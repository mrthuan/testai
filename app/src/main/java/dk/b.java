package dk;

import ck.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kk.g;
import kk.h;
import kk.k;
import kk.w;
import kk.y;
import kk.z;
import kotlin.text.j;
import okhttp3.Protocol;
import okhttp3.o;
import okhttp3.p;
import okhttp3.s;
import okhttp3.t;
import okhttp3.x;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class b implements ck.d {

    /* renamed from: a  reason: collision with root package name */
    public final s f16244a;

    /* renamed from: b  reason: collision with root package name */
    public final okhttp3.internal.connection.f f16245b;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final g f16246d;

    /* renamed from: e  reason: collision with root package name */
    public int f16247e;

    /* renamed from: f  reason: collision with root package name */
    public final dk.a f16248f;

    /* renamed from: g  reason: collision with root package name */
    public o f16249g;

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public abstract class a implements y {

        /* renamed from: a  reason: collision with root package name */
        public final k f16250a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16251b;
        public final /* synthetic */ b c;

        public a(b this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.c = this$0;
            this.f16250a = new k(this$0.c.z());
        }

        public final void a() {
            b bVar = this.c;
            int i10 = bVar.f16247e;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                b.i(bVar, this.f16250a);
                bVar.f16247e = 6;
                return;
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(bVar.f16247e), "state: "));
        }

        @Override // kk.y
        public long g(kk.f sink, long j10) {
            b bVar = this.c;
            kotlin.jvm.internal.g.e(sink, "sink");
            try {
                return bVar.c.g(sink, j10);
            } catch (IOException e10) {
                bVar.f16245b.l();
                a();
                throw e10;
            }
        }

        @Override // kk.y
        public final z z() {
            return this.f16250a;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: dk.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0198b implements w {

        /* renamed from: a  reason: collision with root package name */
        public final k f16252a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16253b;
        public final /* synthetic */ b c;

        public C0198b(b this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.c = this$0;
            this.f16252a = new k(this$0.f16246d.z());
        }

        @Override // kk.w
        public final void D(kk.f source, long j10) {
            kotlin.jvm.internal.g.e(source, "source");
            if (!this.f16253b) {
                if (j10 == 0) {
                    return;
                }
                b bVar = this.c;
                bVar.f16246d.P(j10);
                g gVar = bVar.f16246d;
                gVar.K("\r\n");
                gVar.D(source, j10);
                gVar.K("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f16253b) {
                return;
            }
            this.f16253b = true;
            this.c.f16246d.K("0\r\n\r\n");
            b.i(this.c, this.f16252a);
            this.c.f16247e = 3;
        }

        @Override // kk.w, java.io.Flushable
        public final synchronized void flush() {
            if (this.f16253b) {
                return;
            }
            this.c.f16246d.flush();
        }

        @Override // kk.w
        public final z z() {
            return this.f16252a;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        public final p f16254d;

        /* renamed from: e  reason: collision with root package name */
        public long f16255e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16256f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f16257g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b this$0, p url) {
            super(this$0);
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(url, "url");
            this.f16257g = this$0;
            this.f16254d = url;
            this.f16255e = -1L;
            this.f16256f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16251b) {
                return;
            }
            if (this.f16256f && !ak.b.g(this, TimeUnit.MILLISECONDS)) {
                this.f16257g.f16245b.l();
                a();
            }
            this.f16251b = true;
        }

        @Override // dk.b.a, kk.y
        public final long g(kk.f sink, long j10) {
            kotlin.jvm.internal.g.e(sink, "sink");
            boolean z10 = true;
            if (!this.f16251b) {
                if (!this.f16256f) {
                    return -1L;
                }
                long j11 = this.f16255e;
                int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                b bVar = this.f16257g;
                if (i10 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        bVar.c.V();
                    }
                    try {
                        this.f16255e = bVar.c.j0();
                        String obj = kotlin.text.k.n0(bVar.c.V()).toString();
                        if (this.f16255e >= 0) {
                            if (obj.length() <= 0) {
                                z10 = false;
                            }
                            if (!z10 || j.M(obj, ";", false)) {
                                if (this.f16255e == 0) {
                                    this.f16256f = false;
                                    bVar.f16249g = bVar.f16248f.a();
                                    s sVar = bVar.f16244a;
                                    kotlin.jvm.internal.g.b(sVar);
                                    o oVar = bVar.f16249g;
                                    kotlin.jvm.internal.g.b(oVar);
                                    ck.e.b(sVar.f23391j, this.f16254d, oVar);
                                    a();
                                }
                                if (!this.f16256f) {
                                    return -1L;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f16255e + obj + '\"');
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long g10 = super.g(sink, Math.min(8192L, this.f16255e));
                if (g10 != -1) {
                    this.f16255e -= g10;
                    return g10;
                }
                bVar.f16245b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class d extends a {

        /* renamed from: d  reason: collision with root package name */
        public long f16258d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f16259e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b this$0, long j10) {
            super(this$0);
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f16259e = this$0;
            this.f16258d = j10;
            if (j10 == 0) {
                a();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16251b) {
                return;
            }
            if (this.f16258d != 0 && !ak.b.g(this, TimeUnit.MILLISECONDS)) {
                this.f16259e.f16245b.l();
                a();
            }
            this.f16251b = true;
        }

        @Override // dk.b.a, kk.y
        public final long g(kk.f sink, long j10) {
            kotlin.jvm.internal.g.e(sink, "sink");
            if (!this.f16251b) {
                long j11 = this.f16258d;
                if (j11 == 0) {
                    return -1L;
                }
                long g10 = super.g(sink, Math.min(j11, 8192L));
                if (g10 != -1) {
                    long j12 = this.f16258d - g10;
                    this.f16258d = j12;
                    if (j12 == 0) {
                        a();
                    }
                    return g10;
                }
                this.f16259e.f16245b.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class e implements w {

        /* renamed from: a  reason: collision with root package name */
        public final k f16260a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16261b;
        public final /* synthetic */ b c;

        public e(b this$0) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.c = this$0;
            this.f16260a = new k(this$0.f16246d.z());
        }

        @Override // kk.w
        public final void D(kk.f source, long j10) {
            kotlin.jvm.internal.g.e(source, "source");
            if (!this.f16261b) {
                long j11 = source.f19826b;
                byte[] bArr = ak.b.f665a;
                if ((0 | j10) >= 0 && 0 <= j11 && j11 - 0 >= j10) {
                    this.c.f16246d.D(source, j10);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16261b) {
                return;
            }
            this.f16261b = true;
            k kVar = this.f16260a;
            b bVar = this.c;
            b.i(bVar, kVar);
            bVar.f16247e = 3;
        }

        @Override // kk.w, java.io.Flushable
        public final void flush() {
            if (this.f16261b) {
                return;
            }
            this.c.f16246d.flush();
        }

        @Override // kk.w
        public final z z() {
            return this.f16260a;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* loaded from: classes3.dex */
    public final class f extends a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f16262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b this$0) {
            super(this$0);
            kotlin.jvm.internal.g.e(this$0, "this$0");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16251b) {
                return;
            }
            if (!this.f16262d) {
                a();
            }
            this.f16251b = true;
        }

        @Override // dk.b.a, kk.y
        public final long g(kk.f sink, long j10) {
            kotlin.jvm.internal.g.e(sink, "sink");
            if (!this.f16251b) {
                if (this.f16262d) {
                    return -1L;
                }
                long g10 = super.g(sink, 8192L);
                if (g10 == -1) {
                    this.f16262d = true;
                    a();
                    return -1L;
                }
                return g10;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public b(s sVar, okhttp3.internal.connection.f connection, h hVar, g gVar) {
        kotlin.jvm.internal.g.e(connection, "connection");
        this.f16244a = sVar;
        this.f16245b = connection;
        this.c = hVar;
        this.f16246d = gVar;
        this.f16248f = new dk.a(hVar);
    }

    public static final void i(b bVar, k kVar) {
        bVar.getClass();
        z zVar = kVar.f19829e;
        z.a delegate = z.f19858d;
        kotlin.jvm.internal.g.e(delegate, "delegate");
        kVar.f19829e = delegate;
        zVar.a();
        zVar.b();
    }

    @Override // ck.d
    public final void a() {
        this.f16246d.flush();
    }

    @Override // ck.d
    public final void b(t tVar) {
        boolean z10;
        String d10;
        Proxy.Type type = this.f16245b.f23314b.f23134b.type();
        kotlin.jvm.internal.g.d(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tVar.f23429b);
        sb2.append(' ');
        p pVar = tVar.f23428a;
        if (!pVar.f23372j && type == Proxy.Type.HTTP) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(pVar);
        } else {
            String b10 = pVar.b();
            if (pVar.d() != null) {
                b10 = b10 + '?' + ((Object) d10);
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        k(tVar.c, sb3);
    }

    @Override // ck.d
    public final y c(x xVar) {
        if (!ck.e.a(xVar)) {
            return j(0L);
        }
        boolean z10 = true;
        if (j.G("chunked", x.b(xVar, "Transfer-Encoding"), true)) {
            p pVar = xVar.f23442a.f23428a;
            int i10 = this.f16247e;
            if (i10 != 4) {
                z10 = false;
            }
            if (z10) {
                this.f16247e = 5;
                return new c(this, pVar);
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "state: ").toString());
        }
        long j10 = ak.b.j(xVar);
        if (j10 != -1) {
            return j(j10);
        }
        int i11 = this.f16247e;
        if (i11 != 4) {
            z10 = false;
        }
        if (z10) {
            this.f16247e = 5;
            this.f16245b.l();
            return new f(this);
        }
        throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i11), "state: ").toString());
    }

    @Override // ck.d
    public final void cancel() {
        Socket socket = this.f16245b.c;
        if (socket != null) {
            ak.b.d(socket);
        }
    }

    @Override // ck.d
    public final x.a d(boolean z10) {
        boolean z11;
        dk.a aVar = this.f16248f;
        int i10 = this.f16247e;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            try {
                String J = aVar.f16242a.J(aVar.f16243b);
                aVar.f16243b -= J.length();
                i a10 = i.a.a(J);
                int i11 = a10.f5709b;
                x.a aVar2 = new x.a();
                Protocol protocol = a10.f5708a;
                kotlin.jvm.internal.g.e(protocol, "protocol");
                aVar2.f23456b = protocol;
                aVar2.c = i11;
                String message = a10.c;
                kotlin.jvm.internal.g.e(message, "message");
                aVar2.f23457d = message;
                aVar2.c(aVar.a());
                if (z10 && i11 == 100) {
                    return null;
                }
                if (i11 == 100) {
                    this.f16247e = 3;
                    return aVar2;
                }
                if (102 <= i11 && i11 < 200) {
                    z12 = true;
                }
                if (z12) {
                    this.f16247e = 3;
                    return aVar2;
                }
                this.f16247e = 4;
                return aVar2;
            } catch (EOFException e10) {
                throw new IOException(kotlin.jvm.internal.g.h(this.f16245b.f23314b.f23133a.f23130i.f(), "unexpected end of stream on "), e10);
            }
        }
        throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "state: ").toString());
    }

    @Override // ck.d
    public final okhttp3.internal.connection.f e() {
        return this.f16245b;
    }

    @Override // ck.d
    public final void f() {
        this.f16246d.flush();
    }

    @Override // ck.d
    public final long g(x xVar) {
        if (!ck.e.a(xVar)) {
            return 0L;
        }
        if (j.G("chunked", x.b(xVar, "Transfer-Encoding"), true)) {
            return -1L;
        }
        return ak.b.j(xVar);
    }

    @Override // ck.d
    public final w h(t tVar, long j10) {
        boolean z10 = true;
        if (j.G("chunked", tVar.c.a("Transfer-Encoding"), true)) {
            int i10 = this.f16247e;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f16247e = 2;
                return new C0198b(this);
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "state: ").toString());
        } else if (j10 != -1) {
            int i11 = this.f16247e;
            if (i11 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f16247e = 2;
                return new e(this);
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i11), "state: ").toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final d j(long j10) {
        boolean z10;
        int i10 = this.f16247e;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f16247e = 5;
            return new d(this, j10);
        }
        throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "state: ").toString());
    }

    public final void k(o headers, String requestLine) {
        boolean z10;
        kotlin.jvm.internal.g.e(headers, "headers");
        kotlin.jvm.internal.g.e(requestLine, "requestLine");
        int i10 = this.f16247e;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g gVar = this.f16246d;
            gVar.K(requestLine).K("\r\n");
            int length = headers.f23361a.length / 2;
            for (int i11 = 0; i11 < length; i11++) {
                gVar.K(headers.b(i11)).K(": ").K(headers.d(i11)).K("\r\n");
            }
            gVar.K("\r\n");
            this.f16247e = 1;
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "state: ").toString());
    }
}
