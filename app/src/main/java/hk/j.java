package hk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final a f18368a;

    /* renamed from: b  reason: collision with root package name */
    public k f18369b;

    /* compiled from: DeferredSocketAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        boolean b(SSLSocket sSLSocket);

        k c(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        this.f18368a = aVar;
    }

    @Override // hk.k
    public final boolean a() {
        return true;
    }

    @Override // hk.k
    public final boolean b(SSLSocket sSLSocket) {
        return this.f18368a.b(sSLSocket);
    }

    @Override // hk.k
    public final String c(SSLSocket sSLSocket) {
        k kVar;
        synchronized (this) {
            if (this.f18369b == null && this.f18368a.b(sSLSocket)) {
                this.f18369b = this.f18368a.c(sSLSocket);
            }
            kVar = this.f18369b;
        }
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    @Override // hk.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        k kVar;
        kotlin.jvm.internal.g.e(protocols, "protocols");
        synchronized (this) {
            if (this.f18369b == null && this.f18368a.b(sSLSocket)) {
                this.f18369b = this.f18368a.c(sSLSocket);
            }
            kVar = this.f18369b;
        }
        if (kVar != null) {
            kVar.d(sSLSocket, str, protocols);
        }
    }
}
