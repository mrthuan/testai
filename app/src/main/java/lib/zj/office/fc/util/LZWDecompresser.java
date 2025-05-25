package lib.zj.office.fc.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class LZWDecompresser {
    private final int codeLengthIncrease;
    private final boolean maskMeansCompressed;
    private final boolean positionIsBigEndian;

    public LZWDecompresser(boolean z10, int i10, boolean z11) {
        this.maskMeansCompressed = z10;
        this.codeLengthIncrease = i10;
        this.positionIsBigEndian = z11;
    }

    public static int fromByte(byte b10) {
        if (b10 >= 0) {
            return b10;
        }
        return b10 + 256;
    }

    public static byte fromInt(int i10) {
        if (i10 < 128) {
            return (byte) i10;
        }
        return (byte) (i10 - 256);
    }

    public abstract int adjustDictionaryOffset(int i10);

    public byte[] decompress(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decompress(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public abstract int populateDictionary(byte[] bArr);

    public void decompress(InputStream inputStream, OutputStream outputStream) {
        int i10;
        byte[] bArr = new byte[4096];
        int populateDictionary = populateDictionary(bArr);
        byte[] bArr2 = new byte[this.codeLengthIncrease + 16];
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return;
            }
            for (int i11 = 1; i11 < 256; i11 <<= 1) {
                if (((read & i11) > 0) ^ this.maskMeansCompressed) {
                    int read2 = inputStream.read();
                    if (read2 != -1) {
                        bArr[populateDictionary & 4095] = fromInt(read2);
                        populateDictionary++;
                        outputStream.write(new byte[]{fromInt(read2)});
                    }
                } else {
                    int read3 = inputStream.read();
                    int read4 = inputStream.read();
                    if (read3 != -1 && read4 != -1) {
                        int i12 = (read4 & 15) + this.codeLengthIncrease;
                        if (this.positionIsBigEndian) {
                            read3 <<= 4;
                            i10 = read4 >> 4;
                        } else {
                            i10 = (read4 & 240) << 4;
                        }
                        int adjustDictionaryOffset = adjustDictionaryOffset(read3 + i10);
                        for (int i13 = 0; i13 < i12; i13++) {
                            byte b10 = bArr[(adjustDictionaryOffset + i13) & 4095];
                            bArr2[i13] = b10;
                            bArr[(populateDictionary + i13) & 4095] = b10;
                        }
                        outputStream.write(bArr2, 0, i12);
                        populateDictionary += i12;
                    }
                }
            }
        }
    }
}
