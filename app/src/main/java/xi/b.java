package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Arc2D;

/* compiled from: AbstractArc.java */
/* loaded from: classes3.dex */
public abstract class b extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final Point f31661d;

    /* renamed from: e  reason: collision with root package name */
    public final Point f31662e;

    public b(int i10, Rectangle rectangle, Point point, Point point2) {
        super(i10);
        this.c = rectangle;
        this.f31661d = point;
        this.f31662e = point2;
    }

    public final double d(Point point) {
        Rectangle rectangle = this.c;
        double width = (rectangle.getWidth() / 2.0d) + rectangle.getX();
        double height = (rectangle.getHeight() / 2.0d) + rectangle.getY();
        double d10 = point.x;
        double d11 = point.y;
        int i10 = (d10 > width ? 1 : (d10 == width ? 0 : -1));
        if (i10 > 0) {
            double atan = (Math.atan(Math.abs(d11 - height) / (d10 - width)) / 3.141592653589793d) * 180.0d;
            if (d11 > height) {
                return 360.0d - atan;
            }
            return atan;
        } else if (i10 == 0) {
            if (d11 < height) {
                return 90.0d;
            }
            return 270.0d;
        } else {
            double atan2 = (Math.atan(Math.abs(d11 - height) / (width - d10)) / 3.141592653589793d) * 180.0d;
            if (d11 < height) {
                return 180.0d - atan2;
            }
            return atan2 + 180.0d;
        }
    }

    public final Arc2D.Double e(wi.d dVar, int i10) {
        double d10;
        double d11;
        double d12;
        int i11 = dVar.f31253x;
        Point point = this.f31662e;
        Point point2 = this.f31661d;
        if (i11 == 2) {
            d10 = d(point);
            d11 = d(point2);
        } else {
            d10 = d(point2);
            d11 = d(point);
        }
        double d13 = d10;
        if (d11 > d13) {
            d12 = d11 - d13;
        } else {
            d12 = 360.0d - (d13 - d11);
        }
        Rectangle rectangle = this.c;
        return new Arc2D.Double(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight(), d13, d12, i10);
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  start: " + this.f31661d + "\n  end: " + this.f31662e;
    }
}
