package xi;

/* compiled from: ResizePalette.java */
/* loaded from: classes3.dex */
public final class n1 extends wi.e {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31739d;

    public n1() {
        super(51);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new n1((int) cVar.readUnsignedInt(), (int) cVar.readUnsignedInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  index: 0x" + Integer.toHexString(this.c) + "\n  entries: " + this.f31739d;
    }

    public n1(int i10, int i11) {
        this();
        this.c = i10;
        this.f31739d = i11;
    }
}
