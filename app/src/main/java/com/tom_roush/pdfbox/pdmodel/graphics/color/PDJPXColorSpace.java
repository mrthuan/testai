package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import com.tom_roush.pdfbox.cos.COSBase;

/* loaded from: classes2.dex */
public final class PDJPXColorSpace extends PDColorSpace {
    private final ColorSpace colorSpace;

    public PDJPXColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace, com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        throw new UnsupportedOperationException("JPX color spaces don't have COS objects");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] getDefaultDecode(int i10) {
        float minValue;
        float maxValue;
        if (Build.VERSION.SDK_INT > 26) {
            int numberOfComponents = getNumberOfComponents();
            float[] fArr = new float[numberOfComponents * 2];
            for (int i11 = 0; i11 < numberOfComponents; i11++) {
                int i12 = i11 * 2;
                minValue = this.colorSpace.getMinValue(i11);
                fArr[i12] = minValue;
                maxValue = this.colorSpace.getMaxValue(i11);
                fArr[i12 + 1] = maxValue;
            }
            return fArr;
        }
        return new float[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public PDColor getInitialColor() {
        throw new UnsupportedOperationException("JPX color spaces don't support drawing");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public String getName() {
        return "JPX";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public int getNumberOfComponents() {
        int componentCount;
        if (Build.VERSION.SDK_INT > 26) {
            componentCount = this.colorSpace.getComponentCount();
            return componentCount;
        }
        return 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] toRGB(float[] fArr) {
        throw new UnsupportedOperationException("JPX color spaces don't support drawing");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public Bitmap toRGBImage(Bitmap bitmap) {
        Bitmap createBitmap;
        if (Build.VERSION.SDK_INT > 26) {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565, false, this.colorSpace);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createBitmap;
        }
        return bitmap;
    }
}
