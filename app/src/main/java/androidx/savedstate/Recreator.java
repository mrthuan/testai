package androidx.savedstate;

import a6.h;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import z1.c;

/* compiled from: Recreator.kt */
/* loaded from: classes.dex */
public final class Recreator implements n {

    /* renamed from: a  reason: collision with root package name */
    public final c f4658a;

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f4659a;

        public a(androidx.savedstate.a registry) {
            g.e(registry, "registry");
            this.f4659a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4659a));
            return bundle;
        }
    }

    public Recreator(c owner) {
        g.e(owner, "owner");
        this.f4658a = owner;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            pVar.getLifecycle().c(this);
            c cVar = this.f4658a;
            Bundle a10 = cVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0024a.class);
                        g.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                g.d(newInstance, "{\n                constr…wInstance()\n            }");
                                ((a.InterfaceC0024a) newInstance).a(cVar);
                            } catch (Exception e10) {
                                throw new RuntimeException(a0.a.h("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(h.d("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
