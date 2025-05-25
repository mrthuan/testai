package lib.zj.office.java.awt.geom;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lib.zj.office.java.awt.geom.Point2D;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class Arc2D extends s {
    public static final int CHORD = 1;
    public static final int OPEN = 0;
    public static final int PIE = 2;
    private int type;

    /* loaded from: classes3.dex */
    public static class Double extends Arc2D implements Serializable {
        private static final long serialVersionUID = 728264085846882001L;
        public double extent;
        public double height;
        public double start;
        public double width;

        /* renamed from: x  reason: collision with root package name */
        public double f20695x;

        /* renamed from: y  reason: collision with root package name */
        public double f20696y;

        public Double() {
            super(0);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            try {
                setArcType(objectInputStream.readByte());
            } catch (IllegalArgumentException e10) {
                throw new InvalidObjectException(e10.getMessage());
            }
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeByte(getArcType());
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public double getAngleExtent() {
            return this.extent;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public double getAngleStart() {
            return this.start;
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
            return this.f20695x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20696y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public Rectangle2D makeBounds(double d10, double d11, double d12, double d13) {
            return new Rectangle2D.Double(d10, d11, d12, d13);
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setAngleExtent(double d10) {
            this.extent = d10;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setAngleStart(double d10) {
            this.start = d10;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setArc(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
            setArcType(i10);
            this.f20695x = d10;
            this.f20696y = d11;
            this.width = d12;
            this.height = d13;
            this.start = d14;
            this.extent = d15;
        }

        public Double(int i10) {
            super(i10);
        }

        public Double(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
            super(i10);
            this.f20695x = d10;
            this.f20696y = d11;
            this.width = d12;
            this.height = d13;
            this.start = d14;
            this.extent = d15;
        }

        public Double(Rectangle2D rectangle2D, double d10, double d11, int i10) {
            super(i10);
            this.f20695x = rectangle2D.getX();
            this.f20696y = rectangle2D.getY();
            this.width = rectangle2D.getWidth();
            this.height = rectangle2D.getHeight();
            this.start = d10;
            this.extent = d11;
        }
    }

    /* loaded from: classes3.dex */
    public static class Float extends Arc2D implements Serializable {
        private static final long serialVersionUID = 9130893014586380278L;
        public float extent;
        public float height;
        public float start;
        public float width;

        /* renamed from: x  reason: collision with root package name */
        public float f20697x;

        /* renamed from: y  reason: collision with root package name */
        public float f20698y;

        public Float() {
            super(0);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            try {
                setArcType(objectInputStream.readByte());
            } catch (IllegalArgumentException e10) {
                throw new InvalidObjectException(e10.getMessage());
            }
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeByte(getArcType());
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public double getAngleExtent() {
            return this.extent;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public double getAngleStart() {
            return this.start;
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
            return this.f20697x;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public double getY() {
            return this.f20698y;
        }

        @Override // lib.zj.office.java.awt.geom.s
        public boolean isEmpty() {
            if (this.width > 0.0d && this.height > 0.0d) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public Rectangle2D makeBounds(double d10, double d11, double d12, double d13) {
            return new Rectangle2D.Float((float) d10, (float) d11, (float) d12, (float) d13);
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setAngleExtent(double d10) {
            this.extent = (float) d10;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setAngleStart(double d10) {
            this.start = (float) d10;
        }

        @Override // lib.zj.office.java.awt.geom.Arc2D
        public void setArc(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
            setArcType(i10);
            this.f20697x = (float) d10;
            this.f20698y = (float) d11;
            this.width = (float) d12;
            this.height = (float) d13;
            this.start = (float) d14;
            this.extent = (float) d15;
        }

        public Float(int i10) {
            super(i10);
        }

        public Float(float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
            super(i10);
            this.f20697x = f10;
            this.f20698y = f11;
            this.width = f12;
            this.height = f13;
            this.start = f14;
            this.extent = f15;
        }

        public Float(Rectangle2D rectangle2D, float f10, float f11, int i10) {
            super(i10);
            this.f20697x = (float) rectangle2D.getX();
            this.f20698y = (float) rectangle2D.getY();
            this.width = (float) rectangle2D.getWidth();
            this.height = (float) rectangle2D.getHeight();
            this.start = f10;
            this.extent = f11;
        }
    }

    public Arc2D() {
        this(0);
    }

    public static double normalizeDegrees(double d10) {
        if (d10 > 180.0d) {
            if (d10 <= 540.0d) {
                return d10 - 360.0d;
            }
            double IEEEremainder = Math.IEEEremainder(d10, 360.0d);
            if (IEEEremainder != -180.0d) {
                return IEEEremainder;
            }
        } else if (d10 <= -180.0d) {
            if (d10 > -540.0d) {
                return d10 + 360.0d;
            }
            double IEEEremainder2 = Math.IEEEremainder(d10, 360.0d);
            if (IEEEremainder2 != -180.0d) {
                return IEEEremainder2;
            }
        } else {
            return d10;
        }
        return 180.0d;
    }

    public final boolean a(double d10, double d11, double d12, double d13, Rectangle2D rectangle2D) {
        Rectangle2D rectangle2D2;
        if (contains(d10, d11)) {
            double d14 = d10 + d12;
            if (contains(d14, d11)) {
                double d15 = d11 + d13;
                if (contains(d10, d15) && contains(d14, d15)) {
                    if (this.type != 2 || Math.abs(getAngleExtent()) <= 180.0d) {
                        return true;
                    }
                    if (rectangle2D == null) {
                        rectangle2D2 = new Rectangle2D.Double(d10, d11, d12, d13);
                    } else {
                        rectangle2D2 = rectangle2D;
                    }
                    double width = getWidth() / 2.0d;
                    double height = getHeight() / 2.0d;
                    double x4 = getX() + width;
                    double y10 = getY() + height;
                    double radians = Math.toRadians(-getAngleStart());
                    if (rectangle2D2.intersectsLine(x4, y10, (Math.cos(radians) * width) + x4, android.support.v4.media.session.h.a(radians, height, y10))) {
                        return false;
                    }
                    double radians2 = Math.toRadians(-getAngleExtent()) + radians;
                    return !rectangle2D2.intersectsLine(x4, y10, (Math.cos(radians2) * width) + x4, android.support.v4.media.session.h.a(radians2, height, y10));
                }
            }
        }
        return false;
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
        if ((y10 * y10) + (x4 * x4) >= 0.25d) {
            return false;
        }
        double abs = Math.abs(getAngleExtent());
        if (abs >= 360.0d) {
            return true;
        }
        boolean containsAngle = containsAngle(-Math.toDegrees(Math.atan2(y10, x4)));
        if (this.type == 2) {
            return containsAngle;
        }
        if (containsAngle) {
            if (abs >= 180.0d) {
                return true;
            }
        } else if (abs <= 180.0d) {
            return false;
        }
        double radians = Math.toRadians(-getAngleStart());
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double radians2 = Math.toRadians(-getAngleExtent()) + radians;
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        boolean z10 = Line2D.relativeCCW(cos, sin, cos2, sin2, x4 * 2.0d, y10 * 2.0d) * Line2D.relativeCCW(cos, sin, cos2, sin2, 0.0d, 0.0d) >= 0;
        return containsAngle ? !z10 : z10;
    }

    public boolean containsAngle(double d10) {
        boolean z10;
        double angleExtent = getAngleExtent();
        if (angleExtent < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            angleExtent = -angleExtent;
        }
        if (angleExtent >= 360.0d) {
            return true;
        }
        double normalizeDegrees = normalizeDegrees(d10) - normalizeDegrees(getAngleStart());
        if (z10) {
            normalizeDegrees = -normalizeDegrees;
        }
        if (normalizeDegrees < 0.0d) {
            normalizeDegrees += 360.0d;
        }
        if (normalizeDegrees < 0.0d || normalizeDegrees >= angleExtent) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Arc2D)) {
            return false;
        }
        Arc2D arc2D = (Arc2D) obj;
        if (getX() == arc2D.getX() && getY() == arc2D.getY() && getWidth() == arc2D.getWidth() && getHeight() == arc2D.getHeight() && getAngleStart() == arc2D.getAngleStart() && getAngleExtent() == arc2D.getAngleExtent() && getArcType() == arc2D.getArcType()) {
            return true;
        }
        return false;
    }

    public abstract double getAngleExtent();

    public abstract double getAngleStart();

    public int getArcType() {
        return this.type;
    }

    @Override // lib.zj.office.java.awt.b
    public Rectangle2D getBounds2D() {
        double d10;
        double d11;
        if (isEmpty()) {
            return makeBounds(getX(), getY(), getWidth(), getHeight());
        }
        if (getArcType() == 2) {
            d10 = 0.0d;
            d11 = 0.0d;
        } else {
            d10 = 1.0d;
            d11 = -1.0d;
        }
        double d12 = d11;
        double d13 = 0.0d;
        double d14 = d12;
        double d15 = d10;
        for (int i10 = 0; i10 < 6; i10++) {
            if (i10 < 4) {
                d13 += 90.0d;
                if (!containsAngle(d13)) {
                }
            } else if (i10 == 4) {
                d13 = getAngleStart();
            } else {
                d13 += getAngleExtent();
            }
            double radians = Math.toRadians(-d13);
            double d16 = d13;
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            d10 = Math.min(d10, cos);
            d15 = Math.min(d15, sin);
            double max = Math.max(d14, cos);
            d12 = Math.max(d12, sin);
            d14 = max;
            d13 = d16;
        }
        double width = getWidth();
        double height = getHeight();
        return makeBounds((((d10 * 0.5d) + 0.5d) * width) + getX(), (((d15 * 0.5d) + 0.5d) * height) + getY(), (d14 - d10) * 0.5d * width, (d12 - d15) * 0.5d * height);
    }

    public Point2D getEndPoint() {
        double radians = Math.toRadians((-getAngleStart()) - getAngleExtent());
        return new Point2D.Double((getWidth() * ((Math.cos(radians) * 0.5d) + 0.5d)) + getX(), (getHeight() * android.support.v4.media.session.h.a(radians, 0.5d, 0.5d)) + getY());
    }

    @Override // lib.zj.office.java.awt.b
    public p getPathIterator(AffineTransform affineTransform) {
        return new a(this, affineTransform);
    }

    public Point2D getStartPoint() {
        double radians = Math.toRadians(-getAngleStart());
        return new Point2D.Double((getWidth() * ((Math.cos(radians) * 0.5d) + 0.5d)) + getX(), (getHeight() * android.support.v4.media.session.h.a(radians, 0.5d, 0.5d)) + getY());
    }

    public int hashCode() {
        long doubleToLongBits = (java.lang.Double.doubleToLongBits(getAngleExtent()) * 59) + (java.lang.Double.doubleToLongBits(getAngleStart()) * 53) + (java.lang.Double.doubleToLongBits(getHeight()) * 47) + (java.lang.Double.doubleToLongBits(getWidth()) * 43) + (java.lang.Double.doubleToLongBits(getY()) * 37) + java.lang.Double.doubleToLongBits(getX()) + (getArcType() * 61);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0139, code lost:
        if (r17.intersectsLine(r32, r34, r36, r38) == false) goto L77;
     */
    @Override // lib.zj.office.java.awt.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean intersects(double r43, double r45, double r47, double r49) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.Arc2D.intersects(double, double, double, double):boolean");
    }

    public abstract Rectangle2D makeBounds(double d10, double d11, double d12, double d13);

    public abstract void setAngleExtent(double d10);

    public abstract void setAngleStart(double d10);

    public void setAngleStart(Point2D point2D) {
        setAngleStart(-Math.toDegrees(Math.atan2((point2D.getY() - getCenterY()) * getWidth(), (point2D.getX() - getCenterX()) * getHeight())));
    }

    public void setAngles(double d10, double d11, double d12, double d13) {
        double centerX = getCenterX();
        double centerY = getCenterY();
        double width = getWidth();
        double height = getHeight();
        double atan2 = Math.atan2((centerY - d11) * width, (d10 - centerX) * height);
        double atan22 = Math.atan2((centerY - d13) * width, (d12 - centerX) * height) - atan2;
        if (atan22 <= 0.0d) {
            atan22 += 6.283185307179586d;
        }
        setAngleStart(Math.toDegrees(atan2));
        setAngleExtent(Math.toDegrees(atan22));
    }

    public abstract void setArc(double d10, double d11, double d12, double d13, double d14, double d15, int i10);

    public void setArc(Point2D point2D, g gVar, double d10, double d11, int i10) {
        setArc(point2D.getX(), point2D.getY(), gVar.getWidth(), gVar.getHeight(), d10, d11, i10);
    }

    public void setArcByCenter(double d10, double d11, double d12, double d13, double d14, int i10) {
        double d15 = d12 * 2.0d;
        setArc(d10 - d12, d11 - d12, d15, d15, d13, d14, i10);
    }

    public void setArcByTangent(Point2D point2D, Point2D point2D2, Point2D point2D3, double d10) {
        double d11;
        double d12;
        double d13;
        double atan2 = Math.atan2(point2D.getY() - point2D2.getY(), point2D.getX() - point2D2.getX());
        double atan22 = Math.atan2(point2D3.getY() - point2D2.getY(), point2D3.getX() - point2D2.getX());
        double d14 = atan22 - atan2;
        if (d14 > 3.141592653589793d) {
            atan22 -= 6.283185307179586d;
        } else if (d14 < -3.141592653589793d) {
            atan22 += 6.283185307179586d;
        }
        double d15 = (atan2 + atan22) / 2.0d;
        double sin = d10 / Math.sin(Math.abs(atan22 - d15));
        double x4 = point2D2.getX() + (Math.cos(d15) * sin);
        double a10 = android.support.v4.media.session.h.a(d15, sin, point2D2.getY());
        if (atan2 < atan22) {
            d11 = atan2 - 1.5707963267948966d;
            d12 = atan22 + 1.5707963267948966d;
        } else {
            d11 = atan2 + 1.5707963267948966d;
            d12 = atan22 - 1.5707963267948966d;
        }
        double degrees = Math.toDegrees(-d11);
        double degrees2 = Math.toDegrees(-d12) - degrees;
        if (degrees2 < 0.0d) {
            d13 = degrees2 + 360.0d;
        } else {
            d13 = degrees2 - 360.0d;
        }
        setArcByCenter(x4, a10, d10, degrees, d13, this.type);
    }

    public void setArcType(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.type = i10;
            return;
        }
        throw new IllegalArgumentException(b.a.c("invalid type for Arc: ", i10));
    }

    @Override // lib.zj.office.java.awt.geom.s
    public void setFrame(double d10, double d11, double d12, double d13) {
        setArc(d10, d11, d12, d13, getAngleStart(), getAngleExtent(), this.type);
    }

    public Arc2D(int i10) {
        setArcType(i10);
    }

    public void setArc(Rectangle2D rectangle2D, double d10, double d11, int i10) {
        setArc(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight(), d10, d11, i10);
    }

    public void setArc(Arc2D arc2D) {
        setArc(arc2D.getX(), arc2D.getY(), arc2D.getWidth(), arc2D.getHeight(), arc2D.getAngleStart(), arc2D.getAngleExtent(), arc2D.type);
    }

    public void setAngles(Point2D point2D, Point2D point2D2) {
        setAngles(point2D.getX(), point2D.getY(), point2D2.getX(), point2D2.getY());
    }

    @Override // lib.zj.office.java.awt.b
    public boolean contains(double d10, double d11, double d12, double d13) {
        return a(d10, d11, d12, d13, null);
    }

    @Override // lib.zj.office.java.awt.geom.s
    public boolean contains(Rectangle2D rectangle2D) {
        return a(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight(), rectangle2D);
    }
}
