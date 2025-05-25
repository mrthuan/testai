package ha;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class h<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledFuture<?> f18136h;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public class a implements b<V> {
        public a() {
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public h(c<V> cVar) {
        this.f18136h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void b() {
        boolean z10;
        ScheduledFuture<?> scheduledFuture = this.f18136h;
        Object obj = this.f2734a;
        if ((obj instanceof AbstractResolvableFuture.b) && ((AbstractResolvableFuture.b) obj).f2738a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f18136h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f18136h.getDelay(timeUnit);
    }
}
