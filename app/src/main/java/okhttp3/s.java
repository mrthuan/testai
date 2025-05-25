package okhttp3;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import lib.zj.office.fc.hpsf.Constants;
import okhttp3.e;
import okhttp3.m;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes3.dex */
public final class s implements Cloneable, e.a {
    public static final List<Protocol> A = ak.b.k(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<h> B = ak.b.k(h.f23194e, h.f23195f);

    /* renamed from: a  reason: collision with root package name */
    public final k f23383a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.g f23384b;
    public final List<q> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<q> f23385d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.appcompat.libconvert.a f23386e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23387f;

    /* renamed from: g  reason: collision with root package name */
    public final aj.b f23388g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23389h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23390i;

    /* renamed from: j  reason: collision with root package name */
    public final ge.a f23391j;

    /* renamed from: k  reason: collision with root package name */
    public final c f23392k;

    /* renamed from: l  reason: collision with root package name */
    public final o9.d f23393l;

    /* renamed from: m  reason: collision with root package name */
    public final ProxySelector f23394m;

    /* renamed from: n  reason: collision with root package name */
    public final aj.b f23395n;

    /* renamed from: o  reason: collision with root package name */
    public final SocketFactory f23396o;

    /* renamed from: p  reason: collision with root package name */
    public final SSLSocketFactory f23397p;

    /* renamed from: q  reason: collision with root package name */
    public final X509TrustManager f23398q;

    /* renamed from: r  reason: collision with root package name */
    public final List<h> f23399r;

    /* renamed from: s  reason: collision with root package name */
    public final List<Protocol> f23400s;

    /* renamed from: t  reason: collision with root package name */
    public final jk.c f23401t;

    /* renamed from: u  reason: collision with root package name */
    public final CertificatePinner f23402u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.privacysandbox.ads.adservices.topics.d f23403v;

    /* renamed from: w  reason: collision with root package name */
    public final int f23404w;

    /* renamed from: x  reason: collision with root package name */
    public final int f23405x;

    /* renamed from: y  reason: collision with root package name */
    public final int f23406y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.core.content.e f23407z;

    /* compiled from: OkHttpClient.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final k f23408a = new k();

        /* renamed from: b  reason: collision with root package name */
        public final m7.g f23409b = new m7.g(6);
        public final ArrayList c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f23410d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final androidx.appcompat.libconvert.a f23411e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f23412f;

        /* renamed from: g  reason: collision with root package name */
        public final aj.b f23413g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f23414h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f23415i;

        /* renamed from: j  reason: collision with root package name */
        public final ge.a f23416j;

        /* renamed from: k  reason: collision with root package name */
        public c f23417k;

        /* renamed from: l  reason: collision with root package name */
        public final o9.d f23418l;

        /* renamed from: m  reason: collision with root package name */
        public final aj.b f23419m;

        /* renamed from: n  reason: collision with root package name */
        public final SocketFactory f23420n;

        /* renamed from: o  reason: collision with root package name */
        public final List<h> f23421o;

        /* renamed from: p  reason: collision with root package name */
        public final List<? extends Protocol> f23422p;

        /* renamed from: q  reason: collision with root package name */
        public final jk.c f23423q;

        /* renamed from: r  reason: collision with root package name */
        public final CertificatePinner f23424r;

        /* renamed from: s  reason: collision with root package name */
        public int f23425s;

        /* renamed from: t  reason: collision with root package name */
        public int f23426t;

        /* renamed from: u  reason: collision with root package name */
        public int f23427u;

        public a() {
            m.a aVar = m.f23356a;
            byte[] bArr = ak.b.f665a;
            kotlin.jvm.internal.g.e(aVar, "<this>");
            this.f23411e = new androidx.appcompat.libconvert.a(aVar, 14);
            this.f23412f = true;
            aj.b bVar = b.f23135f1;
            this.f23413g = bVar;
            this.f23414h = true;
            this.f23415i = true;
            this.f23416j = j.f23351g1;
            this.f23418l = l.f23355h1;
            this.f23419m = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.g.d(socketFactory, "getDefault()");
            this.f23420n = socketFactory;
            this.f23421o = s.B;
            this.f23422p = s.A;
            this.f23423q = jk.c.f19286a;
            this.f23424r = CertificatePinner.c;
            this.f23425s = Constants.CP_MAC_ROMAN;
            this.f23426t = Constants.CP_MAC_ROMAN;
            this.f23427u = Constants.CP_MAC_ROMAN;
        }
    }

