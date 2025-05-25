package bk;

import bk.d;
import java.util.logging.Level;
import kotlin.jvm.internal.g;

/* compiled from: TaskRunner.kt */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f5461a;

    public e(d dVar) {
        this.f5461a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c;
        long j10;
        while (true) {
            d dVar = this.f5461a;
            synchronized (dVar) {
                c = dVar.c();
            }
            if (c == null) {
                return;
            }
            c cVar = c.c;
            g.b(cVar);
            d dVar2 = this.f5461a;
            d.b bVar = d.f5451h;
            boolean isLoggable = d.f5453j.isLoggable(Level.FINE);
            if (isLoggable) {
                j10 = cVar.f5446a.f5454a.c();
                b.b.f(c, cVar, "starting");
            } else {
                j10 = -1;
            }
            try {
                d.a(dVar2, c);
                tf.d dVar3 = tf.d.f30009a;
                if (isLoggable) {
                    b.b.f(c, cVar, g.h(b.b.u(cVar.f5446a.f5454a.c() - j10), "finished run in "));
                }
            } catch (Throwable th2) {
                if (isLoggable) {
                    b.b.f(c, cVar, g.h(b.b.u(cVar.f5446a.f5454a.c() - j10), "failed a run in "));
                }
                throw th2;
            }
        }
    }
}
