package lib.zj.office.java.awt.geom;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class Point2D implements Cloneable {

    /* loaded from: classes3.dex */
    public static class Double extends Point2D implements Serializable {
        private static final long serialVersionUID = 6150783262733311327L;

        /* renamed from: x  reason: collision with root package name */
        public double f20720x;

        /* renamed from: y  reason: collision with root package name */
        public double f20721y;

        public Double() {
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public double getX() {
            return this.f20720x;
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public double getY() {
            return this.f20721y;
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public void setLocation(double d10, double d11) {
            this.f20720x = d10;
            this.f20721y = d11;
        }

        public String toString() {
            return "Point2D.Double[" + this.f20720x + ", " + this.f20721y + "]";
        }

        public Double(double d10, double d11) {
            this.f20720x = d10;
            this.f20721y = d11;
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Point2D implements Serializable {
        private static final long serialVersionUID = -2870572449815403710L;

        /* renamed from: x  reason: collision with root package name */
        public float f20722x;

        /* renamed from: y  reason: collision with root package name */
        public float f20723y;

        public Float() {
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public double getX() {
            return this.f20722x;
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public double getY() {
            return this.f20723y;
        }

        @Override // lib.zj.office.java.awt.geom.Point2D
        public void setLocation(double d10, double d11) {
            this.f20722x = (float) d10;
            this.f20723y = (float) d11;
        }

        public String toString() {
            return "Point2D.Float[" + this.f20722x + ", " + this.f20723y + "]";
        }

        public Float(float f10, float f11) {
            this.f20722x = f10;
            this.f20723y = f11;
        }

        public void setLocation(float f10, float f11) {
            this.f20722x = f10;
            this.f20723y = f11;
        }
    }

    public static double distance(double d10, double d11, double d12, double d13) {
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        return Math.sqrt((d15 * d15) + (d14 * d14));
    }

    public static double distanceSq(double d10, double d11, double d12, double d13) {
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        return (d15 * d15) + (d14 * d14);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point2D) {
            Point2D point2D = (Point2D) obj;
            if (getX() == point2D.getX() && getY() == point2D.getY()) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public abstract double getX();

    public abstract double getY();

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(getX()) ^ (java.lang.Double.doubleToLongBits(getY()) * 31);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }

    public abstract void setLocation(double d10, double d11);

    public void setLocation(Point2D point2D) {
        setLocation(point2D.getX(), point2D.getY());
    }

    public double distance(double d10, double d11) {
        double x4 = d10 - getX();
        double y10 = d11 - getY();
        return Math.sqrt((y10 * y10) + (x4 * x4));
    }

    public double distanceSq(double d10, double d11) {
        double x4 = d10 - getX();
        double y10 = d11 - getY();
        return (y10 * y10) + (x4 * x4);
    }

    public double distanceSq(Point2D point2D) {
        double x4 = point2D.getX() - getX();
        double y10 = point2D.getY() - getY();
        return (y10 * y10) + (x4 * x4);
    }

    public double distance(Point2D point2D) {
        double x4 = point2D.getX() - getX();
        double y10 = point2D.getY() - getY();
        return Math.sqrt((y10 * y10) + (x4 * x4));
    }
}
