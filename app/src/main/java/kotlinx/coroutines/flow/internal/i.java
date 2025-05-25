package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.p;

/* compiled from: FlowCoroutine.kt */
/* loaded from: classes.dex */
public final class i<T> extends p<T> {
    @Override // kotlinx.coroutines.c1
    public final boolean I(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return E(th2);
    }
}
