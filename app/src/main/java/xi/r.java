package xi;

import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.IllegalPathStateException;

/* compiled from: CloseFigure.java */
/* loaded from: classes3.dex */
public final class r extends wi.e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10) {
        super(61);
        this.c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(66);
                return;
            }
        }
        super(60);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 0:
                GeneralPath generalPath = dVar.f31231a;
                if (generalPath != null) {
                    try {
                        generalPath.closePath();
                        dVar.a(dVar.f31231a);
                        dVar.f31231a = null;
                        return;
                    } catch (IllegalPathStateException unused) {
                        wi.d.A.warning("no figure to close");
                        return;
                    }
                }
                return;
            case 1:
                GeneralPath generalPath2 = dVar.f31231a;
                if (generalPath2 != null) {
                    try {
                        dVar.a(generalPath2);
                        dVar.f31231a = null;
                        return;
                    } catch (IllegalPathStateException unused2) {
                        wi.d.A.warning("no figure to append");
                        return;
                    }
                }
                return;
            default:
                GeneralPath generalPath3 = dVar.f31250u;
                lib.zj.office.java.awt.c cVar = dVar.f31238i;
                if (generalPath3 != null && cVar != null) {
                    GeneralPath generalPath4 = new GeneralPath(dVar.f31243n);
                    cVar.a(generalPath3);
                    generalPath4.append((lib.zj.office.java.awt.b) null, false);
                    dVar.f31250u = generalPath4;
                    return;
                }
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return this;
    }
}
