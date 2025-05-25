package xi;

/* compiled from: CreateBrushIndirect.java */
/* loaded from: classes3.dex */
public final class s extends wi.e {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f31777d;

    public s() {
        super(39);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        dVar.f31237h[this.c] = this.f31777d;
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new s((int) cVar.readUnsignedInt(), new r0(cVar));
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  index: 0x" + Integer.toHexString(this.c) + "\n" + this.f31777d.toString();
    }

    public s(int i10, r0 r0Var) {
        this();
        this.c = i10;
        this.f31777d = r0Var;
    }
}
