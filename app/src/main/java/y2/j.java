package y2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public final Executor f32003b;

    /* renamed from: d  reason: collision with root package name */
    public volatile Runnable f32004d;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f32002a = new ArrayDeque<>();
    public final Object c = new Object();

    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final j f32005a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f32006b;

        public a(j jVar, Runnable runnable) {
            this.f32005a = jVar;
            this.f32006b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = this.f32005a;
            try {
                this.f32006b.run();
            } finally {
                jVar.b();
            }
        }
    }

    public j(ExecutorService executorService) {
        this.f32003b = executorService;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.c) {
            if (!this.f32002a.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void b() {
        synchronized (this.c) {
            a poll = this.f32002a.poll();
            this.f32004d = poll;
            if (poll != null) {
                this.f32003b.execute(this.f32004d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.f32002a.add(new a(this, runnable));
            if (this.f32004d == null) {
                b();
            }
        }
    }
}
