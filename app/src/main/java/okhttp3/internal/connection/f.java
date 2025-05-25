package okhttp3.internal.connection;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.Api;
import dk.b;
import ek.d;
import ek.n;
import ek.p;
import ek.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kk.r;
import kk.t;
import lib.zj.office.fc.hpsf.Variant;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.m;
import okhttp3.o;
import okhttp3.s;
import okhttp3.t;
import okhttp3.x;

/* compiled from: RealConnection.kt */
/* loaded from: classes3.dex */
public final class f extends d.b {

    /* renamed from: b  reason: collision with root package name */
    public final a0 f23314b;
    public Socket c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f23315d;

    /* renamed from: e  reason: collision with root package name */
    public Handshake f23316e;

    /* renamed from: f  reason: collision with root package name */
    public Protocol f23317f;

    /* renamed from: g  reason: collision with root package name */
    public ek.d f23318g;

    /* renamed from: h  reason: collision with root package name */
    public t f23319h;

    /* renamed from: i  reason: collision with root package name */
    public r f23320i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23321j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23322k;

    /* renamed from: l  reason: collision with root package name */
    public int f23323l;

    /* renamed from: m  reason: collision with root package name */
    public int f23324m;

    /* renamed from: n  reason: collision with root package name */
    public int f23325n;

    /* renamed from: o  reason: collision with root package name */
    public int f23326o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f23327p;

    /* renamed from: q  reason: collision with root package name */
    public long f23328q;

