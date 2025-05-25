package z;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class a<T> implements y9.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<androidx.concurrent.futures.a<T>> f32212a;

    /* renamed from: b  reason: collision with root package name */
    public final C0424a f32213b = new C0424a();

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0424a extends AbstractResolvableFuture<T> {
        public C0424a() {
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture
        public final String f() {
            androidx.concurrent.futures.a<T> aVar = a.this.f32212a.get();
            if (aVar == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            return "tag=[" + aVar.f2749a + "]";
        }
    }

    public a(androidx.concurrent.futures.a<T> aVar) {
        this.f32212a = new WeakReference<>(aVar);
    }

    @Override // y9.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f32213b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        androidx.concurrent.futures.a<T> aVar = this.f32212a.get();
        boolean cancel = this.f32213b.cancel(z10);
        if (cancel && aVar != null) {
            aVar.f2749a = null;
            aVar.f2750b = null;
            aVar.c.h(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f32213b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f32213b.f2734a instanceof AbstractResolvableFuture.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f32213b.isDone();
    }

    public final String toString() {
        return this.f32213b.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j10, TimeUnit timeUnit) {
        return this.f32213b.get(j10, timeUnit);
    }
}
