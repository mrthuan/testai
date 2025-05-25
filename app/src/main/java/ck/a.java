package ck;

import kk.l;
import kotlin.collections.EmptyList;
import okhttp3.j;
import okhttp3.o;
import okhttp3.p;
import okhttp3.q;
import okhttp3.r;
import okhttp3.t;
import okhttp3.w;
import okhttp3.x;
import okhttp3.z;

/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final j f5693a;

    public a(ge.a cookieJar) {
        kotlin.jvm.internal.g.e(cookieJar, "cookieJar");
        this.f5693a = cookieJar;
    }

    @Override // okhttp3.q
    public final x a(f fVar) {
        a aVar;
        boolean z10;
        z zVar;
        t tVar = fVar.f5700e;
        tVar.getClass();
        t.a aVar2 = new t.a(tVar);
        w wVar = tVar.f23430d;
        if (wVar != null) {
            r b10 = wVar.b();
            if (b10 != null) {
                aVar2.c("Content-Type", b10.f23381a);
            }
            long a10 = wVar.a();
            if (a10 != -1) {
                aVar2.c("Content-Length", String.valueOf(a10));
                aVar2.c.f("Transfer-Encoding");
            } else {
                aVar2.c("Transfer-Encoding", "chunked");
                aVar2.c.f("Content-Length");
            }
        }
        o oVar = tVar.c;
        String a11 = oVar.a("Host");
        p pVar = tVar.f23428a;
        if (a11 == null) {
            aVar2.c("Host", ak.b.v(pVar, false));
        }
        if (oVar.a("Connection") == null) {
            aVar2.c("Connection", "Keep-Alive");
        }
        if (oVar.a("Accept-Encoding") == null && oVar.a("Range") == null) {
            aVar2.c("Accept-Encoding", "gzip");
            aVar = this;
            z10 = true;
        } else {
            aVar = this;
            z10 = false;
        }
        j jVar = aVar.f5693a;
        EmptyList h10 = jVar.h(pVar);
        if (!h10.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (Object obj : h10) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    okhttp3.i iVar = (okhttp3.i) obj;
                    if (i10 > 0) {
                        sb2.append("; ");
                    }
                    sb2.append(iVar.f23206a);
                    sb2.append('=');
                    sb2.append(iVar.f23207b);
                    i10 = i11;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            aVar2.c("Cookie", sb3);
        }
        if (oVar.a("User-Agent") == null) {
            aVar2.c("User-Agent", "okhttp/4.11.0");
        }
        x c = fVar.c(aVar2.b());
        o oVar2 = c.f23446f;
        e.b(jVar, pVar, oVar2);
        x.a aVar3 = new x.a(c);
        aVar3.f23455a = tVar;
        if (z10 && kotlin.text.j.G("gzip", x.b(c, "Content-Encoding"), true) && e.a(c) && (zVar = c.f23447g) != null) {
            l lVar = new l(zVar.f());
            o.a c10 = oVar2.c();
            c10.f("Content-Encoding");
            c10.f("Content-Length");
            aVar3.c(c10.d());
            aVar3.f23460g = new g(x.b(c, "Content-Type"), -1L, ge.a.m(lVar));
        }
        return aVar3.a();
    }
}
