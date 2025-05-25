package lib.zj.office.java.awt.geom;

import java.io.Serializable;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class Ellipse2D extends s {

    /* loaded from: classes3.dex */
    public static class Double extends Ellipse2D implements Serializable {
        private static final long serialVersionUID = 5555464816372320683L;
        public double height;
        public double width;

        /* renamed from: x  reason: collision with root package name */
        public double f20699x;

        /* renamed from: y  reason: collision with root package name */
        public double f20700y;

        public Double() {
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Double(this.f20699x, this.f20700y, this.width, this.height);
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
            return this.f20699x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20700y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public void setFrame(double d10, double d11, double d12, double d13) {
            this.f20699x = d10;
            this.f20700y = d11;
            this.width = d12;
            this.height = d13;
        }

        public Double(double d10, double d11, double d12, double d13) {
            setFrame(d10, d11, d12, d13);
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Ellipse2D implements Serializable {
        private static final long serialVersionUID = -6633761252372475977L;
        public float height;
        public float width;

        /* renamed from: x  reason: collision with root package name */
        public float f20701x;

        /* renamed from: y  reason: collision with root package name */
        public float f20702y;

        public Float() {
        }

        @Override // lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Rectangle2D.Float(this.f20701x, this.f20702y, this.width, this.height);
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
            return this.f20701x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20702y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        public void setFrame(float f10, float f11, float f12, float f13) {
            this.f20701x = f10;
            this.f20702y = f11;
            this.width = f12;
            this.height = f13;
        }

        public Float(float f10, float f11, float f12, float f13) {
            setFrame(f10, f11, f12, f13);
        }

        @Override // lib.zj.office.java.awt.geom.s
        public void setFrame(double d10, double d11, double d12, double d13) {
            this.f20701x = (float) d10;
            this.f20702y = (float) d11;
            this.width = (float) d12;
            this.height = (float) d13;
        }
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11) {
        double width = getWidth();
        if (width <= 0.0d) {
            return false;
        }
        double x4 = ((d10 - getX()) / width) - 0.5d;
        double height = getHeight();
        if (height <= 0.0d) {
            return false;
        }
        double y10 = ((d11 - getY()) / height) - 0.5d;
        return (y10 * y10) + (x4 * x4) < 0.25d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ellipse2D)) {
            return false;
        }
        Ellipse2D ellipse2D = (Ellipse2D) obj;
        if (getX() == ellipse2D.getX() && getY() == ellipse2D.getY() && getWidth() == ellipse2D.getWidth() && getHeight() == ellipse2D.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.b
    public p getPathIterator(AffineTransform affineTransform) {
        return new i(this, affineTransform);
    }

    public int hashCode() {
        long doubleToLongBits = (java.lang.Double.doubleToLongBits(getHeight()) * 47) + (java.lang.Double.doubleToLongBits(getWidth()) * 43) + (java.lang.Double.doubleToLongBits(getY()) * 37) + java.lang.Double.doubleToLongBits(getX());
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    @Override // lib.zj.office.java.awt.b
    public boolean intersects(double d10, double d11, double d12, double d13) {
        double d14 = 0.0d;
        if (d12 <= 0.0d || d13 <= 0.0d) {
            return false;
        }
        double width = getWidth();
        if (width <= 0.0d) {
            return false;
        }
        double x4 = ((d10 - getX()) / width) - 0.5d;
        double d15 = (d12 / width) + x4;
        double height = getHeight();
        if (height <= 0.0d) {
            return false;
        }
        double y10 = ((d11 - getY()) / height) - 0.5d;
        double d16 = (d13 / height) + y10;
        if (x4 <= 0.0d) {
            if (d15 < 0.0d) {
                x4 = d15;
            } else {
                x4 = 0.0d;
            }
        }
        if (y10 > 0.0d) {
            d14 = y10;
        } else if (d16 < 0.0d) {
            d14 = d16;
        }
        if ((d14 * d14) + (x4 * x4) >= 0.25d) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11, double d12, double d13) {
        if (contains(d10, d11)) {
            double d14 = d12 + d10;
            if (contains(d14, d11)) {
                double d15 = d11 + d13;
                if (contains(d10, d15) && contains(d14, d15)) {
                    return true;
                }
            }
        }
        return false;
    }
}
