package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.internal.connection.e;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f23331a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23332b;
    public final bk.c c;

    /* renamed from: d  reason: collision with root package name */
    public final g f23333d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue<f> f23334e;

    public h(bk.d taskRunner, TimeUnit timeUnit) {
        kotlin.jvm.internal.g.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.g.e(timeUnit, "timeUnit");
        this.f23331a = 5;
        this.f23332b = timeUnit.toNanos(5L);
        this.c = taskRunner.f();
        this.f23333d = new g(this, kotlin.jvm.internal.g.h(" ConnectionPool", ak.b.f670g));
        this.f23334e = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(okhttp3.a address, e call, List<a0> list, boolean z10) {
        kotlin.jvm.internal.g.e(address, "address");
        kotlin.jvm.internal.g.e(call, "call");
        Iterator<f> it = this.f23334e.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            f connection = it.next();
            kotlin.jvm.internal.g.d(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (connection.f23318g != null) {
                        z11 = true;
                    }
                    if (!z11) {
                        tf.d dVar = tf.d.f30009a;
                    }
                }
                if (connection.i(address, list)) {
                    call.c(connection);
                    return true;
                }
                tf.d dVar2 = tf.d.f30009a;
            }
        }
    }

    public final int b(f fVar, long j10) {
        byte[] bArr = ak.b.f665a;
        ArrayList arrayList = fVar.f23327p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                gk.h hVar = gk.h.f17912a;
                gk.h.f17912a.j(((e.b) reference).f23312a, "A connection to " + fVar.f23314b.f23133a.f23130i + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i10);
                fVar.f23321j = true;
                if (arrayList.isEmpty()) {
                    fVar.f23328q = j10 - this.f23332b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
