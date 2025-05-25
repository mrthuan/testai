package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: LegacySavedStateHandleController.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0024a {
        @Override // androidx.savedstate.a.InterfaceC0024a
        public final void a(z1.c owner) {
            LinkedHashMap linkedHashMap;
            kotlin.jvm.internal.g.e(owner, "owner");
            if (owner instanceof p0) {
                o0 viewModelStore = ((p0) owner).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f4069a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = viewModelStore.f4069a;
                    if (!hasNext) {
                        break;
                    }
                    String key = (String) it.next();
                    kotlin.jvm.internal.g.e(key, "key");
                    j0 j0Var = (j0) linkedHashMap.get(key);
                    kotlin.jvm.internal.g.b(j0Var);
                    k.a(j0Var, savedStateRegistry, owner.getLifecycle());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(j0 j0Var, androidx.savedstate.a registry, Lifecycle lifecycle) {
        Object obj;
        kotlin.jvm.internal.g.e(registry, "registry");
        kotlin.jvm.internal.g.e(lifecycle, "lifecycle");
        HashMap hashMap = j0Var.f4056a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = j0Var.f4056a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.c) {
            savedStateHandleController.c(lifecycle, registry);
            Lifecycle.State b10 = lifecycle.b();
            if (b10 != Lifecycle.State.INITIALIZED && !b10.isAtLeast(Lifecycle.State.STARTED)) {
                lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
            } else {
                registry.d();
            }
        }
    }
}
