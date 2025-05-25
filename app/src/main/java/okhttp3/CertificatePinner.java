package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes3.dex */
public final class CertificatePinner {
    public static final CertificatePinner c = new CertificatePinner(kotlin.collections.m.G0(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f23116a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.privacysandbox.ads.adservices.topics.d f23117b;

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static String a(X509Certificate certificate) {
            kotlin.jvm.internal.g.e(certificate, "certificate");
            return kotlin.jvm.internal.g.h(b(certificate).base64(), "sha256/");
        }

        public static ByteString b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.g.e(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.g.d(encoded, "publicKey.encoded");
            return ByteString.a.e(aVar, encoded).sha256();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            if (!kotlin.jvm.internal.g.a(null, null)) {
                return false;
            }
            bVar.getClass();
            if (!kotlin.jvm.internal.g.a(null, null)) {
                return false;
            }
            bVar.getClass();
            if (kotlin.jvm.internal.g.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<b> pins, androidx.privacysandbox.ads.adservices.topics.d dVar) {
        kotlin.jvm.internal.g.e(pins, "pins");
        this.f23116a = pins;
        this.f23117b = dVar;
    }

    public final void a(final String hostname, final List<? extends Certificate> peerCertificates) {
        kotlin.jvm.internal.g.e(hostname, "hostname");
        kotlin.jvm.internal.g.e(peerCertificates, "peerCertificates");
        b(hostname, new cg.a<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cg.a
            public final List<? extends X509Certificate> invoke() {
                androidx.privacysandbox.ads.adservices.topics.d dVar = CertificatePinner.this.f23117b;
                List<Certificate> f10 = dVar == null ? null : dVar.f(hostname, peerCertificates);
                if (f10 == null) {
                    f10 = peerCertificates;
                }
                List<Certificate> list = f10;
                ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(list, 10));
                for (Certificate certificate : list) {
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void b(String hostname, cg.a<? extends List<? extends X509Certificate>> aVar) {
        kotlin.jvm.internal.g.e(hostname, "hostname");
        EmptyList<b> emptyList = EmptyList.INSTANCE;
        Iterator<T> it = this.f23116a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            List<? extends X509Certificate> invoke = aVar.invoke();
            for (X509Certificate x509Certificate : invoke) {
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (b bVar : emptyList) {
                    bVar.getClass();
                    if (kotlin.jvm.internal.g.a(null, "sha256")) {
                        if (byteString == null) {
                            byteString = a.b(x509Certificate);
                        }
                        if (kotlin.jvm.internal.g.a(null, byteString)) {
                            return;
                        }
                    } else if (kotlin.jvm.internal.g.a(null, "sha1")) {
                        if (byteString2 == null) {
                            kotlin.jvm.internal.g.e(x509Certificate, "<this>");
                            ByteString.a aVar2 = ByteString.Companion;
                            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                            kotlin.jvm.internal.g.d(encoded, "publicKey.encoded");
                            byteString2 = ByteString.a.e(aVar2, encoded).sha1();
                        }
                        if (kotlin.jvm.internal.g.a(null, byteString2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError(kotlin.jvm.internal.g.h(null, "unsupported hashAlgorithm: "));
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : invoke) {
                sb2.append("\n    ");
                sb2.append(a.a(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            for (b bVar2 : emptyList) {
                sb2.append("\n    ");
                sb2.append(bVar2);
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
        ((b) it.next()).getClass();
        kotlin.text.j.M(null, "**.", false);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (kotlin.jvm.internal.g.a(certificatePinner.f23116a, this.f23116a) && kotlin.jvm.internal.g.a(certificatePinner.f23117b, this.f23117b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f23116a.hashCode() + 1517) * 41;
        androidx.privacysandbox.ads.adservices.topics.d dVar = this.f23117b;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
