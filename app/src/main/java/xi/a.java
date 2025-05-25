package xi;

import wi.d;

/* compiled from: AbortPath.java */
/* loaded from: classes3.dex */
public final class a extends wi.e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        super(68);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(33);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 1:
                d.a aVar = new d.a();
                aVar.f31257b = dVar.f31236g.getMatrix();
                aVar.f31256a = dVar.f31254y;
                aVar.c = dVar.f31250u;
                aVar.f31260f = dVar.f31246q;
                aVar.f31259e = dVar.f31243n;
                aVar.f31258d = dVar.f31244o;
                aVar.f31261g = dVar.f31245p;
                aVar.f31262h = dVar.f31248s;
                dVar.f31252w.push(aVar);
                dVar.f31236g.save();
                return;
            default:
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return this;
    }
}
