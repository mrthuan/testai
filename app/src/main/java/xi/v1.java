package xi;

/* compiled from: SetBkMode.java */
/* loaded from: classes3.dex */
public final class v1 extends wi.e {
    public final int c;

    public v1() {
        super(18);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        dVar.f31244o = this.c;
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new v1((int) cVar.readUnsignedInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  mode: " + this.c;
    }

    public v1(int i10) {
        this();
        this.c = i10;
    }
}
