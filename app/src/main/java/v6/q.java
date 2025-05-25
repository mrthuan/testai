package v6;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f30724a;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f30725a;

        public a(Runnable runnable) {
            this.f30725a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f30725a.run();
            } catch (Exception unused) {
                Log.isLoggable(z6.a.b("Executor"), 6);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f30724a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30724a.execute(new a(runnable));
    }
}
