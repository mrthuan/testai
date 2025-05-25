package vk;

import androidx.fragment.app.w;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import qk.h;
import qk.i;
import qk.j;
import qk.k;
import qk.l;
import qk.m;
import qk.n;
import qk.p;
import qk.q;
import qk.r;
import qk.s;
import qk.t;
import qk.u;
import qk.v;
import qk.x;
import vk.f;

/* compiled from: CoreHtmlNodeRenderer.java */
/* loaded from: classes3.dex */
public final class c extends w implements uk.a {

    /* renamed from: d  reason: collision with root package name */
    public final d f30831d;

    /* renamed from: e  reason: collision with root package name */
    public final g f30832e;

    /* compiled from: CoreHtmlNodeRenderer.java */
    /* loaded from: classes3.dex */
    public static class a extends w {

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f30833d = new StringBuilder();

        @Override // qk.y
        public final void f(qk.w wVar) {
            this.f30833d.append(wVar.f29383f);
        }

        @Override // qk.y
        public final void r(h hVar) {
            this.f30833d.append('\n');
        }

        @Override // qk.y
        public final void s(u uVar) {
            this.f30833d.append('\n');
        }
    }

    public c(d dVar) {
        this.f30831d = dVar;
        this.f30832e = ((f.c) dVar).f30838a;
    }

    @Override // androidx.fragment.app.w
    public final void I(r rVar) {
        r rVar2 = rVar.f29378b;
        while (rVar2 != null) {
            r rVar3 = rVar2.f29380e;
            ((f.c) this.f30831d).c.k(rVar2);
            rVar2 = rVar3;
        }
    }

    public final LinkedHashMap J(String str, Map map, r rVar) {
        f.c cVar = (f.c) this.f30831d;
        cVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = cVar.f30839b.iterator();
        while (it.hasNext()) {
            ((vk.a) it.next()).a();
        }
        return linkedHashMap;
    }

    public final LinkedHashMap K(String str, r rVar) {
        return J(str, Collections.emptyMap(), rVar);
    }

    public final HashSet L() {
        return new HashSet(Arrays.asList(qk.e.class, i.class, t.class, qk.b.class, qk.c.class, qk.g.class, j.class, x.class, m.class, n.class, q.class, s.class, l.class, qk.f.class, v.class, qk.w.class, qk.d.class, k.class, u.class, h.class));
    }

    public final void M(String str, Map map, r rVar) {
        g gVar = this.f30832e;
        gVar.b();
        gVar.d(K("pre", rVar), "pre", false);
        gVar.d(J("code", map, rVar), "code", false);
        gVar.a(pk.a.a(str));
        gVar.c("/code");
        gVar.c("/pre");
        gVar.b();
    }

