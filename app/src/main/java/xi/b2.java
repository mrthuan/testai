package xi;

import android.graphics.Point;

/* compiled from: SetWindowOrgEx.java */
/* loaded from: classes3.dex */
public final class b2 extends wi.e {
    public final Point c;

    public b2() {
        super(10);
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
        return new b2(cVar.j());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  point: " + this.c;
    }

    public b2(Point point) {
        this();
        this.c = point;
    }
}
