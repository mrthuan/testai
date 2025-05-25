package com.tom_roush.harmony.awt.geom;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AffineTransform implements Cloneable, Serializable {
    public static final int TYPE_FLIP = 64;
    public static final int TYPE_GENERAL_ROTATION = 16;
    public static final int TYPE_GENERAL_SCALE = 4;
    public static final int TYPE_GENERAL_TRANSFORM = 32;
    public static final int TYPE_IDENTITY = 0;
    public static final int TYPE_MASK_ROTATION = 24;
    public static final int TYPE_MASK_SCALE = 6;
    public static final int TYPE_QUADRANT_ROTATION = 8;
    public static final int TYPE_TRANSLATION = 1;
    public static final int TYPE_UNIFORM_SCALE = 2;
    static final int TYPE_UNKNOWN = -1;
    static final double ZERO = 1.0E-10d;
    private static final long serialVersionUID = 1330973210523860834L;
    double m00;
    double m01;
    double m02;
    double m10;
    double m11;
    double m12;
    transient int type;

    /* loaded from: classes2.dex */
    public class NoninvertibleTransformException extends Exception {
        private static final long serialVersionUID = 6137225240503990466L;

        public NoninvertibleTransformException(String str) {
            super(str);
        }
    }

    public AffineTransform() {
        this.type = 0;
        this.m11 = 1.0d;
        this.m00 = 1.0d;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.m01 = 0.0d;
        this.m10 = 0.0d;
    }

    public static AffineTransform getRotateInstance(double d10) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToRotation(d10);
        return affineTransform;
    }

    public static AffineTransform getScaleInstance(double d10, double d11) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToScale(d10, d11);
        return affineTransform;
    }

    public static AffineTransform getShearInstance(double d10, double d11) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToShear(d10, d11);
        return affineTransform;
    }

    public static AffineTransform getTranslateInstance(double d10, double d11) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToTranslation(d10, d11);
        return affineTransform;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.type = -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public void concatenate(AffineTransform affineTransform) {
        setTransform(multiply(affineTransform, this));
    }

    public AffineTransform createInverse() {
        double determinant = getDeterminant();
        if (Math.abs(determinant) >= ZERO) {
            double d10 = this.m11;
            double d11 = this.m10;
            double d12 = this.m01;
            double d13 = (-d12) / determinant;
            double d14 = this.m00;
            double d15 = this.m12;
            double d16 = this.m02;
            return new AffineTransform(d10 / determinant, (-d11) / determinant, d13, d14 / determinant, ((d12 * d15) - (d10 * d16)) / determinant, ((d11 * d16) - (d14 * d15)) / determinant);
        }
        throw new NoninvertibleTransformException("Determinant is zero");
    }

    public PointF deltaTransform(PointF pointF, PointF pointF2) {
        if (pointF2 == null) {
            pointF2 = new PointF();
        }
        float f10 = pointF.x;
        double d10 = f10 * this.m00;
        float f11 = pointF.y;
        pointF2.set((float) ((f11 * this.m01) + d10), (float) ((f11 * this.m11) + (f10 * this.m10)));
        return pointF2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AffineTransform)) {
            return false;
        }
        AffineTransform affineTransform = (AffineTransform) obj;
        if (this.m00 == affineTransform.m00 && this.m01 == affineTransform.m01 && this.m02 == affineTransform.m02 && this.m10 == affineTransform.m10 && this.m11 == affineTransform.m11 && this.m12 == affineTransform.m12) {
            return true;
        }
        return false;
    }

    public double getDeterminant() {
        return (this.m00 * this.m11) - (this.m01 * this.m10);
    }

    public void getMatrix(double[] dArr) {
        dArr[0] = this.m00;
        dArr[1] = this.m10;
        dArr[2] = this.m01;
        dArr[3] = this.m11;
        if (dArr.length > 4) {
            dArr[4] = this.m02;
            dArr[5] = this.m12;
        }
    }

    public double getScaleX() {
        return this.m00;
    }

    public double getScaleY() {
        return this.m11;
    }

    public double getShearX() {
        return this.m01;
    }

    public double getShearY() {
        return this.m10;
    }

    public double getTranslateX() {
        return this.m02;
    }

    public double getTranslateY() {
        return this.m12;
    }

    public int getType() {
        int i10;
        int i11 = this.type;
        if (i11 != -1) {
            return i11;
        }
        double d10 = this.m00;
        double d11 = this.m01;
        double d12 = this.m10;
        double d13 = this.m11;
        if ((d12 * d13) + (d10 * d11) != 0.0d) {
            return 32;
        }
        if (this.m02 == 0.0d && this.m12 == 0.0d) {
            i10 = 0;
            if (d10 == 1.0d && d13 == 1.0d && d11 == 0.0d && d12 == 0.0d) {
                return 0;
            }
        } else {
            i10 = 1;
        }
        if ((d10 * d13) - (d11 * d12) < 0.0d) {
            i10 |= 64;
        }
        double d14 = (d12 * d12) + (d10 * d10);
        if (d14 != (d13 * d13) + (d11 * d11)) {
            i10 |= 4;
        } else if (d14 != 1.0d) {
            i10 |= 2;
        }
        if ((d10 == 0.0d && d13 == 0.0d) || (d12 == 0.0d && d11 == 0.0d && (d10 < 0.0d || d13 < 0.0d))) {
            return i10 | 8;
        }
        if (d11 != 0.0d || d12 != 0.0d) {
            return i10 | 16;
        }
        return i10;
    }

    public PointF inverseTransform(PointF pointF, PointF pointF2) {
        double determinant = getDeterminant();
        if (Math.abs(determinant) >= ZERO) {
            if (pointF2 == null) {
                pointF2 = new PointF();
            }
            double d10 = (float) (pointF.x - this.m02);
            double d11 = (float) (pointF.y - this.m12);
            pointF2.set((float) (((this.m11 * d10) - (this.m01 * d11)) / determinant), (float) (((d11 * this.m00) - (d10 * this.m10)) / determinant));
            return pointF2;
        }
        throw new NoninvertibleTransformException("Determinant is zero");
    }

    public boolean isIdentity() {
        if (getType() == 0) {
            return true;
        }
        return false;
    }

    public AffineTransform multiply(AffineTransform affineTransform, AffineTransform affineTransform2) {
        double d10 = affineTransform.m00;
        double d11 = affineTransform2.m00;
        double d12 = affineTransform.m10;
        double d13 = affineTransform2.m01;
        double d14 = (d10 * d11) + (d12 * d13);
        double d15 = affineTransform2.m10;
        double d16 = affineTransform2.m11;
        double d17 = (d12 * d16) + (d10 * d15);
        double d18 = affineTransform.m01;
        double d19 = affineTransform.m11;
        double d20 = d19 * d13;
        double d21 = (d19 * d16) + (d18 * d15);
        double d22 = affineTransform.m02;
        double d23 = affineTransform.m12;
        return new AffineTransform(d14, d17, d20 + (d18 * d11), d21, (d13 * d23) + (d11 * d22) + affineTransform2.m02, (d23 * d16) + (d22 * d15) + affineTransform2.m12);
    }

    public void preConcatenate(AffineTransform affineTransform) {
        setTransform(multiply(this, affineTransform));
    }

    public void rotate(double d10) {
        concatenate(getRotateInstance(d10));
    }

    public void scale(double d10, double d11) {
        concatenate(getScaleInstance(d10, d11));
    }

    public void setToIdentity() {
        this.type = 0;
        this.m11 = 1.0d;
        this.m00 = 1.0d;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.m01 = 0.0d;
        this.m10 = 0.0d;
    }

    public void setToRotation(double d10) {
        double sin = Math.sin(d10);
        double cos = Math.cos(d10);
        if (Math.abs(cos) < ZERO) {
            sin = sin > 0.0d ? 1.0d : -1.0d;
            cos = 0.0d;
        } else if (Math.abs(sin) < ZERO) {
            cos = cos > 0.0d ? 1.0d : -1.0d;
            sin = 0.0d;
        }
        this.m11 = cos;
        this.m00 = cos;
        this.m01 = -sin;
        this.m10 = sin;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.type = -1;
    }

    public void setToScale(double d10, double d11) {
        this.m00 = d10;
        this.m11 = d11;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.m01 = 0.0d;
        this.m10 = 0.0d;
        if (d10 == 1.0d && d11 == 1.0d) {
            this.type = 0;
        } else {
            this.type = -1;
        }
    }

    public void setToShear(double d10, double d11) {
        this.m11 = 1.0d;
        this.m00 = 1.0d;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.m01 = d10;
        this.m10 = d11;
        if (d10 == 0.0d && d11 == 0.0d) {
            this.type = 0;
        } else {
            this.type = -1;
        }
    }

    public void setToTranslation(double d10, double d11) {
        this.m11 = 1.0d;
        this.m00 = 1.0d;
        this.m10 = 0.0d;
        this.m01 = 0.0d;
        this.m02 = d10;
        this.m12 = d11;
        if (d10 == 0.0d && d11 == 0.0d) {
            this.type = 0;
        } else {
            this.type = 1;
        }
    }

    public void setTransform(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.type = -1;
        this.m00 = d10;
        this.m10 = d11;
        this.m01 = d12;
        this.m11 = d13;
        this.m02 = d14;
        this.m12 = d15;
    }

    public void shear(double d10, double d11) {
        concatenate(getShearInstance(d10, d11));
    }

    public Matrix toMatrix() {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{(float) this.m00, (float) this.m01, (float) this.m02, (float) this.m10, (float) this.m11, (float) this.m12, 0.0f, 0.0f, 1.0f});
        return matrix;
    }

    public String toString() {
        return getClass().getName() + "[[" + this.m00 + ", " + this.m01 + ", " + this.m02 + "], [" + this.m10 + ", " + this.m11 + ", " + this.m12 + "]]";
    }

    public PointF transform(PointF pointF, PointF pointF2) {
        float f10 = pointF.x;
        double d10 = f10 * this.m00;
        float f11 = pointF.y;
        pointF2.set((float) ((f11 * this.m01) + d10 + this.m02), (float) ((f11 * this.m11) + (f10 * this.m10) + this.m12));
        return pointF2;
    }

    public void translate(double d10, double d11) {
        concatenate(getTranslateInstance(d10, d11));
    }

    public void rotate(double d10, double d11, double d12) {
        concatenate(getRotateInstance(d10, d11, d12));
    }

    public void transform(PointF[] pointFArr, int i10, PointF[] pointFArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            int i13 = i10 + 1;
            PointF pointF = pointFArr[i10];
            PointF pointF2 = pointFArr2[i11];
            if (pointF2 == null) {
                pointF2 = new PointF();
            }
            float f10 = pointF.x;
            double d10 = f10 * this.m00;
            float f11 = pointF.y;
            pointF2.set((float) ((f11 * this.m01) + d10 + this.m02), (float) ((f11 * this.m11) + (f10 * this.m10) + this.m12));
            pointFArr2[i11] = pointF2;
            i11++;
            i10 = i13;
        }
    }

    public static AffineTransform getRotateInstance(double d10, double d11, double d12) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToRotation(d10, d11, d12);
        return affineTransform;
    }

    public void deltaTransform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            int i13 = i10 + 1;
            double d10 = dArr[i10];
            i10 = i13 + 1;
            double d11 = dArr[i13];
            int i14 = i11 + 1;
            dArr2[i11] = (this.m01 * d11) + (this.m00 * d10);
            i11 = i14 + 1;
            dArr2[i14] = (d11 * this.m11) + (d10 * this.m10);
        }
    }

    public AffineTransform(AffineTransform affineTransform) {
        this.type = affineTransform.type;
        this.m00 = affineTransform.m00;
        this.m10 = affineTransform.m10;
        this.m01 = affineTransform.m01;
        this.m11 = affineTransform.m11;
        this.m02 = affineTransform.m02;
        this.m12 = affineTransform.m12;
    }

    public void transform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        int i13;
        int i14;
        int i15 = 2;
        if (dArr == dArr2 && i10 < i11 && i11 < (i14 = i10 + (i13 = i12 * 2))) {
            i10 = i14 - 2;
            i11 = (i11 + i13) - 2;
            i15 = -2;
        }
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            double d10 = dArr[i10 + 0];
            double d11 = dArr[i10 + 1];
            dArr2[i11 + 0] = (this.m01 * d11) + (this.m00 * d10) + this.m02;
            dArr2[i11 + 1] = (d11 * this.m11) + (d10 * this.m10) + this.m12;
            i10 += i15;
            i11 += i15;
        }
    }

    public void inverseTransform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        double determinant = getDeterminant();
        if (Math.abs(determinant) < ZERO) {
            throw new NoninvertibleTransformException("Determinant is zero");
        }
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        while (true) {
            i15--;
            if (i15 < 0) {
                return;
            }
            int i16 = i13 + 1;
            double d10 = dArr[i13] - this.m02;
            i13 = i16 + 1;
            double d11 = dArr[i16] - this.m12;
            int i17 = i14 + 1;
            dArr2[i14] = ((this.m11 * d10) - (this.m01 * d11)) / determinant;
            i14 = i17 + 1;
            dArr2[i17] = ((d11 * this.m00) - (d10 * this.m10)) / determinant;
        }
    }

    public void setTransform(AffineTransform affineTransform) {
        this.type = affineTransform.type;
        setTransform(affineTransform.m00, affineTransform.m10, affineTransform.m01, affineTransform.m11, affineTransform.m02, affineTransform.m12);
    }

    public void setToRotation(double d10, double d11, double d12) {
        setToRotation(d10);
        double d13 = this.m00;
        double d14 = this.m10;
        this.m02 = (d12 * d14) + ((1.0d - d13) * d11);
        this.m12 = ((1.0d - d13) * d12) - (d11 * d14);
        this.type = -1;
    }

    public void transform(float[] fArr, int i10, float[] fArr2, int i11, int i12) {
        int i13;
        int i14;
        int i15 = 2;
        if (fArr == fArr2 && i10 < i11 && i11 < (i14 = i10 + (i13 = i12 * 2))) {
            i10 = i14 - 2;
            i11 = (i11 + i13) - 2;
            i15 = -2;
        }
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            double d10 = fArr[i10 + 0];
            double d11 = fArr[i10 + 1];
            fArr2[i11 + 0] = (float) ((this.m01 * d11) + (this.m00 * d10) + this.m02);
            fArr2[i11 + 1] = (float) ((d11 * this.m11) + (d10 * this.m10) + this.m12);
            i10 += i15;
            i11 += i15;
        }
    }

    public AffineTransform(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.type = -1;
        this.m00 = f10;
        this.m10 = f11;
        this.m01 = f12;
        this.m11 = f13;
        this.m02 = f14;
        this.m12 = f15;
    }

    public void transform(float[] fArr, int i10, double[] dArr, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        while (true) {
            i15--;
            if (i15 < 0) {
                return;
            }
            int i16 = i13 + 1;
            int i17 = i14 + 1;
            double d10 = fArr[i13];
            double d11 = fArr[i16];
            dArr[i14] = (this.m01 * d11) + (this.m00 * d10) + this.m02;
            i14 = i17 + 1;
            dArr[i17] = (d11 * this.m11) + (d10 * this.m10) + this.m12;
            i13 = i16 + 1;
        }
    }

    public void transform(double[] dArr, int i10, float[] fArr, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            }
            int i13 = i10 + 1;
            double d10 = dArr[i10];
            i10 = i13 + 1;
            double d11 = dArr[i13];
            int i14 = i11 + 1;
            fArr[i11] = (float) ((this.m01 * d11) + (this.m00 * d10) + this.m02);
            i11 = i14 + 1;
            fArr[i14] = (float) ((d11 * this.m11) + (d10 * this.m10) + this.m12);
        }
    }

    public AffineTransform(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.type = -1;
        this.m00 = d10;
        this.m10 = d11;
        this.m01 = d12;
        this.m11 = d13;
        this.m02 = d14;
        this.m12 = d15;
    }

    public AffineTransform(float[] fArr) {
        this.type = -1;
        this.m00 = fArr[0];
        this.m10 = fArr[1];
        this.m01 = fArr[2];
        this.m11 = fArr[3];
        if (fArr.length > 4) {
            this.m02 = fArr[4];
            this.m12 = fArr[5];
        }
    }

    public AffineTransform(double[] dArr) {
        this.type = -1;
        this.m00 = dArr[0];
        this.m10 = dArr[1];
        this.m01 = dArr[2];
        this.m11 = dArr[3];
        if (dArr.length > 4) {
            this.m02 = dArr[4];
            this.m12 = dArr[5];
        }
    }

    public AffineTransform(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.m00 = fArr[0];
        this.m01 = fArr[1];
        this.m02 = fArr[2];
        this.m10 = fArr[3];
        this.m11 = fArr[4];
        this.m12 = fArr[5];
    }
}
