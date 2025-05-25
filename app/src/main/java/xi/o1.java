package xi;

import java.util.Stack;
import wi.d;

/* compiled from: RestoreDC.java */
/* loaded from: classes3.dex */
public final class o1 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i10) {
        super(34);
        this.c = i10;
        if (i10 != 1) {
            this.f31754d = -1;
            return;
        }
        super(57);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 0:
                Stack stack = dVar.f31252w;
                if (!stack.empty()) {
                    d.a aVar = (d.a) stack.pop();
                    dVar.f31246q = aVar.f31260f;
                    dVar.f31243n = aVar.f31259e;
                    dVar.f31250u = aVar.c;
                    dVar.f31244o = aVar.f31258d;
                    dVar.f31245p = aVar.f31261g;
                    dVar.f31248s = aVar.f31262h;
                    dVar.f31251v = null;
                    dVar.l(dVar.f31238i);
                    dVar.f31236g.setMatrix(aVar.f31257b);
                    dVar.j(aVar.f31256a);
                }
                dVar.f31236g.restore();
                return;
            default:
                dVar.f31253x = this.f31754d;
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new o1((int) cVar.readUnsignedInt(), 0);
            default:
                return new o1((int) cVar.readUnsignedInt(), 1);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        int i11 = this.f31754d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  savedDC: " + i11;
            default:
                return super.toString() + "\n  direction: " + i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o1(int i10, int i11) {
        this(0);
        this.c = i11;
        if (i11 != 1) {
            this.f31754d = i10;
            return;
        }
        this(1);
        this.f31754d = i10;
    }
}
