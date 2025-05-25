package xi;

import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Ellipse2D;

/* compiled from: Ellipse.java */
/* loaded from: classes3.dex */
public final class z extends wi.e {
    public final Rectangle c;

    public z(Rectangle rectangle) {
        this();
        this.c = rectangle;
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Rectangle rectangle = this.c;
        dVar.e(new Ellipse2D.Double(rectangle.f20688x, rectangle.f20689y, rectangle.getWidth(), rectangle.getHeight()));
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new z(cVar.m());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c;
    }

    public z() {
        super(42);
    }
}
