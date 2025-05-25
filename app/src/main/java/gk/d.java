package gk;

import gk.h;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
/* loaded from: classes3.dex */
public final class d extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f17903d;
    public final Provider c;

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() > 2) {
                    return true;
                }
                return false;
            } else if (version.minor() != 1) {
                if (version.minor() > 1) {
                    return true;
                }
                return false;
            } else if (version.patch() >= 0) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean b() {
            return d.f17903d;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17904a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (a.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f17903d = z10;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        kotlin.jvm.internal.g.d(newProvider, "newProvider()");
        this.c = newProvider;
    }

    @Override // gk.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, protocols);
    }

    @Override // gk.h
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // gk.h
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        kotlin.jvm.internal.g.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // gk.h
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k10 = k();
        k10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k10.getSocketFactory();
        kotlin.jvm.internal.g.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // gk.h
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.g.b(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f17904a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.g.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.g.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
