package ek;

import ck.i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kk.w;
import kk.y;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.o;
import okhttp3.x;
import okio.ByteString;

/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class n implements ck.d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f16739g = ak.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f16740h = ak.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.internal.connection.f f16741a;

    /* renamed from: b  reason: collision with root package name */
    public final ck.f f16742b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public volatile p f16743d;

    /* renamed from: e  reason: collision with root package name */
    public final Protocol f16744e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f16745f;

    public n(okhttp3.s sVar, okhttp3.internal.connection.f connection, ck.f fVar, d dVar) {
        kotlin.jvm.internal.g.e(connection, "connection");
        this.f16741a = connection;
        this.f16742b = fVar;
        this.c = dVar;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f16744e = sVar.f23400s.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // ck.d
    public final void a() {
        p pVar = this.f16743d;
        kotlin.jvm.internal.g.b(pVar);
        pVar.g().close();
    }

    @Override // ck.d
    public final void b(okhttp3.t tVar) {
        boolean z10;
        String d10;
        int i10;
        p pVar;
        if (this.f16743d != null) {
            return;
        }
        boolean z11 = true;
        if (tVar.f23430d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        okhttp3.o oVar = tVar.c;
        ArrayList arrayList = new ArrayList((oVar.f23361a.length / 2) + 4);
        arrayList.add(new a(tVar.f23429b, a.f16644f));
        ByteString byteString = a.f16645g;
        okhttp3.p url = tVar.f23428a;
        kotlin.jvm.internal.g.e(url, "url");
        String b10 = url.b();
        if (url.d() != null) {
            b10 = b10 + '?' + ((Object) d10);
        }
        arrayList.add(new a(b10, byteString));
        String a10 = tVar.c.a("Host");
        if (a10 != null) {
            arrayList.add(new a(a10, a.f16647i));
        }
        arrayList.add(new a(url.f23364a, a.f16646h));
        int length = oVar.f23361a.length / 2;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            String b11 = oVar.b(i11);
            Locale locale = Locale.US;
            String e10 = a0.d.e(locale, "US", b11, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f16739g.contains(e10) || (kotlin.jvm.internal.g.a(e10, "te") && kotlin.jvm.internal.g.a(oVar.d(i11), "trailers"))) {
                arrayList.add(new a(e10, oVar.d(i11)));
            }
            i11 = i12;
        }
        d dVar = this.c;
        dVar.getClass();
        boolean z12 = !z10;
        synchronized (dVar.f16694y) {
            synchronized (dVar) {
                if (dVar.f16675f > 1073741823) {
                    dVar.h(ErrorCode.REFUSED_STREAM);
                }
                if (!dVar.f16676g) {
                    i10 = dVar.f16675f;
                    dVar.f16675f = i10 + 2;
                    pVar = new p(i10, dVar, z12, false, null);
                    if (z10 && dVar.f16691v < dVar.f16692w && pVar.f16758e < pVar.f16759f) {
                        z11 = false;
                    }
                    if (pVar.i()) {
                        dVar.c.put(Integer.valueOf(i10), pVar);
                    }
                    tf.d dVar2 = tf.d.f30009a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            dVar.f16694y.f(i10, arrayList, z12);
        }
        if (z11) {
            dVar.f16694y.flush();
        }
        this.f16743d = pVar;
        if (!this.f16745f) {
            p pVar2 = this.f16743d;
            kotlin.jvm.internal.g.b(pVar2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            pVar2.f16764k.g(this.f16742b.f5702g, timeUnit);
            p pVar3 = this.f16743d;
            kotlin.jvm.internal.g.b(pVar3);
            pVar3.f16765l.g(this.f16742b.f5703h, timeUnit);
            return;
        }
        p pVar4 = this.f16743d;
        kotlin.jvm.internal.g.b(pVar4);
        pVar4.e(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // ck.d
    public final y c(x xVar) {
        p pVar = this.f16743d;
        kotlin.jvm.internal.g.b(pVar);
        return pVar.f16762i;
    }

    @Override // ck.d
    public final void cancel() {
        this.f16745f = true;
        p pVar = this.f16743d;
        if (pVar != null) {
            pVar.e(ErrorCode.CANCEL);
        }
    }

    @Override // ck.d
    public final x.a d(boolean z10) {
        okhttp3.o oVar;
        p pVar = this.f16743d;
        if (pVar != null) {
            synchronized (pVar) {
                pVar.f16764k.h();
                while (pVar.f16760g.isEmpty() && pVar.f16766m == null) {
                    pVar.l();
                }
                pVar.f16764k.l();
                if (!pVar.f16760g.isEmpty()) {
                    okhttp3.o removeFirst = pVar.f16760g.removeFirst();
                    kotlin.jvm.internal.g.d(removeFirst, "headersQueue.removeFirst()");
                    oVar = removeFirst;
                } else {
                    IOException iOException = pVar.f16767n;
                    if (iOException == null) {
                        ErrorCode errorCode = pVar.f16766m;
                        kotlin.jvm.internal.g.b(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
            }
            Protocol protocol = this.f16744e;
            kotlin.jvm.internal.g.e(protocol, "protocol");
            o.a aVar = new o.a();
            int length = oVar.f23361a.length / 2;
            int i10 = 0;
            ck.i iVar = null;
            while (i10 < length) {
                int i11 = i10 + 1;
                String b10 = oVar.b(i10);
                String d10 = oVar.d(i10);
                if (kotlin.jvm.internal.g.a(b10, ":status")) {
                    iVar = i.a.a(kotlin.jvm.internal.g.h(d10, "HTTP/1.1 "));
                } else if (!f16740h.contains(b10)) {
                    aVar.c(b10, d10);
                }
                i10 = i11;
            }
            if (iVar != null) {
                x.a aVar2 = new x.a();
                aVar2.f23456b = protocol;
                aVar2.c = iVar.f5709b;
                String message = iVar.c;
                kotlin.jvm.internal.g.e(message, "message");
                aVar2.f23457d = message;
                aVar2.c(aVar.d());
                if (z10 && aVar2.c == 100) {
                    return null;
                }
                return aVar2;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // ck.d
    public final okhttp3.internal.connection.f e() {
        return this.f16741a;
    }

    @Override // ck.d
    public final void f() {
        this.c.flush();
    }

    @Override // ck.d
    public final long g(x xVar) {
        if (!ck.e.a(xVar)) {
            return 0L;
        }
        return ak.b.j(xVar);
    }

    @Override // ck.d
    public final w h(okhttp3.t tVar, long j10) {
        p pVar = this.f16743d;
        kotlin.jvm.internal.g.b(pVar);
        return pVar.g();
    }
}
