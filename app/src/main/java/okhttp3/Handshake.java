package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import okhttp3.TlsVersion;

/* compiled from: Handshake.kt */
/* loaded from: classes3.dex */
public final class Handshake {

    /* renamed from: a  reason: collision with root package name */
    public final TlsVersion f23118a;

    /* renamed from: b  reason: collision with root package name */
    public final g f23119b;
    public final List<Certificate> c;

    /* renamed from: d  reason: collision with root package name */
    public final tf.c f23120d;

    /* compiled from: Handshake.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static Handshake a(SSLSession sSLSession) {
            boolean a10;
            final List list;
            List list2;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (kotlin.jvm.internal.g.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    a10 = true;
                } else {
                    a10 = kotlin.jvm.internal.g.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!a10) {
                    g b10 = g.f23175b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!kotlin.jvm.internal.g.a("NONE", protocol)) {
                            TlsVersion.Companion.getClass();
                            TlsVersion a11 = TlsVersion.a.a(protocol);
                            try {
                                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                                if (peerCertificates != null) {
                                    list = ak.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
                                } else {
                                    list = EmptyList.INSTANCE;
                                }
                            } catch (SSLPeerUnverifiedException unused) {
                                list = EmptyList.INSTANCE;
                            }
                            Certificate[] localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                                list2 = ak.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
                            } else {
                                list2 = EmptyList.INSTANCE;
                            }
                            return new Handshake(a11, b10, list2, new cg.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // cg.a
                                public final List<? extends Certificate> invoke() {
                                    return list;
                                }
                            });
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException(kotlin.jvm.internal.g.h(cipherSuite, "cipherSuite == "));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, g cipherSuite, List<? extends Certificate> localCertificates, final cg.a<? extends List<? extends Certificate>> aVar) {
        kotlin.jvm.internal.g.e(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.g.e(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.g.e(localCertificates, "localCertificates");
        this.f23118a = tlsVersion;
        this.f23119b = cipherSuite;
        this.c = localCertificates;
        this.f23120d = kotlin.a.a(new cg.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cg.a
            public final List<? extends Certificate> invoke() {
                try {
                    return aVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
            }
        });
    }

    public final List<Certificate> a() {
        return (List) this.f23120d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f23118a == this.f23118a && kotlin.jvm.internal.g.a(handshake.f23119b, this.f23119b) && kotlin.jvm.internal.g.a(handshake.a(), a()) && kotlin.jvm.internal.g.a(handshake.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23119b.hashCode();
        int hashCode2 = a().hashCode();
        return this.c.hashCode() + ((hashCode2 + ((hashCode + ((this.f23118a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(a10, 10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.g.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f23118a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f23119b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.g.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
