package gk;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import gk.h;
import hk.i;
import hk.j;
import hk.k;
import hk.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f17898e;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final hk.h f17899d;

    /* compiled from: AndroidPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a implements jk.d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f17900a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f17901b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f17900a = x509TrustManager;
            this.f17901b = method;
        }

        @Override // jk.d
        public final X509Certificate a(X509Certificate cert) {
            kotlin.jvm.internal.g.e(cert, "cert");
            try {
                Object invoke = this.f17901b.invoke(this.f17900a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.g.a(this.f17900a, aVar.f17900a) && kotlin.jvm.internal.g.a(this.f17901b, aVar.f17901b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f17901b.hashCode() + (this.f17900a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f17900a + ", findByIssuerAndSignatureMethod=" + this.f17901b + ')';
        }
    }

    static {
        boolean z10;
        if (!h.a.c() || Build.VERSION.SDK_INT >= 30) {
            z10 = false;
        } else {
            z10 = true;
        }
        f17898e = z10;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        Method method3 = null;
        try {
            lVar = new l(Class.forName(kotlin.jvm.internal.g.h(".OpenSSLSocketImpl", "com.android.org.conscrypt")), Class.forName(kotlin.jvm.internal.g.h(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt")), Class.forName(kotlin.jvm.internal.g.h(".SSLParametersImpl", "com.android.org.conscrypt")));
        } catch (Exception e10) {
            h.f17912a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new j(hk.f.f18359f);
        kVarArr[2] = new j(i.f18367a);
        kVarArr[3] = new j(hk.g.f18364a);
        ArrayList C = kotlin.collections.f.C(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = C.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod(PDWindowsLaunchParams.OPERATION_OPEN, String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f17899d = new hk.h(method3, method2, method);
    }

    @Override // gk.h
    public final androidx.privacysandbox.ads.adservices.topics.d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        hk.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new hk.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new jk.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // gk.h
    public final jk.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // gk.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        Object obj;
        kotlin.jvm.internal.g.e(protocols, "protocols");
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((k) obj).b(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // gk.h
    public final void e(Socket socket, InetSocketAddress address, int i10) {
        kotlin.jvm.internal.g.e(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // gk.h
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((k) obj).b(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    @Override // gk.h
    public final Object g() {
        hk.h hVar = this.f17899d;
        hVar.getClass();
        Method method = hVar.f18365a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = hVar.f18366b;
            kotlin.jvm.internal.g.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gk.h
    public final boolean h(String hostname) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.g.e(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
            return isCleartextTrafficPermitted;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // gk.h
    public final void j(Object obj, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        hk.h hVar = this.f17899d;
        hVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = hVar.c;
                kotlin.jvm.internal.g.b(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            h.i(5, message, null);
        }
    }
}
