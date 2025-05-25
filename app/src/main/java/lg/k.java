package lg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Dispatcher.kt */
/* loaded from: classes.dex */
public final class k extends CoroutineDispatcher {
    public static final k c = new k();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        b bVar = b.f20584d;
        bVar.c.b(runnable, j.f20595h, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void o(CoroutineContext coroutineContext, Runnable runnable) {
        b bVar = b.f20584d;
        bVar.c.b(runnable, j.f20595h, true);
    }
}
