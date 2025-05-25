package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class N0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final L0 f14504a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f14505b;
    public final /* synthetic */ Context c;

    public N0(Context context) {
        this.c = context;
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.g.d(mainLooper, "getMainLooper(...)");
        this.f14504a = new L0(mainLooper);
    }

    public static final void a(Context context, N0 this$0) {
        kotlin.jvm.internal.g.e(context, "$context");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if ((!O0.a(O0.f14537a, context)) && this$0.f14505b == null) {
            this$0.f14504a.sendEmptyMessageDelayed(1001, 3000L);
        }
    }

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
        Activity activity2;
        kotlin.jvm.internal.g.e(activity, "activity");
        WeakReference weakReference = this.f14505b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (!kotlin.jvm.internal.g.a(activity2, activity)) {
            this.f14505b = new WeakReference(activity);
        }
        this.f14504a.removeMessages(1001);
        this.f14504a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Activity activity2;
        kotlin.jvm.internal.g.e(activity, "activity");
        WeakReference weakReference = this.f14505b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (!kotlin.jvm.internal.g.a(activity2, activity)) {
            this.f14505b = new WeakReference(activity);
        }
        this.f14504a.removeMessages(1001);
        this.f14504a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2;
        kotlin.jvm.internal.g.e(activity, "activity");
        WeakReference weakReference = this.f14505b;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (kotlin.jvm.internal.g.a(activity2, activity)) {
            this.f14504a.sendEmptyMessageDelayed(1001, 3000L);
        } else if (this.f14505b == null) {
            Ha.a(new l.r(11, this.c, this));
        }
    }
}
