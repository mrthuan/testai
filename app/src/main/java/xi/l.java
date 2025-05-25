package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: ArcTo.java */
/* loaded from: classes3.dex */
public final class l extends b {
    public l() {
        super(55, null, null, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        dVar.f31231a.append((lib.zj.office.java.awt.b) e(dVar, 0), true);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new l(cVar.m(), cVar.j(), cVar.j());
    }

    public l(Rectangle rectangle, Point point, Point point2) {
        super(55, rectangle, point, point2);
    }
}
