package xi;

/* compiled from: ExtCreatePen.java */
/* loaded from: classes3.dex */
public final class b0 extends wi.e {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f31663d;

    public b0() {
        super(95);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        dVar.f31237h[this.c] = this.f31663d;
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        return new b0((int) cVar.readUnsignedInt(), new e0(cVar, i10));
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  index: 0x" + Integer.toHexString(this.c) + "\n" + this.f31663d.toString();
    }

    public b0(int i10, e0 e0Var) {
        this();
        this.c = i10;
        this.f31663d = e0Var;
    }
}
