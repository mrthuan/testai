package okhttp3;

import java.io.Closeable;
import okhttp3.d;
import okhttp3.o;

/* compiled from: Response.kt */
/* loaded from: classes3.dex */
public final class x implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final t f23442a;

    /* renamed from: b  reason: collision with root package name */
    public final Protocol f23443b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23444d;

    /* renamed from: e  reason: collision with root package name */
    public final Handshake f23445e;

    /* renamed from: f  reason: collision with root package name */
    public final o f23446f;

    /* renamed from: g  reason: collision with root package name */
    public final z f23447g;

    /* renamed from: h  reason: collision with root package name */
    public final x f23448h;

    /* renamed from: i  reason: collision with root package name */
    public final x f23449i;

    /* renamed from: j  reason: collision with root package name */
    public final x f23450j;

    /* renamed from: k  reason: collision with root package name */
    public final long f23451k;

    /* renamed from: l  reason: collision with root package name */
    public final long f23452l;

    /* renamed from: m  reason: collision with root package name */
    public final okhttp3.internal.connection.c f23453m;

    /* renamed from: n  reason: collision with root package name */
    public d f23454n;

    public x(t tVar, Protocol protocol, String str, int i10, Handshake handshake, o oVar, z zVar, x xVar, x xVar2, x xVar3, long j10, long j11, okhttp3.internal.connection.c cVar) {
        this.f23442a = tVar;
        this.f23443b = protocol;
        this.c = str;
        this.f23444d = i10;
        this.f23445e = handshake;
        this.f23446f = oVar;
        this.f23447g = zVar;
        this.f23448h = xVar;
        this.f23449i = xVar2;
        this.f23450j = xVar3;
        this.f23451k = j10;
        this.f23452l = j11;
        this.f23453m = cVar;
    }

    public static String b(x xVar, String str) {
        xVar.getClass();
        String a10 = xVar.f23446f.a(str);
        if (a10 == null) {
            return null;
        }
        return a10;
    }

    public final d a() {
        d dVar = this.f23454n;
        if (dVar == null) {
            d dVar2 = d.f23157n;
            d b10 = d.b.b(this.f23446f);
            this.f23454n = b10;
            return b10;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f23447g;
        if (zVar != null) {
            zVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        return "Response{protocol=" + this.f23443b + ", code=" + this.f23444d + ", message=" + this.c + ", url=" + this.f23442a.f23428a + '}';
    }

    /* compiled from: Response.kt */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public t f23455a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f23456b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public String f23457d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f23458e;

        /* renamed from: f  reason: collision with root package name */
        public o.a f23459f;

        /* renamed from: g  reason: collision with root package name */
        public z f23460g;

        /* renamed from: h  reason: collision with root package name */
        public x f23461h;

        /* renamed from: i  reason: collision with root package name */
        public x f23462i;

        /* renamed from: j  reason: collision with root package name */
        public x f23463j;

        /* renamed from: k  reason: collision with root package name */
        public long f23464k;

        /* renamed from: l  reason: collision with root package name */
        public long f23465l;

        /* renamed from: m  reason: collision with root package name */
        public okhttp3.internal.connection.c f23466m;

        public a() {
            this.c = -1;
            this.f23459f = new o.a();
        }

        public static void b(String str, x xVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (xVar != null) {
                boolean z13 = true;
                if (xVar.f23447g == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (xVar.f23448h == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (xVar.f23449i == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (xVar.f23450j != null) {
                                z13 = false;
                            }
                            if (z13) {
                                return;
                            }
                            throw new IllegalArgumentException(kotlin.jvm.internal.g.h(".priorResponse != null", str).toString());
                        }
                        throw new IllegalArgumentException(kotlin.jvm.internal.g.h(".cacheResponse != null", str).toString());
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.g.h(".networkResponse != null", str).toString());
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.g.h(".body != null", str).toString());
            }
        }

        public final x a() {
            boolean z10;
            int i10 = this.c;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                t tVar = this.f23455a;
                if (tVar != null) {
                    Protocol protocol = this.f23456b;
                    if (protocol != null) {
                        String str = this.f23457d;
                        if (str != null) {
                            return new x(tVar, protocol, str, i10, this.f23458e, this.f23459f.d(), this.f23460g, this.f23461h, this.f23462i, this.f23463j, this.f23464k, this.f23465l, this.f23466m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "code < 0: ").toString());
        }

        public final void c(o headers) {
            kotlin.jvm.internal.g.e(headers, "headers");
            this.f23459f = headers.c();
        }

        public a(x response) {
            kotlin.jvm.internal.g.e(response, "response");
            this.f23455a = response.f23442a;
            this.f23456b = response.f23443b;
            this.c = response.f23444d;
            this.f23457d = response.c;
            this.f23458e = response.f23445e;
            this.f23459f = response.f23446f.c();
            this.f23460g = response.f23447g;
            this.f23461h = response.f23448h;
            this.f23462i = response.f23449i;
            this.f23463j = response.f23450j;
            this.f23464k = response.f23451k;
            this.f23465l = response.f23452l;
            this.f23466m = response.f23453m;
        }
    }
}
