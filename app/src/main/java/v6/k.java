package v6;

import android.content.Context;
import c7.f;
import c7.g;
import c7.h;
import e7.b;
import e7.c;
import java.util.concurrent.Executor;
import v6.o;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: a  reason: collision with root package name */
    public pf.a<Executor> f30715a = x6.a.a(o.a.f30722a);

    /* renamed from: b  reason: collision with root package name */
    public k3.e f30716b;
    public pf.a c;

    /* renamed from: d  reason: collision with root package name */
    public c7.w f30717d;

    /* renamed from: e  reason: collision with root package name */
    public pf.a<c7.p> f30718e;

    /* renamed from: f  reason: collision with root package name */
    public pf.a<w> f30719f;

    public k(Context context) {
        if (context != null) {
            k3.e eVar = new k3.e(context);
            this.f30716b = eVar;
            e7.b bVar = b.a.f16471a;
            e7.c cVar = c.a.f16472a;
            this.c = x6.a.a(new a2.a(3, eVar, new h3.g(eVar, bVar, cVar)));
            k3.e eVar2 = this.f30716b;
            this.f30717d = new c7.w(eVar2, f.a.f5636a, g.a.f5637a);
            pf.a<c7.p> a10 = x6.a.a(new a7.d(bVar, cVar, h.a.f5638a, this.f30717d, x6.a.a(new f2.t(eVar2, 2)), 1));
            this.f30718e = a10;
            l.t tVar = new l.t(bVar);
            k3.e eVar3 = this.f30716b;
            k3.j jVar = new k3.j(eVar3, a10, tVar, cVar);
            pf.a<Executor> aVar = this.f30715a;
            pf.a aVar2 = this.c;
            this.f30719f = x6.a.a(new y(bVar, cVar, new a7.d(aVar, aVar2, jVar, a10, a10, 0), new b7.f(eVar3, aVar2, a10, jVar, aVar, a10, a10), new a0.b(aVar, a10, jVar, a10)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
