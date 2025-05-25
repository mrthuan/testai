package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageOutputStream;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.io.RandomAccess;
import com.tom_roush.pdfbox.io.RandomAccessBuffer;
import com.tom_roush.pdfbox.io.RandomAccessFile;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class CCITTFactory {
    private CCITTFactory() {
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr) {
        return createFromByteArray(pDDocument, bArr, 0);
    }

    public static PDImageXObject createFromFile(PDDocument pDDocument, File file) {
        return createFromFile(pDDocument, file, 0);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            int[] iArr = new int[width];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MemoryCacheImageOutputStream memoryCacheImageOutputStream = new MemoryCacheImageOutputStream(byteArrayOutputStream);
            for (int i10 = 0; i10 < height; i10++) {
                bitmap.getPixels(iArr, 0, width, 0, i10, width, 1);
                for (int i11 = 0; i11 < width; i11++) {
                    memoryCacheImageOutputStream.writeBits(~(iArr[i11] & 1), 1);
                }
                if (memoryCacheImageOutputStream.getBitOffset() != 0) {
                    memoryCacheImageOutputStream.writeBits(0L, 8 - memoryCacheImageOutputStream.getBitOffset());
                }
            }
            memoryCacheImageOutputStream.flush();
            memoryCacheImageOutputStream.close();
            return prepareImageXObject(pDDocument, byteArrayOutputStream.toByteArray(), width, height, PDDeviceGray.INSTANCE);
        }
        throw new IllegalArgumentException("Only 1-bit b/w images supported");
    }

    @Deprecated
    public static PDImageXObject createFromRandomAccess(PDDocument pDDocument, RandomAccess randomAccess) {
        return createFromRandomAccessImpl(pDDocument, randomAccess, 0);
    }

    private static PDImageXObject createFromRandomAccessImpl(PDDocument pDDocument, RandomAccess randomAccess, int i10) {
        COSDictionary cOSDictionary = new COSDictionary();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        extractFromTiff(randomAccess, byteArrayOutputStream, cOSDictionary, i10);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.CCITTFAX_DECODE, cOSDictionary.getInt(COSName.COLUMNS), cOSDictionary.getInt(COSName.ROWS), 1, PDDeviceGray.INSTANCE);
        pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
        return pDImageXObject;
    }

    private static void extractFromTiff(RandomAccess randomAccess, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        int read;
        int readshort;
        try {
            randomAccess.seek(0L);
            char read2 = (char) randomAccess.read();
            try {
                if (((char) randomAccess.read()) == read2) {
                    if (read2 != 'M' && read2 != 'I') {
                        throw new IOException("Not a valid tiff file");
                    }
                    if (readshort(read2, randomAccess) == 42) {
                        int readlong = readlong(read2, randomAccess);
                        randomAccess.seek(readlong);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (readshort(read2, randomAccess) <= 50) {
                                randomAccess.seek((readshort * 12) + readlong + 2);
                                readlong = readlong(read2, randomAccess);
                                if (readlong == 0) {
                                    outputStream.close();
                                    return;
                                }
                                randomAccess.seek(readlong);
                            } else {
                                throw new IOException("Not a valid tiff file");
                            }
                        }
                        int readshort2 = readshort(read2, randomAccess);
                        if (readshort2 <= 50) {
                            int i12 = -1000;
                            int i13 = 0;
                            int i14 = 0;
                            for (int i15 = 0; i15 < readshort2; i15++) {
                                int readshort3 = readshort(read2, randomAccess);
                                int readshort4 = readshort(read2, randomAccess);
                                int readlong2 = readlong(read2, randomAccess);
                                if (readshort4 != 1) {
                                    if (readshort4 != 3) {
                                        read = readlong(read2, randomAccess);
                                    } else {
                                        read = readshort(read2, randomAccess);
                                        randomAccess.read();
                                        randomAccess.read();
                                    }
                                } else {
                                    read = randomAccess.read();
                                    randomAccess.read();
                                    randomAccess.read();
                                    randomAccess.read();
                                }
                                if (readshort3 != 256) {
                                    if (readshort3 != 257) {
                                        if (readshort3 != 259) {
                                            if (readshort3 != 262) {
                                                if (readshort3 != 266) {
                                                    if (readshort3 != 279) {
                                                        if (readshort3 != 292) {
                                                            if (readshort3 != 273) {
                                                                if (readshort3 != 274) {
                                                                    if (readshort3 != 324) {
                                                                        if (readshort3 == 325) {
                                                                            if (readlong2 != 1) {
                                                                            }
                                                                            i14 = read;
                                                                        }
                                                                    } else {
                                                                        if (readlong2 != 1) {
                                                                        }
                                                                        i13 = read;
                                                                    }
                                                                } else if (read != 1) {
                                                                    throw new IOException("Orientation " + read + " is not supported");
                                                                }
                                                            } else {
                                                                if (readlong2 != 1) {
                                                                }
                                                                i13 = read;
                                                            }
                                                        } else {
                                                            if ((read & 1) != 0) {
                                                                i12 = 50;
                                                            }
                                                            if ((read & 4) == 0) {
                                                                if ((read & 2) != 0) {
                                                                    throw new IOException("CCITT Group 3 'fill bits before EOL' is not supported");
                                                                }
                                                            } else {
                                                                throw new IOException("CCITT Group 3 'uncompressed mode' is not supported");
                                                            }
                                                        }
                                                    } else {
                                                        if (readlong2 != 1) {
                                                        }
                                                        i14 = read;
                                                    }
                                                } else if (read != 1) {
                                                    throw new IOException("FillOrder " + read + " is not supported");
                                                }
                                            } else if (read == 1) {
                                                cOSDictionary.setBoolean(COSName.BLACK_IS_1, true);
                                            }
                                        } else {
                                            if (read == 4) {
                                                i12 = -1;
                                            }
                                            if (read == 3) {
                                                i12 = 0;
                                            }
                                        }
                                    } else {
                                        cOSDictionary.setInt(COSName.ROWS, read);
                                    }
                                } else {
                                    cOSDictionary.setInt(COSName.COLUMNS, read);
                                }
                            }
                            if (i12 != -1000) {
                                if (i13 != 0) {
                                    cOSDictionary.setInt(COSName.K, i12);
                                    randomAccess.seek(i13);
                                    byte[] bArr = new byte[8192];
                                    while (true) {
                                        int read3 = randomAccess.read(bArr, 0, Math.min(8192, i14));
                                        if (read3 > 0) {
                                            i14 -= read3;
                                            outputStream.write(bArr, 0, read3);
                                        } else {
                                            outputStream.close();
                                            return;
                                        }
                                    }
                                } else {
                                    throw new IOException("First image in tiff is not a single tile/strip");
                                }
                            } else {
                                throw new IOException("First image in tiff is not CCITT T4 or T6 compressed");
                            }
                        } else {
                            throw new IOException("Not a valid tiff file");
                        }
                    } else {
                        throw new IOException("Not a valid tiff file");
                    }
                } else {
                    throw new IOException("Not a valid tiff file");
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static PDImageXObject prepareImageXObject(PDDocument pDDocument, byte[] bArr, int i10, int i11, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.CCITTFAX_DECODE;
        Filter filter = filterFactory.getFilter(cOSName);
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setInt(COSName.COLUMNS, i10);
        cOSDictionary.setInt(COSName.ROWS, i11);
        filter.encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, cOSDictionary, 0);
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i10, i11, 1, pDColorSpace);
        cOSDictionary.setInt(COSName.K, -1);
        pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
        return pDImageXObject;
    }

    private static int readlong(char c, RandomAccess randomAccess) {
        int read;
        int read2;
        if (c == 'I') {
            read = randomAccess.read() | (randomAccess.read() << 8) | (randomAccess.read() << 16);
            read2 = randomAccess.read() << 24;
        } else {
            read = (randomAccess.read() << 24) | (randomAccess.read() << 16) | (randomAccess.read() << 8);
            read2 = randomAccess.read();
        }
        return read | read2;
    }

    private static int readshort(char c, RandomAccess randomAccess) {
        int read;
        int read2;
        if (c == 'I') {
            read = randomAccess.read();
            read2 = randomAccess.read() << 8;
        } else {
            read = randomAccess.read() << 8;
            read2 = randomAccess.read();
        }
        return read | read2;
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr, int i10) {
        RandomAccessBuffer randomAccessBuffer = new RandomAccessBuffer(bArr);
        try {
            return createFromRandomAccessImpl(pDDocument, randomAccessBuffer, i10);
        } finally {
            randomAccessBuffer.close();
        }
    }

    public static PDImageXObject createFromFile(PDDocument pDDocument, File file, int i10) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return createFromRandomAccessImpl(pDDocument, randomAccessFile, i10);
        } finally {
            randomAccessFile.close();
        }
    }

    @Deprecated
    public static PDImageXObject createFromRandomAccess(PDDocument pDDocument, RandomAccess randomAccess, int i10) {
        return createFromRandomAccessImpl(pDDocument, randomAccess, i10);
    }
}
