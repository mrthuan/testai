package lib.zj.office.java.awt.geom;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class Rectangle2D extends s {
    public static final int OUT_BOTTOM = 8;
    public static final int OUT_LEFT = 1;
    public static final int OUT_RIGHT = 4;
    public static final int OUT_TOP = 2;

    /* loaded from: classes3.dex */
    public static class Double extends Rectangle2D implements Serializable {
        private static final long serialVersionUID = 7771313791441850493L;
        public double height;
        public double width;

        /* renamed from: x  reason: collision with root package name */
        public double f20724x;

        /* renamed from: y  reason: collision with root package name */
        public double f20725y;

        public Double() {
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public Rectangle2D createIntersection(Rectangle2D rectangle2D) {
            Double r02 = new Double();
            Rectangle2D.intersect(this, rectangle2D, r02);
            return r02;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public Rectangle2D createUnion(Rectangle2D rectangle2D) {
            Double r02 = new Double();
            Rectangle2D.union(this, rectangle2D, r02);
            return r02;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D, lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Double(this.f20724x, this.f20725y, this.width, this.height);
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
            return this.f20724x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20725y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public int outcode(double d10, double d11) {
            int i10;
            double d12 = this.width;
            if (d12 <= 0.0d) {
                i10 = 5;
            } else {
                double d13 = this.f20724x;
                if (d10 < d13) {
                    i10 = 1;
                } else if (d10 > d13 + d12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            double d14 = this.height;
            if (d14 <= 0.0d) {
                return i10 | 10;
            }
            double d15 = this.f20725y;
            if (d11 < d15) {
                return i10 | 2;
            }
            if (d11 > d15 + d14) {
                return i10 | 8;
            }
            return i10;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public void setRect(double d10, double d11, double d12, double d13) {
            this.f20724x = d10;
            this.f20725y = d11;
            this.width = d12;
            this.height = d13;
        }

        public String toString() {
            return getClass().getName() + "[x=" + this.f20724x + ",y=" + this.f20725y + ",w=" + this.width + ",h=" + this.height + "]";
        }

        public Double(double d10, double d11, double d12, double d13) {
            setRect(d10, d11, d12, d13);
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public void setRect(Rectangle2D rectangle2D) {
            this.f20724x = rectangle2D.getX();
            this.f20725y = rectangle2D.getY();
            this.width = rectangle2D.getWidth();
            this.height = rectangle2D.getHeight();
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Rectangle2D implements Serializable {
        private static final long serialVersionUID = 3798716824173675777L;
        public float height;
        public float width;

        /* renamed from: x  reason: collision with root package name */
        public float f20726x;

        /* renamed from: y  reason: collision with root package name */
        public float f20727y;

        public Float() {
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public Rectangle2D createIntersection(Rectangle2D rectangle2D) {
            Rectangle2D rectangle2D2;
            if (rectangle2D instanceof Float) {
                rectangle2D2 = new Float();
            } else {
                rectangle2D2 = new Double();
            }
            Rectangle2D.intersect(this, rectangle2D, rectangle2D2);
            return rectangle2D2;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public Rectangle2D createUnion(Rectangle2D rectangle2D) {
            Rectangle2D rectangle2D2;
            if (rectangle2D instanceof Float) {
                rectangle2D2 = new Float();
            } else {
                rectangle2D2 = new Double();
            }
            Rectangle2D.union(this, rectangle2D, rectangle2D2);
            return rectangle2D2;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D, lib.zj.office.java.awt.b
        public Rectangle2D getBounds2D() {
            return new Float(this.f20726x, this.f20727y, this.width, this.height);
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
            return this.f20726x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20727y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0f && this.height > 0.0f) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public int outcode(double d10, double d11) {
            int i10;
            float f10 = this.width;
            if (f10 <= 0.0f) {
                i10 = 5;
            } else {
                float f11 = this.f20726x;
                if (d10 < f11) {
                    i10 = 1;
                } else if (d10 > f11 + f10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            float f12 = this.height;
            if (f12 <= 0.0f) {
                return i10 | 10;
            }
            float f13 = this.f20727y;
            if (d11 < f13) {
                return i10 | 2;
            }
            if (d11 > f13 + f12) {
                return i10 | 8;
            }
            return i10;
        }

        public void setRect(float f10, float f11, float f12, float f13) {
            this.f20726x = f10;
            this.f20727y = f11;
            this.width = f12;
            this.height = f13;
        }

        public String toString() {
            return getClass().getName() + "[x=" + this.f20726x + ",y=" + this.f20727y + ",w=" + this.width + ",h=" + this.height + "]";
        }

        public Float(float f10, float f11, float f12, float f13) {
            setRect(f10, f11, f12, f13);
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public void setRect(double d10, double d11, double d12, double d13) {
            this.f20726x = (float) d10;
            this.f20727y = (float) d11;
            this.width = (float) d12;
            this.height = (float) d13;
        }

        @Override // lib.zj.office.java.awt.geom.Rectangle2D
        public void setRect(Rectangle2D rectangle2D) {
            this.f20726x = (float) rectangle2D.getX();
            this.f20727y = (float) rectangle2D.getY();
            this.width = (float) rectangle2D.getWidth();
            this.height = (float) rectangle2D.getHeight();
        }
    }

    public static void intersect(Rectangle2D rectangle2D, Rectangle2D rectangle2D2, Rectangle2D rectangle2D3) {
        double max = Math.max(rectangle2D.getMinX(), rectangle2D2.getMinX());
        double max2 = Math.max(rectangle2D.getMinY(), rectangle2D2.getMinY());
        rectangle2D3.setFrame(max, max2, Math.min(rectangle2D.getMaxX(), rectangle2D2.getMaxX()) - max, Math.min(rectangle2D.getMaxY(), rectangle2D2.getMaxY()) - max2);
    }

    public static void union(Rectangle2D rectangle2D, Rectangle2D rectangle2D2, Rectangle2D rectangle2D3) {
        rectangle2D3.setFrameFromDiagonal(Math.min(rectangle2D.getMinX(), rectangle2D2.getMinX()), Math.min(rectangle2D.getMinY(), rectangle2D2.getMinY()), Math.max(rectangle2D.getMaxX(), rectangle2D2.getMaxX()), Math.max(rectangle2D.getMaxY(), rectangle2D2.getMaxY()));
    }

    public void add(double d10, double d11) {
        double min = Math.min(getMinX(), d10);
        double max = Math.max(getMaxX(), d10);
        double min2 = Math.min(getMinY(), d11);
        setRect(min, min2, max - min, Math.max(getMaxY(), d11) - min2);
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11) {
        double x4 = getX();
        double y10 = getY();
        return d10 >= x4 && d11 >= y10 && d10 < getWidth() + x4 && d11 < getHeight() + y10;
    }

    public abstract Rectangle2D createIntersection(Rectangle2D rectangle2D);

    public abstract Rectangle2D createUnion(Rectangle2D rectangle2D);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle2D)) {
            return false;
        }
        Rectangle2D rectangle2D = (Rectangle2D) obj;
        if (getX() == rectangle2D.getX() && getY() == rectangle2D.getY() && getWidth() == rectangle2D.getWidth() && getHeight() == rectangle2D.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.b
    public Rectangle2D getBounds2D() {
        return (Rectangle2D) clone();
    }

    @Override // lib.zj.office.java.awt.b
    public p getPathIterator(AffineTransform affineTransform) {
        return new r(this, affineTransform);
    }

    public int hashCode() {
        long doubleToLongBits = (java.lang.Double.doubleToLongBits(getHeight()) * 47) + (java.lang.Double.doubleToLongBits(getWidth()) * 43) + (java.lang.Double.doubleToLongBits(getY()) * 37) + java.lang.Double.doubleToLongBits(getX());
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    @Override // lib.zj.office.java.awt.b
    public boolean intersects(double d10, double d11, double d12, double d13) {
        if (isEmpty() || d12 <= 0.0d || d13 <= 0.0d) {
            return false;
        }
        double x4 = getX();
        double y10 = getY();
        if (d12 + d10 <= x4 || d13 + d11 <= y10 || d10 >= getWidth() + x4 || d11 >= getHeight() + y10) {
            return false;
        }
        return true;
    }

    public boolean intersectsLine(double d10, double d11, double d12, double d13) {
        int outcode = outcode(d12, d13);
        if (outcode == 0) {
            return true;
        }
        double d14 = d10;
        double d15 = d11;
        while (true) {
            int outcode2 = outcode(d14, d15);
            if (outcode2 == 0) {
                return true;
            }
            if ((outcode2 & outcode) != 0) {
                return false;
            }
            if ((outcode2 & 5) != 0) {
                double x4 = getX();
                if ((outcode2 & 4) != 0) {
                    x4 = getWidth() + x4;
                }
                d15 = (((d13 - d15) * (x4 - d14)) / (d12 - d14)) + d15;
                d14 = x4;
            } else {
                double y10 = getY();
                if ((outcode2 & 8) != 0) {
                    y10 = getHeight() + y10;
                }
                d14 = (((d12 - d14) * (y10 - d15)) / (d13 - d15)) + d14;
                d15 = y10;
            }
        }
    }

    public abstract int outcode(double d10, double d11);

    public int outcode(Point2D point2D) {
        return outcode(point2D.getX(), point2D.getY());
    }

    @Override // lib.zj.office.java.awt.geom.s
    public void setFrame(double d10, double d11, double d12, double d13) {
        setRect(d10, d11, d12, d13);
    }

    public abstract void setRect(double d10, double d11, double d12, double d13);

    public void setRect(Rectangle2D rectangle2D) {
        setRect(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    @Override // lib.zj.office.java.awt.geom.s
    public p getPathIterator(AffineTransform affineTransform, double d10) {
        return new r(this, affineTransform);
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11, double d12, double d13) {
        if (isEmpty() || d12 <= 0.0d || d13 <= 0.0d) {
            return false;
        }
        double x4 = getX();
        double y10 = getY();
        return d10 >= x4 && d11 >= y10 && d10 + d12 <= getWidth() + x4 && d11 + d13 <= getHeight() + y10;
    }

    public void add(Point2D point2D) {
        add(point2D.getX(), point2D.getY());
    }

    public void add(Rectangle2D rectangle2D) {
        double min = Math.min(getMinX(), rectangle2D.getMinX());
        double max = Math.max(getMaxX(), rectangle2D.getMaxX());
        double min2 = Math.min(getMinY(), rectangle2D.getMinY());
        setRect(min, min2, max - min, Math.max(getMaxY(), rectangle2D.getMaxY()) - min2);
    }

    public boolean intersectsLine(Line2D line2D) {
        return intersectsLine(line2D.getX1(), line2D.getY1(), line2D.getX2(), line2D.getY2());
    }
}
