package lib.zj.office.java.awt.geom;

import java.io.Serializable;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class RoundRectangle2D extends s {

    /* loaded from: classes3.dex */
    public static class Double extends RoundRectangle2D implements Serializable {
        private static final long serialVersionUID = 1048939333485206117L;
        public double archeight;
        public double arcwidth;
        public double height;
        public double width;

        /* renamed from: x  reason: collision with root package name */
        public double f20728x;

        /* renamed from: y  reason: collision with root package name */
        public double f20729y;

        public Double() {
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public double getArcHeight() {
            return this.archeight;
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public double getArcWidth() {
            return this.arcwidth;
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Double(this.f20728x, this.f20729y, this.width, this.height);
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getHeight() {
            return this.height;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getWidth() {
            return this.width;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getX() {
            return this.f20728x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20729y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public void setRoundRect(double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f20728x = d10;
            this.f20729y = d11;
            this.width = d12;
            this.height = d13;
            this.arcwidth = d14;
            this.archeight = d15;
        }

        public Double(double d10, double d11, double d12, double d13, double d14, double d15) {
            setRoundRect(d10, d11, d12, d13, d14, d15);
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public void setRoundRect(RoundRectangle2D roundRectangle2D) {
            this.f20728x = roundRectangle2D.getX();
            this.f20729y = roundRectangle2D.getY();
            this.width = roundRectangle2D.getWidth();
            this.height = roundRectangle2D.getHeight();
            this.arcwidth = roundRectangle2D.getArcWidth();
            this.archeight = roundRectangle2D.getArcHeight();
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends RoundRectangle2D implements Serializable {
        private static final long serialVersionUID = -3423150618393866922L;
        public float archeight;
        public float arcwidth;
        public float height;
        public float width;

        /* renamed from: x  reason: collision with root package name */
        public float f20730x;

        /* renamed from: y  reason: collision with root package name */
        public float f20731y;

        public Float() {
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public double getArcHeight() {
            return this.archeight;
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public double getArcWidth() {
            return this.arcwidth;
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Float(this.f20730x, this.f20731y, this.width, this.height);
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getHeight() {
            return this.height;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getWidth() {
            return this.width;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getX() {
            return this.f20730x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20731y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0f && this.height > 0.0f) {
                return false;
            }
            return true;
        }

        public void setRoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f20730x = f10;
            this.f20731y = f11;
            this.width = f12;
            this.height = f13;
            this.arcwidth = f14;
            this.archeight = f15;
        }

        public Float(float f10, float f11, float f12, float f13, float f14, float f15) {
            setRoundRect(f10, f11, f12, f13, f14, f15);
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public void setRoundRect(double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f20730x = (float) d10;
            this.f20731y = (float) d11;
            this.width = (float) d12;
            this.height = (float) d13;
            this.arcwidth = (float) d14;
            this.archeight = (float) d15;
        }

        @Override // lib.zj.office.java.awt.geom.RoundRectangle2D
        public void setRoundRect(RoundRectangle2D roundRectangle2D) {
            this.f20730x = (float) roundRectangle2D.getX();
            this.f20731y = (float) roundRectangle2D.getY();
            this.width = (float) roundRectangle2D.getWidth();
            this.height = (float) roundRectangle2D.getHeight();
            this.arcwidth = (float) roundRectangle2D.getArcWidth();
            this.archeight = (float) roundRectangle2D.getArcHeight();
        }
    }

    public static int a(double d10, double d11, double d12, double d13) {
        if (d10 < d11) {
            return 0;
        }
        if (d10 < d11 + d13) {
            return 1;
        }
        if (d10 < d12 - d13) {
            return 2;
        }
        if (d10 < d12) {
            return 3;
        }
        return 4;
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11) {
        if (isEmpty()) {
            return false;
        }
        double x4 = getX();
        double y10 = getY();
        double width = getWidth() + x4;
        double height = getHeight() + y10;
        if (d10 < x4 || d11 < y10 || d10 >= width || d11 >= height) {
            return false;
        }
        double min = Math.min(getWidth(), Math.abs(getArcWidth())) / 2.0d;
        double min2 = Math.min(getHeight(), Math.abs(getArcHeight())) / 2.0d;
        double d12 = x4 + min;
        if (d10 >= d12) {
            d12 = width - min;
            if (d10 < d12) {
                return true;
            }
        }
        double d13 = y10 + min2;
        if (d11 >= d13) {
            d13 = height - min2;
            if (d11 < d13) {
                return true;
            }
        }
        double d14 = (d10 - d12) / min;
        double d15 = (d11 - d13) / min2;
        return (d15 * d15) + (d14 * d14) <= 1.0d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoundRectangle2D)) {
            return false;
        }
        RoundRectangle2D roundRectangle2D = (RoundRectangle2D) obj;
        if (getX() == roundRectangle2D.getX() && getY() == roundRectangle2D.getY() && getWidth() == roundRectangle2D.getWidth() && getHeight() == roundRectangle2D.getHeight() && getArcWidth() == roundRectangle2D.getArcWidth() && getArcHeight() == roundRectangle2D.getArcHeight()) {
            return true;
        }
        return false;
    }

    public abstract double getArcHeight();

    public abstract double getArcWidth();

    @Override // lib.zj.office.java.awt.b
    public p getPathIterator(AffineTransform affineTransform) {
        return new t(this, affineTransform);
    }

    public int hashCode() {
        long doubleToLongBits = (java.lang.Double.doubleToLongBits(getArcHeight()) * 59) + (java.lang.Double.doubleToLongBits(getArcWidth()) * 53) + (java.lang.Double.doubleToLongBits(getHeight()) * 47) + (java.lang.Double.doubleToLongBits(getWidth()) * 43) + (java.lang.Double.doubleToLongBits(getY()) * 37) + java.lang.Double.doubleToLongBits(getX());
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    @Override // lib.zj.office.java.awt.b
    public boolean intersects(double d10, double d11, double d12, double d13) {
        double d14;
        double d15;
        if (!isEmpty() && d12 > 0.0d && d13 > 0.0d) {
            double x4 = getX();
            double y10 = getY();
            double width = getWidth() + x4;
            double height = getHeight() + y10;
            double d16 = d10 + d12;
            if (d16 > x4 && d10 < width) {
                double d17 = d11 + d13;
                if (d17 > y10 && d11 < height) {
                    double min = Math.min(getWidth(), Math.abs(getArcWidth())) / 2.0d;
                    double min2 = Math.min(getHeight(), Math.abs(getArcHeight())) / 2.0d;
                    int a10 = a(d10, x4, width, min);
                    int a11 = a(d16, x4, width, min);
                    int a12 = a(d11, y10, height, min2);
                    int a13 = a(d17, y10, height, min2);
                    if (a10 == 2 || a11 == 2 || a12 == 2 || a13 == 2) {
                        return true;
                    }
                    if ((a10 < 2 && a11 > 2) || (a12 < 2 && a13 > 2)) {
                        return true;
                    }
                    if (a11 == 1) {
                        d14 = d16 - (x4 + min);
                    } else {
                        d14 = d10 - (width - min);
                    }
                    if (a13 == 1) {
                        d15 = d17 - (y10 + min2);
                    } else {
                        d15 = d11 - (height - min2);
                    }
                    double d18 = d14 / min;
                    double d19 = d15 / min2;
                    if ((d19 * d19) + (d18 * d18) > 1.0d) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.s
    public void setFrame(double d10, double d11, double d12, double d13) {
        setRoundRect(d10, d11, d12, d13, getArcWidth(), getArcHeight());
    }

    public abstract void setRoundRect(double d10, double d11, double d12, double d13, double d14, double d15);

    public void setRoundRect(RoundRectangle2D roundRectangle2D) {
        setRoundRect(roundRectangle2D.getX(), roundRectangle2D.getY(), roundRectangle2D.getWidth(), roundRectangle2D.getHeight(), roundRectangle2D.getArcWidth(), roundRectangle2D.getArcHeight());
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11, double d12, double d13) {
        if (isEmpty() || d12 <= 0.0d || d13 <= 0.0d || !contains(d10, d11)) {
            return false;
        }
        double d14 = d12 + d10;
        if (contains(d14, d11)) {
            double d15 = d11 + d13;
            return contains(d10, d15) && contains(d14, d15);
        }
        return false;
    }
}
