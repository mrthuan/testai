package qk;

/* compiled from: Node.java */
/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public r f29377a = null;

    /* renamed from: b  reason: collision with root package name */
    public r f29378b = null;
    public r c = null;

    /* renamed from: d  reason: collision with root package name */
    public r f29379d = null;

    /* renamed from: e  reason: collision with root package name */
    public r f29380e = null;

    public abstract void a(y yVar);

    public final void b(r rVar) {
        rVar.f();
        rVar.d(this);
        r rVar2 = this.c;
        if (rVar2 != null) {
            rVar2.f29380e = rVar;
            rVar.f29379d = rVar2;
            this.c = rVar;
            return;
        }
        this.f29378b = rVar;
        this.c = rVar;
    }

    public r c() {
        return this.f29377a;
    }

    public void d(r rVar) {
        this.f29377a = rVar;
    }

    public String e() {
        return "";
    }

    public final void f() {
        r rVar = this.f29379d;
        if (rVar != null) {
            rVar.f29380e = this.f29380e;
        } else {
            r rVar2 = this.f29377a;
            if (rVar2 != null) {
                rVar2.f29378b = this.f29380e;
            }
        }
        r rVar3 = this.f29380e;
        if (rVar3 != null) {
            rVar3.f29379d = rVar;
        } else {
            r rVar4 = this.f29377a;
            if (rVar4 != null) {
                rVar4.c = rVar;
            }
        }
        this.f29377a = null;
        this.f29380e = null;
        this.f29379d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
