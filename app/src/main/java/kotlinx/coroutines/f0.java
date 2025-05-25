package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Builders.common.kt */
/* loaded from: classes.dex */
public final class f0<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20048e = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_decision");
    private volatile int _decision;

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.c1
    public final void C(Object obj) {
        D(obj);
    }

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.c1
    public final void D(Object obj) {
        boolean z10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20048e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            z10 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        ge.a.O(com.google.android.play.core.assetpacks.b1.L(this.f20196d), s.a(obj), null);
    }
}
