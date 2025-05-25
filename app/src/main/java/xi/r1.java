package xi;

/* compiled from: ScaleWindowExtEx.java */
/* loaded from: classes3.dex */
public final class r1 extends wi.e {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31774d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31775e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31776f;

    public r1() {
        super(32);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new r1(cVar.readInt(), cVar.readInt(), cVar.readInt(), cVar.readInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  xNum: " + this.c + "\n  xDenom: " + this.f31774d + "\n  yNum: " + this.f31775e + "\n  yDenom: " + this.f31776f;
    }

    public r1(int i10, int i11, int i12, int i13) {
        this();
        this.c = i10;
        this.f31774d = i11;
        this.f31775e = i12;
        this.f31776f = i13;
    }
}
