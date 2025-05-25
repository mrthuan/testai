package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.savedstate.a f3979b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(Lifecycle lifecycle, androidx.savedstate.a aVar) {
        this.f3978a = lifecycle;
        this.f3979b = aVar;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f3978a.c(this);
            this.f3979b.d();
        }
    }
}
