package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* compiled from: ConnectionSpec.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f23194e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f23195f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23196a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23197b;
    public final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f23198d;

    static {
        g gVar = g.f23190r;
        g gVar2 = g.f23191s;
        g gVar3 = g.f23192t;
        g gVar4 = g.f23184l;
        g gVar5 = g.f23186n;
        g gVar6 = g.f23185m;
        g gVar7 = g.f23187o;
        g gVar8 = g.f23189q;
        g gVar9 = g.f23188p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f23182j, g.f23183k, g.f23180h, g.f23181i, g.f23178f, g.f23179g, g.f23177e};
        a aVar = new a();
        aVar.c((g[]) Arrays.copyOf(gVarArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.f(tlsVersion, tlsVersion2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar2.f(tlsVersion, tlsVersion2);
        aVar2.d();
        f23194e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((g[]) Arrays.copyOf(gVarArr2, 16));
        aVar3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f23195f = new h(false, false, null, null);
    }

    public h(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f23196a = z10;
        this.f23197b = z11;
        this.c = strArr;
        this.f23198d = strArr2;
    }

    public final List<g> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f23175b.b(str));
        }
        return kotlin.collections.m.E0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f23196a) {
            return false;
        }
        String[] strArr = this.f23198d;
        if (strArr != null && !ak.b.i(strArr, sSLSocket.getEnabledProtocols(), uf.a.f30366a)) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 != null && !ak.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), g.c)) {
            return false;
        }
        return true;
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.f23198d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(TlsVersion.a.a(str));
        }
        return kotlin.collections.m.E0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z10 = hVar.f23196a;
        boolean z11 = this.f23196a;
        if (z11 != z10) {
            return false;
        }
        if (z11 && (!Arrays.equals(this.c, hVar.c) || !Arrays.equals(this.f23198d, hVar.f23198d) || this.f23197b != hVar.f23197b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f23196a) {
            int i10 = 0;
            String[] strArr = this.c;
            if (strArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(strArr);
            }
            int i11 = (527 + hashCode) * 31;
            String[] strArr2 = this.f23198d;
            if (strArr2 != null) {
                i10 = Arrays.hashCode(strArr2);
            }
            return ((i11 + i10) * 31) + (!this.f23197b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f23196a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f23197b + ')';
    }

    /* compiled from: ConnectionSpec.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f23199a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f23200b;
        public String[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23201d;

        public a() {
            this.f23199a = true;
        }

        public final h a() {
            return new h(this.f23199a, this.f23201d, this.f23200b, this.c);
        }

        public final void b(String... cipherSuites) {
            boolean z10;
            kotlin.jvm.internal.g.e(cipherSuites, "cipherSuites");
            if (this.f23199a) {
                if (cipherSuites.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f23200b = (String[]) cipherSuites.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void c(g... cipherSuites) {
            kotlin.jvm.internal.g.e(cipherSuites, "cipherSuites");
            if (this.f23199a) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (g gVar : cipherSuites) {
                    arrayList.add(gVar.f23193a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (this.f23199a) {
                this.f23201d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final void e(String... tlsVersions) {
            boolean z10;
            kotlin.jvm.internal.g.e(tlsVersions, "tlsVersions");
            if (this.f23199a) {
                if (tlsVersions.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.c = (String[]) tlsVersions.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final void f(TlsVersion... tlsVersionArr) {
            if (this.f23199a) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion tlsVersion : tlsVersionArr) {
                    arrayList.add(tlsVersion.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(h hVar) {
            this.f23199a = hVar.f23196a;
            this.f23200b = hVar.c;
            this.c = hVar.f23198d;
            this.f23201d = hVar.f23197b;
        }
    }
}
