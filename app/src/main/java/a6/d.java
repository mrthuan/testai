package a6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        try {
            com.facebook.d.c().execute(new com.facebook.appevents.a(2));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        try {
            if (kotlin.jvm.internal.g.a(com.facebook.appevents.iap.a.f9536d, Boolean.TRUE) && kotlin.jvm.internal.g.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                com.facebook.d.c().execute(new c(0));
            }
        } catch (Exception unused) {
        }
    }
}
