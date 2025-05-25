package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.kt */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f23133a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f23134b;
    public final InetSocketAddress c;

    public a0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.g.e(address, "address");
        kotlin.jvm.internal.g.e(socketAddress, "socketAddress");
        this.f23133a = address;
        this.f23134b = proxy;
        this.c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (kotlin.jvm.internal.g.a(a0Var.f23133a, this.f23133a) && kotlin.jvm.internal.g.a(a0Var.f23134b, this.f23134b) && kotlin.jvm.internal.g.a(a0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23134b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.f23133a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
