package ha;

import f0.s;
import ha.h;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledExecutorService.java */
/* loaded from: classes2.dex */
public final class g implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f18134a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f18135b;

    public g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f18134a = executorService;
        this.f18135b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f18134a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18134a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f18134a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f18134a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f18134a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f18134a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new h(new b7.c(this, runnable, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: ha.d
            @Override // ha.h.c
            public final ScheduledFuture a(h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                g gVar = g.this;
                return gVar.f18135b.scheduleAtFixedRate(new androidx.emoji2.text.h(1, gVar, runnable, aVar), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: ha.c
            @Override // ha.h.c
            public final ScheduledFuture a(h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                g gVar = g.this;
                return gVar.f18135b.scheduleWithFixedDelay(new e(0, gVar, runnable, aVar), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f18134a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f18134a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f18134a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: ha.b
            @Override // ha.h.c
            public final ScheduledFuture a(final h.a aVar) {
                final g gVar = g.this;
                gVar.getClass();
                final Callable callable2 = callable;
                return gVar.f18135b.schedule(new Callable() { // from class: ha.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        g gVar2 = g.this;
                        gVar2.getClass();
                        return gVar2.f18134a.submit(new s(6, callable2, aVar));
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t4) {
        return this.f18134a.submit(runnable, t4);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f18134a.submit(runnable);
    }
}
