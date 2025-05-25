package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import n1.a;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4016a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f4017b = new c();
    public static final a c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class c {
    }

    public static final e0 a(n1.c cVar) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        Bundle bundle;
        b bVar = f4016a;
        LinkedHashMap linkedHashMap = cVar.f22313a;
        z1.c cVar2 = (z1.c) linkedHashMap.get(bVar);
        if (cVar2 != null) {
            p0 p0Var = (p0) linkedHashMap.get(f4017b);
            if (p0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(c);
                String str = (String) linkedHashMap.get(n0.f4068a);
                if (str != null) {
                    a.b b10 = cVar2.getSavedStateRegistry().b();
                    if (b10 instanceof SavedStateHandlesProvider) {
                        savedStateHandlesProvider = (SavedStateHandlesProvider) b10;
                    } else {
                        savedStateHandlesProvider = null;
                    }
                    if (savedStateHandlesProvider != null) {
                        LinkedHashMap linkedHashMap2 = c(p0Var).f4045d;
                        e0 e0Var = (e0) linkedHashMap2.get(str);
                        if (e0Var == null) {
                            Class<? extends Object>[] clsArr = e0.f4038f;
                            boolean z10 = true;
                            if (!savedStateHandlesProvider.f4019b) {
                                savedStateHandlesProvider.c = savedStateHandlesProvider.f4018a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                savedStateHandlesProvider.f4019b = true;
                                f0 f0Var = (f0) savedStateHandlesProvider.f4020d.getValue();
                            }
                            Bundle bundle3 = savedStateHandlesProvider.c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = savedStateHandlesProvider.c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = savedStateHandlesProvider.c;
                            if ((bundle5 == null || !bundle5.isEmpty()) ? false : false) {
                                savedStateHandlesProvider.c = null;
                            }
                            e0 a10 = e0.a.a(bundle, bundle2);
                            linkedHashMap2.put(str, a10);
                            return a10;
                        }
                        return e0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends z1.c & p0> void b(T t4) {
        boolean z10;
        kotlin.jvm.internal.g.e(t4, "<this>");
        Lifecycle.State b10 = t4.getLifecycle().b();
        if (b10 != Lifecycle.State.INITIALIZED && b10 != Lifecycle.State.CREATED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (t4.getSavedStateRegistry().b() == null) {
                SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t4.getSavedStateRegistry(), t4);
                t4.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
                t4.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final f0 c(p0 p0Var) {
        n1.a aVar;
        kotlin.jvm.internal.g.e(p0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 initializer = new cg.l<n1.a, f0>() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // cg.l
            public final f0 invoke(n1.a initializer2) {
                kotlin.jvm.internal.g.e(initializer2, "$this$initializer");
                return new f0();
            }
        };
        kotlin.jvm.internal.c a10 = kotlin.jvm.internal.i.a(f0.class);
        kotlin.jvm.internal.g.e(initializer, "initializer");
        Class<?> a11 = a10.a();
        kotlin.jvm.internal.g.c(a11, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new n1.d(a11, initializer));
        n1.d[] dVarArr = (n1.d[]) arrayList.toArray(new n1.d[0]);
        n1.b bVar = new n1.b((n1.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        o0 viewModelStore = p0Var.getViewModelStore();
        if (p0Var instanceof j) {
            aVar = ((j) p0Var).getDefaultViewModelCreationExtras();
        } else {
            aVar = a.C0298a.f22314b;
        }
        return (f0) new m0(viewModelStore, bVar, aVar).b(f0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
