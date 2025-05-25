package hk;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import gk.h;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: Android10SocketAdapter.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class a implements k {
    @Override // hk.k
    public final boolean a() {
        gk.h hVar = gk.h.f17912a;
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // hk.k
    public final boolean b(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // hk.k
    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean a10;
        applicationProtocol = sSLSocket.getApplicationProtocol();
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
    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            gk.h hVar = gk.h.f17912a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
