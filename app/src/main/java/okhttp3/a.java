package okhttp3;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.p;

/* compiled from: Address.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final l f23123a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f23124b;
    public final SSLSocketFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f23125d;

    /* renamed from: e  reason: collision with root package name */
    public final CertificatePinner f23126e;

    /* renamed from: f  reason: collision with root package name */
    public final b f23127f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f23128g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f23129h;

    /* renamed from: i  reason: collision with root package name */
    public final p f23130i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Protocol> f23131j;

    /* renamed from: k  reason: collision with root package name */
    public final List<h> f23132k;

    public a(String uriHost, int i10, o9.d dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, jk.c cVar, CertificatePinner certificatePinner, aj.b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.g.e(uriHost, "uriHost");
        kotlin.jvm.internal.g.e(dns, "dns");
        kotlin.jvm.internal.g.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.g.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.g.e(protocols, "protocols");
        kotlin.jvm.internal.g.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.g.e(proxySelector, "proxySelector");
        this.f23123a = dns;
        this.f23124b = socketFactory;
        this.c = sSLSocketFactory;
        this.f23125d = cVar;
        this.f23126e = certificatePinner;
        this.f23127f = proxyAuthenticator;
        this.f23128g = null;
        this.f23129h = proxySelector;
        p.a aVar = new p.a();
        String str = sSLSocketFactory != null ? Constants.SCHEME : "http";
        boolean z10 = true;
        if (kotlin.text.j.G(str, "http", true)) {
            aVar.f23373a = "http";
        } else if (kotlin.text.j.G(str, Constants.SCHEME, true)) {
            aVar.f23373a = Constants.SCHEME;
        } else {
            throw new IllegalArgumentException(kotlin.jvm.internal.g.h(str, "unexpected scheme: "));
        }
        String B = ea.a.B(p.b.d(uriHost, 0, 0, false, 7));
        if (B != null) {
            aVar.f23375d = B;
            if ((1 > i10 || i10 >= 65536) ? false : z10) {
                aVar.f23376e = i10;
                this.f23130i = aVar.a();
                this.f23131j = ak.b.w(protocols);
                this.f23132k = ak.b.w(connectionSpecs);
                return;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "unexpected port: ").toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.g.h(uriHost, "unexpected host: "));
    }

    public final boolean a(a that) {
        kotlin.jvm.internal.g.e(that, "that");
        if (kotlin.jvm.internal.g.a(this.f23123a, that.f23123a) && kotlin.jvm.internal.g.a(this.f23127f, that.f23127f) && kotlin.jvm.internal.g.a(this.f23131j, that.f23131j) && kotlin.jvm.internal.g.a(this.f23132k, that.f23132k) && kotlin.jvm.internal.g.a(this.f23129h, that.f23129h) && kotlin.jvm.internal.g.a(this.f23128g, that.f23128g) && kotlin.jvm.internal.g.a(this.c, that.c) && kotlin.jvm.internal.g.a(this.f23125d, that.f23125d) && kotlin.jvm.internal.g.a(this.f23126e, that.f23126e) && this.f23130i.f23367e == that.f23130i.f23367e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.g.a(this.f23130i, aVar.f23130i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23123a.hashCode();
        int hashCode2 = this.f23127f.hashCode();
        int hashCode3 = this.f23131j.hashCode();
        int hashCode4 = this.f23132k.hashCode();
        int hashCode5 = this.f23129h.hashCode();
        int hashCode6 = Objects.hashCode(this.f23128g);
        int hashCode7 = Objects.hashCode(this.c);
        int hashCode8 = Objects.hashCode(this.f23125d);
        return Objects.hashCode(this.f23126e) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f23130i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String h10;
        StringBuilder sb2 = new StringBuilder("Address{");
        p pVar = this.f23130i;
        sb2.append(pVar.f23366d);
        sb2.append(':');
        sb2.append(pVar.f23367e);
        sb2.append(", ");
        Proxy proxy = this.f23128g;
        if (proxy != null) {
            h10 = kotlin.jvm.internal.g.h(proxy, "proxy=");
        } else {
            h10 = kotlin.jvm.internal.g.h(this.f23129h, "proxySelector=");
        }
        return androidx.activity.r.f(sb2, h10, '}');
    }
}
