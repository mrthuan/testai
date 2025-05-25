package xi;

import android.graphics.Point;

/* compiled from: SetViewportOrgEx.java */
/* loaded from: classes3.dex */
public final class a2 extends wi.e {
    public final Point c;

    public a2() {
        super(12);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Point point = this.c;
        if (point != null) {
            dVar.f31236g.translate(-point.x, -point.y);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new a2(cVar.j());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  point: " + this.c;
    }

    public a2(Point point) {
        this();
        this.c = point;
    }
}
