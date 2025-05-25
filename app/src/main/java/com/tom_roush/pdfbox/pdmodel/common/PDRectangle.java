package com.tom_roush.pdfbox.pdmodel.common;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PDRectangle implements COSObjectable {
    private static final float POINTS_PER_INCH = 72.0f;
    private static final float POINTS_PER_MM = 2.8346457f;
    private final COSArray rectArray;
    public static final PDRectangle LETTER = new PDRectangle(612.0f, 792.0f);
    public static final PDRectangle LEGAL = new PDRectangle(612.0f, 1008.0f);
    public static final PDRectangle A0 = new PDRectangle(2383.937f, 3370.3938f);
    public static final PDRectangle A1 = new PDRectangle(1683.7795f, 2383.937f);
    public static final PDRectangle A2 = new PDRectangle(1190.5513f, 1683.7795f);
    public static final PDRectangle A3 = new PDRectangle(841.8898f, 1190.5513f);
    public static final PDRectangle A4 = new PDRectangle(595.27563f, 841.8898f);
    public static final PDRectangle A5 = new PDRectangle(419.52756f, 595.27563f);
    public static final PDRectangle A6 = new PDRectangle(297.63782f, 419.52756f);

    public PDRectangle() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public boolean contains(float f10, float f11) {
        float lowerLeftX = getLowerLeftX();
        float upperRightX = getUpperRightX();
        float lowerLeftY = getLowerLeftY();
        float upperRightY = getUpperRightY();
        if (f10 >= lowerLeftX && f10 <= upperRightX && f11 >= lowerLeftY && f11 <= upperRightY) {
            return true;
        }
        return false;
    }

    public PDRectangle createRetranslatedRectangle() {
        PDRectangle pDRectangle = new PDRectangle();
        pDRectangle.setUpperRightX(getWidth());
        pDRectangle.setUpperRightY(getHeight());
        return pDRectangle;
    }

    public COSArray getCOSArray() {
        return this.rectArray;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.rectArray;
    }

    public float getHeight() {
        return getUpperRightY() - getLowerLeftY();
    }

    public float getLowerLeftX() {
        return ((COSNumber) this.rectArray.get(0)).floatValue();
    }

    public float getLowerLeftY() {
        return ((COSNumber) this.rectArray.get(1)).floatValue();
    }

    public float getUpperRightX() {
        return ((COSNumber) this.rectArray.get(2)).floatValue();
    }

    public float getUpperRightY() {
        return ((COSNumber) this.rectArray.get(3)).floatValue();
    }

    public float getWidth() {
        return getUpperRightX() - getLowerLeftX();
    }

    public void setLowerLeftX(float f10) {
        this.rectArray.set(0, (COSBase) new COSFloat(f10));
    }

    public void setLowerLeftY(float f10) {
        this.rectArray.set(1, (COSBase) new COSFloat(f10));
    }

    public void setUpperRightX(float f10) {
        this.rectArray.set(2, (COSBase) new COSFloat(f10));
    }

    public void setUpperRightY(float f10) {
        this.rectArray.set(3, (COSBase) new COSFloat(f10));
    }

    public Path toGeneralPath() {
        float lowerLeftX = getLowerLeftX();
        float lowerLeftY = getLowerLeftY();
        float upperRightX = getUpperRightX();
        float upperRightY = getUpperRightY();
        Path path = new Path();
        path.moveTo(lowerLeftX, lowerLeftY);
        path.lineTo(upperRightX, lowerLeftY);
        path.lineTo(upperRightX, upperRightY);
        path.lineTo(lowerLeftX, upperRightY);
        path.close();
        return path;
    }

    public String toString() {
        return "[" + getLowerLeftX() + "," + getLowerLeftY() + "," + getUpperRightX() + "," + getUpperRightY() + "]";
    }

    public Path transform(Matrix matrix) {
        float lowerLeftX = getLowerLeftX();
        float lowerLeftY = getLowerLeftY();
        float upperRightX = getUpperRightX();
        float upperRightY = getUpperRightY();
        PointF transformPoint = matrix.transformPoint(lowerLeftX, lowerLeftY);
        PointF transformPoint2 = matrix.transformPoint(upperRightX, lowerLeftY);
        PointF transformPoint3 = matrix.transformPoint(upperRightX, upperRightY);
        PointF transformPoint4 = matrix.transformPoint(lowerLeftX, upperRightY);
        Path path = new Path();
        path.moveTo(transformPoint.x, transformPoint.y);
        path.lineTo(transformPoint2.x, transformPoint2.y);
        path.lineTo(transformPoint3.x, transformPoint3.y);
        path.lineTo(transformPoint4.x, transformPoint4.y);
        path.close();
        return path;
    }

    public PDRectangle(float f10, float f11) {
        this(0.0f, 0.0f, f10, f11);
    }

    public PDRectangle(float f10, float f11, float f12, float f13) {
        COSArray cOSArray = new COSArray();
        this.rectArray = cOSArray;
        cOSArray.add((COSBase) new COSFloat(f10));
        cOSArray.add((COSBase) new COSFloat(f11));
        cOSArray.add((COSBase) new COSFloat(f10 + f12));
        cOSArray.add((COSBase) new COSFloat(f11 + f13));
    }

    public PDRectangle(BoundingBox boundingBox) {
        COSArray cOSArray = new COSArray();
        this.rectArray = cOSArray;
        cOSArray.add((COSBase) new COSFloat(boundingBox.getLowerLeftX()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getLowerLeftY()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getUpperRightX()));
        cOSArray.add((COSBase) new COSFloat(boundingBox.getUpperRightY()));
    }

    public PDRectangle(COSArray cOSArray) {
        float[] copyOf = Arrays.copyOf(cOSArray.toFloatArray(), 4);
        COSArray cOSArray2 = new COSArray();
        this.rectArray = cOSArray2;
        cOSArray2.add((COSBase) new COSFloat(Math.min(copyOf[0], copyOf[2])));
        cOSArray2.add((COSBase) new COSFloat(Math.min(copyOf[1], copyOf[3])));
        cOSArray2.add((COSBase) new COSFloat(Math.max(copyOf[0], copyOf[2])));
        cOSArray2.add((COSBase) new COSFloat(Math.max(copyOf[1], copyOf[3])));
    }
}
