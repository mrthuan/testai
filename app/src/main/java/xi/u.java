package xi;

/* compiled from: CreatePen.java */
/* loaded from: classes3.dex */
public final class u extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31799d;

    /* renamed from: e  reason: collision with root package name */
    public final l0 f31800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i10) {
        super(38);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(82);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        l0[] l0VarArr = dVar.f31237h;
        int i10 = this.c;
        int i11 = this.f31799d;
        l0 l0Var = this.f31800e;
        switch (i10) {
            case 0:
                l0VarArr[i11] = (t0) l0Var;
                return;
            default:
                l0VarArr[i11] = (d0) l0Var;
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new u((int) cVar.readUnsignedInt(), new t0(cVar));
            default:
                return new u((int) cVar.readUnsignedInt(), new d0(cVar));
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        l0 l0Var = this.f31800e;
        int i11 = this.f31799d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  index: 0x" + Integer.toHexString(i11) + "\n" + ((t0) l0Var).toString();
            default:
                return super.toString() + "\n  index: 0x" + Integer.toHexString(i11) + "\n" + ((d0) l0Var).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i10, d0 d0Var) {
        this(1);
        this.c = 1;
        this.f31799d = i10;
        this.f31800e = d0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i10, t0 t0Var) {
        this(0);
        this.c = 0;
        this.f31799d = i10;
        this.f31800e = t0Var;
    }
}
