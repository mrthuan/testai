package ga;

import db.a;

/* compiled from: OptionalProvider.java */
/* loaded from: classes2.dex */
public final class p<T> implements db.b<T>, db.a<T> {
    public static final ha.n c = new ha.n(5);

    /* renamed from: d  reason: collision with root package name */
    public static final o f17737d = new o();

    /* renamed from: a  reason: collision with root package name */
    public a.InterfaceC0196a<T> f17738a;

    /* renamed from: b  reason: collision with root package name */
    public volatile db.b<T> f17739b;

    public p(ha.n nVar, db.b bVar) {
        this.f17738a = nVar;
        this.f17739b = bVar;
    }

    public final void a(a.InterfaceC0196a<T> interfaceC0196a) {
        db.b<T> bVar;
        db.b<T> bVar2;
        db.b<T> bVar3 = this.f17739b;
        o oVar = f17737d;
        if (bVar3 != oVar) {
            interfaceC0196a.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f17739b;
            if (bVar != oVar) {
                bVar2 = bVar;
            } else {
                this.f17738a = new androidx.fragment.app.h(2, this.f17738a, interfaceC0196a);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0196a.g(bVar);
        }
    }

    @Override // db.b
    public final T get() {
        return this.f17739b.get();
    }
}
