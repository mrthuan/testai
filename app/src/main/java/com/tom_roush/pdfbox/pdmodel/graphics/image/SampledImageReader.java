package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SampledImageReader {
    private SampledImageReader() {
    }

    private static Rect clipRegion(PDImage pDImage, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, pDImage.getWidth(), pDImage.getHeight());
        }
        int max = Math.max(0, rect.left);
        int max2 = Math.max(0, rect.top);
        return new Rect(max, max2, Math.min(rect.width(), pDImage.getWidth() - max), Math.min(rect.height(), pDImage.getHeight() - max2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap createBitmapFromRawStream(java.io.InputStream r7, int r8, int r9, int r10) {
        /*
            byte[] r7 = com.tom_roush.pdfbox.io.IOUtils.toByteArray(r7)
            int r0 = r7.length
            int r0 = r0 / r9
            int r0 = r0 / r8
            r1 = 1
            if (r9 != r1) goto L30
            int r9 = r8 * r0
            int r2 = r9 * 4
            byte[] r2 = new byte[r2]
            int r9 = r9 - r1
        L11:
            if (r9 < 0) goto L2e
            int r3 = r9 * 4
            int r4 = r3 + 3
            r5 = r7[r9]
            r2[r4] = r5
            r4 = r7[r9]
            r2[r3] = r4
            int r4 = r3 + 1
            r5 = r7[r9]
            r2[r4] = r5
            int r3 = r3 + 2
            r4 = r7[r9]
            r2[r3] = r4
            int r9 = r9 + (-1)
            goto L11
        L2e:
            r7 = r2
            goto L5c
        L30:
            r2 = 3
            if (r9 != r2) goto L5c
            int r9 = r8 * r0
            int r2 = r9 * 4
            byte[] r2 = new byte[r2]
            int r9 = r9 - r1
        L3a:
            if (r9 < 0) goto L2e
            int r3 = r9 * 4
            int r4 = r9 * 3
            int r5 = r3 + 3
            r6 = -1
            r2[r5] = r6
            r5 = r7[r4]
            r2[r3] = r5
            int r5 = r3 + 1
            int r6 = r4 + 1
            r6 = r7[r6]
            r2[r5] = r6
            int r3 = r3 + 2
            int r4 = r4 + 2
            r4 = r7[r4]
            r2[r3] = r4
            int r9 = r9 + (-1)
            goto L3a
        L5c:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r8, r0, r9)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r9.copyPixelsFromBuffer(r7)
            if (r10 <= r1) goto L71
            int r8 = r8 / r10
            int r0 = r0 / r10
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r8, r0, r1)
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.graphics.image.SampledImageReader.createBitmapFromRawStream(java.io.InputStream, int, int, int):android.graphics.Bitmap");
    }

    private static Bitmap from1Bit(PDImage pDImage, Rect rect, int i10, int i11, int i12) {
        InputStream inputStream;
        int width;
        int height;
        int i13;
        int i14;
        byte b10;
        byte b11;
        int i15;
        byte b12;
        PDColorSpace colorSpace = pDImage.getColorSpace();
        float[] decodeArray = getDecodeArray(pDImage);
        int i16 = i11;
        Bitmap createBitmap = Bitmap.createBitmap(i16, i12, Bitmap.Config.ALPHA_8);
        ByteBuffer allocate = ByteBuffer.allocate(createBitmap.getRowBytes() * i12);
        createBitmap.copyPixelsToBuffer(allocate);
        int i17 = i10;
        DecodeOptions decodeOptions = new DecodeOptions(i17);
        decodeOptions.setSourceRegion(rect);
        try {
            inputStream = pDImage.createInputStream(decodeOptions);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            if (decodeOptions.isFilterSubsampled()) {
                height = i12;
                width = i16;
                i17 = 1;
                i13 = 0;
                i14 = 0;
            } else {
                width = pDImage.getWidth();
                int i18 = rect.left;
                int i19 = rect.top;
                int width2 = rect.width();
                height = rect.height();
                i13 = i18;
                i16 = width2;
                i14 = i19;
            }
            byte[] array = allocate.array();
            int i20 = width / 8;
            if (width % 8 > 0) {
                i20++;
            }
            int i21 = (decodeArray[0] > decodeArray[1] ? 1 : (decodeArray[0] == decodeArray[1] ? 0 : -1));
            byte b13 = -1;
            if (i21 < 0) {
                b10 = 0;
            } else {
                b10 = -1;
                b13 = 0;
            }
            byte[] bArr = new byte[i20];
            int i22 = 0;
            int i23 = 0;
            while (i22 < i14 + height) {
                int i24 = height;
                byte b14 = b10;
                int populateBuffer = (int) IOUtils.populateBuffer(inputStream, bArr);
                if (i22 >= i14 && i22 % i17 <= 0) {
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i20 && i25 < populateBuffer) {
                        byte b15 = bArr[i25];
                        int i27 = 128;
                        byte b16 = b13;
                        int i28 = i14;
                        for (int i29 = 0; i29 < 8 && i26 < i13 + i16; i29++) {
                            int i30 = b15 & i27;
                            i27 >>= 1;
                            if (i26 >= i13 && i26 % i17 == 0) {
                                int i31 = i23 + 1;
                                if (i30 == 0) {
                                    b12 = b14;
                                } else {
                                    b12 = b16;
                                }
                                array[i23] = b12;
                                i23 = i31;
                            }
                            i26++;
                        }
                        i25++;
                        b13 = b16;
                        i14 = i28;
                    }
                    b11 = b13;
                    i15 = i14;
                    if (populateBuffer != i20) {
                        break;
                    }
                    i22++;
                    b13 = b11;
                    height = i24;
                    b10 = b14;
                    i14 = i15;
                }
                b11 = b13;
                i15 = i14;
                i22++;
                b13 = b11;
                height = i24;
                b10 = b14;
                i14 = i15;
            }
            allocate.rewind();
            createBitmap.copyPixelsFromBuffer(allocate);
            Bitmap rGBImage = colorSpace.toRGBImage(createBitmap);
            if (inputStream != null) {
                inputStream.close();
            }
            return rGBImage;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    private static Bitmap from8bit(PDImage pDImage, Rect rect, int i10, int i11, int i12) {
        int i13;
        int width;
        int height;
        int i14;
        int i15;
        int i16;
        DecodeOptions decodeOptions = new DecodeOptions(i10);
        decodeOptions.setSourceRegion(rect);
        InputStream createInputStream = pDImage.createInputStream(decodeOptions);
        try {
            if (decodeOptions.isFilterSubsampled()) {
                i14 = 0;
                i13 = 0;
                i15 = i11;
                width = i15;
                height = i12;
                i16 = 1;
            } else {
                int width2 = pDImage.getWidth();
                int i17 = rect.left;
                i13 = rect.top;
                width = rect.width();
                height = rect.height();
                i14 = i17;
                i15 = width2;
                i16 = i10;
            }
            int numberOfComponents = pDImage.getColorSpace().getNumberOfComponents();
            if (i14 == 0 && i13 == 0 && width == i11 && height == i12) {
                return createBitmapFromRawStream(createInputStream, i15, numberOfComponents, i16);
            }
            Bitmap createBitmapFromRawStream = createBitmapFromRawStream(createInputStream, i15, numberOfComponents, i16);
            if (i16 > 1) {
                i14 /= i16;
                i13 /= i16;
            }
            return Bitmap.createBitmap(createBitmapFromRawStream, i14, i13, i11, i12);
        } finally {
            IOUtils.closeQuietly(createInputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float[] getDecodeArray(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage r9) {
        /*
            com.tom_roush.pdfbox.cos.COSArray r0 = r9.getDecode()
            if (r0 == 0) goto L6e
            com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace r1 = r9.getColorSpace()
            int r1 = r1.getNumberOfComponents()
            int r2 = r0.size()
            r3 = 2
            int r1 = r1 * r3
            if (r2 == r1) goto L69
            boolean r1 = r9.isStencil()
            if (r1 == 0) goto L65
            int r1 = r0.size()
            if (r1 < r3) goto L65
            r1 = 0
            com.tom_roush.pdfbox.cos.COSBase r2 = r0.get(r1)
            boolean r2 = r2 instanceof com.tom_roush.pdfbox.cos.COSNumber
            if (r2 == 0) goto L65
            r2 = 1
            com.tom_roush.pdfbox.cos.COSBase r4 = r0.get(r2)
            boolean r4 = r4 instanceof com.tom_roush.pdfbox.cos.COSNumber
            if (r4 == 0) goto L65
            com.tom_roush.pdfbox.cos.COSBase r4 = r0.get(r1)
            com.tom_roush.pdfbox.cos.COSNumber r4 = (com.tom_roush.pdfbox.cos.COSNumber) r4
            float r4 = r4.floatValue()
            com.tom_roush.pdfbox.cos.COSBase r5 = r0.get(r2)
            com.tom_roush.pdfbox.cos.COSNumber r5 = (com.tom_roush.pdfbox.cos.COSNumber) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 < 0) goto L65
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 > 0) goto L65
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 < 0) goto L65
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 > 0) goto L65
            r0.toString()
            float[] r9 = new float[r3]
            r9[r1] = r4
            r9[r2] = r5
            return r9
        L65:
            r0.toString()
            goto L6e
        L69:
            float[] r0 = r0.toFloatArray()
            goto L6f
        L6e:
            r0 = 0
        L6f:
            if (r0 != 0) goto L7e
            com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace r0 = r9.getColorSpace()
            int r9 = r9.getBitsPerComponent()
            float[] r9 = r0.getDefaultDecode(r9)
            return r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.graphics.image.SampledImageReader.getDecodeArray(com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage):float[]");
    }

    public static Bitmap getRGBImage(PDImage pDImage, COSArray cOSArray) {
        return getRGBImage(pDImage, null, 1, cOSArray);
    }

    public static Bitmap getStencilImage(PDImage pDImage, Paint paint) {
        MemoryCacheImageInputStream memoryCacheImageInputStream;
        int i10;
        int i11;
        boolean z10;
        int width = pDImage.getWidth();
        int height = pDImage.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawRect(0.0f, 0.0f, width, height, paint);
        MemoryCacheImageInputStream memoryCacheImageInputStream2 = null;
        try {
            memoryCacheImageInputStream = new MemoryCacheImageInputStream(pDImage.createInputStream());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            float[] decodeArray = getDecodeArray(pDImage);
            int i12 = 0;
            boolean z11 = true;
            if (decodeArray[0] < decodeArray[1]) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i13 = width / 8;
            if (width % 8 > 0) {
                i13++;
            }
            byte[] bArr = new byte[i13];
            int i14 = 0;
            while (i14 < height) {
                int read = memoryCacheImageInputStream.read(bArr);
                int i15 = i12;
                int i16 = i15;
                while (i15 < i13 && i15 < read) {
                    byte b10 = bArr[i15];
                    int i17 = 128;
                    int i18 = 7;
                    while (true) {
                        if (i12 < 8) {
                            int i19 = (b10 & i17) >> i18;
                            z10 = true;
                            i17 >>= 1;
                            i18--;
                            if (i19 == i10) {
                                i11 = 0;
                                createBitmap.setPixel(i16, i14, 0);
                            } else {
                                i11 = 0;
                            }
                            i16++;
                            if (i16 == width) {
                                break;
                            }
                            i12++;
                        } else {
                            i11 = 0;
                            z10 = true;
                            break;
                        }
                    }
                    i15++;
                    i12 = i11;
                    z11 = z10;
                }
                boolean z12 = z11;
                int i20 = i12;
                if (read != i13) {
                    break;
                }
                i14++;
                i12 = i20;
                z11 = z12;
            }
            memoryCacheImageInputStream.close();
            return createBitmap;
        } catch (Throwable th3) {
            th = th3;
            memoryCacheImageInputStream2 = memoryCacheImageInputStream;
            if (memoryCacheImageInputStream2 != null) {
                memoryCacheImageInputStream2.close();
            }
            throw th;
        }
    }

    public static Bitmap getRGBImage(PDImage pDImage, Rect rect, int i10, COSArray cOSArray) {
        if (!pDImage.isEmpty()) {
            Rect clipRegion = clipRegion(pDImage, rect);
            int numberOfComponents = pDImage.getColorSpace().getNumberOfComponents();
            int ceil = (int) Math.ceil(clipRegion.width() / i10);
            int ceil2 = (int) Math.ceil(clipRegion.height() / i10);
            int bitsPerComponent = pDImage.getBitsPerComponent();
            if (ceil > 0 && ceil2 > 0 && pDImage.getWidth() > 0 && pDImage.getHeight() > 0) {
                try {
                    if (bitsPerComponent == 1 && cOSArray == null && numberOfComponents == 1) {
                        return from1Bit(pDImage, clipRegion, i10, ceil, ceil2);
                    }
                    float[] defaultDecode = pDImage.getColorSpace().getDefaultDecode(8);
                    float[] decodeArray = getDecodeArray(pDImage);
                    if (pDImage.getSuffix() != null && pDImage.getSuffix().equals(ContentTypes.EXTENSION_JPG_1) && i10 == 1) {
                        return BitmapFactory.decodeStream(pDImage.createInputStream());
                    }
                    if (bitsPerComponent == 8 && cOSArray == null && Arrays.equals(decodeArray, defaultDecode)) {
                        return from8bit(pDImage, clipRegion, i10, ceil, ceil2);
                    }
                    return from8bit(pDImage, clipRegion, i10, ceil, ceil2);
                } catch (NegativeArraySizeException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IOException("image width and height must be positive");
        }
        throw new IOException("Image stream is empty");
    }
}
