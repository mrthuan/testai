package com.tom_roush.pdfbox.filter;

import androidx.activity.r;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageOutputStream;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public class LZWFilter extends Filter {
    public static final long CLEAR_TABLE = 256;
    public static final long EOD = 257;

    private int calculateChunk(int i10, int i11) {
        if (i10 >= 2048 - i11) {
            return 12;
        }
        if (i10 >= 1024 - i11) {
            return 11;
        }
        if (i10 >= 512 - i11) {
            return 10;
        }
        return 9;
    }

    private void checkIndexBounds(List<byte[]> list, long j10, MemoryCacheImageInputStream memoryCacheImageInputStream) {
        if (j10 >= 0) {
            if (j10 < list.size()) {
                return;
            }
            StringBuilder h10 = r.h("array index overflow: ", j10, " >= ");
            h10.append(list.size());
            h10.append(" near offset ");
            h10.append(memoryCacheImageInputStream.getStreamPosition());
            throw new IOException(h10.toString());
        }
        StringBuilder h11 = r.h("negative array index: ", j10, " near offset ");
        h11.append(memoryCacheImageInputStream.getStreamPosition());
        throw new IOException(h11.toString());
    }

    private List<byte[]> createCodeTable() {
        ArrayList arrayList = new ArrayList(4096);
        for (int i10 = 0; i10 < 256; i10++) {
            arrayList.add(new byte[]{(byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC)});
        }
        arrayList.add(null);
        arrayList.add(null);
        return arrayList;
    }

    private void doLZWDecode(InputStream inputStream, OutputStream outputStream, int i10) {
        List<byte[]> arrayList = new ArrayList<>();
        MemoryCacheImageInputStream memoryCacheImageInputStream = new MemoryCacheImageInputStream(inputStream);
        loop0: while (true) {
            int i11 = 9;
            long j10 = -1;
            while (true) {
                try {
                    long readBits = memoryCacheImageInputStream.readBits(i11);
                    if (readBits == 257) {
                        break loop0;
                    } else if (readBits == 256) {
                        break;
                    } else {
                        if (readBits < arrayList.size()) {
                            byte[] bArr = arrayList.get((int) readBits);
                            byte b10 = bArr[0];
                            outputStream.write(bArr);
                            if (j10 != -1) {
                                checkIndexBounds(arrayList, j10, memoryCacheImageInputStream);
                                byte[] bArr2 = arrayList.get((int) j10);
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + 1);
                                copyOf[bArr2.length] = b10;
                                arrayList.add(copyOf);
                            }
                        } else {
                            checkIndexBounds(arrayList, j10, memoryCacheImageInputStream);
                            byte[] bArr3 = arrayList.get((int) j10);
                            byte[] copyOf2 = Arrays.copyOf(bArr3, bArr3.length + 1);
                            copyOf2[bArr3.length] = bArr3[0];
                            outputStream.write(copyOf2);
                            arrayList.add(copyOf2);
                        }
                        i11 = calculateChunk(arrayList.size(), i10);
                        j10 = readBits;
                    }
                } catch (EOFException unused) {
                }
            }
            arrayList = createCodeTable();
        }
        outputStream.flush();
    }

    private int findPatternCode(List<byte[]> list, byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size <= 257) {
                if (i11 != -1) {
                    return i11;
                }
                if (bArr.length > 1) {
                    return -1;
                }
            }
            byte[] bArr2 = list.get(size);
            if ((i11 != -1 || bArr2.length > i10) && Arrays.equals(bArr2, bArr)) {
                i10 = bArr2.length;
                i11 = size;
            }
        }
        return i11;
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        COSDictionary decodeParams = getDecodeParams(cOSDictionary, i10);
        int i11 = 1;
        int i12 = decodeParams.getInt(COSName.EARLY_CHANGE, 1);
        if (i12 == 0 || i12 == 1) {
            i11 = i12;
        }
        doLZWDecode(inputStream, Predictor.wrapPredictor(outputStream, decodeParams), i11);
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        List<byte[]> createCodeTable = createCodeTable();
        MemoryCacheImageOutputStream memoryCacheImageOutputStream = new MemoryCacheImageOutputStream(outputStream);
        memoryCacheImageOutputStream.writeBits(256L, 9);
        byte[] bArr = null;
        int i10 = -1;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            byte b10 = (byte) read;
            if (bArr == null) {
                bArr = new byte[]{b10};
            } else {
                bArr = Arrays.copyOf(bArr, bArr.length + 1);
                bArr[bArr.length - 1] = b10;
                int findPatternCode = findPatternCode(createCodeTable, bArr);
                if (findPatternCode == -1) {
                    int calculateChunk = calculateChunk(createCodeTable.size() - 1, 1);
                    memoryCacheImageOutputStream.writeBits(i10, calculateChunk);
                    createCodeTable.add(bArr);
                    if (createCodeTable.size() == 4096) {
                        memoryCacheImageOutputStream.writeBits(256L, calculateChunk);
                        createCodeTable = createCodeTable();
                    }
                    bArr = new byte[]{b10};
                } else {
                    i10 = findPatternCode;
                }
            }
            i10 = b10 & 255;
        }
        if (i10 != -1) {
            memoryCacheImageOutputStream.writeBits(i10, calculateChunk(createCodeTable.size() - 1, 1));
        }
        memoryCacheImageOutputStream.writeBits(257L, calculateChunk(createCodeTable.size(), 1));
        memoryCacheImageOutputStream.writeBits(0L, 7);
        memoryCacheImageOutputStream.flush();
        memoryCacheImageOutputStream.close();
    }
}
