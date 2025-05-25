package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class g0 extends m0.d implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f4046a;

    /* renamed from: b  reason: collision with root package name */
    public final m0.a f4047b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f4048d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.savedstate.a f4049e;

    @SuppressLint({"LambdaLast"})
    public g0(Application application, z1.c owner, Bundle bundle) {
        m0.a aVar;
        kotlin.jvm.internal.g.e(owner, "owner");
        this.f4049e = owner.getSavedStateRegistry();
        this.f4048d = owner.getLifecycle();
        this.c = bundle;
        this.f4046a = application;
        if (application != null) {
            if (m0.a.c == null) {
                m0.a.c = new m0.a(application);
            }
            aVar = m0.a.c;
            kotlin.jvm.internal.g.b(aVar);
        } else {
            aVar = new m0.a(null);
        }
        this.f4047b = aVar;
    }

    @Override // androidx.lifecycle.m0.b
    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.m0.b
    public final j0 b(Class cls, n1.c cVar) {
        Constructor a10;
        n0 n0Var = n0.f4068a;
        LinkedHashMap linkedHashMap = cVar.f22313a;
        String str = (String) linkedHashMap.get(n0Var);
        if (str != null) {
            if (linkedHashMap.get(SavedStateHandleSupport.f4016a) != null && linkedHashMap.get(SavedStateHandleSupport.f4017b) != null) {
                Application application = (Application) linkedHashMap.get(l0.f4062a);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = h0.a(h0.f4050a, cls);
                } else {
                    a10 = h0.a(h0.f4051b, cls);
                }
                if (a10 == null) {
                    return this.f4047b.b(cls, cVar);
                }
                if (isAssignableFrom && application != null) {
                    return h0.b(cls, a10, application, SavedStateHandleSupport.a(cVar));
                }
                return h0.b(cls, a10, SavedStateHandleSupport.a(cVar));
            } else if (this.f4048d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.m0.d
    public final void c(j0 j0Var) {
        Lifecycle lifecycle = this.f4048d;
        if (lifecycle != null) {
            androidx.savedstate.a aVar = this.f4049e;
            kotlin.jvm.internal.g.b(aVar);
            k.a(j0Var, aVar, lifecycle);
        }
    }

    public final j0 d(Class cls, String str) {
        Constructor a10;
        j0 b10;
        Lifecycle lifecycle = this.f4048d;
        if (lifecycle != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Application application = this.f4046a;
            if (isAssignableFrom && application != null) {
                a10 = h0.a(h0.f4050a, cls);
            } else {
                a10 = h0.a(h0.f4051b, cls);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f4047b.a(cls);
                }
                if (m0.c.f4067a == null) {
                    m0.c.f4067a = new m0.c();
                }
                m0.c cVar = m0.c.f4067a;
                kotlin.jvm.internal.g.b(cVar);
                return cVar.a(cls);
            }
            androidx.savedstate.a aVar = this.f4049e;
            kotlin.jvm.internal.g.b(aVar);
            Bundle a11 = aVar.a(str);
            Class<? extends Object>[] clsArr = e0.f4038f;
            e0 a12 = e0.a.a(a11, this.c);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(a12, str);
            savedStateHandleController.c(lifecycle, aVar);
            Lifecycle.State b11 = lifecycle.b();
            if (b11 != Lifecycle.State.INITIALIZED && !b11.isAtLeast(Lifecycle.State.STARTED)) {
                lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, aVar));
            } else {
                aVar.d();
            }
            if (isAssignableFrom && application != null) {
                b10 = h0.b(cls, a10, application, a12);
            } else {
                b10 = h0.b(cls, a10, a12);
            }
            b10.c(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
            return b10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
