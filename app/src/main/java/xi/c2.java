package xi;

import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: SetWorldTransform.java */
/* loaded from: classes3.dex */
public final class c2 extends wi.e {
    public final AffineTransform c;

    public c2() {
        super(35);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        GeneralPath generalPath = dVar.f31250u;
        AffineTransform affineTransform = this.c;
        if (generalPath != null) {
            dVar.f31251v = affineTransform;
            return;
        }
        dVar.i(dVar.f31236g);
        dVar.m(affineTransform);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new c2(cVar.p());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  transform: " + this.c;
    }

    public c2(AffineTransform affineTransform) {
        this();
        this.c = affineTransform;
    }
}
