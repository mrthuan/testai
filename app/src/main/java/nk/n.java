package nk;

import qk.q;
import qk.t;

/* compiled from: ListItemParser.java */
/* loaded from: classes3.dex */
public final class n extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final q f22574a = new q();

    /* renamed from: b  reason: collision with root package name */
    public final int f22575b;
    public boolean c;

    public n(int i10) {
        this.f22575b = i10;
    }

    @Override // sk.a, sk.c
    public final boolean a() {
        return true;
    }

    @Override // sk.a, sk.c
    public final boolean d(qk.a aVar) {
        if (this.c) {
            qk.a aVar2 = (qk.a) this.f22574a.f29377a;
            if (aVar2 instanceof qk.p) {
                ((qk.p) aVar2).f29376f = false;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // sk.c
    public final a f(sk.e eVar) {
        g gVar = (g) eVar;
        boolean z10 = false;
        if (gVar.f22528h) {
            if (this.f22574a.f29378b == null) {
                return null;
            }
            qk.a g10 = gVar.h().g();
            this.c = ((g10 instanceof t) || (g10 instanceof q)) ? true : true;
            return a.a(gVar.f22525e);
        }
        int i10 = gVar.f22527g;
        int i11 = this.f22575b;
        if (i10 < i11) {
            return null;
        }
        return new a(-1, gVar.c + i11, false);
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22574a;
    }
}
