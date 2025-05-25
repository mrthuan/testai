package hk;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidCertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public final class b extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f18353a;

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManagerExtensions f18354b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f18353a = x509TrustManager;
        this.f18354b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f18353a == this.f18353a) {
            return true;
        }
        return false;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public final List f(String hostname, List chain) {
        kotlin.jvm.internal.g.e(chain, "chain");
        kotlin.jvm.internal.g.e(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f18354b.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
                kotlin.jvm.internal.g.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final int hashCode() {
        return System.identityHashCode(this.f18353a);
    }
}
