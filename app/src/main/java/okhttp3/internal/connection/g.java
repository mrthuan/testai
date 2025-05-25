package okhttp3.internal.connection;

import java.net.Socket;
import java.util.Iterator;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class g extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f23330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str) {
        super(str, true);
        this.f23330e = hVar;
    }

    @Override // bk.a
    public final long a() {
        h hVar = this.f23330e;
        long nanoTime = System.nanoTime();
        Iterator<f> it = hVar.f23334e.iterator();
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f connection = it.next();
            kotlin.jvm.internal.g.d(connection, "connection");
            synchronized (connection) {
                if (hVar.b(connection, nanoTime) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j11 = nanoTime - connection.f23328q;
                    if (j11 > j10) {
                        fVar = connection;
                        j10 = j11;
                    }
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }
        long j12 = hVar.f23332b;
        if (j10 < j12 && i10 <= hVar.f23331a) {
            if (i10 > 0) {
                return j12 - j10;
            }
            if (i11 <= 0) {
                return -1L;
            }
            return j12;
        }
        kotlin.jvm.internal.g.b(fVar);
        synchronized (fVar) {
            if (!(!fVar.f23327p.isEmpty())) {
                if (fVar.f23328q + j10 == nanoTime) {
                    fVar.f23321j = true;
                    hVar.f23334e.remove(fVar);
                    Socket socket = fVar.f23315d;
                    kotlin.jvm.internal.g.b(socket);
                    ak.b.d(socket);
                    if (hVar.f23334e.isEmpty()) {
                        hVar.c.a();
                    }
                }
            }
        }
        return 0L;
    }
}
