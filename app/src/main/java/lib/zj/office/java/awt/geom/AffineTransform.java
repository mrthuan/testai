package lib.zj.office.java.awt.geom;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lib.zj.office.java.awt.geom.Path2D;
import lib.zj.office.java.awt.geom.Point2D;

/* loaded from: classes3.dex */
public class AffineTransform implements Cloneable, Serializable {
    static final int APPLY_IDENTITY = 0;
    static final int APPLY_SCALE = 2;
    static final int APPLY_SHEAR = 4;
    static final int APPLY_TRANSLATE = 1;
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

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f20693b = {4, 5, 4, 5, 2, 3, 6, 7};
    private static final long serialVersionUID = 1330973210523860834L;

    /* renamed from: a  reason: collision with root package name */
    public transient int f20694a;
    double m00;
    double m01;
    double m02;
    double m10;
    double m11;
    double m12;
    transient int state;

    public AffineTransform(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
        this.m00 = d10;
        this.m10 = d11;
        this.m01 = d12;
        this.m11 = d13;
        this.m02 = d14;
        this.m12 = d15;
        this.state = i10;
        this.f20694a = -1;
    }

    public static double a(double d10) {
        return Math.rint(d10 * 1.0E15d) / 1.0E15d;
    }

    public static void f() {
        throw new InternalError("missing case in transform state switch");
    }

    public static AffineTransform getQuadrantRotateInstance(int i10) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToQuadrantRotation(i10);
        return affineTransform;
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
        updateState();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public final void c() {
        double d10 = -this.m00;
        this.m00 = d10;
        double d11 = -this.m11;
        this.m11 = d11;
        int i10 = this.state;
        if ((i10 & 4) != 0) {
            this.m01 = -this.m01;
            this.m10 = -this.m10;
        } else if (d10 == 1.0d && d11 == 1.0d) {
            this.state = i10 & (-3);
        } else {
            this.state = i10 | 2;
        }
        this.f20694a = -1;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void concatenate(AffineTransform affineTransform) {
        int i10 = this.state;
        int i11 = affineTransform.state;
        int i12 = (i11 << 3) | i10;
        if (i12 != 48) {
            if (i12 != 56) {
                switch (i12) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return;
                    case 8:
                        this.m02 = affineTransform.m02;
                        this.m12 = affineTransform.m12;
                        this.state = i11;
                        this.f20694a = affineTransform.f20694a;
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        translate(affineTransform.m02, affineTransform.m12);
                        return;
                    case 16:
                        break;
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        scale(affineTransform.m00, affineTransform.m11);
                        return;
                    case 24:
                        break;
                    default:
                        switch (i12) {
                            case 32:
                                break;
                            case 33:
                                this.m00 = 0.0d;
                                this.m01 = affineTransform.m01;
                                this.m10 = affineTransform.m10;
                                this.m11 = 0.0d;
                                this.state = 5;
                                this.f20694a = -1;
                                return;
                            case 34:
                            case 35:
                                this.m01 = this.m00 * affineTransform.m01;
                                this.m00 = 0.0d;
                                this.m10 = this.m11 * affineTransform.m10;
                                this.m11 = 0.0d;
                                this.state = i10 ^ 6;
                                this.f20694a = -1;
                                return;
                            case 36:
                            case 37:
                                this.m00 = this.m01 * affineTransform.m10;
                                this.m01 = 0.0d;
                                this.m11 = this.m10 * affineTransform.m01;
                                this.m10 = 0.0d;
                                this.state = i10 ^ 6;
                                this.f20694a = -1;
                                return;
                            case 38:
                            case 39:
                                double d10 = affineTransform.m01;
                                double d11 = affineTransform.m10;
                                double d12 = this.m00;
                                this.m00 = this.m01 * d11;
                                this.m01 = d12 * d10;
                                double d13 = this.m10;
                                this.m10 = this.m11 * d11;
                                this.m11 = d13 * d10;
                                this.f20694a = -1;
                                return;
                            case 40:
                                this.m02 = affineTransform.m02;
                                this.m12 = affineTransform.m12;
                                break;
                            default:
                                double d14 = affineTransform.m00;
                                double d15 = affineTransform.m01;
                                double d16 = affineTransform.m02;
                                double d17 = affineTransform.m10;
                                double d18 = affineTransform.m11;
                                double d19 = affineTransform.m12;
                                switch (i10) {
                                    case 1:
                                        this.m00 = d14;
                                        this.m01 = d15;
                                        this.m02 += d16;
                                        this.m10 = d17;
                                        this.m11 = d18;
                                        this.m12 += d19;
                                        this.state = i11 | 1;
                                        this.f20694a = -1;
                                        return;
                                    case 2:
                                    case 3:
                                        double d20 = this.m00;
                                        this.m00 = d14 * d20;
                                        this.m01 = d15 * d20;
                                        this.m02 = (d16 * d20) + this.m02;
                                        double d21 = this.m11;
                                        this.m10 = d17 * d21;
                                        this.m11 = d18 * d21;
                                        this.m12 = (d19 * d21) + this.m12;
                                        updateState();
                                        return;
                                    case 4:
                                    case 5:
                                        double d22 = this.m01;
                                        this.m00 = d17 * d22;
                                        this.m01 = d18 * d22;
                                        this.m02 = (d19 * d22) + this.m02;
                                        double d23 = this.m10;
                                        this.m10 = d14 * d23;
                                        this.m11 = d15 * d23;
                                        this.m12 = (d16 * d23) + this.m12;
                                        updateState();
                                        return;
                                    case 6:
                                        this.state = i10 | i11;
                                        double d24 = this.m00;
                                        double d25 = this.m01;
                                        this.m00 = (d17 * d25) + (d14 * d24);
                                        this.m01 = (d18 * d25) + (d15 * d24);
                                        this.m02 = androidx.activity.r.a(d19, d25, d24 * d16, this.m02);
                                        double d26 = this.m10;
                                        double d27 = this.m11;
                                        this.m10 = (d17 * d27) + (d14 * d26);
                                        this.m11 = (d18 * d27) + (d15 * d26);
                                        this.m12 = androidx.activity.r.a(d19, d27, d16 * d26, this.m12);
                                        this.f20694a = -1;
                                        return;
                                    case 7:
                                        double d242 = this.m00;
                                        double d252 = this.m01;
                                        this.m00 = (d17 * d252) + (d14 * d242);
                                        this.m01 = (d18 * d252) + (d15 * d242);
                                        this.m02 = androidx.activity.r.a(d19, d252, d242 * d16, this.m02);
                                        double d262 = this.m10;
                                        double d272 = this.m11;
                                        this.m10 = (d17 * d272) + (d14 * d262);
                                        this.m11 = (d18 * d272) + (d15 * d262);
                                        this.m12 = androidx.activity.r.a(d19, d272, d16 * d262, this.m12);
                                        this.f20694a = -1;
                                        return;
                                    default:
                                        f();
                                        throw null;
                                }
                        }
                        this.m01 = affineTransform.m01;
                        this.m10 = affineTransform.m10;
                        this.m11 = 0.0d;
                        this.m00 = 0.0d;
                        this.state = i11;
                        this.f20694a = affineTransform.f20694a;
                        return;
                }
            } else {
                this.m01 = affineTransform.m01;
                this.m10 = affineTransform.m10;
            }
            this.m00 = affineTransform.m00;
            this.m11 = affineTransform.m11;
            this.m02 = affineTransform.m02;
            this.m12 = affineTransform.m12;
            this.state = i11;
            this.f20694a = affineTransform.f20694a;
            return;
        }
        this.m01 = affineTransform.m01;
        this.m10 = affineTransform.m10;
        this.m00 = affineTransform.m00;
        this.m11 = affineTransform.m11;
        this.state = i11;
        this.f20694a = affineTransform.f20694a;
    }

