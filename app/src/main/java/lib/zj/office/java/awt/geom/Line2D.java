package lib.zj.office.java.awt.geom;

import java.io.Serializable;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Point2D;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class Line2D implements lib.zj.office.java.awt.b, Cloneable {

    /* loaded from: classes3.dex */
    public static class Double extends Line2D implements Serializable {
        private static final long serialVersionUID = 7979627399746467499L;

        /* renamed from: x1  reason: collision with root package name */
        public double f20703x1;

        /* renamed from: x2  reason: collision with root package name */
        public double f20704x2;

        /* renamed from: y1  reason: collision with root package name */
        public double f20705y1;

        /* renamed from: y2  reason: collision with root package name */
        public double f20706y2;

        public Double() {
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            double d10;
            double d11;
            double d12;
            double d13;
            double d14 = this.f20703x1;
            double d15 = this.f20704x2;
            if (d14 < d15) {
                d11 = d14;
                d10 = d15 - d14;
            } else {
                d10 = d14 - d15;
                d11 = d15;
            }
            double d16 = this.f20705y1;
            double d17 = this.f20706y2;
            if (d16 < d17) {
                d13 = d16;
                d12 = d17 - d16;
            } else {
                d12 = d16 - d17;
                d13 = d17;
            }
            return new Rectangle2D.Double(d11, d13, d10, d12);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public Point2D getP1() {
            return new Point2D.Double(this.f20703x1, this.f20705y1);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public Point2D getP2() {
            return new Point2D.Double(this.f20704x2, this.f20706y2);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getX1() {
            return this.f20703x1;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getX2() {
            return this.f20704x2;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getY1() {
            return this.f20705y1;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getY2() {
            return this.f20706y2;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public void setLine(double d10, double d11, double d12, double d13) {
            this.f20703x1 = d10;
            this.f20705y1 = d11;
            this.f20704x2 = d12;
            this.f20706y2 = d13;
        }

        public Double(double d10, double d11, double d12, double d13) {
            setLine(d10, d11, d12, d13);
        }

        public Double(Point2D point2D, Point2D point2D2) {
            setLine(point2D, point2D2);
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Line2D implements Serializable {
        private static final long serialVersionUID = 6161772511649436349L;

        /* renamed from: x1  reason: collision with root package name */
        public float f20707x1;

        /* renamed from: x2  reason: collision with root package name */
        public float f20708x2;

        /* renamed from: y1  reason: collision with root package name */
        public float f20709y1;

        /* renamed from: y2  reason: collision with root package name */
        public float f20710y2;

        public Float() {
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            float f10;
            float f11;
            float f12 = this.f20707x1;
            float f13 = this.f20708x2;
            if (f12 < f13) {
                f10 = f13 - f12;
            } else {
                f10 = f12 - f13;
                f12 = f13;
            }
            float f14 = this.f20709y1;
            float f15 = this.f20710y2;
            if (f14 < f15) {
                f11 = f15 - f14;
            } else {
                f11 = f14 - f15;
                f14 = f15;
            }
            return new Rectangle2D.Float(f12, f14, f10, f11);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public Point2D getP1() {
            return new Point2D.Float(this.f20707x1, this.f20709y1);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public Point2D getP2() {
            return new Point2D.Float(this.f20708x2, this.f20710y2);
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getX1() {
            return this.f20707x1;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getX2() {
            return this.f20708x2;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getY1() {
            return this.f20709y1;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public double getY2() {
            return this.f20710y2;
        }

        @Override // lib.zj.office.java.awt.geom.Line2D
        public void setLine(double d10, double d11, double d12, double d13) {
            this.f20707x1 = (float) d10;
            this.f20709y1 = (float) d11;
            this.f20708x2 = (float) d12;
            this.f20710y2 = (float) d13;
        }

        public Float(float f10, float f11, float f12, float f13) {
            setLine(f10, f11, f12, f13);
        }

        public Float(Point2D point2D, Point2D point2D2) {
            setLine(point2D, point2D2);
        }

        public void setLine(float f10, float f11, float f12, float f13) {
            this.f20707x1 = f10;
            this.f20709y1 = f11;
            this.f20708x2 = f12;
            this.f20710y2 = f13;
        }
    }

    public static boolean linesIntersect(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        if (relativeCCW(d10, d11, d12, d13, d14, d15) * relativeCCW(d10, d11, d12, d13, d16, d17) <= 0 && relativeCCW(d14, d15, d16, d17, d10, d11) * relativeCCW(d14, d15, d16, d17, d12, d13) <= 0) {
            return true;
        }
        return false;
    }

    public static double ptLineDist(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.sqrt(ptLineDistSq(d10, d11, d12, d13, d14, d15));
    }

    public static double ptLineDistSq(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d12 - d10;
        double d17 = d13 - d11;
        double d18 = d14 - d10;
        double d19 = d15 - d11;
        double d20 = (d19 * d17) + (d18 * d16);
        double d21 = (d19 * d19) + (d18 * d18);
        double d22 = d21 - ((d20 * d20) / ((d17 * d17) + (d16 * d16)));
        if (d22 < 0.0d) {
            return 0.0d;
        }
        return d22;
    }

    public static double ptSegDist(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.sqrt(ptSegDistSq(d10, d11, d12, d13, d14, d15));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double ptSegDistSq(double r2, double r4, double r6, double r8, double r10, double r12) {
        /*
            double r6 = r6 - r2
            double r8 = r8 - r4
            double r10 = r10 - r2
            double r12 = r12 - r4
            double r2 = r10 * r6
            double r4 = r12 * r8
            double r4 = r4 + r2
            r2 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L11
        Lf:
            r0 = r2
            goto L24
        L11:
            double r10 = r6 - r10
            double r12 = r8 - r12
            double r4 = r10 * r6
            double r0 = r12 * r8
            double r0 = r0 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1f
            goto Lf
        L1f:
            double r0 = r0 * r0
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r8 = r8 + r6
            double r0 = r0 / r8
        L24:
            double r10 = r10 * r10
            double r12 = r12 * r12
            double r12 = r12 + r10
            double r12 = r12 - r0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            goto L2e
        L2d:
            r2 = r12
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.Line2D.ptSegDistSq(double, double, double, double, double, double):double");
    }

    public static int relativeCCW(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d12 - d10;
        double d17 = d13 - d11;
        double d18 = d14 - d10;
        double d19 = d15 - d11;
        double d20 = (d18 * d17) - (d19 * d16);
        if (d20 == 0.0d) {
            d20 = (d18 * d16) + (d19 * d17);
            if (d20 > 0.0d) {
                d20 = ((d19 - d17) * d17) + ((d18 - d16) * d16);
                if (d20 < 0.0d) {
                    d20 = 0.0d;
                }
            }
        }
        if (d20 < 0.0d) {
            return -1;
        }
        return d20 > 0.0d ? 1 : 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11) {
        return false;
    }

    public Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    public abstract Point2D getP1();

    public abstract Point2D getP2();

    @Override // lib.zj.office.java.awt.b
    public p getPathIterator(AffineTransform affineTransform) {
        return new k(this, affineTransform);
    }

    public abstract double getX1();

    public abstract double getX2();

    public abstract double getY1();

    public abstract double getY2();

    @Override // lib.zj.office.java.awt.b
    public boolean intersects(double d10, double d11, double d12, double d13) {
        return intersects(new Rectangle2D.Double(d10, d11, d12, d13));
    }

    public boolean intersectsLine(double d10, double d11, double d12, double d13) {
        return linesIntersect(d10, d11, d12, d13, getX1(), getY1(), getX2(), getY2());
    }

    public abstract void setLine(double d10, double d11, double d12, double d13);

    public void setLine(Point2D point2D, Point2D point2D2) {
        setLine(point2D.getX(), point2D.getY(), point2D2.getX(), point2D2.getY());
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11, double d12, double d13) {
        return false;
    }

    public p getPathIterator(AffineTransform affineTransform, double d10) {
        return new k(this, affineTransform);
    }

    public boolean intersects(Rectangle2D rectangle2D) {
        return rectangle2D.intersectsLine(getX1(), getY1(), getX2(), getY2());
    }

    public double ptLineDist(double d10, double d11) {
        return ptLineDist(getX1(), getY1(), getX2(), getY2(), d10, d11);
    }

    public double ptLineDistSq(double d10, double d11) {
        return ptLineDistSq(getX1(), getY1(), getX2(), getY2(), d10, d11);
    }

    public double ptSegDist(double d10, double d11) {
        return ptSegDist(getX1(), getY1(), getX2(), getY2(), d10, d11);
    }

    public double ptSegDistSq(double d10, double d11) {
        return ptSegDistSq(getX1(), getY1(), getX2(), getY2(), d10, d11);
    }

    public int relativeCCW(double d10, double d11) {
        return relativeCCW(getX1(), getY1(), getX2(), getY2(), d10, d11);
    }

    public void setLine(Line2D line2D) {
        setLine(line2D.getX1(), line2D.getY1(), line2D.getX2(), line2D.getY2());
    }

    public boolean contains(Point2D point2D) {
        return false;
    }

    public boolean intersectsLine(Line2D line2D) {
        return linesIntersect(line2D.getX1(), line2D.getY1(), line2D.getX2(), line2D.getY2(), getX1(), getY1(), getX2(), getY2());
    }

    public double ptLineDist(Point2D point2D) {
        return ptLineDist(getX1(), getY1(), getX2(), getY2(), point2D.getX(), point2D.getY());
    }

    public double ptLineDistSq(Point2D point2D) {
        return ptLineDistSq(getX1(), getY1(), getX2(), getY2(), point2D.getX(), point2D.getY());
    }

    public double ptSegDist(Point2D point2D) {
        return ptSegDist(getX1(), getY1(), getX2(), getY2(), point2D.getX(), point2D.getY());
    }

    public double ptSegDistSq(Point2D point2D) {
        return ptSegDistSq(getX1(), getY1(), getX2(), getY2(), point2D.getX(), point2D.getY());
    }

    public int relativeCCW(Point2D point2D) {
        return relativeCCW(getX1(), getY1(), getX2(), getY2(), point2D.getX(), point2D.getY());
    }

    public boolean contains(Rectangle2D rectangle2D) {
        return false;
    }
}
