package r;

import android.os.Looper;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f29426b;
    public static final a c = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f29427a = new c();

    public static b m() {
        if (f29426b != null) {
            return f29426b;
        }
        synchronized (b.class) {
            if (f29426b == null) {
                f29426b = new b();
            }
        }
        return f29426b;
    }

    public final boolean n() {
        this.f29427a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void o(Runnable runnable) {
        c cVar = this.f29427a;
        if (cVar.c == null) {
            synchronized (cVar.f29428a) {
                if (cVar.c == null) {
                    cVar.c = c.m(Looper.getMainLooper());
                }
            }
        }
        cVar.c.post(runnable);
    }
}
