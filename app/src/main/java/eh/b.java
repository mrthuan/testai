package eh;

/* compiled from: BackgroundAndFill.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16569a;

    /* renamed from: b  reason: collision with root package name */
    public kh.c f16570b;
    public byte c;

    /* renamed from: d  reason: collision with root package name */
    public int f16571d;

    /* renamed from: e  reason: collision with root package name */
    public int f16572e;

    /* renamed from: f  reason: collision with root package name */
    public a f16573f;

    public final jh.a a(lib.zj.office.system.f fVar) {
        if (fVar != null && fVar.o() != null && fVar.o().g() != null) {
            return fVar.o().g().j(this.f16572e);
        }
        return null;
    }

    public final synchronized a b() {
        return this.f16573f;
    }

    public final synchronized void c(a aVar) {
        this.f16573f = aVar;
    }
}
