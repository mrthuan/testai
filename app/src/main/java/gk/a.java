package gk;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import gk.h;
import hk.i;
import hk.j;
import hk.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: Android10Platform.kt */
/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f17897d;
    public final ArrayList c;

    static {
        boolean z10;
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f17897d = z10;
    }

    public a() {
        boolean z10;
        hk.a aVar;
        k[] kVarArr = new k[4];
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar = new hk.a();
        } else {
            aVar = null;
        }
        kVarArr[0] = aVar;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
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
    @SuppressLint({"NewApi"})
    public final boolean h(String hostname) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.g.e(hostname, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}
