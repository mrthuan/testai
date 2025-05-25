package xi;

import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: ModifyWorldTransform.java */
/* loaded from: classes3.dex */
public final class u0 extends wi.e {
    public final AffineTransform c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31801d;

    public u0() {
        super(36);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        int i10 = this.f31801d;
        if (i10 == 1) {
            if (dVar.f31250u != null) {
                dVar.f31251v = new AffineTransform();
            } else {
                dVar.i(dVar.f31236g);
            }
        } else if (i10 == 2) {
            GeneralPath generalPath = dVar.f31250u;
            AffineTransform affineTransform = this.c;
            if (generalPath != null) {
                dVar.f31251v.concatenate(affineTransform);
                dVar.m(affineTransform);
                return;
            }
            dVar.m(affineTransform);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new u0(cVar.p(), (int) cVar.readUnsignedInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  transform: " + this.c + "\n  mode: " + this.f31801d;
    }

    public u0(AffineTransform affineTransform, int i10) {
        this();
        this.c = affineTransform;
        this.f31801d = i10;
    }
}