    public AffineTransform createInverse() {
        switch (this.state) {
            case 0:
                return new AffineTransform();
            case 1:
                return new AffineTransform(1.0d, 0.0d, 0.0d, 1.0d, -this.m02, -this.m12, 1);
            case 2:
                double d10 = this.m00;
                if (d10 != 0.0d) {
                    double d11 = this.m11;
                    if (d11 != 0.0d) {
                        return new AffineTransform(1.0d / d10, 0.0d, 0.0d, 1.0d / d11, 0.0d, 0.0d, 2);
                    }
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 3:
                double d12 = this.m00;
                if (d12 != 0.0d) {
                    double d13 = this.m11;
                    if (d13 != 0.0d) {
                        return new AffineTransform(1.0d / d12, 0.0d, 0.0d, 1.0d / d13, (-this.m02) / d12, (-this.m12) / d13, 3);
                    }
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 4:
                double d14 = this.m01;
                if (d14 != 0.0d) {
                    double d15 = this.m10;
                    if (d15 != 0.0d) {
                        return new AffineTransform(0.0d, 1.0d / d14, 1.0d / d15, 0.0d, 0.0d, 0.0d, 4);
                    }
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 5:
                double d16 = this.m01;
                if (d16 != 0.0d) {
                    double d17 = this.m10;
                    if (d17 != 0.0d) {
                        return new AffineTransform(0.0d, 1.0d / d16, 1.0d / d17, 0.0d, (-this.m12) / d17, (-this.m02) / d16, 5);
                    }
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 6:
                double d18 = (this.m00 * this.m11) - (this.m01 * this.m10);
                if (Math.abs(d18) > Double.MIN_VALUE) {
                    return new AffineTransform(this.m11 / d18, (-this.m10) / d18, (-this.m01) / d18, this.m00 / d18, 0.0d, 0.0d, 6);
                }
                throw new NoninvertibleTransformException("Determinant is " + d18);
            case 7:
                double d19 = (this.m00 * this.m11) - (this.m01 * this.m10);
                if (Math.abs(d19) > Double.MIN_VALUE) {
                    double d20 = this.m11;
                    double d21 = this.m10;
                    double d22 = (-d21) / d19;
                    double d23 = this.m01;
                    double d24 = (-d23) / d19;
                    double d25 = this.m00;
                    double d26 = this.m12;
                    double d27 = d23 * d26;
                    double d28 = this.m02;
                    return new AffineTransform(d20 / d19, d22, d24, d25 / d19, (d27 - (d20 * d28)) / d19, ((d21 * d28) - (d25 * d26)) / d19, 7);
                }
                throw new NoninvertibleTransformException("Determinant is " + d19);
            default:
                f();
                throw null;
        }
    }

    public lib.zj.office.java.awt.b createTransformedShape(lib.zj.office.java.awt.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new Path2D.Double(bVar, this);
    }

    public final void d() {
        double d10 = this.m00;
        double d11 = -this.m01;
        this.m00 = d11;
        this.m01 = d10;
        double d12 = this.m10;
        this.m10 = -this.m11;
        this.m11 = d12;
        int i10 = f20693b[this.state];
        if ((i10 & 6) == 2 && d11 == 1.0d && d12 == 1.0d) {
            i10 -= 2;
        }
        this.state = i10;
        this.f20694a = -1;
    }

    public Point2D deltaTransform(Point2D point2D, Point2D point2D2) {
        if (point2D2 == null) {
            if (point2D instanceof Point2D.Double) {
                point2D2 = new Point2D.Double();
            } else {
                point2D2 = new Point2D.Float();
            }
        }
        double x4 = point2D.getX();
        double y10 = point2D.getY();
        switch (this.state) {
            case 0:
            case 1:
                point2D2.setLocation(x4, y10);
                return point2D2;
            case 2:
            case 3:
                point2D2.setLocation(x4 * this.m00, y10 * this.m11);
                return point2D2;
            case 4:
            case 5:
                point2D2.setLocation(y10 * this.m01, x4 * this.m10);
                return point2D2;
            case 6:
            case 7:
                point2D2.setLocation((this.m01 * y10) + (this.m00 * x4), (y10 * this.m11) + (x4 * this.m10));
                return point2D2;
            default:
                f();
                throw null;
        }
    }

    public final void e() {
        double d10 = this.m00;
        double d11 = this.m01;
        this.m00 = d11;
        this.m01 = -d10;
        double d12 = this.m10;
        this.m10 = this.m11;
        double d13 = -d12;
        this.m11 = d13;
        int i10 = f20693b[this.state];
        if ((i10 & 6) == 2 && d11 == 1.0d && d13 == 1.0d) {
            i10 -= 2;
        }
        this.state = i10;
        this.f20694a = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AffineTransform)) {
            return false;
        }
        AffineTransform affineTransform = (AffineTransform) obj;
        if (this.m00 != affineTransform.m00 || this.m01 != affineTransform.m01 || this.m02 != affineTransform.m02 || this.m10 != affineTransform.m10 || this.m11 != affineTransform.m11 || this.m12 != affineTransform.m12) {
            return false;
        }
        return true;
    }

    public double getDeterminant() {
        switch (this.state) {
            case 0:
            case 1:
                return 1.0d;
            case 2:
            case 3:
                return this.m00 * this.m11;
            case 4:
            case 5:
                return -(this.m01 * this.m10);
            case 6:
            case 7:
                return (this.m00 * this.m11) - (this.m01 * this.m10);
            default:
                f();
                throw null;
        }
    }

    public void getMatrix(double[] dArr) {
        dArr[0] = this.m00;
        dArr[1] = this.m10;
        dArr[2] = this.m01;
        dArr[3] = this.m11;
        if (dArr.length > 5) {
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

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
        if (r2 != (-1.0d)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00db, code lost:
        if (r2 != (-1.0d)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00dd, code lost:
        r2 = r1 | 10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getType() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.AffineTransform.getType():int");
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.m01);
        long doubleToLongBits2 = Double.doubleToLongBits(this.m02);
        long doubleToLongBits3 = Double.doubleToLongBits(this.m10);
        long doubleToLongBits4 = Double.doubleToLongBits(this.m11);
        long doubleToLongBits5 = Double.doubleToLongBits(this.m12) + ((doubleToLongBits4 + ((doubleToLongBits3 + ((doubleToLongBits2 + ((doubleToLongBits + (Double.doubleToLongBits(this.m00) * 31)) * 31)) * 31)) * 31)) * 31);
        return ((int) doubleToLongBits5) ^ ((int) (doubleToLongBits5 >> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lib.zj.office.java.awt.geom.Point2D inverseTransform(lib.zj.office.java.awt.geom.Point2D r12, lib.zj.office.java.awt.geom.Point2D r13) {
        /*
            r11 = this;
            if (r13 != 0) goto L11
            boolean r13 = r12 instanceof lib.zj.office.java.awt.geom.Point2D.Double
            if (r13 == 0) goto Lc
            lib.zj.office.java.awt.geom.Point2D$Double r13 = new lib.zj.office.java.awt.geom.Point2D$Double
            r13.<init>()
            goto L11
        Lc:
            lib.zj.office.java.awt.geom.Point2D$Float r13 = new lib.zj.office.java.awt.geom.Point2D$Float
            r13.<init>()
        L11:
            double r0 = r12.getX()
            double r2 = r12.getY()
            int r12 = r11.state
            java.lang.String r4 = "Determinant is 0"
            r5 = 0
            switch(r12) {
                case 0: goto Lb0;
                case 1: goto La6;
                case 2: goto L8e;
                case 3: goto L88;
                case 4: goto L70;
                case 5: goto L6a;
                case 6: goto L2d;
                case 7: goto L27;
                default: goto L22;
            }
        L22:
            f()
            r12 = 0
            throw r12
        L27:
            double r4 = r11.m02
            double r0 = r0 - r4
            double r4 = r11.m12
            double r2 = r2 - r4
        L2d:
            double r4 = r11.m00
            double r6 = r11.m11
            double r4 = r4 * r6
            double r6 = r11.m01
            double r8 = r11.m10
            double r6 = r6 * r8
            double r4 = r4 - r6
            double r6 = java.lang.Math.abs(r4)
            r8 = 1
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L56
            double r6 = r11.m11
            double r6 = r6 * r0
            double r8 = r11.m01
            double r8 = r8 * r2
            double r6 = r6 - r8
            double r6 = r6 / r4
            double r8 = r11.m00
            double r2 = r2 * r8
            double r8 = r11.m10
            double r0 = r0 * r8
            double r2 = r2 - r0
            double r2 = r2 / r4
            r13.setLocation(r6, r2)
            return r13
        L56:
            lib.zj.office.java.awt.geom.NoninvertibleTransformException r12 = new lib.zj.office.java.awt.geom.NoninvertibleTransformException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Determinant is "
            r13.<init>(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L6a:
            double r7 = r11.m02
            double r0 = r0 - r7
            double r7 = r11.m12
            double r2 = r2 - r7
        L70:
            double r7 = r11.m01
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 == 0) goto L82
            double r9 = r11.m10
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 == 0) goto L82
            double r2 = r2 / r9
            double r0 = r0 / r7
            r13.setLocation(r2, r0)
            return r13
        L82:
            lib.zj.office.java.awt.geom.NoninvertibleTransformException r12 = new lib.zj.office.java.awt.geom.NoninvertibleTransformException
            r12.<init>(r4)
            throw r12
        L88:
            double r7 = r11.m02
            double r0 = r0 - r7
            double r7 = r11.m12
            double r2 = r2 - r7
        L8e:
            double r7 = r11.m00
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 == 0) goto La0
            double r9 = r11.m11
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 == 0) goto La0
            double r0 = r0 / r7
            double r2 = r2 / r9
            r13.setLocation(r0, r2)
            return r13
        La0:
            lib.zj.office.java.awt.geom.NoninvertibleTransformException r12 = new lib.zj.office.java.awt.geom.NoninvertibleTransformException
            r12.<init>(r4)
            throw r12
        La6:
            double r4 = r11.m02
            double r0 = r0 - r4
            double r4 = r11.m12
            double r2 = r2 - r4
            r13.setLocation(r0, r2)
            return r13
        Lb0:
            r13.setLocation(r0, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.AffineTransform.inverseTransform(lib.zj.office.java.awt.geom.Point2D, lib.zj.office.java.awt.geom.Point2D):lib.zj.office.java.awt.geom.Point2D");
    }

    public void invert() {
        switch (this.state) {
            case 0:
                return;
            case 1:
                this.m02 = -this.m02;
                this.m12 = -this.m12;
                return;
            case 2:
                double d10 = this.m00;
                double d11 = this.m11;
                if (d10 != 0.0d && d11 != 0.0d) {
                    this.m00 = 1.0d / d10;
                    this.m11 = 1.0d / d11;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 3:
                double d12 = this.m00;
                double d13 = this.m02;
                double d14 = this.m11;
                double d15 = this.m12;
                if (d12 != 0.0d && d14 != 0.0d) {
                    this.m00 = 1.0d / d12;
                    this.m11 = 1.0d / d14;
                    this.m02 = (-d13) / d12;
                    this.m12 = (-d15) / d14;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 4:
                double d16 = this.m01;
                double d17 = this.m10;
                if (d16 != 0.0d && d17 != 0.0d) {
                    this.m10 = 1.0d / d16;
                    this.m01 = 1.0d / d17;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 5:
                double d18 = this.m01;
                double d19 = this.m02;
                double d20 = this.m10;
                double d21 = this.m12;
                if (d18 != 0.0d && d20 != 0.0d) {
                    this.m10 = 1.0d / d18;
                    this.m01 = 1.0d / d20;
                    this.m02 = (-d21) / d20;
                    this.m12 = (-d19) / d18;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is 0");
            case 6:
                double d22 = this.m00;
                double d23 = this.m01;
                double d24 = this.m10;
                double d25 = this.m11;
                double d26 = (d22 * d25) - (d23 * d24);
                if (Math.abs(d26) > Double.MIN_VALUE) {
                    this.m00 = d25 / d26;
                    this.m10 = (-d24) / d26;
                    this.m01 = (-d23) / d26;
                    this.m11 = d22 / d26;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is " + d26);
            case 7:
                double d27 = this.m00;
                double d28 = this.m01;
                double d29 = this.m02;
                double d30 = this.m10;
                double d31 = this.m11;
                double d32 = this.m12;
                double d33 = (d27 * d31) - (d28 * d30);
                if (Math.abs(d33) > Double.MIN_VALUE) {
                    this.m00 = d31 / d33;
                    this.m10 = (-d30) / d33;
                    this.m01 = (-d28) / d33;
                    this.m11 = d27 / d33;
                    this.m02 = ((d28 * d32) - (d31 * d29)) / d33;
                    this.m12 = ((d30 * d29) - (d27 * d32)) / d33;
                    return;
                }
                throw new NoninvertibleTransformException("Determinant is " + d33);
            default:
                f();
                throw null;
        }
    }

    public boolean isIdentity() {
        if (this.state != 0 && getType() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void preConcatenate(AffineTransform affineTransform) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        int i10 = this.state;
        int i11 = affineTransform.state;
        int i12 = (i11 << 3) | i10;
        switch (i12) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
            case 10:
            case 12:
            case 14:
                this.m02 = affineTransform.m02;
                this.m12 = affineTransform.m12;
                this.state = i10 | 1;
                this.f20694a |= 1;
                return;
            case 9:
            case 11:
            case 13:
            case 15:
                this.m02 += affineTransform.m02;
                this.m12 += affineTransform.m12;
                return;
            case 16:
            case 17:
                this.state = i10 | 2;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                switch (i12) {
                    case 36:
                    case 37:
                        i10 |= 2;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        this.state = i10 ^ 4;
                        break;
                    case 38:
                    case 39:
                        break;
                    default:
                        double d22 = affineTransform.m00;
                        double d23 = affineTransform.m01;
                        double d24 = affineTransform.m02;
                        double d25 = affineTransform.m10;
                        double d26 = affineTransform.m11;
                        double d27 = affineTransform.m12;
                        switch (i10) {
                            case 0:
                                d10 = d26;
                                d11 = d23;
                                d12 = d25;
                                break;
                            case 1:
                                d11 = d23;
                                d12 = d25;
                                double d28 = this.m02;
                                double d29 = this.m12;
                                d10 = d26;
                                d24 = androidx.activity.r.a(d29, d11, d28 * d22, d24);
                                d27 = androidx.activity.r.a(d29, d10, d28 * d12, d27);
                                break;
                            case 2:
                                d13 = d26;
                                d14 = d23;
                                d15 = d25;
                                this.m02 = d24;
                                this.m12 = d27;
                                double d30 = this.m00;
                                this.m00 = d22 * d30;
                                this.m10 = d30 * d15;
                                double d31 = this.m11;
                                this.m01 = d14 * d31;
                                this.m11 = d31 * d13;
                                updateState();
                                return;
                            case 3:
                                d14 = d23;
                                d15 = d25;
                                double d32 = this.m02;
                                double d33 = this.m12;
                                d13 = d26;
                                d24 = androidx.activity.r.a(d33, d14, d32 * d22, d24);
                                d27 = androidx.activity.r.a(d33, d13, d32 * d15, d27);
                                this.m02 = d24;
                                this.m12 = d27;
                                double d302 = this.m00;
                                this.m00 = d22 * d302;
                                this.m10 = d302 * d15;
                                double d312 = this.m11;
                                this.m01 = d14 * d312;
                                this.m11 = d312 * d13;
                                updateState();
                                return;
                            case 4:
                                d16 = d26;
                                d17 = d23;
                                d18 = d25;
                                this.m02 = d24;
                                this.m12 = d27;
                                double d34 = this.m10;
                                this.m00 = d17 * d34;
                                this.m10 = d34 * d16;
                                double d35 = this.m01;
                                this.m01 = d22 * d35;
                                this.m11 = d35 * d18;
                                updateState();
                                return;
                            case 5:
                                d17 = d23;
                                d18 = d25;
                                double d36 = this.m02;
                                double d37 = this.m12;
                                d16 = d26;
                                d24 = androidx.activity.r.a(d37, d17, d36 * d22, d24);
                                d27 = androidx.activity.r.a(d37, d16, d36 * d18, d27);
                                this.m02 = d24;
                                this.m12 = d27;
                                double d342 = this.m10;
                                this.m00 = d17 * d342;
                                this.m10 = d342 * d16;
                                double d352 = this.m01;
                                this.m01 = d22 * d352;
                                this.m11 = d352 * d18;
                                updateState();
                                return;
                            case 6:
                                d19 = d26;
                                d20 = d23;
                                d21 = d25;
                                this.m02 = d24;
                                this.m12 = d27;
                                double d38 = this.m00;
                                double d39 = this.m10;
                                this.m00 = (d39 * d20) + (d38 * d22);
                                double d40 = d19;
                                this.m10 = (d39 * d40) + (d38 * d21);
                                double d41 = this.m01;
                                double d42 = this.m11;
                                this.m01 = (d20 * d42) + (d22 * d41);
                                this.m11 = (d42 * d40) + (d41 * d21);
                                updateState();
                                return;
                            case 7:
                                double d43 = this.m02;
                                double d44 = this.m12;
                                d19 = d26;
                                d20 = d23;
                                d21 = d25;
                                d24 = androidx.activity.r.a(d44, d23, d43 * d22, d24);
                                d27 = androidx.activity.r.a(d44, d19, d43 * d21, d27);
                                this.m02 = d24;
                                this.m12 = d27;
                                double d382 = this.m00;
                                double d392 = this.m10;
                                this.m00 = (d392 * d20) + (d382 * d22);
                                double d402 = d19;
                                this.m10 = (d392 * d402) + (d382 * d21);
                                double d412 = this.m01;
                                double d422 = this.m11;
                                this.m01 = (d20 * d422) + (d22 * d412);
                                this.m11 = (d422 * d402) + (d412 * d21);
                                updateState();
                                return;
                            default:
                                f();
                                throw null;
                        }
                        this.m02 = d24;
                        this.m12 = d27;
                        this.m00 = d22;
                        this.m10 = d12;
                        this.m01 = d11;
                        this.m11 = d10;
                        this.state = i10 | i11;
                        this.f20694a = -1;
                        return;
                }
                double d45 = affineTransform.m01;
                double d46 = affineTransform.m10;
                double d47 = this.m00;
                this.m00 = this.m10 * d45;
                this.m10 = d47 * d46;
                double d48 = this.m01;
                this.m01 = this.m11 * d45;
                this.m11 = d48 * d46;
                double d49 = this.m02;
                this.m02 = this.m12 * d45;
                this.m12 = d49 * d46;
                this.f20694a = -1;
                return;
        }
        double d50 = affineTransform.m00;
        double d51 = affineTransform.m11;
        if ((i10 & 4) != 0) {
            this.m01 *= d50;
            this.m10 *= d51;
            if ((i10 & 2) != 0) {
                this.m00 *= d50;
                this.m11 *= d51;
            }
        } else {
            this.m00 *= d50;
            this.m11 *= d51;
        }
        if ((i10 & 1) != 0) {
            this.m02 *= d50;
            this.m12 *= d51;
        }
        this.f20694a = -1;
    }

    public void quadrantRotate(int i10) {
        int i11 = i10 & 3;
        if (i11 == 1) {
            e();
        } else if (i11 == 2) {
            c();
        } else if (i11 != 3) {
        } else {
            d();
        }
    }

    public void rotate(double d10) {
        double sin = Math.sin(d10);
        if (sin == 1.0d) {
            e();
        } else if (sin == -1.0d) {
            d();
        } else {
            double cos = Math.cos(d10);
            if (cos == -1.0d) {
                c();
            } else if (cos != 1.0d) {
                double d11 = this.m00;
                double d12 = this.m01;
                this.m00 = (sin * d12) + (cos * d11);
                double d13 = -sin;
                this.m01 = (d12 * cos) + (d11 * d13);
                double d14 = this.m10;
                double d15 = this.m11;
                this.m10 = (sin * d15) + (cos * d14);
                this.m11 = (cos * d15) + (d13 * d14);
                updateState();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void scale(double d10, double d11) {
        int i10 = this.state;
        int i11 = 0;
        switch (i10) {
            case 0:
            case 1:
                this.m00 = d10;
                this.m11 = d11;
                if (d10 != 1.0d || d11 != 1.0d) {
                    this.state = i10 | 2;
                    this.f20694a = -1;
                    return;
                }
                return;
            case 2:
            case 3:
                double d12 = this.m00 * d10;
                this.m00 = d12;
                double d13 = this.m11 * d11;
                this.m11 = d13;
                if (d12 == 1.0d && d13 == 1.0d) {
                    int i12 = i10 & 1;
                    this.state = i12;
                    if (i12 != 0) {
                        i11 = 1;
                    }
                    this.f20694a = i11;
                    return;
                }
                this.f20694a = -1;
                return;
            case 4:
            case 5:
                break;
            case 6:
            case 7:
                this.m00 *= d10;
                this.m11 *= d11;
                break;
            default:
                f();
                throw null;
        }
        double d14 = this.m01 * d11;
        this.m01 = d14;
        double d15 = this.m10 * d10;
        this.m10 = d15;
        if (d14 == 0.0d && d15 == 0.0d) {
            int i13 = i10 & 1;
            if (this.m00 == 1.0d && this.m11 == 1.0d) {
                if (i13 != 0) {
                    i11 = 1;
                }
                this.f20694a = i11;
            } else {
                i13 |= 2;
                this.f20694a = -1;
            }
            this.state = i13;
        }
    }

    public void setToIdentity() {
        this.m11 = 1.0d;
        this.m00 = 1.0d;
        this.m12 = 0.0d;
        this.m02 = 0.0d;
        this.m01 = 0.0d;
        this.m10 = 0.0d;
        this.state = 0;
        this.f20694a = 0;
    }

    public void setToQuadrantRotation(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0) {
            this.m00 = 1.0d;
            this.m10 = 0.0d;
            this.m01 = 0.0d;
            this.m11 = 1.0d;
            this.m02 = 0.0d;
            this.m12 = 0.0d;
            this.state = 0;
            this.f20694a = 0;
        } else if (i11 == 1) {
            this.m00 = 0.0d;
            this.m10 = 1.0d;
            this.m01 = -1.0d;
            this.m11 = 0.0d;
            this.m02 = 0.0d;
            this.m12 = 0.0d;
            this.state = 4;
            this.f20694a = 8;
        } else if (i11 == 2) {
            this.m00 = -1.0d;
            this.m10 = 0.0d;
            this.m01 = 0.0d;
            this.m11 = -1.0d;
            this.m02 = 0.0d;
            this.m12 = 0.0d;
            this.state = 2;
            this.f20694a = 8;
        } else if (i11 != 3) {
        } else {
            this.m00 = 0.0d;
            this.m10 = -1.0d;
            this.m01 = 1.0d;
            this.m11 = 0.0d;
            this.m02 = 0.0d;
            this.m12 = 0.0d;
            this.state = 4;
            this.f20694a = 8;
        }
    }

    public void setToRotation(double d10) {
        double d11;
        double sin = Math.sin(d10);
        if (sin != 1.0d && sin != -1.0d) {
            d11 = Math.cos(d10);
            if (d11 == -1.0d) {
                this.state = 2;
                this.f20694a = 8;
            } else if (d11 == 1.0d) {
                this.state = 0;
                this.f20694a = 0;
            } else {
                this.state = 6;
                this.f20694a = 16;
            }
            sin = 0.0d;
        } else {
            this.state = 4;
            this.f20694a = 8;
            d11 = 0.0d;
        }
        this.m00 = d11;
        this.m10 = sin;
        this.m01 = -sin;
        this.m11 = d11;
        this.m02 = 0.0d;
        this.m12 = 0.0d;
    }

    public void setToScale(double d10, double d11) {
        this.m00 = d10;
        this.m10 = 0.0d;
        this.m01 = 0.0d;
        this.m11 = d11;
        this.m02 = 0.0d;
        this.m12 = 0.0d;
        if (d10 == 1.0d && d11 == 1.0d) {
            this.state = 0;
            this.f20694a = 0;
            return;
        }
        this.state = 2;
        this.f20694a = -1;
    }

    public void setToShear(double d10, double d11) {
        this.m00 = 1.0d;
        this.m01 = d10;
        this.m10 = d11;
        this.m11 = 1.0d;
        this.m02 = 0.0d;
        this.m12 = 0.0d;
        if (d10 == 0.0d && d11 == 0.0d) {
            this.state = 0;
            this.f20694a = 0;
            return;
        }
        this.state = 6;
        this.f20694a = -1;
    }

    public void setToTranslation(double d10, double d11) {
        this.m00 = 1.0d;
        this.m10 = 0.0d;
        this.m01 = 0.0d;
        this.m11 = 1.0d;
        this.m02 = d10;
        this.m12 = d11;
        if (d10 == 0.0d && d11 == 0.0d) {
            this.state = 0;
            this.f20694a = 0;
            return;
        }
        this.state = 1;
        this.f20694a = 1;
    }

    public void setTransform(AffineTransform affineTransform) {
        this.m00 = affineTransform.m00;
        this.m10 = affineTransform.m10;
        this.m01 = affineTransform.m01;
        this.m11 = affineTransform.m11;
        this.m02 = affineTransform.m02;
        this.m12 = affineTransform.m12;
        this.state = affineTransform.state;
        this.f20694a = affineTransform.f20694a;
    }

    public void shear(double d10, double d11) {
        int i10 = this.state;
        switch (i10) {
            case 0:
            case 1:
                this.m01 = d10;
                this.m10 = d11;
                if (d10 != 0.0d || d11 != 0.0d) {
                    this.state = i10 | 2 | 4;
                    this.f20694a = -1;
                    return;
                }
                return;
            case 2:
            case 3:
                double d12 = this.m00 * d10;
                this.m01 = d12;
                double d13 = this.m11 * d11;
                this.m10 = d13;
                if (d12 != 0.0d || d13 != 0.0d) {
                    this.state = i10 | 4;
                }
                this.f20694a = -1;
                return;
            case 4:
            case 5:
                double d14 = this.m01 * d11;
                this.m00 = d14;
                double d15 = this.m10 * d10;
                this.m11 = d15;
                if (d14 != 0.0d || d15 != 0.0d) {
                    this.state = i10 | 2;
                }
                this.f20694a = -1;
                return;
            case 6:
            case 7:
                double d16 = this.m00;
                double d17 = this.m01;
                this.m00 = (d17 * d11) + d16;
                this.m01 = (d16 * d10) + d17;
                double d18 = this.m10;
                double d19 = this.m11;
                this.m10 = (d11 * d19) + d18;
                this.m11 = (d18 * d10) + d19;
                updateState();
                return;
            default:
                f();
                throw null;
        }
    }

    public String toString() {
        return "AffineTransform[[" + a(this.m00) + ", " + a(this.m01) + ", " + a(this.m02) + "], [" + a(this.m10) + ", " + a(this.m11) + ", " + a(this.m12) + "]]";
    }

    public Point2D transform(Point2D point2D, Point2D point2D2) {
        if (point2D2 == null) {
            if (point2D instanceof Point2D.Double) {
                point2D2 = new Point2D.Double();
            } else {
                point2D2 = new Point2D.Float();
            }
        }
        double x4 = point2D.getX();
        double y10 = point2D.getY();
        switch (this.state) {
            case 0:
                point2D2.setLocation(x4, y10);
                return point2D2;
            case 1:
                point2D2.setLocation(x4 + this.m02, y10 + this.m12);
                return point2D2;
            case 2:
                point2D2.setLocation(x4 * this.m00, y10 * this.m11);
                return point2D2;
            case 3:
                point2D2.setLocation((x4 * this.m00) + this.m02, (y10 * this.m11) + this.m12);
                return point2D2;
            case 4:
                point2D2.setLocation(y10 * this.m01, x4 * this.m10);
                return point2D2;
            case 5:
                point2D2.setLocation((y10 * this.m01) + this.m02, (x4 * this.m10) + this.m12);
                return point2D2;
            case 6:
                point2D2.setLocation((this.m01 * y10) + (this.m00 * x4), (y10 * this.m11) + (x4 * this.m10));
                return point2D2;
            case 7:
                point2D2.setLocation((this.m01 * y10) + (this.m00 * x4) + this.m02, (y10 * this.m11) + (x4 * this.m10) + this.m12);
                return point2D2;
            default:
                f();
                throw null;
        }
    }

    public void translate(double d10, double d11) {
        switch (this.state) {
            case 0:
                this.m02 = d10;
                this.m12 = d11;
                if (d10 != 0.0d || d11 != 0.0d) {
                    this.state = 1;
                    this.f20694a = 1;
                    return;
                }
                return;
            case 1:
                double d12 = d10 + this.m02;
                this.m02 = d12;
                double d13 = d11 + this.m12;
                this.m12 = d13;
                if (d12 == 0.0d && d13 == 0.0d) {
                    this.state = 0;
                    this.f20694a = 0;
                    return;
                }
                return;
            case 2:
                double d14 = d10 * this.m00;
                this.m02 = d14;
                double d15 = d11 * this.m11;
                this.m12 = d15;
                if (d14 != 0.0d || d15 != 0.0d) {
                    this.state = 3;
                    this.f20694a |= 1;
                    return;
                }
                return;
            case 3:
                double d16 = (d10 * this.m00) + this.m02;
                this.m02 = d16;
                double d17 = (d11 * this.m11) + this.m12;
                this.m12 = d17;
                if (d16 == 0.0d && d17 == 0.0d) {
                    this.state = 2;
                    int i10 = this.f20694a;
                    if (i10 != -1) {
                        this.f20694a = i10 - 1;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                double d18 = d11 * this.m01;
                this.m02 = d18;
                double d19 = d10 * this.m10;
                this.m12 = d19;
                if (d18 != 0.0d || d19 != 0.0d) {
                    this.state = 5;
                    this.f20694a |= 1;
                    return;
                }
                return;
            case 5:
                double d20 = (d11 * this.m01) + this.m02;
                this.m02 = d20;
                double d21 = (d10 * this.m10) + this.m12;
                this.m12 = d21;
                if (d20 == 0.0d && d21 == 0.0d) {
                    this.state = 4;
                    int i11 = this.f20694a;
                    if (i11 != -1) {
                        this.f20694a = i11 - 1;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                double d22 = (this.m01 * d11) + (this.m00 * d10);
                this.m02 = d22;
                double d23 = (d11 * this.m11) + (d10 * this.m10);
                this.m12 = d23;
                if (d22 != 0.0d || d23 != 0.0d) {
                    this.state = 7;
                    this.f20694a |= 1;
                    return;
                }
                return;
            case 7:
                double d24 = (this.m01 * d11) + (this.m00 * d10) + this.m02;
                this.m02 = d24;
                double d25 = (d11 * this.m11) + (d10 * this.m10) + this.m12;
                this.m12 = d25;
                if (d24 == 0.0d && d25 == 0.0d) {
                    this.state = 6;
                    int i12 = this.f20694a;
                    if (i12 != -1) {
                        this.f20694a = i12 - 1;
                        return;
                    }
                    return;
                }
                return;
            default:
                f();
                throw null;
        }
    }

    public void updateState() {
        if (this.m01 == 0.0d && this.m10 == 0.0d) {
            if (this.m00 == 1.0d && this.m11 == 1.0d) {
                if (this.m02 == 0.0d && this.m12 == 0.0d) {
                    this.state = 0;
                    this.f20694a = 0;
                    return;
                }
                this.state = 1;
                this.f20694a = 1;
            } else if (this.m02 == 0.0d && this.m12 == 0.0d) {
                this.state = 2;
                this.f20694a = -1;
            } else {
                this.state = 3;
                this.f20694a = -1;
            }
        } else if (this.m00 == 0.0d && this.m11 == 0.0d) {
            if (this.m02 == 0.0d && this.m12 == 0.0d) {
                this.state = 4;
                this.f20694a = -1;
                return;
            }
            this.state = 5;
            this.f20694a = -1;
        } else if (this.m02 == 0.0d && this.m12 == 0.0d) {
            this.state = 6;
            this.f20694a = -1;
        } else {
            this.state = 7;
            this.f20694a = -1;
        }
    }

    public static AffineTransform getQuadrantRotateInstance(int i10, double d10, double d11) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToQuadrantRotation(i10, d10, d11);
        return affineTransform;
    }

    public static AffineTransform getRotateInstance(double d10, double d11, double d12) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToRotation(d10, d11, d12);
        return affineTransform;
    }

    public void quadrantRotate(int i10, double d10, double d11) {
        int i11 = i10 & 3;
        if (i11 != 0) {
            if (i11 == 1) {
                double d12 = this.m02;
                double d13 = this.m00;
                double d14 = this.m01;
                this.m02 = ((d14 + d13) * d11) + ((d13 - d14) * d10) + d12;
                double d15 = this.m12;
                double d16 = this.m10;
                double d17 = this.m11;
                this.m12 = ((d17 + d16) * d11) + ((d16 - d17) * d10) + d15;
                e();
            } else if (i11 == 2) {
                double d18 = this.m02;
                double d19 = this.m00;
                double d20 = this.m01;
                this.m02 = ((d20 + d20) * d11) + ((d19 + d19) * d10) + d18;
                double d21 = this.m12;
                double d22 = this.m10;
                double d23 = this.m11;
                this.m12 = ((d23 + d23) * d11) + ((d22 + d22) * d10) + d21;
                c();
            } else if (i11 == 3) {
                double d24 = this.m02;
                double d25 = this.m00;
                double d26 = this.m01;
                this.m02 = ((d26 - d25) * d11) + ((d25 + d26) * d10) + d24;
                double d27 = this.m12;
                double d28 = this.m10;
                double d29 = this.m11;
                this.m12 = ((d29 - d28) * d11) + ((d28 + d29) * d10) + d27;
                d();
            }
            if (this.m02 == 0.0d && this.m12 == 0.0d) {
                this.state &= -2;
            } else {
                this.state |= 1;
            }
        }
    }

    public static AffineTransform getRotateInstance(double d10, double d11) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToRotation(d10, d11);
        return affineTransform;
    }

    public static AffineTransform getRotateInstance(double d10, double d11, double d12, double d13) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.setToRotation(d10, d11, d12, d13);
        return affineTransform;
    }

    public void setTransform(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.m00 = d10;
        this.m10 = d11;
        this.m01 = d12;
        this.m11 = d13;
        this.m02 = d14;
        this.m12 = d15;
        updateState();
    }

    public AffineTransform() {
        this.m11 = 1.0d;
        this.m00 = 1.0d;
    }

    public AffineTransform(AffineTransform affineTransform) {
        this.m00 = affineTransform.m00;
        this.m10 = affineTransform.m10;
        this.m01 = affineTransform.m01;
        this.m11 = affineTransform.m11;
        this.m02 = affineTransform.m02;
        this.m12 = affineTransform.m12;
        this.state = affineTransform.state;
        this.f20694a = affineTransform.f20694a;
    }

    public void deltaTransform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        if (dArr2 == dArr && i14 > i13) {
            int i15 = i12 * 2;
            if (i14 < i13 + i15) {
                System.arraycopy(dArr, i13, dArr2, i14, i15);
                i13 = i14;
            }
        }
        switch (this.state) {
            case 0:
            case 1:
                if (dArr == dArr2 && i13 == i14) {
                    return;
                }
                System.arraycopy(dArr, i13, dArr2, i14, i12 * 2);
                return;
            case 2:
            case 3:
                double d10 = this.m00;
                double d11 = this.m11;
                int i16 = i13;
                int i17 = i12;
                while (true) {
                    i17--;
                    if (i17 < 0) {
                        return;
                    }
                    int i18 = i14 + 1;
                    int i19 = i16 + 1;
                    dArr2[i14] = dArr[i16] * d10;
                    i14 = i18 + 1;
                    i16 = i19 + 1;
                    dArr2[i18] = dArr[i19] * d11;
                }
            case 4:
            case 5:
                double d12 = this.m01;
                double d13 = this.m10;
                int i20 = i13;
                int i21 = i12;
                while (true) {
                    i21--;
                    if (i21 < 0) {
                        return;
                    }
                    int i22 = i20 + 1;
                    double d14 = dArr[i20];
                    int i23 = i14 + 1;
                    dArr2[i14] = dArr[i22] * d12;
                    i14 = i23 + 1;
                    dArr2[i23] = d14 * d13;
                    i20 = i22 + 1;
                }
            case 6:
            case 7:
                double d15 = this.m00;
                double d16 = this.m01;
                double d17 = this.m10;
                double d18 = this.m11;
                int i24 = i13;
                int i25 = i12;
                while (true) {
                    i25--;
                    if (i25 < 0) {
                        return;
                    }
                    int i26 = i24 + 1;
                    double d19 = dArr[i24];
                    i24 = i26 + 1;
                    double d20 = dArr[i26];
                    int i27 = i14 + 1;
                    dArr2[i14] = (d20 * d16) + (d19 * d15);
                    i14 = i27 + 1;
                    dArr2[i27] = (d20 * d18) + (d19 * d17);
                }
            default:
                f();
                throw null;
        }
    }

    public void rotate(double d10, double d11, double d12) {
        translate(d11, d12);
        rotate(d10);
        translate(-d11, -d12);
    }

    public void transform(Point2D[] point2DArr, int i10, Point2D[] point2DArr2, int i11, int i12) {
        Point2D point2D;
        int i13 = this.state;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        while (true) {
            i16--;
            if (i16 < 0) {
                return;
            }
            int i17 = i14 + 1;
            Point2D point2D2 = point2DArr[i14];
            double x4 = point2D2.getX();
            double y10 = point2D2.getY();
            int i18 = i15 + 1;
            Point2D point2D3 = point2DArr2[i15];
            if (point2D3 == null) {
                if (point2D2 instanceof Point2D.Double) {
                    point2D = new Point2D.Double();
                } else {
                    point2D = new Point2D.Float();
                }
                point2D3 = point2D;
                point2DArr2[i18 - 1] = point2D3;
            }
            switch (i13) {
                case 0:
                    point2D3.setLocation(x4, y10);
                    break;
                case 1:
                    point2D3.setLocation(x4 + this.m02, y10 + this.m12);
                    break;
                case 2:
                    point2D3.setLocation(x4 * this.m00, y10 * this.m11);
                    break;
                case 3:
                    point2D3.setLocation((x4 * this.m00) + this.m02, (y10 * this.m11) + this.m12);
                    break;
                case 4:
                    point2D3.setLocation(y10 * this.m01, x4 * this.m10);
                    break;
                case 5:
                    point2D3.setLocation((y10 * this.m01) + this.m02, (x4 * this.m10) + this.m12);
                    break;
                case 6:
                    point2D3.setLocation((this.m01 * y10) + (this.m00 * x4), (y10 * this.m11) + (x4 * this.m10));
                    break;
                case 7:
                    point2D3.setLocation((this.m01 * y10) + (this.m00 * x4) + this.m02, (y10 * this.m11) + (x4 * this.m10) + this.m12);
                    break;
                default:
                    f();
                    throw null;
            }
            i14 = i17;
            i15 = i18;
        }
    }

    public void setToRotation(double d10, double d11, double d12) {
        setToRotation(d10);
        double d13 = this.m10;
        double d14 = 1.0d - this.m00;
        double d15 = (d12 * d13) + (d11 * d14);
        this.m02 = d15;
        double d16 = (d12 * d14) - (d11 * d13);
        this.m12 = d16;
        if (d15 == 0.0d && d16 == 0.0d) {
            return;
        }
        this.state |= 1;
        this.f20694a |= 1;
    }

    public void rotate(double d10, double d11) {
        int i10 = (d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            if (d10 < 0.0d) {
                c();
            }
        } else if (d10 == 0.0d) {
            if (i10 > 0) {
                e();
            } else {
                d();
            }
        } else {
            double sqrt = Math.sqrt((d11 * d11) + (d10 * d10));
            double d12 = d11 / sqrt;
            double d13 = d10 / sqrt;
            double d14 = this.m00;
            double d15 = this.m01;
            this.m00 = (d12 * d15) + (d13 * d14);
            double d16 = -d12;
            this.m01 = (d15 * d13) + (d14 * d16);
            double d17 = this.m10;
            double d18 = this.m11;
            this.m10 = (d12 * d18) + (d13 * d17);
            this.m11 = (d13 * d18) + (d16 * d17);
            updateState();
        }
    }

    public AffineTransform(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.m00 = f10;
        this.m10 = f11;
        this.m01 = f12;
        this.m11 = f13;
        this.m02 = f14;
        this.m12 = f15;
        updateState();
    }

    public void setToRotation(double d10, double d11) {
        double d12;
        int i10 = (d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            if (d10 < 0.0d) {
                this.state = 2;
                this.f20694a = 8;
                d12 = 0.0d;
            } else {
                this.state = 0;
                this.f20694a = 0;
                d12 = 0.0d;
                r4 = 1.0d;
            }
        } else if (d10 == 0.0d) {
            r4 = i10 > 0 ? 1.0d : -1.0d;
            this.state = 4;
            this.f20694a = 8;
            d12 = r4;
            r4 = 0.0d;
        } else {
            double sqrt = Math.sqrt((d11 * d11) + (d10 * d10));
            r4 = d10 / sqrt;
            d12 = d11 / sqrt;
            this.state = 6;
            this.f20694a = 16;
        }
        this.m00 = r4;
        this.m10 = d12;
        this.m01 = -d12;
        this.m11 = r4;
        this.m02 = 0.0d;
        this.m12 = 0.0d;
    }

    public void inverseTransform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        int i13 = i10;
        if (dArr2 == dArr && i11 > i13) {
            int i14 = i12 * 2;
            if (i11 < i13 + i14) {
                System.arraycopy(dArr, i13, dArr2, i11, i14);
                i13 = i11;
            }
        }
        switch (this.state) {
            case 0:
                int i15 = i13;
                if (dArr == dArr2 && i15 == i11) {
                    return;
                }
                System.arraycopy(dArr, i15, dArr2, i11, i12 * 2);
                return;
            case 1:
                double d10 = this.m02;
                double d11 = this.m12;
                int i16 = i13;
                int i17 = i11;
                int i18 = i12;
                while (true) {
                    i18--;
                    if (i18 < 0) {
                        return;
                    }
                    int i19 = i17 + 1;
                    int i20 = i16 + 1;
                    dArr2[i17] = dArr[i16] - d10;
                    i17 = i19 + 1;
                    i16 = i20 + 1;
                    dArr2[i19] = dArr[i20] - d11;
                }
            case 2:
                int i21 = i13;
                double d12 = this.m00;
                double d13 = this.m11;
                if (d12 == 0.0d || d13 == 0.0d) {
                    throw new NoninvertibleTransformException("Determinant is 0");
                }
                int i22 = i21;
                int i23 = i11;
                int i24 = i12;
                while (true) {
                    i24--;
                    if (i24 < 0) {
                        return;
                    }
                    int i25 = i23 + 1;
                    int i26 = i22 + 1;
                    dArr2[i23] = dArr[i22] / d12;
                    i23 = i25 + 1;
                    i22 = i26 + 1;
                    dArr2[i25] = dArr[i26] / d13;
                }
                break;
            case 3:
                int i27 = i13;
                double d14 = this.m00;
                double d15 = this.m02;
                double d16 = this.m11;
                double d17 = this.m12;
                if (d14 == 0.0d || d16 == 0.0d) {
                    throw new NoninvertibleTransformException("Determinant is 0");
                }
                int i28 = i27;
                int i29 = i11;
                int i30 = i12;
                while (true) {
                    i30--;
                    if (i30 < 0) {
                        return;
                    }
                    int i31 = i29 + 1;
                    int i32 = i28 + 1;
                    dArr2[i29] = (dArr[i28] - d15) / d14;
                    i29 = i31 + 1;
                    i28 = i32 + 1;
                    dArr2[i31] = (dArr[i32] - d17) / d16;
                }
                break;
            case 4:
                int i33 = i13;
                double d18 = this.m01;
                double d19 = this.m10;
                if (d18 == 0.0d || d19 == 0.0d) {
                    throw new NoninvertibleTransformException("Determinant is 0");
                }
                int i34 = i33;
                int i35 = i11;
                int i36 = i12;
                while (true) {
                    i36--;
                    if (i36 < 0) {
                        return;
                    }
                    int i37 = i34 + 1;
                    double d20 = dArr[i34];
                    int i38 = i35 + 1;
                    dArr2[i35] = dArr[i37] / d19;
                    i35 = i38 + 1;
                    dArr2[i38] = d20 / d18;
                    i34 = i37 + 1;
                }
                break;
            case 5:
                int i39 = i13;
                double d21 = this.m01;
                double d22 = this.m02;
                double d23 = this.m10;
                double d24 = this.m12;
                if (d21 == 0.0d || d23 == 0.0d) {
                    throw new NoninvertibleTransformException("Determinant is 0");
                }
                int i40 = i39;
                int i41 = i11;
                int i42 = i12;
                while (true) {
                    i42--;
                    if (i42 < 0) {
                        return;
                    }
                    int i43 = i40 + 1;
                    int i44 = i41 + 1;
                    dArr2[i41] = (dArr[i43] - d24) / d23;
                    i41 = i44 + 1;
                    dArr2[i44] = (dArr[i40] - d22) / d21;
                    i40 = i43 + 1;
                }
                break;
            case 6:
                int i45 = i13;
                double d25 = this.m00;
                double d26 = this.m01;
                double d27 = this.m10;
                double d28 = this.m11;
                double d29 = (d25 * d28) - (d26 * d27);
                if (Math.abs(d29) <= Double.MIN_VALUE) {
                    throw new NoninvertibleTransformException("Determinant is " + d29);
                }
                int i46 = i45;
                int i47 = i11;
                int i48 = i12;
                while (true) {
                    i48--;
                    if (i48 < 0) {
                        return;
                    }
                    int i49 = i46 + 1;
                    double d30 = dArr[i46];
                    i46 = i49 + 1;
                    double d31 = dArr[i49];
                    int i50 = i47 + 1;
                    dArr2[i47] = ((d30 * d28) - (d31 * d26)) / d29;
                    i47 = i50 + 1;
                    dArr2[i50] = ((d31 * d25) - (d30 * d27)) / d29;
                }
            case 7:
                double d32 = this.m00;
                double d33 = this.m01;
                double d34 = this.m02;
                double d35 = this.m10;
                double d36 = this.m11;
                int i51 = i13;
                double d37 = this.m12;
                double d38 = (d32 * d36) - (d33 * d35);
                if (Math.abs(d38) <= Double.MIN_VALUE) {
                    throw new NoninvertibleTransformException("Determinant is " + d38);
                }
                int i52 = i51;
                int i53 = i11;
                int i54 = i12;
                while (true) {
                    i54--;
                    if (i54 < 0) {
                        return;
                    }
                    int i55 = i52 + 1;
                    double d39 = dArr[i52] - d34;
                    i52 = i55 + 1;
                    double d40 = dArr[i55] - d37;
                    int i56 = i53 + 1;
                    dArr2[i53] = ((d39 * d36) - (d40 * d33)) / d38;
                    i53 = i56 + 1;
                    dArr2[i56] = ((d40 * d32) - (d39 * d35)) / d38;
                    d37 = d37;
                }
            default:
                f();
                throw null;
        }
    }

    public AffineTransform(float[] fArr) {
        this.m00 = fArr[0];
        this.m10 = fArr[1];
        this.m01 = fArr[2];
        this.m11 = fArr[3];
        if (fArr.length > 5) {
            this.m02 = fArr[4];
            this.m12 = fArr[5];
        }
        updateState();
    }

    public void rotate(double d10, double d11, double d12, double d13) {
        translate(d12, d13);
        rotate(d10, d11);
        translate(-d12, -d13);
    }

    public void setToQuadrantRotation(int i10, double d10, double d11) {
        int i11 = i10 & 3;
        if (i11 == 0) {
            this.m00 = 1.0d;
            this.m10 = 0.0d;
            this.m01 = 0.0d;
            this.m11 = 1.0d;
            this.m02 = 0.0d;
            this.m12 = 0.0d;
            this.state = 0;
            this.f20694a = 0;
        } else if (i11 == 1) {
            this.m00 = 0.0d;
            this.m10 = 1.0d;
            this.m01 = -1.0d;
            this.m11 = 0.0d;
            double d12 = d10 + d11;
            this.m02 = d12;
            double d13 = d11 - d10;
            this.m12 = d13;
            if (d12 == 0.0d && d13 == 0.0d) {
                this.state = 4;
                this.f20694a = 8;
                return;
            }
            this.state = 5;
            this.f20694a = 9;
        } else if (i11 == 2) {
            this.m00 = -1.0d;
            this.m10 = 0.0d;
            this.m01 = 0.0d;
            this.m11 = -1.0d;
            double d14 = d10 + d10;
            this.m02 = d14;
            double d15 = d11 + d11;
            this.m12 = d15;
            if (d14 == 0.0d && d15 == 0.0d) {
                this.state = 2;
                this.f20694a = 8;
                return;
            }
            this.state = 3;
            this.f20694a = 9;
        } else if (i11 != 3) {
        } else {
            this.m00 = 0.0d;
            this.m10 = -1.0d;
            this.m01 = 1.0d;
            this.m11 = 0.0d;
            double d16 = d10 - d11;
            this.m02 = d16;
            double d17 = d11 + d10;
            this.m12 = d17;
            if (d16 == 0.0d && d17 == 0.0d) {
                this.state = 4;
                this.f20694a = 8;
                return;
            }
            this.state = 5;
            this.f20694a = 9;
        }
    }

    public void transform(float[] fArr, int i10, float[] fArr2, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float[] fArr3 = fArr;
        int i18 = i10;
        int i19 = i11;
        if (fArr2 == fArr3 && i19 > i18) {
            int i20 = i12 * 2;
            if (i19 < i18 + i20) {
                System.arraycopy(fArr3, i18, fArr2, i19, i20);
                i18 = i19;
            }
        }
        switch (this.state) {
            case 0:
                if (fArr3 == fArr2 && i18 == i19) {
                    return;
                }
                System.arraycopy(fArr3, i18, fArr2, i19, i12 * 2);
                return;
            case 1:
                int i21 = i18;
                double d10 = this.m02;
                double d11 = this.m12;
                int i22 = i12;
                while (true) {
                    i22--;
                    if (i22 < 0) {
                        return;
                    }
                    int i23 = i19 + 1;
                    fArr2[i19] = (float) (fArr3[i21] + d10);
                    i19 = i23 + 1;
                    i21 = i21 + 1 + 1;
                    fArr2[i23] = (float) (fArr3[i13] + d11);
                }
            case 2:
                int i24 = i18;
                double d12 = this.m00;
                double d13 = this.m11;
                int i25 = i12;
                while (true) {
                    i25--;
                    if (i25 < 0) {
                        return;
                    }
                    int i26 = i19 + 1;
                    fArr2[i19] = (float) (fArr3[i24] * d12);
                    i19 = i26 + 1;
                    i24 = i24 + 1 + 1;
                    fArr2[i26] = (float) (fArr3[i14] * d13);
                }
            case 3:
                int i27 = i18;
                double d14 = this.m00;
                double d15 = this.m02;
                double d16 = this.m11;
                double d17 = this.m12;
                int i28 = i12;
                while (true) {
                    i28--;
                    if (i28 < 0) {
                        return;
                    }
                    int i29 = i19 + 1;
                    double d18 = d17;
                    fArr2[i19] = (float) ((fArr3[i27] * d14) + d15);
                    i19 = i29 + 1;
                    i27 = i27 + 1 + 1;
                    fArr2[i29] = (float) ((fArr3[i15] * d16) + d18);
                    d17 = d18;
                }
            case 4:
                int i30 = i18;
                double d19 = this.m01;
                double d20 = this.m10;
                int i31 = i12;
                while (true) {
                    i31--;
                    if (i31 < 0) {
                        return;
                    }
                    int i32 = i19 + 1;
                    fArr2[i19] = (float) (fArr3[i16] * d19);
                    i19 = i32 + 1;
                    fArr2[i32] = (float) (fArr3[i30] * d20);
                    i30 = i30 + 1 + 1;
                }
            case 5:
                int i33 = i18;
                double d21 = this.m01;
                double d22 = this.m02;
                double d23 = this.m10;
                double d24 = this.m12;
                int i34 = i12;
                while (true) {
                    i34--;
                    if (i34 < 0) {
                        return;
                    }
                    int i35 = i19 + 1;
                    double d25 = d24;
                    fArr2[i19] = (float) ((fArr3[i17] * d21) + d22);
                    i19 = i35 + 1;
                    fArr2[i35] = (float) ((fArr3[i33] * d23) + d25);
                    i33 = i33 + 1 + 1;
                    d24 = d25;
                }
            case 6:
                int i36 = i18;
                double d26 = this.m00;
                double d27 = this.m01;
                double d28 = this.m10;
                double d29 = this.m11;
                int i37 = i12;
                while (true) {
                    i37--;
                    if (i37 < 0) {
                        return;
                    }
                    int i38 = i36 + 1;
                    double d30 = fArr[i36];
                    int i39 = i38 + 1;
                    double d31 = d29;
                    double d32 = fArr[i38];
                    int i40 = i19 + 1;
                    fArr2[i19] = (float) ((d27 * d32) + (d26 * d30));
                    i19 = i40 + 1;
                    fArr2[i40] = (float) ((d32 * d31) + (d30 * d28));
                    i36 = i39;
                    d29 = d31;
                    d26 = d26;
                }
            case 7:
                double d33 = this.m00;
                double d34 = this.m01;
                double d35 = this.m02;
                double d36 = this.m10;
                double d37 = this.m11;
                int i41 = i18;
                double d38 = this.m12;
                int i42 = i41;
                int i43 = i12;
                while (true) {
                    int i44 = i43 - 1;
                    if (i44 < 0) {
                        return;
                    }
                    int i45 = i42 + 1;
                    double d39 = d38;
                    double d40 = fArr3[i42];
                    int i46 = i45 + 1;
                    double d41 = fArr3[i45];
                    int i47 = i19 + 1;
                    double d42 = d37;
                    double d43 = d36;
                    double d44 = d35;
                    fArr2[i19] = (float) androidx.activity.r.a(d34, d41, d33 * d40, d44);
                    i19 = i47 + 1;
                    fArr2[i47] = (float) androidx.activity.r.a(d41, d42, d40 * d43, d39);
                    fArr3 = fArr;
                    d38 = d39;
                    i43 = i44;
                    i42 = i46;
                    d37 = d42;
                    d36 = d43;
                    d35 = d44;
                    d34 = d34;
                }
            default:
                f();
                throw null;
        }
    }

    public AffineTransform(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.m00 = d10;
        this.m10 = d11;
        this.m01 = d12;
        this.m11 = d13;
        this.m02 = d14;
        this.m12 = d15;
        updateState();
    }

    public void setToRotation(double d10, double d11, double d12, double d13) {
        setToRotation(d10, d11);
        double d14 = this.m10;
        double d15 = 1.0d - this.m00;
        double d16 = (d13 * d14) + (d12 * d15);
        this.m02 = d16;
        double d17 = (d13 * d15) - (d12 * d14);
        this.m12 = d17;
        if (d16 == 0.0d && d17 == 0.0d) {
            return;
        }
        this.state |= 1;
        this.f20694a |= 1;
    }

    public AffineTransform(double[] dArr) {
        this.m00 = dArr[0];
        this.m10 = dArr[1];
        this.m01 = dArr[2];
        this.m11 = dArr[3];
        if (dArr.length > 5) {
            this.m02 = dArr[4];
            this.m12 = dArr[5];
        }
        updateState();
    }

    public void transform(double[] dArr, int i10, double[] dArr2, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        if (dArr2 == dArr && i14 > i13) {
            int i15 = i12 * 2;
            if (i14 < i13 + i15) {
                System.arraycopy(dArr, i13, dArr2, i14, i15);
                i13 = i14;
            }
        }
        switch (this.state) {
            case 0:
                int i16 = i13;
                if (dArr == dArr2 && i16 == i14) {
                    return;
                }
                System.arraycopy(dArr, i16, dArr2, i14, i12 * 2);
                return;
            case 1:
                int i17 = i13;
                double d10 = this.m02;
                double d11 = this.m12;
                int i18 = i12;
                while (true) {
                    i18--;
                    if (i18 < 0) {
                        return;
                    }
                    int i19 = i14 + 1;
                    int i20 = i17 + 1;
                    dArr2[i14] = dArr[i17] + d10;
                    i14 = i19 + 1;
                    i17 = i20 + 1;
                    dArr2[i19] = dArr[i20] + d11;
                }
            case 2:
                int i21 = i13;
                double d12 = this.m00;
                double d13 = this.m11;
                int i22 = i12;
                while (true) {
                    i22--;
                    if (i22 < 0) {
                        return;
                    }
                    int i23 = i14 + 1;
                    int i24 = i21 + 1;
                    dArr2[i14] = dArr[i21] * d12;
                    i14 = i23 + 1;
                    i21 = i24 + 1;
                    dArr2[i23] = dArr[i24] * d13;
                }
            case 3:
                int i25 = i13;
                double d14 = this.m00;
                double d15 = this.m02;
                double d16 = this.m11;
                double d17 = this.m12;
                int i26 = i12;
                while (true) {
                    i26--;
                    if (i26 < 0) {
                        return;
                    }
                    int i27 = i14 + 1;
                    int i28 = i25 + 1;
                    dArr2[i14] = (dArr[i25] * d14) + d15;
                    i14 = i27 + 1;
                    i25 = i28 + 1;
                    dArr2[i27] = (dArr[i28] * d16) + d17;
                }
            case 4:
                int i29 = i13;
                double d18 = this.m01;
                double d19 = this.m10;
                int i30 = i12;
                while (true) {
                    i30--;
                    if (i30 < 0) {
                        return;
                    }
                    int i31 = i29 + 1;
                    double d20 = dArr[i29];
                    int i32 = i14 + 1;
                    i29 = i31 + 1;
                    dArr2[i14] = dArr[i31] * d18;
                    i14 = i32 + 1;
                    dArr2[i32] = d20 * d19;
                }
            case 5:
                int i33 = i13;
                double d21 = this.m01;
                double d22 = this.m02;
                double d23 = this.m10;
                double d24 = this.m12;
                int i34 = i12;
                while (true) {
                    i34--;
                    if (i34 < 0) {
                        return;
                    }
                    int i35 = i33 + 1;
                    double d25 = dArr[i33];
                    int i36 = i14 + 1;
                    dArr2[i14] = (dArr[i35] * d21) + d22;
                    i14 = i36 + 1;
                    dArr2[i36] = (d25 * d23) + d24;
                    i33 = i35 + 1;
                }
            case 6:
                int i37 = i13;
                double d26 = this.m00;
                double d27 = this.m01;
                double d28 = this.m10;
                double d29 = this.m11;
                int i38 = i12;
                while (true) {
                    i38--;
                    if (i38 < 0) {
                        return;
                    }
                    int i39 = i37 + 1;
                    double d30 = dArr[i37];
                    int i40 = i39 + 1;
                    double d31 = dArr[i39];
                    int i41 = i14 + 1;
                    dArr2[i14] = (d27 * d31) + (d26 * d30);
                    i14 = i41 + 1;
                    dArr2[i41] = (d31 * d29) + (d30 * d28);
                    i37 = i40;
                }
            case 7:
                double d32 = this.m00;
                double d33 = this.m01;
                double d34 = this.m02;
                double d35 = this.m10;
                double d36 = this.m11;
                int i42 = i13;
                double d37 = this.m12;
                int i43 = i42;
                int i44 = i12;
                while (true) {
                    int i45 = i44 - 1;
                    if (i45 < 0) {
                        return;
                    }
                    int i46 = i43 + 1;
                    double d38 = dArr[i43];
                    int i47 = i46 + 1;
                    double d39 = dArr[i46];
                    int i48 = i14 + 1;
                    double d40 = d36;
                    double d41 = d35;
                    double d42 = d34;
                    double d43 = d37;
                    dArr2[i14] = androidx.activity.r.a(d33, d39, d32 * d38, d42);
                    i14 = i48 + 1;
                    dArr2[i48] = androidx.activity.r.a(d39, d40, d38 * d41, d43);
                    d37 = d43;
                    i44 = i45;
                    i43 = i47;
                    d36 = d40;
                    d35 = d41;
                    d34 = d42;
                    d33 = d33;
                }
            default:
                f();
                throw null;
        }
    }

    public void transform(float[] fArr, int i10, double[] dArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.state) {
            case 0:
                int i17 = i10;
                int i18 = i11;
                int i19 = i12;
                while (true) {
                    i19--;
                    if (i19 < 0) {
                        return;
                    }
                    int i20 = i18 + 1;
                    dArr[i18] = fArr[i17];
                    i18 = i20 + 1;
                    i17 = i17 + 1 + 1;
                    dArr[i20] = fArr[i13];
                }
            case 1:
                double d10 = this.m02;
                double d11 = this.m12;
                int i21 = i10;
                int i22 = i11;
                int i23 = i12;
                while (true) {
                    i23--;
                    if (i23 < 0) {
                        return;
                    }
                    int i24 = i22 + 1;
                    dArr[i22] = fArr[i21] + d10;
                    i22 = i24 + 1;
                    i21 = i21 + 1 + 1;
                    dArr[i24] = fArr[i14] + d11;
                }
            case 2:
                double d12 = this.m00;
                double d13 = this.m11;
                int i25 = i10;
                int i26 = i11;
                int i27 = i12;
                while (true) {
                    i27--;
                    if (i27 < 0) {
                        return;
                    }
                    int i28 = i26 + 1;
                    dArr[i26] = fArr[i25] * d12;
                    i26 = i28 + 1;
                    i25 = i25 + 1 + 1;
                    dArr[i28] = fArr[i15] * d13;
                }
            case 3:
                double d14 = this.m00;
                double d15 = this.m02;
                double d16 = this.m11;
                double d17 = this.m12;
                int i29 = i10;
                int i30 = i11;
                int i31 = i12;
                while (true) {
                    i31--;
                    if (i31 < 0) {
                        return;
                    }
                    int i32 = i30 + 1;
                    dArr[i30] = (fArr[i29] * d14) + d15;
                    i30 = i32 + 1;
                    i29 = i29 + 1 + 1;
                    dArr[i32] = (fArr[i16] * d16) + d17;
                }
            case 4:
                double d18 = this.m01;
                double d19 = this.m10;
                int i33 = i10;
                int i34 = i11;
                int i35 = i12;
                while (true) {
                    i35--;
                    if (i35 < 0) {
                        return;
                    }
                    int i36 = i33 + 1;
                    double d20 = fArr[i33];
                    int i37 = i34 + 1;
                    dArr[i34] = fArr[i36] * d18;
                    i34 = i37 + 1;
                    dArr[i37] = d20 * d19;
                    i33 = i36 + 1;
                }
            case 5:
                double d21 = this.m01;
                double d22 = this.m02;
                double d23 = this.m10;
                double d24 = this.m12;
                int i38 = i10;
                int i39 = i11;
                int i40 = i12;
                while (true) {
                    int i41 = i40 - 1;
                    if (i41 < 0) {
                        return;
                    }
                    int i42 = i38 + 1;
                    double d25 = fArr[i38];
                    int i43 = i39 + 1;
                    dArr[i39] = (fArr[i42] * d21) + d22;
                    i39 = i43 + 1;
                    dArr[i43] = (d25 * d23) + d24;
                    i40 = i41;
                    i38 = i42 + 1;
                }
            case 6:
                double d26 = this.m00;
                double d27 = this.m01;
                double d28 = this.m10;
                double d29 = this.m11;
                int i44 = i10;
                int i45 = i11;
                int i46 = i12;
                while (true) {
                    int i47 = i46 - 1;
                    if (i47 < 0) {
                        return;
                    }
                    int i48 = i44 + 1;
                    double d30 = fArr[i44];
                    i44 = i48 + 1;
                    double d31 = fArr[i48];
                    int i49 = i45 + 1;
                    dArr[i45] = (d27 * d31) + (d26 * d30);
                    i45 = i49 + 1;
                    dArr[i49] = (d31 * d29) + (d30 * d28);
                    i46 = i47;
                }
            case 7:
                double d32 = this.m00;
                double d33 = this.m01;
                double d34 = this.m02;
                double d35 = this.m10;
                double d36 = this.m11;
                double d37 = this.m12;
                int i50 = i10;
                int i51 = i11;
                int i52 = i12;
                while (true) {
                    int i53 = i52 - 1;
                    if (i53 < 0) {
                        return;
                    }
                    int i54 = i50 + 1;
                    double d38 = d35;
                    double d39 = fArr[i50];
                    int i55 = i54 + 1;
                    double d40 = fArr[i54];
                    int i56 = i51 + 1;
                    double d41 = d37;
                    double d42 = d36;
                    dArr[i51] = androidx.activity.r.a(d33, d40, d32 * d39, d34);
                    dArr[i56] = androidx.activity.r.a(d40, d42, d39 * d38, d41);
                    i51 = i56 + 1;
                    i52 = i53;
                    i50 = i55;
                    d37 = d41;
                    d36 = d42;
                    d35 = d38;
                }
            default:
                f();
                throw null;
        }
    }

    public void transform(double[] dArr, int i10, float[] fArr, int i11, int i12) {
        switch (this.state) {
            case 0:
                int i13 = i10;
                int i14 = i11;
                int i15 = i12;
                while (true) {
                    i15--;
                    if (i15 < 0) {
                        return;
                    }
                    int i16 = i14 + 1;
                    int i17 = i13 + 1;
                    fArr[i14] = (float) dArr[i13];
                    i14 = i16 + 1;
                    i13 = i17 + 1;
                    fArr[i16] = (float) dArr[i17];
                }
            case 1:
                double d10 = this.m02;
                double d11 = this.m12;
                int i18 = i10;
                int i19 = i11;
                int i20 = i12;
                while (true) {
                    i20--;
                    if (i20 < 0) {
                        return;
                    }
                    int i21 = i19 + 1;
                    int i22 = i18 + 1;
                    fArr[i19] = (float) (dArr[i18] + d10);
                    i19 = i21 + 1;
                    i18 = i22 + 1;
                    fArr[i21] = (float) (dArr[i22] + d11);
                }
            case 2:
                double d12 = this.m00;
                double d13 = this.m11;
                int i23 = i10;
                int i24 = i11;
                int i25 = i12;
                while (true) {
                    i25--;
                    if (i25 < 0) {
                        return;
                    }
                    int i26 = i24 + 1;
                    int i27 = i23 + 1;
                    fArr[i24] = (float) (dArr[i23] * d12);
                    i24 = i26 + 1;
                    i23 = i27 + 1;
                    fArr[i26] = (float) (dArr[i27] * d13);
                }
            case 3:
                double d14 = this.m00;
                double d15 = this.m02;
                double d16 = this.m11;
                double d17 = this.m12;
                int i28 = i10;
                int i29 = i11;
                int i30 = i12;
                while (true) {
                    i30--;
                    if (i30 < 0) {
                        return;
                    }
                    int i31 = i29 + 1;
                    int i32 = i28 + 1;
                    fArr[i29] = (float) ((dArr[i28] * d14) + d15);
                    i29 = i31 + 1;
                    i28 = i32 + 1;
                    fArr[i31] = (float) ((dArr[i32] * d16) + d17);
                }
            case 4:
                double d18 = this.m01;
                double d19 = this.m10;
                int i33 = i10;
                int i34 = i11;
                int i35 = i12;
                while (true) {
                    i35--;
                    if (i35 < 0) {
                        return;
                    }
                    int i36 = i33 + 1;
                    double d20 = dArr[i33];
                    int i37 = i34 + 1;
                    fArr[i34] = (float) (dArr[i36] * d18);
                    i34 = i37 + 1;
                    fArr[i37] = (float) (d20 * d19);
                    i33 = i36 + 1;
                }
            case 5:
                double d21 = this.m01;
                double d22 = this.m02;
                double d23 = this.m10;
                double d24 = this.m12;
                int i38 = i10;
                int i39 = i11;
                int i40 = i12;
                while (true) {
                    i40--;
                    if (i40 < 0) {
                        return;
                    }
                    int i41 = i38 + 1;
                    double d25 = dArr[i38];
                    int i42 = i39 + 1;
                    fArr[i39] = (float) ((dArr[i41] * d21) + d22);
                    i39 = i42 + 1;
                    fArr[i42] = (float) ((d25 * d23) + d24);
                    i38 = i41 + 1;
                    d21 = d21;
                }
            case 6:
                double d26 = this.m00;
                double d27 = this.m01;
                double d28 = this.m10;
                double d29 = this.m11;
                int i43 = i10;
                int i44 = i11;
                int i45 = i12;
                while (true) {
                    i45--;
                    if (i45 < 0) {
                        return;
                    }
                    int i46 = i43 + 1;
                    double d30 = dArr[i43];
                    i43 = i46 + 1;
                    double d31 = dArr[i46];
                    int i47 = i44 + 1;
                    fArr[i44] = (float) ((d27 * d31) + (d26 * d30));
                    i44 = i47 + 1;
                    fArr[i47] = (float) ((d31 * d29) + (d30 * d28));
                    d26 = d26;
                }
            case 7:
                double d32 = this.m00;
                double d33 = this.m01;
                double d34 = this.m02;
                double d35 = this.m10;
                double d36 = this.m11;
                double d37 = this.m12;
                int i48 = i10;
                int i49 = i11;
                int i50 = i12;
                while (true) {
                    int i51 = i50 - 1;
                    if (i51 < 0) {
                        return;
                    }
                    int i52 = i48 + 1;
                    double d38 = dArr[i48];
                    int i53 = i52 + 1;
                    double d39 = dArr[i52];
                    int i54 = i49 + 1;
                    double d40 = d37;
                    double d41 = d36;
                    double d42 = d35;
                    fArr[i49] = (float) androidx.activity.r.a(d33, d39, d32 * d38, d34);
                    fArr[i54] = (float) androidx.activity.r.a(d39, d41, d38 * d42, d40);
                    i49 = i54 + 1;
                    i50 = i51;
                    i48 = i53;
                    d37 = d40;
                    d36 = d41;
                    d35 = d42;
                }
            default:
                f();
                throw null;
        }
    }
}
