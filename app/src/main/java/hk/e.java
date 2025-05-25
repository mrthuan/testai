package hk;

import hk.j;
import javax.net.ssl.SSLSocket;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class e implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18358a = "com.google.android.gms.org.conscrypt";

    @Override // hk.j.a
    public final boolean b(SSLSocket sSLSocket) {
        return kotlin.text.j.M(sSLSocket.getClass().getName(), kotlin.jvm.internal.g.h(".", this.f18358a), false);
    }

    @Override // hk.j.a
    public final k c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!kotlin.jvm.internal.g.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(kotlin.jvm.internal.g.h(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(cls2);
    }
}
