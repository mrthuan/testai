package xi;

import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: IntersectClipRect.java */
/* loaded from: classes3.dex */
public final class p0 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final Rectangle f31764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i10) {
        super(30);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(63);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 0:
                dVar.b(this.f31764d);
                return;
            default:
                GeneralPath generalPath = dVar.f31250u;
                if (generalPath != null) {
                    dVar.f(generalPath);
                    dVar.d(dVar.f31236g, generalPath);
                    dVar.f31250u = null;
                    return;
                }
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new p0(cVar.m(), 0);
            default:
                return new p0(cVar.m(), 1);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        Rectangle rectangle = this.f31764d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  bounds: " + rectangle;
            default:
                return super.toString() + "\n  bounds: " + rectangle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(Rectangle rectangle, int i10) {
        this(0);
        this.c = i10;
        if (i10 != 1) {
            this.f31764d = rectangle;
            return;
        }
        this(1);
        this.f31764d = rectangle;
    }
}
