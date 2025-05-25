package com.tom_roush.pdfbox.util;

import android.graphics.PointF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Matrix implements Cloneable {
    private static final float MAX_FLOAT_VALUE = Float.MAX_VALUE;
    public static final int SIZE = 9;
    private float[] single;

    public Matrix() {
        this.single = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static Matrix createMatrix(COSBase cOSBase) {
        if (!(cOSBase instanceof COSArray)) {
            return new Matrix();
        }
        COSArray cOSArray = (COSArray) cOSBase;
        if (cOSArray.size() < 6) {
            return new Matrix();
        }
        for (int i10 = 0; i10 < 6; i10++) {
            if (!(cOSArray.getObject(i10) instanceof COSNumber)) {
                return new Matrix();
            }
        }
        return new Matrix(cOSArray);
    }

    public static Matrix getRotateInstance(double d10, float f10, float f11) {
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        return new Matrix(cos, sin, -sin, cos, f10, f11);
    }

    public static Matrix getScaleInstance(float f10, float f11) {
        return new Matrix(f10, 0.0f, 0.0f, f11, 0.0f, 0.0f);
    }

    public static Matrix getTranslateInstance(float f10, float f11) {
        return new Matrix(1.0f, 0.0f, 0.0f, 1.0f, f10, f11);
    }

    @Deprecated
    public static Matrix getTranslatingInstance(float f10, float f11) {
        return new Matrix(1.0f, 0.0f, 0.0f, 1.0f, f10, f11);
    }

    private static boolean isFinite(float f10) {
        if (Math.abs(f10) <= MAX_FLOAT_VALUE) {
            return true;
        }
        return false;
    }

    private void multiplyArrays(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr[1];
        float f11 = fArr2[3];
        float f12 = fArr[2];
        float f13 = fArr2[6];
        float f14 = f12 * f13;
        fArr3[0] = f14 + (f10 * f11) + (fArr[0] * fArr2[0]);
        float f15 = fArr[0];
        float f16 = fArr2[4];
        float f17 = fArr2[7];
        float f18 = f12 * f17;
        fArr3[1] = f18 + (f10 * f16) + (fArr2[1] * f15);
        float f19 = f15 * fArr2[2];
        float f20 = fArr[1];
        float f21 = fArr2[5];
        float f22 = fArr2[8];
        fArr3[2] = (f12 * f22) + (f20 * f21) + f19;
        float f23 = fArr[3];
        float f24 = fArr2[0];
        float f25 = fArr[4];
        float f26 = (f11 * f25) + (f23 * f24);
        float f27 = fArr[5];
        fArr3[3] = (f27 * f13) + f26;
        float f28 = fArr[3];
        float f29 = fArr2[1];
        float f30 = f25 * f16;
        fArr3[4] = (f27 * f17) + f30 + (f28 * f29);
        float f31 = fArr2[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (fArr[4] * f21) + (f28 * f31);
        float f33 = fArr[6] * f24;
        float f34 = fArr[7];
        float f35 = (fArr2[3] * f34) + f33;
        float f36 = fArr[8];
        fArr3[6] = (f13 * f36) + f35;
        float f37 = fArr[6];
        float f38 = f17 * f36;
        fArr3[7] = f38 + (f34 * fArr2[4]) + (f29 * f37);
        float f39 = f36 * f22;
        fArr3[8] = f39 + (fArr[7] * fArr2[5]) + (f37 * f31);
    }

    public void concatenate(Matrix matrix) {
        matrix.multiply(this, this);
    }

    public AffineTransform createAffineTransform() {
        float[] fArr = this.single;
        return new AffineTransform(fArr[0], fArr[1], fArr[3], fArr[4], fArr[6], fArr[7]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Matrix.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.single, ((Matrix) obj).single);
    }

    @Deprecated
    public Matrix extractScaling() {
        Matrix matrix = new Matrix();
        float[] fArr = matrix.single;
        float[] fArr2 = this.single;
        fArr[0] = fArr2[0];
        fArr[4] = fArr2[4];
        return matrix;
    }

    @Deprecated
    public Matrix extractTranslating() {
        Matrix matrix = new Matrix();
        float[] fArr = matrix.single;
        float[] fArr2 = this.single;
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        return matrix;
    }

    public float getScaleX() {
        return this.single[0];
    }

    public float getScaleY() {
        return this.single[4];
    }

    public float getScalingFactorX() {
        float[] fArr = this.single;
        if (fArr[1] != 0.0f) {
            return (float) Math.sqrt(Math.pow(this.single[1], 2.0d) + Math.pow(fArr[0], 2.0d));
        }
        return fArr[0];
    }

    public float getScalingFactorY() {
        float[] fArr = this.single;
        float f10 = fArr[3];
        if (f10 != 0.0f) {
            return (float) Math.sqrt(Math.pow(this.single[4], 2.0d) + Math.pow(f10, 2.0d));
        }
        return fArr[4];
    }

    public float getShearX() {
        return this.single[3];
    }

    public float getShearY() {
        return this.single[1];
    }

    public float getTranslateX() {
        return this.single[6];
    }

    public float getTranslateY() {
        return this.single[7];
    }

    public float getValue(int i10, int i11) {
        return this.single[(i10 * 3) + i11];
    }

    public float[][] getValues() {
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 3, 3);
        float[] fArr2 = fArr[0];
        float[] fArr3 = this.single;
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        fArr2[2] = fArr3[2];
        float[] fArr4 = fArr[1];
        fArr4[0] = fArr3[3];
        fArr4[1] = fArr3[4];
        fArr4[2] = fArr3[5];
        float[] fArr5 = fArr[2];
        fArr5[0] = fArr3[6];
        fArr5[1] = fArr3[7];
        fArr5[2] = fArr3[8];
        return fArr;
    }

    @Deprecated
    public double[][] getValuesAsDouble() {
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, 3, 3);
        double[] dArr2 = dArr[0];
        float[] fArr = this.single;
        dArr2[0] = fArr[0];
        dArr2[1] = fArr[1];
        dArr2[2] = fArr[2];
        double[] dArr3 = dArr[1];
        dArr3[0] = fArr[3];
        dArr3[1] = fArr[4];
        dArr3[2] = fArr[5];
        double[] dArr4 = dArr[2];
        dArr4[0] = fArr[6];
        dArr4[1] = fArr[7];
        dArr4[2] = fArr[8];
        return dArr;
    }

    @Deprecated
    public float getXPosition() {
        return this.single[6];
    }

    @Deprecated
    public float getYPosition() {
        return this.single[7];
    }

    public int hashCode() {
        return Arrays.hashCode(this.single);
    }

    public Matrix multiply(Matrix matrix) {
        return multiply(matrix, new Matrix());
    }

    @Deprecated
    public void reset() {
        Arrays.fill(this.single, 0.0f);
        float[] fArr = this.single;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        fArr[8] = 1.0f;
    }

    public void rotate(double d10) {
        concatenate(getRotateInstance(d10, 0.0f, 0.0f));
    }

    public void scale(float f10, float f11) {
        concatenate(getScaleInstance(f10, f11));
    }

    @Deprecated
    public void setFromAffineTransform(AffineTransform affineTransform) {
        this.single[0] = (float) affineTransform.getScaleX();
        this.single[1] = (float) affineTransform.getShearY();
        this.single[3] = (float) affineTransform.getShearX();
        this.single[4] = (float) affineTransform.getScaleY();
        this.single[6] = (float) affineTransform.getTranslateX();
        this.single[7] = (float) affineTransform.getTranslateY();
    }

    public void setValue(int i10, int i11, float f10) {
        this.single[(i10 * 3) + i11] = f10;
    }

    public COSArray toCOSArray() {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(this.single[0]));
        cOSArray.add((COSBase) new COSFloat(this.single[1]));
        cOSArray.add((COSBase) new COSFloat(this.single[3]));
        cOSArray.add((COSBase) new COSFloat(this.single[4]));
        cOSArray.add((COSBase) new COSFloat(this.single[6]));
        cOSArray.add((COSBase) new COSFloat(this.single[7]));
        return cOSArray;
    }

    public String toString() {
        return "[" + this.single[0] + "," + this.single[1] + "," + this.single[3] + "," + this.single[4] + "," + this.single[6] + "," + this.single[7] + "]";
    }

    public void transform(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float[] fArr = this.single;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        pointF.set((f14 * f11) + (f12 * f10) + fArr[6], (f11 * f15) + (f10 * f13) + fArr[7]);
    }

    public PointF transformPoint(float f10, float f11) {
        float[] fArr = this.single;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        return new PointF((f14 * f11) + (f12 * f10) + fArr[6], (f11 * f15) + (f10 * f13) + fArr[7]);
    }

    public void translate(Vector vector) {
        concatenate(getTranslateInstance(vector.getX(), vector.getY()));
    }

    public static Matrix concatenate(Matrix matrix, Matrix matrix2) {
        return matrix2.multiply(matrix);
    }

    /* renamed from: clone */
    public Matrix m11clone() {
        return new Matrix((float[]) this.single.clone());
    }

    @Deprecated
    public Matrix multiply(Matrix matrix, Matrix matrix2) {
        float[] fArr = (matrix2 == null || matrix2 == matrix || matrix2 == this) ? new float[9] : matrix2.single;
        multiplyArrays(this.single, matrix.single, fArr);
        if (isFinite(fArr[0]) && isFinite(fArr[1]) && isFinite(fArr[2]) && isFinite(fArr[3]) && isFinite(fArr[4]) && isFinite(fArr[5]) && isFinite(fArr[6]) && isFinite(fArr[7]) && isFinite(fArr[8])) {
            if (matrix2 == null) {
                return new Matrix(fArr);
            }
            matrix2.single = fArr;
            return matrix2;
        }
        throw new IllegalArgumentException("Multiplying two matrices produces illegal values");
    }

    public void translate(float f10, float f11) {
        concatenate(getTranslateInstance(f10, f11));
    }

    private Matrix(float[] fArr) {
        this.single = fArr;
    }

    public Matrix(COSArray cOSArray) {
        float[] fArr = new float[9];
        this.single = fArr;
        fArr[0] = ((COSNumber) cOSArray.getObject(0)).floatValue();
        this.single[1] = ((COSNumber) cOSArray.getObject(1)).floatValue();
        this.single[3] = ((COSNumber) cOSArray.getObject(2)).floatValue();
        this.single[4] = ((COSNumber) cOSArray.getObject(3)).floatValue();
        this.single[6] = ((COSNumber) cOSArray.getObject(4)).floatValue();
        this.single[7] = ((COSNumber) cOSArray.getObject(5)).floatValue();
        this.single[8] = 1.0f;
    }

    public Vector transform(Vector vector) {
        float[] fArr = this.single;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float x4 = vector.getX();
        float y10 = vector.getY();
        return new Vector((f12 * y10) + (f10 * x4) + f14, (y10 * f13) + (x4 * f11) + f15);
    }

    public Matrix(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.single = r0;
        float[] fArr = {f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 1.0f};
    }

    public Matrix(AffineTransform affineTransform) {
        float[] fArr = new float[9];
        this.single = fArr;
        fArr[0] = (float) affineTransform.getScaleX();
        this.single[1] = (float) affineTransform.getShearY();
        this.single[3] = (float) affineTransform.getShearX();
        this.single[4] = (float) affineTransform.getScaleY();
        this.single[6] = (float) affineTransform.getTranslateX();
        this.single[7] = (float) affineTransform.getTranslateY();
        this.single[8] = 1.0f;
    }
}
