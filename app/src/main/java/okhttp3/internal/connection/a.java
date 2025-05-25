package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.q;
import okhttp3.s;
import okhttp3.x;

/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23265a = new a();

    @Override // okhttp3.q
    public final x a(ck.f fVar) {
        boolean z10;
        e eVar = fVar.f5697a;
        eVar.getClass();
        synchronized (eVar) {
            if (eVar.f23306o) {
                if (!eVar.f23305n) {
                    if (!eVar.f23304m) {
                        tf.d dVar = tf.d.f30009a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        d dVar2 = eVar.f23300i;
        kotlin.jvm.internal.g.b(dVar2);
        s client = eVar.f23293a;
        kotlin.jvm.internal.g.e(client, "client");
        try {
            int i10 = fVar.f5701f;
            int i11 = fVar.f5702g;
            int i12 = fVar.f5703h;
            boolean z11 = client.f23387f;
            if (!kotlin.jvm.internal.g.a(fVar.f5700e.f23429b, "GET")) {
                z10 = true;
            } else {
                z10 = false;
            }
            c cVar = new c(eVar, eVar.f23296e, dVar2, dVar2.a(i10, i11, i12, z11, z10).k(client, fVar));
            eVar.f23303l = cVar;
            eVar.f23308q = cVar;
            synchronized (eVar) {
                eVar.f23304m = true;
                eVar.f23305n = true;
            }
            if (!eVar.f23307p) {
                return ck.f.b(fVar, 0, cVar, null, 61).c(fVar.f5700e);
            }
            throw new IOException("Canceled");
        } catch (IOException e10) {
            dVar2.c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            dVar2.c(e11.getLastConnectException());
            throw e11;
        }
    }
}
