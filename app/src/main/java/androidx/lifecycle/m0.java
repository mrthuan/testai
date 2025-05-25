package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import n1.a;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f4064a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4065b;
    public final n1.a c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class a extends c {
        public static a c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f4066b;

        public a(Application application) {
            this.f4066b = application;
        }

        @Override // androidx.lifecycle.m0.c, androidx.lifecycle.m0.b
        public final <T extends j0> T a(Class<T> cls) {
            Application application = this.f4066b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.m0.c, androidx.lifecycle.m0.b
        public final j0 b(Class cls, n1.c cVar) {
            if (this.f4066b != null) {
                return a(cls);
            }
            Application application = (Application) cVar.f22313a.get(l0.f4062a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends j0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    kotlin.jvm.internal.g.d(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public interface b {
        <T extends j0> T a(Class<T> cls);

        j0 b(Class cls, n1.c cVar);
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f4067a;

        @Override // androidx.lifecycle.m0.b
        public <T extends j0> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.g.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // androidx.lifecycle.m0.b
        public j0 b(Class cls, n1.c cVar) {
            return a(cls);
        }
    }

    public m0(o0 store, b factory, n1.a defaultCreationExtras) {
        kotlin.jvm.internal.g.e(store, "store");
        kotlin.jvm.internal.g.e(factory, "factory");
        kotlin.jvm.internal.g.e(defaultCreationExtras, "defaultCreationExtras");
        this.f4064a = store;
        this.f4065b = factory;
        this.c = defaultCreationExtras;
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, String key) {
        j0 viewModel;
        d dVar;
        kotlin.jvm.internal.g.e(key, "key");
        o0 o0Var = this.f4064a;
        o0Var.getClass();
        j0 j0Var = (j0) o0Var.f4069a.get(key);
        boolean isInstance = cls.isInstance(j0Var);
        b bVar = this.f4065b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                kotlin.jvm.internal.g.b(j0Var);
                dVar.c(j0Var);
            }
            kotlin.jvm.internal.g.c(j0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return j0Var;
        }
        n1.c cVar = new n1.c(this.c);
        cVar.f22313a.put(n0.f4068a, key);
        try {
            viewModel = bVar.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            viewModel = bVar.a(cls);
        }
        kotlin.jvm.internal.g.e(viewModel, "viewModel");
        j0 j0Var2 = (j0) o0Var.f4069a.put(key, viewModel);
        if (j0Var2 != null) {
            j0Var2.b();
        }
        return viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(o0 store, b bVar) {
        this(store, bVar, a.C0298a.f22314b);
        kotlin.jvm.internal.g.e(store, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m0(androidx.lifecycle.p0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g.e(r4, r0)
            androidx.lifecycle.o0 r0 = r4.getViewModelStore()
            boolean r1 = r4 instanceof androidx.lifecycle.j
            if (r1 == 0) goto L15
            r2 = r4
            androidx.lifecycle.j r2 = (androidx.lifecycle.j) r2
            androidx.lifecycle.m0$b r2 = r2.getDefaultViewModelProviderFactory()
            goto L25
        L15:
            androidx.lifecycle.m0$c r2 = androidx.lifecycle.m0.c.f4067a
            if (r2 != 0) goto L20
            androidx.lifecycle.m0$c r2 = new androidx.lifecycle.m0$c
            r2.<init>()
            androidx.lifecycle.m0.c.f4067a = r2
        L20:
            androidx.lifecycle.m0$c r2 = androidx.lifecycle.m0.c.f4067a
            kotlin.jvm.internal.g.b(r2)
        L25:
            if (r1 == 0) goto L2e
            androidx.lifecycle.j r4 = (androidx.lifecycle.j) r4
            n1.a r4 = r4.getDefaultViewModelCreationExtras()
            goto L30
        L2e:
            n1.a$a r4 = n1.a.C0298a.f22314b
        L30:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m0.<init>(androidx.lifecycle.p0):void");
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class d {
        public void c(j0 j0Var) {
        }
    }
}
