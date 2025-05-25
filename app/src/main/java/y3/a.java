package y3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f32039b = TimeUnit.SECONDS.toMillis(10);
    public static volatile int c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f32040a;

    /* compiled from: GlideExecutor.java */
    /* renamed from: y3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0413a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f32041a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f32042b;
        public int c;

        /* compiled from: GlideExecutor.java */
        /* renamed from: y3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0414a extends Thread {
            public C0414a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0413a.this.f32042b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable unused) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        public ThreadFactoryC0413a(String str, boolean z10) {
            this.f32041a = str;
            this.f32042b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            C0414a c0414a;
            c0414a = new C0414a(runnable, "glide-" + this.f32041a + "-thread-" + this.c);
            this.c = this.c + 1;
            return c0414a;
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f32040a = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f32040a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f32040a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f32040a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f32040a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f32040a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f32040a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f32040a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f32040a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f32040a.submit(runnable);
    }

    public final String toString() {
        return this.f32040a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f32040a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f32040a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t4) {
        return this.f32040a.submit(runnable, t4);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f32040a.submit(callable);
    }
}
