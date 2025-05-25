package okhttp3.internal.connection;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.g;
import okhttp3.h;

/* compiled from: ConnectionSpecSelector.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<okhttp3.h> f23266a;

    /* renamed from: b  reason: collision with root package name */
    public int f23267b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23268d;

    public b(List<okhttp3.h> connectionSpecs) {
        kotlin.jvm.internal.g.e(connectionSpecs, "connectionSpecs");
        this.f23266a = connectionSpecs;
    }

    public final okhttp3.h a(SSLSocket sSLSocket) {
        okhttp3.h hVar;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        boolean z11;
        int i10 = this.f23267b;
        List<okhttp3.h> list = this.f23266a;
        int size = list.size();
        while (true) {
            if (i10 < size) {
                int i11 = i10 + 1;
                hVar = list.get(i10);
                if (hVar.b(sSLSocket)) {
                    this.f23267b = i11;
                    break;
                }
                i10 = i11;
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            int i12 = this.f23267b;
            int size2 = list.size();
            while (true) {
                if (i12 < size2) {
                    int i13 = i12 + 1;
                    if (list.get(i12).b(sSLSocket)) {
                        z10 = true;
                        break;
                    }
                    i12 = i13;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.c = z10;
            boolean z12 = this.f23268d;
            String[] strArr = hVar.c;
            if (strArr != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                kotlin.jvm.internal.g.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                cipherSuitesIntersection = ak.b.o(enabledCipherSuites, strArr, okhttp3.g.c);
            } else {
                cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = hVar.f23198d;
            if (strArr2 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                kotlin.jvm.internal.g.d(enabledProtocols, "sslSocket.enabledProtocols");
                tlsVersionsIntersection = ak.b.o(enabledProtocols, strArr2, uf.a.f30366a);
            } else {
                tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            kotlin.jvm.internal.g.d(supportedCipherSuites, "supportedCipherSuites");
            g.a aVar = okhttp3.g.c;
            byte[] bArr = ak.b.f665a;
            int length = supportedCipherSuites.length;
            int i14 = 0;
            while (true) {
                if (i14 < length) {
                    if (aVar.compare(supportedCipherSuites[i14], "TLS_FALLBACK_SCSV") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (z12 && i14 != -1) {
                kotlin.jvm.internal.g.d(cipherSuitesIntersection, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i14];
                kotlin.jvm.internal.g.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
                kotlin.jvm.internal.g.d(copyOf, "copyOf(this, newSize)");
                cipherSuitesIntersection = (String[]) copyOf;
                cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
            }
            h.a aVar2 = new h.a(hVar);
            kotlin.jvm.internal.g.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            aVar2.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
            kotlin.jvm.internal.g.d(tlsVersionsIntersection, "tlsVersionsIntersection");
            aVar2.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
            okhttp3.h a10 = aVar2.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f23198d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.c);
            }
            return hVar;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f23268d);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.g.b(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        kotlin.jvm.internal.g.d(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }
}
