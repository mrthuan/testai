package hk;

import gk.d;
import gk.h;
import hk.j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18367a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a implements j.a {
        @Override // hk.j.a
        public final boolean b(SSLSocket sSLSocket) {
            boolean z10 = gk.d.f17903d;
            if (d.a.b() && Conscrypt.isConscrypt(sSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // hk.j.a
        public final k c(SSLSocket sSLSocket) {
            return new i();
        }
    }

    @Override // hk.k
    public final boolean a() {
        boolean z10 = gk.d.f17903d;
        return gk.d.f17903d;
    }

    @Override // hk.k
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // hk.k
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // hk.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.g.e(protocols, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            gk.h hVar = gk.h.f17912a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