    public final void N(p pVar, String str, LinkedHashMap linkedHashMap) {
        g gVar = this.f30832e;
        gVar.b();
        gVar.d(linkedHashMap, str, false);
        gVar.b();
        I(pVar);
        gVar.b();
        gVar.c(PackagingURIHelper.FORWARD_SLASH_STRING.concat(str));
        gVar.b();
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void b(qk.e eVar) {
        I(eVar);
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void c(qk.f fVar) {
        LinkedHashMap K = K("em", fVar);
        g gVar = this.f30832e;
        gVar.d(K, "em", false);
        I(fVar);
        gVar.c("/em");
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void d(t tVar) {
        boolean z10;
        qk.a aVar;
        qk.a aVar2 = (qk.a) tVar.f29377a;
        if (aVar2 != null && (aVar = (qk.a) aVar2.f29377a) != null && (aVar instanceof p)) {
            z10 = ((p) aVar).f29376f;
        } else {
            z10 = false;
        }
        g gVar = this.f30832e;
        if (!z10) {
            gVar.b();
            gVar.d(K("p", tVar), "p", false);
        }
        I(tVar);
        if (!z10) {
            gVar.c("/p");
            gVar.b();
        }
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void e(j jVar) {
        g gVar = this.f30832e;
        gVar.b();
        f.this.getClass();
        gVar.a(jVar.f29366f);
        gVar.b();
    }

    @Override // qk.y
    public final void f(qk.w wVar) {
        String str = wVar.f29383f;
        g gVar = this.f30832e;
        gVar.getClass();
        gVar.a(pk.a.a(str));
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void h(v vVar) {
        LinkedHashMap K = K("strong", vVar);
        g gVar = this.f30832e;
        gVar.d(K, "strong", false);
        I(vVar);
        gVar.c("/strong");
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void i(qk.g gVar) {
        String str = gVar.f29364j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = gVar.f29363i;
        if (str2 != null && !str2.isEmpty()) {
            int indexOf = str2.indexOf(" ");
            if (indexOf != -1) {
                str2 = str2.substring(0, indexOf);
            }
            linkedHashMap.put("class", "language-" + str2);
        }
        M(str, linkedHashMap, gVar);
    }

    @Override // uk.a
    public final void j(r rVar) {
        rVar.a(this);
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void k(qk.b bVar) {
        g gVar = this.f30832e;
        gVar.b();
        gVar.d(K("blockquote", bVar), "blockquote", false);
        gVar.b();
        I(bVar);
        gVar.b();
        gVar.c("/blockquote");
        gVar.b();
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void l(s sVar) {
        int i10 = sVar.f29381g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i10 != 1) {
            linkedHashMap.put("start", String.valueOf(i10));
        }
        N(sVar, "ol", J("ol", linkedHashMap, sVar));
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void m(l lVar) {
        String str = lVar.f29368f;
        f.this.getClass();
        a aVar = new a();
        aVar.m(lVar);
        String sb2 = aVar.f30833d.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("src", str);
        linkedHashMap.put("alt", sb2);
        String str2 = lVar.f29369g;
        if (str2 != null) {
            linkedHashMap.put(InMobiNetworkValues.TITLE, str2);
        }
        this.f30832e.d(J("img", linkedHashMap, lVar), "img", true);
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void n(i iVar) {
        String str = "h" + iVar.f29365f;
        g gVar = this.f30832e;
        gVar.b();
        gVar.d(K(str, iVar), str, false);
        I(iVar);
        gVar.c(PackagingURIHelper.FORWARD_SLASH_STRING + str);
        gVar.b();
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void o(k kVar) {
        f.this.getClass();
        this.f30832e.a(kVar.f29367f);
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void p(qk.d dVar) {
        LinkedHashMap K = K("code", dVar);
        g gVar = this.f30832e;
        gVar.d(K, "code", false);
        gVar.a(pk.a.a(dVar.f29359f));
        gVar.c("/code");
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void q(qk.c cVar) {
        N(cVar, "ul", K("ul", cVar));
    }

    @Override // qk.y
    public final void r(h hVar) {
        LinkedHashMap K = K("br", hVar);
        g gVar = this.f30832e;
        gVar.d(K, "br", true);
        gVar.b();
    }

    @Override // qk.y
    public final void s(u uVar) {
        f.this.getClass();
        this.f30832e.a("\n");
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void t(n nVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = nVar.f29371f;
        f.this.getClass();
        linkedHashMap.put("href", str);
        String str2 = nVar.f29372g;
        if (str2 != null) {
            linkedHashMap.put(InMobiNetworkValues.TITLE, str2);
        }
        LinkedHashMap J = J("a", linkedHashMap, nVar);
        g gVar = this.f30832e;
        gVar.d(J, "a", false);
        I(nVar);
        gVar.c("/a");
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void v(m mVar) {
        M(mVar.f29370f, Collections.emptyMap(), mVar);
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void w(q qVar) {
        LinkedHashMap K = K("li", qVar);
        g gVar = this.f30832e;
        gVar.d(K, "li", false);
        I(qVar);
        gVar.c("/li");
        gVar.b();
    }

    @Override // androidx.fragment.app.w, qk.y
    public final void x(x xVar) {
        g gVar = this.f30832e;
        gVar.b();
        gVar.d(K("hr", xVar), "hr", true);
        gVar.b();
    }
}
