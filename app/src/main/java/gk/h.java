package gk;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: Platform.kt */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f17912a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f17913b;

    /* compiled from: Platform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ArrayList a(List protocols) {
            boolean z10;
            kotlin.jvm.internal.g.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            kotlin.jvm.internal.g.e(protocols, "protocols");
            kk.f fVar = new kk.f();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.q(str.length());
                fVar.x(str);
            }
            return fVar.h(fVar.f19826b);
        }

        public static boolean c() {
            return kotlin.jvm.internal.g.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    static {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.h.<clinit>():void");
    }

    public static void i(int i10, String message, Throwable th2) {
        Level level;
        kotlin.jvm.internal.g.e(message, "message");
        if (i10 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f17913b.log(level, message, th2);
    }

    public androidx.privacysandbox.ads.adservices.topics.d b(X509TrustManager x509TrustManager) {
        return new jk.a(c(x509TrustManager));
    }

    public jk.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.g.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new jk.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i10) {
        kotlin.jvm.internal.g.e(address, "address");
        socket.connect(address, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f17913b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        kotlin.jvm.internal.g.e(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        if (obj == null) {
            message = kotlin.jvm.internal.g.h(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.g.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k10 = k();
            k10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k10.getSocketFactory();
            kotlin.jvm.internal.g.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(kotlin.jvm.internal.g.h(e10, "No System TLS: "), e10);
        }
    }

    public X509TrustManager m() {
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
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.g.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.g.h(arrays, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