    public s(a aVar) {
        boolean z10;
        boolean z11;
        this.f23383a = aVar.f23408a;
        this.f23384b = aVar.f23409b;
        this.c = ak.b.w(aVar.c);
        this.f23385d = ak.b.w(aVar.f23410d);
        this.f23386e = aVar.f23411e;
        this.f23387f = aVar.f23412f;
        this.f23388g = aVar.f23413g;
        this.f23389h = aVar.f23414h;
        this.f23390i = aVar.f23415i;
        this.f23391j = aVar.f23416j;
        this.f23392k = aVar.f23417k;
        this.f23393l = aVar.f23418l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f23394m = proxySelector == null ? ik.a.f18545a : proxySelector;
        this.f23395n = aVar.f23419m;
        this.f23396o = aVar.f23420n;
        List<h> list = aVar.f23421o;
        this.f23399r = list;
        this.f23400s = aVar.f23422p;
        this.f23401t = aVar.f23423q;
        this.f23404w = aVar.f23425s;
        this.f23405x = aVar.f23426t;
        this.f23406y = aVar.f23427u;
        this.f23407z = new androidx.core.content.e(13);
        List<h> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (h hVar : list2) {
                if (hVar.f23196a) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.f23397p = null;
            this.f23403v = null;
            this.f23398q = null;
            this.f23402u = CertificatePinner.c;
        } else {
            gk.h hVar2 = gk.h.f17912a;
            X509TrustManager m10 = gk.h.f17912a.m();
            this.f23398q = m10;
            gk.h hVar3 = gk.h.f17912a;
            kotlin.jvm.internal.g.b(m10);
            this.f23397p = hVar3.l(m10);
            androidx.privacysandbox.ads.adservices.topics.d b10 = gk.h.f17912a.b(m10);
            this.f23403v = b10;
            CertificatePinner certificatePinner = aVar.f23424r;
            kotlin.jvm.internal.g.b(b10);
            this.f23402u = kotlin.jvm.internal.g.a(certificatePinner.f23117b, b10) ? certificatePinner : new CertificatePinner(certificatePinner.f23116a, b10);
        }
        List<q> list3 = this.c;
        if (!list3.contains(null)) {
            List<q> list4 = this.f23385d;
            if (!list4.contains(null)) {
                List<h> list5 = this.f23399r;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    for (h hVar4 : list5) {
                        if (hVar4.f23196a) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                X509TrustManager x509TrustManager = this.f23398q;
                androidx.privacysandbox.ads.adservices.topics.d dVar = this.f23403v;
                SSLSocketFactory sSLSocketFactory = this.f23397p;
                if (!z11) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (dVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
                if (!(sSLSocketFactory == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(dVar == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (x509TrustManager == null) {
                    if (!kotlin.jvm.internal.g.a(this.f23402u, CertificatePinner.c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException(kotlin.jvm.internal.g.h(list4, "Null network interceptor: ").toString());
        }
        throw new IllegalStateException(kotlin.jvm.internal.g.h(list3, "Null interceptor: ").toString());
    }

    public final okhttp3.internal.connection.e a(t request) {
        kotlin.jvm.internal.g.e(request, "request");
        return new okhttp3.internal.connection.e(this, request, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public s() {
        this(new a());
    }
}
