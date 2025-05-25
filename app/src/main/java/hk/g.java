package hk;

import gk.c;
import gk.h;
import hk.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18364a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a implements j.a {
        @Override // hk.j.a
        public final boolean b(SSLSocket sSLSocket) {
            boolean z10 = gk.c.f17902d;
            if (c.a.a() && (sSLSocket instanceof BCSSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // hk.j.a
        public final k c(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // hk.k
    public final boolean a() {
        boolean z10 = gk.c.f17902d;
        return gk.c.f17902d;
    }

    @Override // hk.k
    public final boolean b(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // hk.k
    public final String c(SSLSocket sSLSocket) {
        boolean a10;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            a10 = true;
        } else {
            a10 = kotlin.jvm.internal.g.a(applicationProtocol, "");
        }
        if (a10) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // hk.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            gk.h hVar = gk.h.f17912a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
