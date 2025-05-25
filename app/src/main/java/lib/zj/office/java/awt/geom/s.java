package lib.zj.office.java.awt.geom;

import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: RectangularShape.java */
/* loaded from: classes3.dex */
public abstract class s implements lib.zj.office.java.awt.b, Cloneable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean contains(Point2D point2D) {
        return contains(point2D.getX(), point2D.getY());
    }

    public Rectangle getBounds() {
        double width = getWidth();
        double height = getHeight();
        if (width >= 0.0d && height >= 0.0d) {
            double x4 = getX();
            double y10 = getY();
            double floor = Math.floor(x4);
            double floor2 = Math.floor(y10);
            return new Rectangle((int) floor, (int) floor2, (int) (Math.ceil(x4 + width) - floor), (int) (Math.ceil(y10 + height) - floor2));
        }
        return new Rectangle();
    }

    public double getCenterX() {
        return (getWidth() / 2.0d) + getX();
    }

    public double getCenterY() {
        return (getHeight() / 2.0d) + getY();
    }

    public Rectangle2D getFrame() {
        return new Rectangle2D.Double(getX(), getY(), getWidth(), getHeight());
    }

    public abstract double getHeight();

    public double getMaxX() {
        return getWidth() + getX();
    }

    public double getMaxY() {
        return getHeight() + getY();
    }

    public double getMinX() {
        return getX();
    }

    public double getMinY() {
        return getY();
    }

    public p getPathIterator(AffineTransform affineTransform, double d10) {
        return new j(getPathIterator(affineTransform), d10);
    }

    public abstract double getWidth();

    public abstract double getX();

    public abstract double getY();

    public boolean intersects(Rectangle2D rectangle2D) {
        return intersects(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public abstract boolean isEmpty();

    public abstract void setFrame(double d10, double d11, double d12, double d13);

    public void setFrame(Point2D point2D, g gVar) {
        setFrame(point2D.getX(), point2D.getY(), gVar.getWidth(), gVar.getHeight());
    }

    public void setFrameFromCenter(double d10, double d11, double d12, double d13) {
        double abs = Math.abs(d12 - d10);
        double abs2 = Math.abs(d13 - d11);
        setFrame(d10 - abs, d11 - abs2, abs * 2.0d, abs2 * 2.0d);
    }

    public void setFrameFromDiagonal(double d10, double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17;
        if (d12 < d10) {
            d15 = d10;
            d14 = d12;
        } else {
            d14 = d10;
            d15 = d12;
        }
        if (d13 < d11) {
            d17 = d11;
            d16 = d13;
        } else {
            d16 = d11;
            d17 = d13;
        }
        double d18 = d17 - d16;
        setFrame(d14, d16, d15 - d14, d18);
    }

    public boolean contains(Rectangle2D rectangle2D) {
        return contains(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public void setFrame(Rectangle2D rectangle2D) {
        setFrame(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public void setFrameFromDiagonal(Point2D point2D, Point2D point2D2) {
        setFrameFromDiagonal(point2D.getX(), point2D.getY(), point2D2.getX(), point2D2.getY());
    }

    public void setFrameFromCenter(Point2D point2D, Point2D point2D2) {
        setFrameFromCenter(point2D.getX(), point2D.getY(), point2D2.getX(), point2D2.getY());
    }
}
