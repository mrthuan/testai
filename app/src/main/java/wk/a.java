package wk;

import java.util.logging.Level;

/* compiled from: BackgroundPoster.java */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final a2.a f31302a = new a2.a(10);

    /* renamed from: b  reason: collision with root package name */
    public final b f31303b;
    public volatile boolean c;

    public a(b bVar) {
        this.f31303b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                h k10 = this.f31302a.k();
                if (k10 == null) {
                    synchronized (this) {
                        k10 = this.f31302a.j();
                        if (k10 == null) {
                            return;
                        }
                    }
                }
                this.f31303b.d(k10);
            } catch (InterruptedException e10) {
                e eVar = this.f31303b.f31321p;
                Level level = Level.WARNING;
                eVar.b(level, Thread.currentThread().getName() + " was interruppted", e10);
                return;
            } finally {
                this.c = false;
            }
        }
    }
}
