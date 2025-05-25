package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.n {
    @Override // androidx.lifecycle.n
    public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_START) {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            throw null;
        }
        throw null;
    }
}
