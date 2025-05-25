package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.CoroutineContext;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends l implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Lifecycle f3984a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f3985b;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        kotlin.jvm.internal.g.e(coroutineContext, "coroutineContext");
        this.f3984a = lifecycle;
        this.f3985b = coroutineContext;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            b.b.l(coroutineContext, null);
        }
    }

    public final void c() {
        lg.b bVar = kotlinx.coroutines.j0.f20206a;
        t0.d0(this, kotlinx.coroutines.internal.l.f20194a.v(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2);
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f3984a;
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.c(this);
            b.b.l(this.f3985b, null);
        }
    }

    @Override // kotlinx.coroutines.w
    public final CoroutineContext n() {
        return this.f3985b;
    }
}
