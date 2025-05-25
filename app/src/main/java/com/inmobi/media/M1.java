package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class M1 implements K2, Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final String f14448a;

    /* renamed from: b  reason: collision with root package name */
    public final I1 f14449b;
    public final A9 c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14450d;

    /* renamed from: e  reason: collision with root package name */
    public final N2 f14451e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f14452f;

    public M1(String urlToLoad, Context context, I1 i12, A9 redirectionValidator, String api) {
        kotlin.jvm.internal.g.e(urlToLoad, "urlToLoad");
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.g.e(api, "api");
        this.f14448a = urlToLoad;
        this.f14449b = i12;
        this.c = redirectionValidator;
        this.f14450d = api;
        N2 n22 = new N2();
        this.f14451e = n22;
        n22.c = this;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.g.d(applicationContext, "getApplicationContext(...)");
        this.f14452f = applicationContext;
        Ha.a(context, this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        N2 n22 = this.f14451e;
        Context context = this.f14452f;
        n22.getClass();
        kotlin.jvm.internal.g.e(context, "context");
        L2 l22 = n22.f14516b;
        if (l22 != null) {
            context.unbindService(l22);
            n22.f14515a = null;
        }
        n22.f14516b = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
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
    }
}
