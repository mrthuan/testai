package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.k;
import okhttp3.a0;
import okhttp3.m;
import okhttp3.p;

/* compiled from: RouteSelector.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.a f23335a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.core.content.e f23336b;
    public final okhttp3.e c;

    /* renamed from: d  reason: collision with root package name */
    public final m f23337d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends Proxy> f23338e;

    /* renamed from: f  reason: collision with root package name */
    public int f23339f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends InetSocketAddress> f23340g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f23341h;

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<a0> f23342a;

        /* renamed from: b  reason: collision with root package name */
        public int f23343b;

        public a(ArrayList arrayList) {
            this.f23342a = arrayList;
        }

        public final boolean a() {
            if (this.f23343b < this.f23342a.size()) {
                return true;
            }
            return false;
        }
    }

    public i(okhttp3.a address, androidx.core.content.e routeDatabase, e call, m eventListener) {
        boolean z10;
        List<? extends Proxy> w7;
        kotlin.jvm.internal.g.e(address, "address");
        kotlin.jvm.internal.g.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.g.e(call, "call");
        kotlin.jvm.internal.g.e(eventListener, "eventListener");
        this.f23335a = address;
        this.f23336b = routeDatabase;
        this.c = call;
        this.f23337d = eventListener;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f23338e = emptyList;
        this.f23340g = emptyList;
        this.f23341h = new ArrayList();
        p url = address.f23130i;
        kotlin.jvm.internal.g.e(url, "url");
        Proxy proxy = address.f23128g;
        if (proxy != null) {
            w7 = ge.a.H(proxy);
        } else {
            URI g10 = url.g();
            if (g10.getHost() == null) {
                w7 = ak.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f23129h.select(g10);
                List<Proxy> list = proxiesOrNull;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    w7 = ak.b.k(Proxy.NO_PROXY);
                } else {
                    kotlin.jvm.internal.g.d(proxiesOrNull, "proxiesOrNull");
                    w7 = ak.b.w(proxiesOrNull);
                }
            }
        }
        this.f23338e = w7;
        this.f23339f = 0;
    }

    public final boolean a() {
        boolean z10;
        if (this.f23339f < this.f23338e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!this.f23341h.isEmpty())) {
            return true;
        }
        return false;
    }

    public final a b() {
        boolean z10;
        boolean z11;
        String hostName;
        int i10;
        List<InetAddress> a10;
        boolean contains;
        if (a()) {
            ArrayList arrayList = new ArrayList();
            do {
                boolean z12 = false;
                if (this.f23339f < this.f23338e.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                if (this.f23339f < this.f23338e.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                okhttp3.a aVar = this.f23335a;
                if (z11) {
                    List<? extends Proxy> list = this.f23338e;
                    int i11 = this.f23339f;
                    this.f23339f = i11 + 1;
                    Proxy proxy = list.get(i11);
                    ArrayList arrayList2 = new ArrayList();
                    this.f23340g = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress proxyAddress = proxy.address();
                        if (proxyAddress instanceof InetSocketAddress) {
                            kotlin.jvm.internal.g.d(proxyAddress, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                            InetAddress address = inetSocketAddress.getAddress();
                            if (address == null) {
                                hostName = inetSocketAddress.getHostName();
                                kotlin.jvm.internal.g.d(hostName, "hostName");
                            } else {
                                hostName = address.getHostAddress();
                                kotlin.jvm.internal.g.d(hostName, "address.hostAddress");
                            }
                            i10 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(kotlin.jvm.internal.g.h(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                        }
                    } else {
                        p pVar = aVar.f23130i;
                        hostName = pVar.f23366d;
                        i10 = pVar.f23367e;
                    }
                    if (1 <= i10 && i10 < 65536) {
                        z12 = true;
                    }
                    if (z12) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, i10));
                        } else {
                            byte[] bArr = ak.b.f665a;
                            kotlin.jvm.internal.g.e(hostName, "<this>");
                            if (ak.b.f669f.matches(hostName)) {
                                a10 = ge.a.H(InetAddress.getByName(hostName));
                            } else {
                                this.f23337d.getClass();
                                okhttp3.e call = this.c;
                                kotlin.jvm.internal.g.e(call, "call");
                                a10 = aVar.f23123a.a(hostName);
                                if (a10.isEmpty()) {
                                    throw new UnknownHostException(aVar.f23123a + " returned no addresses for " + hostName);
                                }
                            }
                            for (InetAddress inetAddress : a10) {
                                arrayList2.add(new InetSocketAddress(inetAddress, i10));
                            }
                        }
                        for (InetSocketAddress inetSocketAddress2 : this.f23340g) {
                            a0 a0Var = new a0(this.f23335a, proxy, inetSocketAddress2);
                            androidx.core.content.e eVar = this.f23336b;
                            synchronized (eVar) {
                                contains = ((Set) eVar.f3529a).contains(a0Var);
                            }
                            if (contains) {
                                this.f23341h.add(a0Var);
                            } else {
                                arrayList.add(a0Var);
                            }
                        }
                    } else {
                        throw new SocketException("No route to " + hostName + ':' + i10 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + aVar.f23130i.f23366d + "; exhausted proxy configurations: " + this.f23338e);
                }
            } while (!(!arrayList.isEmpty()));
            if (arrayList.isEmpty()) {
                k.k0(this.f23341h, arrayList);
                this.f23341h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
