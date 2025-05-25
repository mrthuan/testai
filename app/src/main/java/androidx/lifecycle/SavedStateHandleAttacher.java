package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements n {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateHandlesProvider f4013a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f4013a = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        boolean z10;
        if (event == Lifecycle.Event.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pVar.getLifecycle().c(this);
            SavedStateHandlesProvider savedStateHandlesProvider = this.f4013a;
            if (!savedStateHandlesProvider.f4019b) {
                savedStateHandlesProvider.c = savedStateHandlesProvider.f4018a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                savedStateHandlesProvider.f4019b = true;
                f0 f0Var = (f0) savedStateHandlesProvider.f4020d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
