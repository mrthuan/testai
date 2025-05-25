package lg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Dispatcher.kt */
/* loaded from: classes.dex */
public class e extends q0 {
    public final CoroutineScheduler c;

    public e(int i10, int i11, long j10, String str) {
        this.c = new CoroutineScheduler(i10, i11, j10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f20232h;
        this.c.b(runnable, j.f20594g, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void o(CoroutineContext coroutineContext, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f20232h;
        this.c.b(runnable, j.f20594g, true);
    }
}
