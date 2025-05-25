package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.m0;
import java.util.LinkedHashMap;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class x0 implements androidx.lifecycle.j, z1.c, androidx.lifecycle.p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f3955a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.o0 f3956b;
    public final Runnable c;

    /* renamed from: d  reason: collision with root package name */
    public m0.b f3957d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.lifecycle.q f3958e = null;

    /* renamed from: f  reason: collision with root package name */
    public z1.b f3959f = null;

    public x0(Fragment fragment, androidx.lifecycle.o0 o0Var, androidx.activity.b bVar) {
        this.f3955a = fragment;
        this.f3956b = o0Var;
        this.c = bVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f3958e.f(event);
    }

    public final void b() {
        if (this.f3958e == null) {
            this.f3958e = new androidx.lifecycle.q(this);
            z1.b bVar = new z1.b(this);
            this.f3959f = bVar;
            bVar.a();
            this.c.run();
        }
    }

    @Override // androidx.lifecycle.j
    public final n1.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f3955a;
        Context applicationContext = fragment.g0().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        n1.c cVar = new n1.c();
        LinkedHashMap linkedHashMap = cVar.f22313a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.l0.f4062a, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f4016a, fragment);
        linkedHashMap.put(SavedStateHandleSupport.f4017b, this);
        Bundle bundle = fragment.f3674g;
        if (bundle != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.j
    public final m0.b getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f3955a;
        m0.b defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.S)) {
            this.f3957d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f3957d == null) {
            Context applicationContext = fragment.g0().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f3957d = new androidx.lifecycle.g0(application, fragment, fragment.f3674g);
        }
        return this.f3957d;
    }

    @Override // androidx.lifecycle.p
    public final Lifecycle getLifecycle() {
        b();
        return this.f3958e;
    }

    @Override // z1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f3959f.f32217b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 getViewModelStore() {
        b();
        return this.f3956b;
    }
}
