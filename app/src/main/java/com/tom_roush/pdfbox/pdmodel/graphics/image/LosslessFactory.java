package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageOutputStream;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public final class LosslessFactory {
    static boolean usePredictorEncoder = false;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class PredictorEncoder {
        final byte[] aValues;
        final byte[] alphaImageData;
        final byte[] bValues;
        private final int bytesPerComponent = 1;
        private final int bytesPerPixel;
        final byte[] cValues;
        private final byte[] dataRawRowAverage;
        private final byte[] dataRawRowNone;
        private final byte[] dataRawRowPaeth;
        private final byte[] dataRawRowSub;
        private final byte[] dataRawRowUp;
        private final PDDocument document;
        final boolean hasAlpha;
        private final int height;
        private final Bitmap image;
        final Bitmap.Config imageType;
        final byte[] tmpResultValues;
        private final int width;
        final byte[] xValues;

        public PredictorEncoder(PDDocument pDDocument, Bitmap bitmap) {
            byte[] bArr;
            this.document = pDDocument;
            this.image = bitmap;
            int i10 = 1 * 3;
            this.bytesPerPixel = i10;
            int height = bitmap.getHeight();
            this.height = height;
            int width = bitmap.getWidth();
            this.width = width;
            this.imageType = bitmap.getConfig();
            boolean hasAlpha = bitmap.hasAlpha();
            this.hasAlpha = hasAlpha;
            if (hasAlpha) {
                bArr = new byte[height * width * 1];
            } else {
                bArr = null;
            }
            this.alphaImageData = bArr;
            int i11 = (width * i10) + 1;
            byte[] bArr2 = new byte[i11];
            this.dataRawRowNone = bArr2;
            byte[] bArr3 = new byte[i11];
            this.dataRawRowSub = bArr3;
            byte[] bArr4 = new byte[i11];
            this.dataRawRowUp = bArr4;
            byte[] bArr5 = new byte[i11];
            this.dataRawRowAverage = bArr5;
            byte[] bArr6 = new byte[i11];
            this.dataRawRowPaeth = bArr6;
            bArr2[0] = 0;
            bArr3[0] = 1;
            bArr4[0] = 2;
            bArr5[0] = 3;
            bArr6[0] = 4;
            this.aValues = new byte[i10];
            this.cValues = new byte[i10];
            this.bValues = new byte[i10];
            this.xValues = new byte[i10];
            this.tmpResultValues = new byte[i10];
        }

        private byte[] chooseDataRowToWrite() {
            byte[] bArr = this.dataRawRowNone;
            long estCompressSum = estCompressSum(bArr);
            long estCompressSum2 = estCompressSum(this.dataRawRowSub);
            long estCompressSum3 = estCompressSum(this.dataRawRowUp);
            long estCompressSum4 = estCompressSum(this.dataRawRowAverage);
            long estCompressSum5 = estCompressSum(this.dataRawRowPaeth);
            if (estCompressSum > estCompressSum2) {
                bArr = this.dataRawRowSub;
                estCompressSum = estCompressSum2;
            }
            if (estCompressSum > estCompressSum3) {
                bArr = this.dataRawRowUp;
            } else {
                estCompressSum3 = estCompressSum;
            }
            if (estCompressSum3 > estCompressSum4) {
                bArr = this.dataRawRowAverage;
            } else {
                estCompressSum4 = estCompressSum3;
            }
            if (estCompressSum4 > estCompressSum5) {
                return this.dataRawRowPaeth;
            }
            return bArr;
        }

        private void copyIntToBytes(int[] iArr, int i10, byte[] bArr, byte[] bArr2, int i11) {
            int i12 = iArr[i10];
            byte blue = (byte) Color.blue(i12);
            byte green = (byte) Color.green(i12);
            byte red = (byte) Color.red(i12);
            int i13 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[this.imageType.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    bArr[0] = red;
                    bArr[1] = green;
                    bArr[2] = blue;
                    return;
                }
                return;
            }
            bArr[0] = red;
            bArr[1] = green;
            bArr[2] = blue;
            if (bArr2 != null) {
                bArr2[i11] = (byte) Color.alpha(i12);
            }
        }

        private static long estCompressSum(byte[] bArr) {
            long j10 = 0;
            for (byte b10 : bArr) {
                j10 += Math.abs((int) b10);
            }
            return j10;
        }

        private static byte pngFilterAverage(int i10, int i11, int i12) {
            return (byte) (i10 - ((i12 + i11) / 2));
        }

        private static byte pngFilterPaeth(int i10, int i11, int i12, int i13) {
            int i14 = (i11 + i12) - i13;
            int abs = Math.abs(i14 - i11);
            int abs2 = Math.abs(i14 - i12);
            int abs3 = Math.abs(i14 - i13);
            if (abs > abs2 || abs > abs3) {
                if (abs2 <= abs3) {
                    i11 = i12;
                } else {
                    i11 = i13;
                }
            }
            return (byte) (i10 - i11);
        }

        private static byte pngFilterSub(int i10, int i11) {
            return (byte) ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) - (i11 & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }

        private static byte pngFilterUp(int i10, int i11) {
            return pngFilterSub(i10, i11);
        }

        private PDImageXObject preparePredictorPDImage(ByteArrayOutputStream byteArrayOutputStream, int i10) {
            int height = this.image.getHeight();
            int width = this.image.getWidth();
            PDImageXObject pDImageXObject = new PDImageXObject(this.document, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE, width, height, i10, PDDeviceRGB.INSTANCE);
            COSDictionary cOSDictionary = new COSDictionary();
            cOSDictionary.setItem(COSName.BITS_PER_COMPONENT, (COSBase) COSInteger.get(i10));
            cOSDictionary.setItem(COSName.PREDICTOR, (COSBase) COSInteger.get(15L));
            cOSDictionary.setItem(COSName.COLUMNS, (COSBase) COSInteger.get(width));
            cOSDictionary.setItem(COSName.COLORS, (COSBase) COSInteger.get(3L));
            pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
            if (this.hasAlpha) {
                pDImageXObject.getCOSObject().setItem(COSName.SMASK, LosslessFactory.prepareImageXObject(this.document, this.alphaImageData, this.image.getWidth(), this.image.getHeight(), this.bytesPerComponent * 8, PDDeviceGray.INSTANCE));
            }
            return pDImageXObject;
        }

        public PDImageXObject encode() {
            int i10 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[this.imageType.ordinal()];
            int i11 = 1;
            if (i10 != 1 && i10 != 2) {
                return null;
            }
            int i12 = this.width;
            int i13 = i12 * 1;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.height * this.width) * this.bytesPerPixel) / 2);
            Deflater deflater = new Deflater(Filter.getCompressionLevel());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            byte b10 = 0;
            int[] iArr = new int[i12 * 1];
            int[] iArr2 = new int[i12 * 1];
            int i14 = 0;
            int i15 = 0;
            while (i15 < this.height) {
                Bitmap bitmap = this.image;
                int i16 = this.width;
                bitmap.getPixels(iArr2, 0, i16, 0, i15, i16, 1);
                Arrays.fill(this.aValues, b10);
                Arrays.fill(this.cValues, b10);
                int i17 = i14;
                int i18 = i11;
                int i19 = b10;
                while (i19 < i13) {
                    int i20 = i19;
                    int i21 = i15;
                    copyIntToBytes(iArr2, i20, this.xValues, this.alphaImageData, i17);
                    copyIntToBytes(iArr, i20, this.bValues, null, 0);
                    int length = this.xValues.length;
                    for (int i22 = b10; i22 < length; i22++) {
                        int i23 = this.xValues[i22] & 255;
                        int i24 = this.aValues[i22] & 255;
                        int i25 = this.bValues[i22] & 255;
                        this.dataRawRowNone[i18] = (byte) i23;
                        this.dataRawRowSub[i18] = pngFilterSub(i23, i24);
                        this.dataRawRowUp[i18] = pngFilterUp(i23, i25);
                        this.dataRawRowAverage[i18] = pngFilterAverage(i23, i24, i25);
                        this.dataRawRowPaeth[i18] = pngFilterPaeth(i23, i24, i25, this.cValues[i22] & 255);
                        i18++;
                    }
                    System.arraycopy(this.xValues, 0, this.aValues, 0, this.bytesPerPixel);
                    System.arraycopy(this.bValues, 0, this.cValues, 0, this.bytesPerPixel);
                    i19++;
                    i17 += this.bytesPerComponent;
                    b10 = 0;
                    i15 = i21;
                }
                byte[] chooseDataRowToWrite = chooseDataRowToWrite();
                deflaterOutputStream.write(chooseDataRowToWrite, b10, chooseDataRowToWrite.length);
                i15++;
                i14 = i17;
                i11 = 1;
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            deflaterOutputStream.close();
            deflater.end();
            return preparePredictorPDImage(byteArrayOutputStream, this.bytesPerComponent * 8);
        }
    }

    private LosslessFactory() {
    }

    private static PDImageXObject createFromGrayImage(Bitmap bitmap, PDDocument pDDocument) {
        int i10;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        int i11 = width * 8;
        int i12 = i11 / 8;
        if (i11 % 8 != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((i12 + i10) * height);
        MemoryCacheImageOutputStream memoryCacheImageOutputStream = new MemoryCacheImageOutputStream(byteArrayOutputStream);
        for (int i13 = 0; i13 < height; i13++) {
            bitmap.getPixels(iArr, 0, width, 0, i13, width, 1);
            for (int i14 = 0; i14 < width; i14++) {
                memoryCacheImageOutputStream.writeBits(iArr[i14] & FunctionEval.FunctionID.EXTERNAL_FUNC, 8);
            }
            int bitOffset = memoryCacheImageOutputStream.getBitOffset();
            if (bitOffset != 0) {
                memoryCacheImageOutputStream.writeBits(0L, 8 - bitOffset);
            }
        }
        memoryCacheImageOutputStream.flush();
        memoryCacheImageOutputStream.close();
        return prepareImageXObject(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) {
        PDImageXObject encode;
        if (isGrayImage(bitmap)) {
            return createFromGrayImage(bitmap, pDDocument);
        }
        if (usePredictorEncoder && (encode = new PredictorEncoder(pDDocument, bitmap).encode()) != null) {
            if (encode.getColorSpace() == PDDeviceRGB.INSTANCE && encode.getBitsPerComponent() < 16) {
                if (bitmap.getHeight() * bitmap.getWidth() <= 2500) {
                    PDImageXObject createFromRGBImage = createFromRGBImage(bitmap, pDDocument);
                    if (createFromRGBImage.getCOSObject().getLength() < encode.getCOSObject().getLength()) {
                        encode.getCOSObject().close();
                        return createFromRGBImage;
                    }
                    createFromRGBImage.getCOSObject().close();
                }
            }
            return encode;
        }
        return createFromRGBImage(bitmap, pDDocument);
    }

    private static PDImageXObject createFromRGBImage(Bitmap bitmap, PDDocument pDDocument) {
        byte[] bArr;
        int i10;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        PDDeviceRGB pDDeviceRGB = PDDeviceRGB.INSTANCE;
        byte[] bArr2 = new byte[width * height * 3];
        if (bitmap.hasAlpha()) {
            int i11 = width * 8;
            int i12 = i11 / 8;
            if (i11 % 8 != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            bArr = new byte[(i12 + i10) * height];
        } else {
            bArr = new byte[0];
        }
        byte[] bArr3 = bArr;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = i13;
            bitmap.getPixels(iArr, 0, width, 0, i13, width, 1);
            for (int i17 = 0; i17 < width; i17++) {
                int i18 = iArr[i17];
                int i19 = i14 + 1;
                bArr2[i14] = (byte) ((i18 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                int i20 = i19 + 1;
                bArr2[i19] = (byte) ((i18 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                i14 = i20 + 1;
                bArr2[i20] = (byte) (i18 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                if (bitmap.hasAlpha()) {
                    bArr3[i15] = (byte) ((i18 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    i15++;
                }
            }
            i13 = i16 + 1;
        }
        PDImageXObject prepareImageXObject = prepareImageXObject(pDDocument, bArr2, bitmap.getWidth(), bitmap.getHeight(), 8, pDDeviceRGB);
        if (bitmap.hasAlpha()) {
            prepareImageXObject.getCOSObject().setItem(COSName.SMASK, prepareImageXObject(pDDocument, bArr3, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE));
        }
        return prepareImageXObject;
    }

    private static boolean isGrayImage(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return true;
        }
        return false;
    }

    public static PDImageXObject prepareImageXObject(PDDocument pDDocument, byte[] bArr, int i10, int i11, int i12, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length / 2);
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i10, i11, i12, pDColorSpace);
    }
}
