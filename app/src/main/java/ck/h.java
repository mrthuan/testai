package ck;

import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.text.Regex;
import okhttp3.CertificatePinner;
import okhttp3.a0;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.p;
import okhttp3.q;
import okhttp3.s;
import okhttp3.t;
import okhttp3.w;
import okhttp3.x;
import okhttp3.z;

/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes3.dex */
public final class h implements q {

    /* renamed from: a  reason: collision with root package name */
    public final s f5707a;

    public h(s client) {
        kotlin.jvm.internal.g.e(client, "client");
        this.f5707a = client;
    }

    public static int d(x xVar, int i10) {
        String b10 = x.b(xVar, "Retry-After");
        if (b10 == null) {
            return i10;
        }
        if (new Regex("\\d+").matches(b10)) {
            Integer valueOf = Integer.valueOf(b10);
            kotlin.jvm.internal.g.d(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // okhttp3.q
    public final x a(f fVar) {
        boolean z10;
        List list;
        int i10;
        boolean z11;
        okhttp3.internal.connection.c cVar;
        boolean z12;
        SSLSocketFactory sSLSocketFactory;
        jk.c cVar2;
        CertificatePinner certificatePinner;
        t tVar = fVar.f5700e;
        okhttp3.internal.connection.e eVar = fVar.f5697a;
        boolean z13 = true;
        List list2 = EmptyList.INSTANCE;
        int i11 = 0;
        x xVar = null;
        t request = tVar;
        boolean z14 = true;
        while (true) {
            eVar.getClass();
            kotlin.jvm.internal.g.e(request, "request");
            if (eVar.f23303l == null) {
                z10 = z13;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (eVar) {
                    if (eVar.f23305n ^ z13) {
                        if (eVar.f23304m ^ z13) {
                            tf.d dVar = tf.d.f30009a;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                }
                if (z14) {
                    okhttp3.internal.connection.h hVar = eVar.f23295d;
                    p pVar = request.f23428a;
                    boolean z15 = pVar.f23372j;
                    s sVar = eVar.f23293a;
                    if (z15) {
                        SSLSocketFactory sSLSocketFactory2 = sVar.f23397p;
                        if (sSLSocketFactory2 != null) {
                            jk.c cVar3 = sVar.f23401t;
                            certificatePinner = sVar.f23402u;
                            sSLSocketFactory = sSLSocketFactory2;
                            cVar2 = cVar3;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        cVar2 = null;
                        certificatePinner = null;
                    }
                    list = list2;
                    i10 = i11;
                    eVar.f23300i = new okhttp3.internal.connection.d(hVar, new okhttp3.a(pVar.f23366d, pVar.f23367e, sVar.f23393l, sVar.f23396o, sSLSocketFactory, cVar2, certificatePinner, sVar.f23395n, sVar.f23400s, sVar.f23399r, sVar.f23394m), eVar, eVar.f23296e);
                } else {
                    list = list2;
                    i10 = i11;
                }
                try {
                    if (!eVar.f23307p) {
                        try {
                            x c = fVar.c(request);
                            if (xVar != null) {
                                x.a aVar = new x.a(c);
                                x.a aVar2 = new x.a(xVar);
                                aVar2.f23460g = null;
                                x a10 = aVar2.a();
                                if (a10.f23447g == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    aVar.f23463j = a10;
                                    c = aVar.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            xVar = c;
                            cVar = eVar.f23303l;
                            request = b(xVar, cVar);
                        } catch (IOException e10) {
                            if (!(e10 instanceof ConnectionShutdownException)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (c(e10, eVar, request, z11)) {
                                list2 = m.z0(list, e10);
                                eVar.f(true);
                                z13 = true;
                                i11 = i10;
                                z14 = false;
                            } else {
                                ak.b.z(e10, list);
                                throw e10;
                            }
                        } catch (RouteException e11) {
                            List list3 = list;
                            if (c(e11.getLastConnectException(), eVar, request, false)) {
                                list2 = m.z0(list3, e11.getFirstConnectException());
                                eVar.f(true);
                                z13 = true;
                                z14 = false;
                                i11 = i10;
                            } else {
                                IOException firstConnectException = e11.getFirstConnectException();
                                ak.b.z(firstConnectException, list3);
                                throw firstConnectException;
                            }
                        }
                        if (request == null) {
                            if (cVar != null && cVar.f23272e) {
                                if (!eVar.f23302k) {
                                    eVar.f23302k = true;
                                    eVar.f23297f.i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            eVar.f(false);
                            return xVar;
                        }
                        z zVar = xVar.f23447g;
                        if (zVar != null) {
                            ak.b.c(zVar);
                        }
                        i11 = i10 + 1;
                        if (i11 <= 20) {
                            eVar.f(true);
                            list2 = list;
                            z14 = true;
                            z13 = true;
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.g.h(Integer.valueOf(i11), "Too many follow-up requests: "));
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th2) {
                    eVar.f(true);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public final t b(x xVar, okhttp3.internal.connection.c cVar) {
        a0 a0Var;
        String b10;
        p.a aVar;
        p a10;
        okhttp3.internal.connection.f fVar;
        w wVar = null;
        if (cVar == null || (fVar = cVar.f23274g) == null) {
            a0Var = null;
        } else {
            a0Var = fVar.f23314b;
        }
        int i10 = xVar.f23444d;
        String str = xVar.f23442a.f23429b;
        boolean z10 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 != 421) {
                    if (i10 != 503) {
                        if (i10 != 407) {
                            if (i10 != 408) {
                                switch (i10) {
                                    case OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT /* 300 */:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f5707a.f23387f) {
                                return null;
                            } else {
                                x xVar2 = xVar.f23450j;
                                if ((xVar2 != null && xVar2.f23444d == 408) || d(xVar, 0) > 0) {
                                    return null;
                                }
                                return xVar.f23442a;
                            }
                        } else {
                            kotlin.jvm.internal.g.b(a0Var);
                            if (a0Var.f23134b.type() == Proxy.Type.HTTP) {
                                this.f5707a.f23395n.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        x xVar3 = xVar.f23450j;
                        if ((xVar3 != null && xVar3.f23444d == 503) || d(xVar, Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0) {
                            return null;
                        }
                        return xVar.f23442a;
                    }
                } else if (cVar == null || !(!kotlin.jvm.internal.g.a(cVar.c.f23285b.f23130i.f23366d, cVar.f23274g.f23314b.f23133a.f23130i.f23366d))) {
                    return null;
                } else {
                    okhttp3.internal.connection.f fVar2 = cVar.f23274g;
                    synchronized (fVar2) {
                        fVar2.f23322k = true;
                    }
                    return xVar.f23442a;
                }
            } else {
                this.f5707a.f23388g.getClass();
                return null;
            }
        }
        s sVar = this.f5707a;
        if (!sVar.f23389h || (b10 = x.b(xVar, "Location")) == null) {
            return null;
        }
        t tVar = xVar.f23442a;
        p pVar = tVar.f23428a;
        pVar.getClass();
        try {
            aVar = new p.a();
            aVar.d(pVar, b10);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar == null) {
            a10 = null;
        } else {
            a10 = aVar.a();
        }
        if (a10 == null) {
            return null;
        }
        if (!kotlin.jvm.internal.g.a(a10.f23364a, tVar.f23428a.f23364a) && !sVar.f23390i) {
            return null;
        }
        t.a aVar2 = new t.a(tVar);
        if (o9.d.u(str)) {
            boolean a11 = kotlin.jvm.internal.g.a(str, "PROPFIND");
            int i11 = xVar.f23444d;
            if (a11 || i11 == 308 || i11 == 307) {
                z10 = true;
            }
            if ((true ^ kotlin.jvm.internal.g.a(str, "PROPFIND")) && i11 != 308 && i11 != 307) {
                aVar2.d("GET", null);
            } else {
                if (z10) {
                    wVar = tVar.f23430d;
                }
                aVar2.d(str, wVar);
            }
            if (!z10) {
                aVar2.c.f("Transfer-Encoding");
                aVar2.c.f("Content-Length");
                aVar2.c.f("Content-Type");
            }
        }
        if (!ak.b.a(tVar.f23428a, a10)) {
            aVar2.c.f("Authorization");
        }
        aVar2.f23433a = a10;
        return aVar2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.io.IOException r3, okhttp3.internal.connection.e r4, okhttp3.t r5, boolean r6) {
        /*
            r2 = this;
            okhttp3.s r5 = r2.f5707a
            boolean r5 = r5.f23387f
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            if (r6 == 0) goto Lf
            boolean r5 = r3 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto Lf
            return r0
        Lf:
            boolean r5 = r3 instanceof java.net.ProtocolException
            r1 = 1
            if (r5 == 0) goto L15
            goto L31
        L15:
            boolean r5 = r3 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L20
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L31
            if (r6 != 0) goto L31
            goto L33
        L20:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L2d
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L2d
            goto L31
        L2d:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L37
            return r0
        L37:
            okhttp3.internal.connection.d r3 = r4.f23300i
            kotlin.jvm.internal.g.b(r3)
            int r4 = r3.f23289g
            if (r4 != 0) goto L4b
            int r5 = r3.f23290h
            if (r5 != 0) goto L4b
            int r5 = r3.f23291i
            if (r5 != 0) goto L4b
            r3 = r0
            goto La3
        L4b:
            okhttp3.a0 r5 = r3.f23292j
            if (r5 == 0) goto L50
            goto L9d
        L50:
            if (r4 > r1) goto L82
            int r4 = r3.f23290h
            if (r4 > r1) goto L82
            int r4 = r3.f23291i
            if (r4 <= 0) goto L5b
            goto L82
        L5b:
            okhttp3.internal.connection.e r4 = r3.c
            okhttp3.internal.connection.f r4 = r4.f23301j
            if (r4 != 0) goto L62
            goto L82
        L62:
            monitor-enter(r4)
            int r5 = r4.f23323l     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L69
            monitor-exit(r4)
            goto L82
        L69:
            okhttp3.a0 r5 = r4.f23314b     // Catch: java.lang.Throwable -> L7f
            okhttp3.a r5 = r5.f23133a     // Catch: java.lang.Throwable -> L7f
            okhttp3.p r5 = r5.f23130i     // Catch: java.lang.Throwable -> L7f
            okhttp3.a r6 = r3.f23285b     // Catch: java.lang.Throwable -> L7f
            okhttp3.p r6 = r6.f23130i     // Catch: java.lang.Throwable -> L7f
            boolean r5 = ak.b.a(r5, r6)     // Catch: java.lang.Throwable -> L7f
            if (r5 != 0) goto L7b
            monitor-exit(r4)
            goto L82
        L7b:
            okhttp3.a0 r5 = r4.f23314b     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r4)
            goto L83
        L7f:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L82:
            r5 = 0
        L83:
            if (r5 == 0) goto L88
            r3.f23292j = r5
            goto L9d
        L88:
            okhttp3.internal.connection.i$a r4 = r3.f23287e
            if (r4 != 0) goto L8d
            goto L95
        L8d:
            boolean r4 = r4.a()
            if (r4 != r1) goto L95
            r4 = r1
            goto L96
        L95:
            r4 = r0
        L96:
            if (r4 == 0) goto L99
            goto L9d
        L99:
            okhttp3.internal.connection.i r3 = r3.f23288f
            if (r3 != 0) goto L9f
        L9d:
            r3 = r1
            goto La3
        L9f:
            boolean r3 = r3.a()
        La3:
            if (r3 != 0) goto La6
            return r0
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.h.c(java.io.IOException, okhttp3.internal.connection.e, okhttp3.t, boolean):boolean");
    }
}
