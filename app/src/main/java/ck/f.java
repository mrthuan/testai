package ck;

import java.util.List;
import okhttp3.q;
import okhttp3.t;
import okhttp3.x;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.internal.connection.e f5697a;

    /* renamed from: b  reason: collision with root package name */
    public final List<q> f5698b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final okhttp3.internal.connection.c f5699d;

    /* renamed from: e  reason: collision with root package name */
    public final t f5700e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5701f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5702g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5703h;

    /* renamed from: i  reason: collision with root package name */
    public int f5704i;

    /* JADX WARN: Multi-variable type inference failed */
    public f(okhttp3.internal.connection.e call, List<? extends q> interceptors, int i10, okhttp3.internal.connection.c cVar, t request, int i11, int i12, int i13) {
        kotlin.jvm.internal.g.e(call, "call");
        kotlin.jvm.internal.g.e(interceptors, "interceptors");
        kotlin.jvm.internal.g.e(request, "request");
        this.f5697a = call;
        this.f5698b = interceptors;
        this.c = i10;
        this.f5699d = cVar;
        this.f5700e = request;
        this.f5701f = i11;
        this.f5702g = i12;
        this.f5703h = i13;
    }

    public static f b(f fVar, int i10, okhttp3.internal.connection.c cVar, t tVar, int i11) {
        int i12;
        int i13;
        int i14;
        if ((i11 & 1) != 0) {
            i10 = fVar.c;
        }
        int i15 = i10;
        if ((i11 & 2) != 0) {
            cVar = fVar.f5699d;
        }
        okhttp3.internal.connection.c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            tVar = fVar.f5700e;
        }
        t request = tVar;
        if ((i11 & 8) != 0) {
            i12 = fVar.f5701f;
        } else {
            i12 = 0;
        }
        if ((i11 & 16) != 0) {
            i13 = fVar.f5702g;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            i14 = fVar.f5703h;
        } else {
            i14 = 0;
        }
        fVar.getClass();
        kotlin.jvm.internal.g.e(request, "request");
        return new f(fVar.f5697a, fVar.f5698b, i15, cVar2, request, i12, i13, i14);
    }

    public final okhttp3.internal.connection.f a() {
        okhttp3.internal.connection.c cVar = this.f5699d;
        if (cVar == null) {
            return null;
        }
        return cVar.f23274g;
    }

    public final x c(t request) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.g.e(request, "request");
        List<q> list = this.f5698b;
        int size = list.size();
        boolean z13 = false;
        int i10 = this.c;
        if (i10 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5704i++;
            okhttp3.internal.connection.c cVar = this.f5699d;
            if (cVar != null) {
                if (cVar.c.b(request.f23428a)) {
                    if (this.f5704i == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
                }
            }
            int i11 = i10 + 1;
            f b10 = b(this, i11, null, request, 58);
            q qVar = list.get(i10);
            x a10 = qVar.a(b10);
            if (a10 != null) {
                if (cVar != null) {
                    if (i11 < list.size() && b10.f5704i != 1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.f23447g != null) {
                    z13 = true;
                }
                if (z13) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
