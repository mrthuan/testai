package xi;

/* compiled from: ExtLogFontW.java */
/* loaded from: classes3.dex */
public final class d0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f31670a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31671b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31672d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31673e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31674f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f31675g;

    /* renamed from: h  reason: collision with root package name */
    public final int f31676h;

    /* renamed from: i  reason: collision with root package name */
    public final w0 f31677i;

    public d0(wi.c cVar) {
        this.f31670a = new s0(cVar);
        this.f31671b = cVar.o(64);
        this.c = cVar.o(32);
        this.f31672d = (int) cVar.readUnsignedInt();
        this.f31673e = (int) cVar.readUnsignedInt();
        this.f31674f = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        this.f31675g = cVar.h(4);
        this.f31676h = (int) cVar.readUnsignedInt();
        this.f31677i = new w0(cVar);
        cVar.readUnsignedShort();
        cVar.d();
    }

    @Override // xi.l0
    public final void a(wi.d dVar) {
        int i10;
        s0 s0Var = this.f31670a;
        if (s0Var.f31791o == null) {
            if (s0Var.f31782f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (s0Var.f31781e > 400) {
                i10 |= 1;
            }
            s0Var.f31791o = new yh.a(s0Var.f31790n, i10, Math.abs(s0Var.f31778a));
        }
        dVar.k(s0Var.f31791o);
        dVar.f31255z = s0Var.c;
    }

    public final String toString() {
        return super.toString() + "\n  LogFontW\n" + this.f31670a.toString() + "\n    fullname: " + this.f31671b + "\n    style: " + this.c + "\n    version: " + this.f31672d + "\n    stylesize: " + this.f31673e + "\n    match: " + this.f31674f + "\n    vendorID: " + this.f31675g + "\n    culture: " + this.f31676h + "\n" + this.f31677i.toString();
    }
}
