package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20225b = AtomicIntegerFieldUpdater.newUpdater(p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f20226a;

    public p(boolean z10, Throwable th2) {
        this.f20226a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f20226a + ']';
    }
}
