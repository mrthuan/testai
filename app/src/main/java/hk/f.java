package hk;

import gk.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes3.dex */
public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final e f18359f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super SSLSocket> f18360a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f18361b;
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f18362d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f18363e;

    public f(Class<? super SSLSocket> cls) {
        this.f18360a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.g.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f18361b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.f18362d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f18363e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // hk.k
    public final boolean a() {
        boolean z10 = gk.b.f17898e;
        return gk.b.f17898e;
    }

    @Override // hk.k
    public final boolean b(SSLSocket sSLSocket) {
        return this.f18360a.isInstance(sSLSocket);
    }

    @Override // hk.k
    public final String c(SSLSocket sSLSocket) {
        if (!this.f18360a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f18362d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, kotlin.text.a.f19966b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.g.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // hk.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        if (this.f18360a.isInstance(sSLSocket)) {
            try {
                this.f18361b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.f18363e;
                gk.h hVar = gk.h.f17912a;
                method.invoke(sSLSocket, h.a.b(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
