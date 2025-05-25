package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import okhttp3.o;
import okhttp3.p;

/* compiled from: Request.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final p f23428a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23429b;
    public final o c;

    /* renamed from: d  reason: collision with root package name */
    public final w f23430d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f23431e;

    /* renamed from: f  reason: collision with root package name */
    public d f23432f;

    public t(p pVar, String method, o oVar, w wVar, Map<Class<?>, ? extends Object> map) {
        kotlin.jvm.internal.g.e(method, "method");
        this.f23428a = pVar;
        this.f23429b = method;
        this.c = oVar;
        this.f23430d = wVar;
        this.f23431e = map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f23429b);
        sb2.append(", url=");
        sb2.append(this.f23428a);
        o oVar = this.c;
        if (oVar.f23361a.length / 2 != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : oVar) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    Pair<? extends String, ? extends String> pair2 = pair;
                    String component1 = pair2.component1();
                    String component2 = pair2.component2();
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(component1);
                    sb2.append(':');
                    sb2.append(component2);
                    i10 = i11;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f23431e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: Request.kt */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public p f23433a;

        /* renamed from: b  reason: collision with root package name */
        public String f23434b;
        public o.a c;

        /* renamed from: d  reason: collision with root package name */
        public w f23435d;

        /* renamed from: e  reason: collision with root package name */
        public final LinkedHashMap f23436e;

        public a() {
            this.f23436e = new LinkedHashMap();
            this.f23434b = "GET";
            this.c = new o.a();
        }

        public final void a(String str, String value) {
            kotlin.jvm.internal.g.e(value, "value");
            this.c.a(str, value);
        }

        public final t b() {
            Map unmodifiableMap;
            p pVar = this.f23433a;
            if (pVar != null) {
                String str = this.f23434b;
                o d10 = this.c.d();
                w wVar = this.f23435d;
                byte[] bArr = ak.b.f665a;
                LinkedHashMap linkedHashMap = this.f23436e;
                kotlin.jvm.internal.g.e(linkedHashMap, "<this>");
                if (linkedHashMap.isEmpty()) {
                    unmodifiableMap = kotlin.collections.q.y0();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    kotlin.jvm.internal.g.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                }
                return new t(pVar, str, d10, wVar, unmodifiableMap);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void c(String str, String value) {
            kotlin.jvm.internal.g.e(value, "value");
            o.a aVar = this.c;
            aVar.getClass();
            o.b.a(str);
            o.b.b(value, str);
            aVar.f(str);
            aVar.c(str, value);
        }

        public final void d(String method, w wVar) {
            boolean z10;
            kotlin.jvm.internal.g.e(method, "method");
            boolean z11 = false;
            if (method.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (wVar == null) {
                    if (kotlin.jvm.internal.g.a(method, "POST") || kotlin.jvm.internal.g.a(method, "PUT") || kotlin.jvm.internal.g.a(method, "PATCH") || kotlin.jvm.internal.g.a(method, "PROPPATCH") || kotlin.jvm.internal.g.a(method, "REPORT")) {
                        z11 = true;
                    }
                    if (!(!z11)) {
                        throw new IllegalArgumentException(a6.h.d("method ", method, " must have a request body.").toString());
                    }
                } else if (!o9.d.u(method)) {
                    throw new IllegalArgumentException(a6.h.d("method ", method, " must not have a request body.").toString());
                }
                this.f23434b = method;
                this.f23435d = wVar;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void e(String url) {
            kotlin.jvm.internal.g.e(url, "url");
            if (kotlin.text.j.M(url, "ws:", true)) {
                String substring = url.substring(3);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                url = kotlin.jvm.internal.g.h(substring, "http:");
            } else if (kotlin.text.j.M(url, "wss:", true)) {
                String substring2 = url.substring(4);
                kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                url = kotlin.jvm.internal.g.h(substring2, "https:");
            }
            kotlin.jvm.internal.g.e(url, "<this>");
            p.a aVar = new p.a();
            aVar.d(null, url);
            this.f23433a = aVar.a();
        }

        public a(t tVar) {
            LinkedHashMap linkedHashMap;
            this.f23436e = new LinkedHashMap();
            this.f23433a = tVar.f23428a;
            this.f23434b = tVar.f23429b;
            this.f23435d = tVar.f23430d;
            Map<Class<?>, Object> map = tVar.f23431e;
            if (map.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(map);
            }
            this.f23436e = linkedHashMap;
            this.c = tVar.c.c();
        }
    }
}
