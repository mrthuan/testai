package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements n {

    /* renamed from: a  reason: collision with root package name */
    public final String f4014a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f4015b;
    public boolean c;

    public SavedStateHandleController(e0 e0Var, String str) {
        this.f4014a = str;
        this.f4015b = e0Var;
    }

    public final void c(Lifecycle lifecycle, androidx.savedstate.a registry) {
        kotlin.jvm.internal.g.e(registry, "registry");
        kotlin.jvm.internal.g.e(lifecycle, "lifecycle");
        if (!this.c) {
            this.c = true;
            lifecycle.a(this);
            registry.c(this.f4014a, this.f4015b.f4042e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c = false;
            pVar.getLifecycle().c(this);
        }
    }
}
