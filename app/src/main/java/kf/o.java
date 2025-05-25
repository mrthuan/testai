package kf;

import io.noties.markwon.core.CoreProps;
import java.util.ArrayList;
import jf.i;
import jf.m;
import qk.r;
import qk.s;
import qk.t;
import qk.u;
import qk.v;
import qk.w;
import qk.x;

/* compiled from: CorePlugin.java */
/* loaded from: classes.dex */
public final class o extends jf.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f19734a = new ArrayList(0);

    /* compiled from: CorePlugin.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public static void j(jf.j jVar, String str, String str2, r rVar) {
        jf.m mVar = (jf.m) jVar;
        mVar.j(rVar);
        int y10 = mVar.y();
        jf.q qVar = mVar.c;
        qVar.f19202a.append((char) 160);
        StringBuilder sb2 = qVar.f19202a;
        sb2.append('\n');
        mVar.f19194a.f19177b.getClass();
        qVar.b(qVar.length(), str2);
        sb2.append((CharSequence) str2);
        mVar.u();
        qVar.a((char) 160);
        CoreProps.f18960g.b(mVar.f19195b, str);
        mVar.z(rVar, y10);
        mVar.a(rVar);
    }

    @Override // jf.a, jf.g
    public final void e(i.a aVar) {
        lf.b bVar = new lf.b();
        aVar.a(v.class, new lf.h());
        aVar.a(qk.f.class, new lf.d());
        aVar.a(qk.b.class, new lf.a(0));
        aVar.a(qk.d.class, new lf.c());
        aVar.a(qk.g.class, bVar);
        aVar.a(qk.m.class, bVar);
        aVar.a(qk.q.class, new lf.g());
        aVar.a(qk.i.class, new lf.e());
        aVar.a(qk.n.class, new lf.f());
        aVar.a(x.class, new lf.a(1));
    }

    @Override // jf.g
    public final void i(m.a aVar) {
        aVar.a(w.class, new g(this));
        aVar.a(v.class, new h());
        aVar.a(qk.f.class, new i());
        aVar.a(qk.b.class, new j());
        aVar.a(qk.d.class, new k());
        aVar.a(qk.g.class, new l());
        aVar.a(qk.m.class, new m());
        aVar.a(qk.l.class, new n());
        aVar.a(qk.c.class, new q());
        aVar.a(s.class, new q());
        aVar.a(qk.q.class, new io.noties.markwon.core.a());
        aVar.a(x.class, new kf.a());
        aVar.a(qk.i.class, new b());
        aVar.a(u.class, new c());
        aVar.a(qk.h.class, new d());
        aVar.a(t.class, new e());
        aVar.a(qk.n.class, new f());
    }
}
