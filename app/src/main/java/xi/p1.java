package xi;

import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.RoundRectangle2D;

/* compiled from: RoundRect.java */
/* loaded from: classes3.dex */
public final class p1 extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final Dimension f31765d;

    public p1() {
        super(44);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Rectangle rectangle = this.c;
        double d10 = rectangle.f20688x;
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        Dimension dimension = this.f31765d;
        dVar.e(new RoundRectangle2D.Double(d10, d10, width, height, dimension.getWidth(), dimension.getHeight()));
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new p1(cVar.m(), cVar.n());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  corner: " + this.f31765d;
    }

    public p1(Rectangle rectangle, Dimension dimension) {
        this();
        this.c = rectangle;
        this.f31765d = dimension;
    }
}
