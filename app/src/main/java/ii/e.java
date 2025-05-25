package ii;

/* compiled from: CellStyle.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public f f18502a;

    /* renamed from: b  reason: collision with root package name */
    public short f18503b;
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public d f18504d;

    /* renamed from: e  reason: collision with root package name */
    public eh.b f18505e;

    public final void a() {
        if (this.c == null) {
            this.c = new a();
        }
    }

    public final void b() {
        if (this.f18504d == null) {
            this.f18504d = new d();
        }
    }

    public final void c() {
        if (this.f18505e == null) {
            eh.b bVar = new eh.b();
            this.f18505e = bVar;
            bVar.c = (byte) -1;
        }
    }

    public final short d() {
        b();
        return this.f18504d.f18501d.f18496a;
    }

    public final short e() {
        b();
        return this.f18504d.f18499a.f18496a;
    }

    public final short f() {
        b();
        return this.f18504d.c.f18496a;
    }

    public final short g() {
        b();
        return this.f18504d.f18500b.f18496a;
    }

    public final byte h() {
        c();
        return this.f18505e.c;
    }

    public final short i() {
        a();
        return this.c.f18493a;
    }

    public final short j() {
        a();
        return this.c.f18495d;
    }

    public final short k() {
        a();
        return this.c.f18494b;
    }

    public final boolean l() {
        a();
        a aVar = this.c;
        if (!aVar.c && aVar.f18493a != 5 && aVar.f18494b != 3) {
            return false;
        }
        return true;
    }
}
