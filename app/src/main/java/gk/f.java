package gk;

import gk.h;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: Jdk9Platform.kt */
/* loaded from: classes3.dex */
public final class f extends h {
    public static final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0.intValue() >= 9) goto L11;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            java.lang.Integer r0 = kotlin.text.i.E(r0)
        Le:
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L24
            goto L23
        L1a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L24
            r0.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L24
        L23:
            r1 = 1
        L24:
            gk.f.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.f.<clinit>():void");
    }

    @Override // gk.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = h.a.a(protocols).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // gk.h
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean a10;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                a10 = true;
            } else {
                a10 = kotlin.jvm.internal.g.a(applicationProtocol, "");
            }
        } catch (UnsupportedOperationException unused) {
        }
        if (a10) {
            return null;
        }
        return applicationProtocol;
    }
}
