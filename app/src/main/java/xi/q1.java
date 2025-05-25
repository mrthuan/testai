package xi;

/* compiled from: ScaleViewportExtEx.java */
/* loaded from: classes3.dex */
public final class q1 extends wi.e {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31769d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31770e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31771f;

    public q1() {
        super(31);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        cVar.c(i10);
        return new q1(cVar.readInt(), cVar.readInt(), cVar.readInt(), cVar.readInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  xNum: " + this.c + "\n  xDenom: " + this.f31769d + "\n  yNum: " + this.f31770e + "\n  yDenom: " + this.f31771f;
    }

    public q1(int i10, int i11, int i12, int i13) {
        this();
        this.c = i10;
        this.f31769d = i11;
        this.f31770e = i12;
        this.f31771f = i13;
    }
}
