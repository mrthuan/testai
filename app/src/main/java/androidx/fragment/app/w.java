package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: FragmentContainer.java */
/* loaded from: classes.dex */
public abstract class w implements qk.y, oo.a {

    /* renamed from: a  reason: collision with root package name */
    public static final jf.n f3952a = new jf.n("image-destination");

    /* renamed from: b  reason: collision with root package name */
    public static final jf.n f3953b = new jf.n("image-replacement-text-is-link");
    public static final jf.n c = new jf.n("image-size");

    public abstract long A(ViewGroup viewGroup, f2.k kVar, f2.r rVar, f2.r rVar2);

    public abstract float[] B();

    public abstract float C();

    public abstract float[] D();

    public abstract float E();

    public abstract View F(int i10);

    public abstract com.google.android.material.carousel.a G(o8.a aVar, View view);

    public abstract boolean H();

    public void I(qk.r rVar) {
        qk.r rVar2 = rVar.f29378b;
        while (rVar2 != null) {
            qk.r rVar3 = rVar2.f29380e;
            rVar2.a(this);
            rVar2 = rVar3;
        }
    }

    @Override // qk.y
    public void b(qk.e eVar) {
        I(eVar);
    }

    @Override // qk.y
    public void c(qk.f fVar) {
        I(fVar);
    }

    @Override // qk.y
    public void d(qk.t tVar) {
        I(tVar);
    }

    @Override // qk.y
    public void e(qk.j jVar) {
        I(jVar);
    }

    @Override // qk.y
    public void g(qk.o oVar) {
        I(oVar);
    }

    @Override // qk.y
    public void h(qk.v vVar) {
        I(vVar);
    }

    @Override // qk.y
    public void i(qk.g gVar) {
        I(gVar);
    }

    @Override // qk.y
    public void k(qk.b bVar) {
        I(bVar);
    }

    @Override // qk.y
    public void l(qk.s sVar) {
        I(sVar);
    }

    @Override // qk.y
    public void m(qk.l lVar) {
        I(lVar);
    }

    @Override // qk.y
    public void n(qk.i iVar) {
        I(iVar);
    }

    @Override // qk.y
    public void o(qk.k kVar) {
        I(kVar);
    }

    @Override // qk.y
    public void p(qk.d dVar) {
        I(dVar);
    }

    @Override // qk.y
    public void q(qk.c cVar) {
        I(cVar);
    }

    @Override // qk.y
    public void t(qk.n nVar) {
        I(nVar);
    }

    @Override // qk.y
    public void v(qk.m mVar) {
        I(mVar);
    }

    @Override // qk.y
    public void w(qk.q qVar) {
        I(qVar);
    }

    @Override // qk.y
    public void x(qk.x xVar) {
        I(xVar);
    }

    public abstract void y(f2.r rVar);

    public abstract void z();

    @Override // oo.a
    public void cancel() {
    }
}
