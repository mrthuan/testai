package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class JPEGFactory {

    /* loaded from: classes2.dex */
    public static class Dimensions {
        private int height;
        private int numComponents;
        private int width;

        private Dimensions() {
        }

        public /* synthetic */ Dimensions(int i10) {
            this();
        }
    }

    private JPEGFactory() {
    }

    private static PDImageXObject createAlphaFromARGBImage(PDDocument pDDocument, Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return null;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 < width; i10++) {
            byteArrayOutputStream.write(Color.alpha(iArr[i10]));
        }
        return prepareImageXObject(pDDocument, byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceGray.INSTANCE);
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Dimensions retrieveDimensions = retrieveDimensions(byteArrayInputStream);
        return new PDImageXObject(pDDocument, byteArrayInputStream, COSName.DCT_DECODE, retrieveDimensions.width, retrieveDimensions.height, 8, PDDeviceRGB.INSTANCE);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) {
        return createFromImage(pDDocument, bitmap, 0.75f);
    }

    public static PDImageXObject createFromStream(PDDocument pDDocument, InputStream inputStream) {
        return createFromByteArray(pDDocument, IOUtils.toByteArray(inputStream));
    }

    private static PDImageXObject createJPEG(PDDocument pDDocument, Bitmap bitmap, float f10, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeImageToJPEGStream(bitmap, f10, i10, byteArrayOutputStream);
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.DCT_DECODE, bitmap.getWidth(), bitmap.getHeight(), 8, PDDeviceRGB.INSTANCE);
        if (bitmap.hasAlpha()) {
            pDImageXObject.getCOSObject().setItem(COSName.SMASK, createAlphaFromARGBImage(pDDocument, bitmap));
        }
        return pDImageXObject;
    }

    private static void encodeImageToJPEGStream(Bitmap bitmap, float f10, int i10, OutputStream outputStream) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f10 * 100.0f), outputStream);
    }

    private static Bitmap getAlphaImage(Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return null;
        }
        return bitmap.extractAlpha();
    }

    private static Bitmap getColorImage(Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return bitmap;
        }
        if (bitmap.getConfig().name().contains("RGB")) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Paint paint = new Paint();
            paint.setAlpha(0);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        }
        throw new UnsupportedOperationException("only RGB color spaces are implemented");
    }

    private static PDImageXObject prepareImageXObject(PDDocument pDDocument, byte[] bArr, int i10, int i11, int i12, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.FLATE_DECODE;
        filterFactory.getFilter(cOSName).encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, new COSDictionary(), 0);
        return new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i10, i11, i12, pDColorSpace);
    }

    private static Dimensions retrieveDimensions(ByteArrayInputStream byteArrayInputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        byteArrayInputStream.reset();
        Dimensions dimensions = new Dimensions(0);
        dimensions.width = options.outWidth;
        dimensions.height = options.outHeight;
        return dimensions;
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f10) {
        return createFromImage(pDDocument, bitmap, f10, 72);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap, float f10, int i10) {
        return createJPEG(pDDocument, bitmap, f10, i10);
    }
}
