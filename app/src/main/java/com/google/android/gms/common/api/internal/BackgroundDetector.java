package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final BackgroundDetector f10932e = new BackgroundDetector();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f10933a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f10934b = new AtomicBoolean();
    public final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f10935d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z10);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    public static void b(Application application) {
        BackgroundDetector backgroundDetector = f10932e;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f10935d) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f10935d = true;
            }
        }
    }

    @KeepForSdk
    public final void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f10932e) {
            this.c.add(backgroundStateChangeListener);
        }
    }

    public final void c(boolean z10) {
        synchronized (f10932e) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f10934b;
        boolean compareAndSet = this.f10933a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f10934b;
        boolean compareAndSet = this.f10933a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f10933a.compareAndSet(false, true)) {
            this.f10934b.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
