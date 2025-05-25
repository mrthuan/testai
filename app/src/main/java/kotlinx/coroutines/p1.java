package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: Unconfined.kt */
/* loaded from: classes.dex */
public final class p1 extends CoroutineDispatcher {
    public static final /* synthetic */ int c = 0;

    static {
        new p1();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        t1 t1Var = (t1) coroutineContext.get(t1.c);
        if (t1Var != null) {
            t1Var.f20268b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
