package jf;

import java.util.HashMap;
import java.util.Map;
import jf.j;
import qk.r;
import qk.s;
import qk.t;
import qk.u;
import qk.v;
import qk.w;
import qk.x;

/* compiled from: MarkwonVisitorImpl.java */
/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public final e f19194a;

    /* renamed from: b  reason: collision with root package name */
    public final o f19195b;
    public final q c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<? extends r>, j.c<? extends r>> f19196d;

    /* renamed from: e  reason: collision with root package name */
    public final j.a f19197e;

    /* compiled from: MarkwonVisitorImpl.java */
    /* loaded from: classes.dex */
    public static class a implements j.b {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f19198a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public j.a f19199b;

        public final a a(Class cls, j.c cVar) {
            this.f19198a.put(cls, cVar);
            return this;
        }
    }

    public m(e eVar, o oVar, q qVar, Map<Class<? extends r>, j.c<? extends r>> map, j.a aVar) {
        this.f19194a = eVar;
        this.f19195b = oVar;
        this.c = qVar;
        this.f19196d = map;
        this.f19197e = aVar;
    }

    public final void A(r rVar) {
        j.c<? extends r> cVar = this.f19196d.get(rVar.getClass());
        if (cVar != null) {
            cVar.a(this, rVar);
        } else {
            B(rVar);
        }
    }

    public final void B(r rVar) {
        r rVar2 = rVar.f29378b;
        while (rVar2 != null) {
            r rVar3 = rVar2.f29380e;
            rVar2.a(this);
            rVar2 = rVar3;
        }
    }

    public final void a(r rVar) {
        this.f19197e.a(this, rVar);
    }

    @Override // qk.y
    public final void b(qk.e eVar) {
        A(eVar);
    }

    @Override // qk.y
    public final void c(qk.f fVar) {
        A(fVar);
    }

    @Override // qk.y
    public final void d(t tVar) {
        A(tVar);
    }

    @Override // qk.y
    public final void e(qk.j jVar) {
        A(jVar);
    }

    @Override // qk.y
    public final void f(w wVar) {
        A(wVar);
    }

    @Override // qk.y
    public final void g(qk.o oVar) {
        A(oVar);
    }

    @Override // qk.y
    public final void h(v vVar) {
        A(vVar);
    }

    @Override // qk.y
    public final void i(qk.g gVar) {
        A(gVar);
    }

    public final void j(r rVar) {
        this.f19197e.b(this, rVar);
    }

    @Override // qk.y
    public final void k(qk.b bVar) {
        A(bVar);
    }

    @Override // qk.y
    public final void l(s sVar) {
        A(sVar);
    }

    @Override // qk.y
    public final void m(qk.l lVar) {
        A(lVar);
    }

    @Override // qk.y
    public final void n(qk.i iVar) {
        A(iVar);
    }

    @Override // qk.y
    public final void o(qk.k kVar) {
        A(kVar);
    }

    @Override // qk.y
    public final void p(qk.d dVar) {
        A(dVar);
    }

    @Override // qk.y
    public final void q(qk.c cVar) {
        A(cVar);
    }

    @Override // qk.y
    public final void r(qk.h hVar) {
        A(hVar);
    }

    @Override // qk.y
    public final void s(u uVar) {
        A(uVar);
    }

    @Override // qk.y
    public final void t(qk.n nVar) {
        A(nVar);
    }

    public final void u() {
        q qVar = this.c;
        if (qVar.length() > 0) {
            if ('\n' != qVar.f19202a.charAt(qVar.length() - 1)) {
                qVar.a('\n');
            }
        }
    }

    @Override // qk.y
    public final void v(qk.m mVar) {
        A(mVar);
    }

    @Override // qk.y
    public final void w(qk.q qVar) {
        A(qVar);
    }

    @Override // qk.y
    public final void x(x xVar) {
        A(xVar);
    }

    public final int y() {
        return this.c.length();
    }

    public final <N extends r> void z(N n10, int i10) {
        boolean z10;
        Class<?> cls = n10.getClass();
        e eVar = this.f19194a;
        p pVar = ((i) eVar.f19179e).f19190a.get(cls);
        if (pVar != null) {
            Object a10 = pVar.a(eVar, this.f19195b);
            q qVar = this.c;
            int length = qVar.length();
            if (a10 != null) {
                int length2 = qVar.length();
                if (length > i10 && i10 >= 0 && length <= length2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    q.c(qVar, a10, i10, length);
                }
            }
        }
    }
}