    /* compiled from: RealConnection.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23329a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f23329a = iArr;
        }
    }

    public f(h connectionPool, a0 route) {
        kotlin.jvm.internal.g.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.g.e(route, "route");
        this.f23314b = route;
        this.f23326o = 1;
        this.f23327p = new ArrayList();
        this.f23328q = Long.MAX_VALUE;
    }

    public static void d(s client, a0 failedRoute, IOException failure) {
        kotlin.jvm.internal.g.e(client, "client");
        kotlin.jvm.internal.g.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.g.e(failure, "failure");
        if (failedRoute.f23134b.type() != Proxy.Type.DIRECT) {
            okhttp3.a aVar = failedRoute.f23133a;
            aVar.f23129h.connectFailed(aVar.f23130i.g(), failedRoute.f23134b.address(), failure);
        }
        androidx.core.content.e eVar = client.f23407z;
        synchronized (eVar) {
            ((Set) eVar.f3529a).add(failedRoute);
        }
    }

    @Override // ek.d.b
    public final synchronized void a(ek.d connection, ek.t settings) {
        int i10;
        kotlin.jvm.internal.g.e(connection, "connection");
        kotlin.jvm.internal.g.e(settings, "settings");
        if ((settings.f16788a & 16) != 0) {
            i10 = settings.f16789b[4];
        } else {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f23326o = i10;
    }

    @Override // ek.d.b
    public final void b(p stream) {
        kotlin.jvm.internal.g.e(stream, "stream");
        stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, e call, m eventListener) {
        boolean z11;
        boolean z12;
        boolean z13;
        a0 a0Var;
        kotlin.jvm.internal.g.e(call, "call");
        kotlin.jvm.internal.g.e(eventListener, "eventListener");
        boolean z14 = true;
        if (this.f23317f == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            List<okhttp3.h> list = this.f23314b.f23133a.f23132k;
            b bVar = new b(list);
            okhttp3.a aVar = this.f23314b.f23133a;
            if (aVar.c == null) {
                if (list.contains(okhttp3.h.f23195f)) {
                    String str = this.f23314b.f23133a.f23130i.f23366d;
                    gk.h hVar = gk.h.f17912a;
                    if (!gk.h.f17912a.h(str)) {
                        throw new RouteException(new UnknownServiceException(a6.h.d("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (aVar.f23131j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            RouteException routeException = null;
            do {
                try {
                    a0 a0Var2 = this.f23314b;
                    if (a0Var2.f23133a.c != null && a0Var2.f23134b.type() == Proxy.Type.HTTP) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f(i10, i11, i12, call, eventListener);
                        if (this.c == null) {
                            a0Var = this.f23314b;
                            if (!((a0Var.f23133a.c == null && a0Var.f23134b.type() == Proxy.Type.HTTP) ? false : false) && this.c == null) {
                                throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f23328q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            e(i10, i11, call, eventListener);
                        } catch (IOException e10) {
                            e = e10;
                            Socket socket = this.f23315d;
                            if (socket != null) {
                                ak.b.d(socket);
                            }
                            Socket socket2 = this.c;
                            if (socket2 != null) {
                                ak.b.d(socket2);
                            }
                            this.f23315d = null;
                            this.c = null;
                            this.f23319h = null;
                            this.f23320i = null;
                            this.f23316e = null;
                            this.f23317f = null;
                            this.f23318g = null;
                            this.f23326o = 1;
                            a0 a0Var3 = this.f23314b;
                            InetSocketAddress inetSocketAddress = a0Var3.c;
                            Proxy proxy = a0Var3.f23134b;
                            kotlin.jvm.internal.g.e(inetSocketAddress, "inetSocketAddress");
                            kotlin.jvm.internal.g.e(proxy, "proxy");
                            if (routeException == null) {
                                routeException = new RouteException(e);
                            } else {
                                routeException.addConnectException(e);
                            }
                            if (!z10) {
                                break;
                            }
                            bVar.f23268d = true;
                            if (bVar.c && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                z12 = true;
                                continue;
                            } else {
                                z12 = false;
                                continue;
                            }
                            if (!z12) {
                            }
                            throw routeException;
                        }
                    }
                    g(bVar, call, eventListener);
                    a0 a0Var4 = this.f23314b;
                    InetSocketAddress inetSocketAddress2 = a0Var4.c;
                    Proxy proxy2 = a0Var4.f23134b;
                    m.a aVar2 = m.f23356a;
                    kotlin.jvm.internal.g.e(inetSocketAddress2, "inetSocketAddress");
                    kotlin.jvm.internal.g.e(proxy2, "proxy");
                    a0Var = this.f23314b;
                    if (!((a0Var.f23133a.c == null && a0Var.f23134b.type() == Proxy.Type.HTTP) ? false : false)) {
                    }
                    this.f23328q = System.nanoTime();
                    return;
                } catch (IOException e11) {
                    e = e11;
                }
            } while (!z12);
            throw routeException;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i10, int i11, e call, m mVar) {
        int i12;
        Socket createSocket;
        a0 a0Var = this.f23314b;
        Proxy proxy = a0Var.f23134b;
        okhttp3.a aVar = a0Var.f23133a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = a.f23329a[type.ordinal()];
        }
        if (i12 != 1 && i12 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = aVar.f23124b.createSocket();
            kotlin.jvm.internal.g.b(createSocket);
        }
        this.c = createSocket;
        InetSocketAddress inetSocketAddress = this.f23314b.c;
        mVar.getClass();
        kotlin.jvm.internal.g.e(call, "call");
        kotlin.jvm.internal.g.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i11);
        try {
            gk.h hVar = gk.h.f17912a;
            gk.h.f17912a.e(createSocket, this.f23314b.c, i10);
            try {
                this.f23319h = ge.a.m(ge.a.Y(createSocket));
                this.f23320i = ge.a.l(ge.a.V(createSocket));
            } catch (NullPointerException e10) {
                if (!kotlin.jvm.internal.g.a(e10.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e10);
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(kotlin.jvm.internal.g.h(this.f23314b.c, "Failed to connect to "));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, e eVar, m mVar) {
        t.a aVar = new t.a();
        a0 a0Var = this.f23314b;
        okhttp3.p url = a0Var.f23133a.f23130i;
        kotlin.jvm.internal.g.e(url, "url");
        aVar.f23433a = url;
        aVar.d("CONNECT", null);
        okhttp3.a aVar2 = a0Var.f23133a;
        aVar.c("Host", ak.b.v(aVar2.f23130i, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/4.11.0");
        okhttp3.t b10 = aVar.b();
        x.a aVar3 = new x.a();
        aVar3.f23455a = b10;
        Protocol protocol = Protocol.HTTP_1_1;
        kotlin.jvm.internal.g.e(protocol, "protocol");
        aVar3.f23456b = protocol;
        aVar3.c = TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        aVar3.f23457d = "Preemptive Authenticate";
        aVar3.f23460g = ak.b.c;
        aVar3.f23464k = -1L;
        aVar3.f23465l = -1L;
        o.a aVar4 = aVar3.f23459f;
        aVar4.getClass();
        o.b.a("Proxy-Authenticate");
        o.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar4.f("Proxy-Authenticate");
        aVar4.c("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f23127f.f(a0Var, aVar3.a());
        e(i10, i11, eVar, mVar);
        kk.t tVar = this.f23319h;
        kotlin.jvm.internal.g.b(tVar);
        r rVar = this.f23320i;
        kotlin.jvm.internal.g.b(rVar);
        dk.b bVar = new dk.b(null, this, tVar, rVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.z().g(i11, timeUnit);
        rVar.z().g(i12, timeUnit);
        bVar.k(b10.c, "CONNECT " + ak.b.v(b10.f23428a, true) + " HTTP/1.1");
        bVar.a();
        x.a d10 = bVar.d(false);
        kotlin.jvm.internal.g.b(d10);
        d10.f23455a = b10;
        x a10 = d10.a();
        long j10 = ak.b.j(a10);
        if (j10 != -1) {
            b.d j11 = bVar.j(j10);
            ak.b.t(j11, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
            j11.close();
        }
        int i13 = a10.f23444d;
        if (i13 != 200) {
            if (i13 == 407) {
                aVar2.f23127f.f(a0Var, a10);
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(kotlin.jvm.internal.g.h(Integer.valueOf(i13), "Unexpected response code for CONNECT: "));
        } else if (tVar.f19848b.E() && rVar.f19845b.E()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, e call, m mVar) {
        Protocol protocol;
        okhttp3.a aVar = this.f23314b.f23133a;
        if (aVar.c == null) {
            List<Protocol> list = aVar.f23131j;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (list.contains(protocol2)) {
                this.f23315d = this.c;
                this.f23317f = protocol2;
                m();
                return;
            }
            this.f23315d = this.c;
            this.f23317f = Protocol.HTTP_1_1;
            return;
        }
        mVar.getClass();
        kotlin.jvm.internal.g.e(call, "call");
        final okhttp3.a aVar2 = this.f23314b.f23133a;
        SSLSocketFactory sSLSocketFactory = aVar2.c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            kotlin.jvm.internal.g.b(sSLSocketFactory);
            Socket socket = this.c;
            okhttp3.p pVar = aVar2.f23130i;
            Socket createSocket = sSLSocketFactory.createSocket(socket, pVar.f23366d, pVar.f23367e, true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    okhttp3.h a10 = bVar.a(sSLSocket2);
                    if (a10.f23197b) {
                        gk.h hVar = gk.h.f17912a;
                        gk.h.f17912a.d(sSLSocket2, aVar2.f23130i.f23366d, aVar2.f23131j);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession sslSocketSession = sSLSocket2.getSession();
                    kotlin.jvm.internal.g.d(sslSocketSession, "sslSocketSession");
                    final Handshake a11 = Handshake.Companion.a(sslSocketSession);
                    HostnameVerifier hostnameVerifier = aVar2.f23125d;
                    kotlin.jvm.internal.g.b(hostnameVerifier);
                    if (!hostnameVerifier.verify(aVar2.f23130i.f23366d, sslSocketSession)) {
                        List<Certificate> a12 = a11.a();
                        if (!a12.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) a12.get(0);
                            StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                            sb2.append(aVar2.f23130i.f23366d);
                            sb2.append(" not verified:\n              |    certificate: ");
                            CertificatePinner certificatePinner = CertificatePinner.c;
                            sb2.append(CertificatePinner.a.a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            sb2.append((Object) x509Certificate.getSubjectDN().getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(jk.c.a(x509Certificate));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(kotlin.text.f.D(sb2.toString()));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.f23130i.f23366d + " not verified (no certificates)");
                    }
                    final CertificatePinner certificatePinner2 = aVar2.f23126e;
                    kotlin.jvm.internal.g.b(certificatePinner2);
                    this.f23316e = new Handshake(a11.f23118a, a11.f23119b, a11.c, new cg.a<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public final List<? extends Certificate> invoke() {
                            androidx.privacysandbox.ads.adservices.topics.d dVar = CertificatePinner.this.f23117b;
                            kotlin.jvm.internal.g.b(dVar);
                            return dVar.f(aVar2.f23130i.f23366d, a11.a());
                        }
                    });
                    certificatePinner2.b(aVar2.f23130i.f23366d, new cg.a<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public final List<? extends X509Certificate> invoke() {
                            Handshake handshake = f.this.f23316e;
                            kotlin.jvm.internal.g.b(handshake);
                            List<Certificate> a13 = handshake.a();
                            ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(a13, 10));
                            for (Certificate certificate : a13) {
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    });
                    if (a10.f23197b) {
                        gk.h hVar2 = gk.h.f17912a;
                        str = gk.h.f17912a.f(sSLSocket2);
                    }
                    this.f23315d = sSLSocket2;
                    this.f23319h = ge.a.m(ge.a.Y(sSLSocket2));
                    this.f23320i = ge.a.l(ge.a.V(sSLSocket2));
                    if (str != null) {
                        Protocol.Companion.getClass();
                        protocol = Protocol.a.a(str);
                    } else {
                        protocol = Protocol.HTTP_1_1;
                    }
                    this.f23317f = protocol;
                    gk.h hVar3 = gk.h.f17912a;
                    gk.h.f17912a.a(sSLSocket2);
                    if (this.f23317f == Protocol.HTTP_2) {
                        m();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        gk.h hVar4 = gk.h.f17912a;
                        gk.h.f17912a.a(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        ak.b.d(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized void h() {
        this.f23324m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r10 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(okhttp3.a r9, java.util.List<okhttp3.a0> r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.i(okhttp3.a, java.util.List):boolean");
    }

    public final boolean j(boolean z10) {
        long j10;
        byte[] bArr = ak.b.f665a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        kotlin.jvm.internal.g.b(socket);
        Socket socket2 = this.f23315d;
        kotlin.jvm.internal.g.b(socket2);
        kk.t tVar = this.f23319h;
        kotlin.jvm.internal.g.b(tVar);
        boolean z11 = false;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ek.d dVar = this.f23318g;
        if (dVar != null) {
            return dVar.d(nanoTime);
        }
        synchronized (this) {
            j10 = nanoTime - this.f23328q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            boolean z12 = !tVar.E();
            socket2.setSoTimeout(soTimeout);
            z11 = z12;
            return z11;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z11;
        }
    }

    public final ck.d k(s sVar, ck.f fVar) {
        Socket socket = this.f23315d;
        kotlin.jvm.internal.g.b(socket);
        kk.t tVar = this.f23319h;
        kotlin.jvm.internal.g.b(tVar);
        r rVar = this.f23320i;
        kotlin.jvm.internal.g.b(rVar);
        ek.d dVar = this.f23318g;
        if (dVar != null) {
            return new n(sVar, this, fVar, dVar);
        }
        int i10 = fVar.f5702g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.z().g(i10, timeUnit);
        rVar.z().g(fVar.f5703h, timeUnit);
        return new dk.b(sVar, this, tVar, rVar);
    }

    public final synchronized void l() {
        this.f23321j = true;
    }

    public final void m() {
        String h10;
        int i10;
        int a10;
        Socket socket = this.f23315d;
        kotlin.jvm.internal.g.b(socket);
        kk.t tVar = this.f23319h;
        kotlin.jvm.internal.g.b(tVar);
        r rVar = this.f23320i;
        kotlin.jvm.internal.g.b(rVar);
        socket.setSoTimeout(0);
        bk.d dVar = bk.d.f5452i;
        d.a aVar = new d.a(dVar);
        String peerName = this.f23314b.f23133a.f23130i.f23366d;
        kotlin.jvm.internal.g.e(peerName, "peerName");
        aVar.c = socket;
        if (aVar.f16696a) {
            h10 = ak.b.f670g + ' ' + peerName;
        } else {
            h10 = kotlin.jvm.internal.g.h(peerName, "MockWebServer ");
        }
        kotlin.jvm.internal.g.e(h10, "<set-?>");
        aVar.f16698d = h10;
        aVar.f16699e = tVar;
        aVar.f16700f = rVar;
        aVar.f16701g = this;
        aVar.f16703i = 0;
        ek.d dVar2 = new ek.d(aVar);
        this.f23318g = dVar2;
        ek.t tVar2 = ek.d.B;
        if ((tVar2.f16788a & 16) != 0) {
            i10 = tVar2.f16789b[4];
        } else {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f23326o = i10;
        q qVar = dVar2.f16694y;
        synchronized (qVar) {
            if (!qVar.f16781e) {
                if (qVar.f16779b) {
                    Logger logger = q.f16777g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ak.b.h(kotlin.jvm.internal.g.h(ek.c.f16668b.hex(), ">> CONNECTION "), new Object[0]));
                    }
                    qVar.f16778a.Z(ek.c.f16668b);
                    qVar.f16778a.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        dVar2.f16694y.j(dVar2.f16687r);
        if (dVar2.f16687r.a() != 65535) {
            dVar2.f16694y.k(0, a10 - Variant.VT_ILLEGAL);
        }
        dVar.f().c(new bk.b(dVar2.f16673d, dVar2.f16695z), 0L);
    }

    public final String toString() {
        okhttp3.g gVar;
        StringBuilder sb2 = new StringBuilder("Connection{");
        a0 a0Var = this.f23314b;
        sb2.append(a0Var.f23133a.f23130i.f23366d);
        sb2.append(':');
        sb2.append(a0Var.f23133a.f23130i.f23367e);
        sb2.append(", proxy=");
        sb2.append(a0Var.f23134b);
        sb2.append(" hostAddress=");
        sb2.append(a0Var.c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f23316e;
        Object obj = "none";
        if (handshake != null && (gVar = handshake.f23119b) != null) {
            obj = gVar;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f23317f);
        sb2.append('}');
        return sb2.toString();
    }
}
