package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tom_roush.pdfbox.cos.COSName;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public final class PDDeviceGray extends PDDeviceColorSpace {
    public static final PDDeviceGray INSTANCE = new PDDeviceGray();
    private final PDColor initialColor = new PDColor(new float[]{0.0f}, this);

    private PDDeviceGray() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] getDefaultDecode(int i10) {
        return new float[]{0.0f, 1.0f};
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public PDColor getInitialColor() {
        return this.initialColor;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public String getName() {
        return COSName.DEVICEGRAY.getName();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public int getNumberOfComponents() {
        return 1;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public float[] toRGB(float[] fArr) {
        float f10 = fArr[0];
        return new float[]{fArr[0], f10, f10};
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace
    public Bitmap toRGBImage(Bitmap bitmap) {
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ALPHA_8;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int[] iArr2 = new int[width];
        for (int i10 = 0; i10 < height; i10++) {
            bitmap.getPixels(iArr, 0, width, 0, i10, width, 1);
            for (int i11 = 0; i11 < width; i11++) {
                int alpha = Color.alpha(iArr[i11]);
                iArr2[i11] = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, alpha, alpha, alpha);
            }
            createBitmap.setPixels(iArr2, 0, width, 0, i10, width, 1);
        }
        return createBitmap;
    }
}
