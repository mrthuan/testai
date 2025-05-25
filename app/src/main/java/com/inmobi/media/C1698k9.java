package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* renamed from: com.inmobi.media.k9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1698k9 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object obj;
        Picasso picasso;
        WeakReference a10;
        List list;
        List list2;
        Picasso picasso2;
        Picasso picasso3;
        kotlin.jvm.internal.g.e(activity, "activity");
        obj = C1712l9.c;
        synchronized (obj) {
            picasso = C1712l9.f15291b;
            if (picasso != null && (a10 = C1712l9.a(C1712l9.f15290a, activity)) != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                list = C1712l9.f15292d;
                list.remove(a10);
                list2 = C1712l9.f15292d;
                if (list2.isEmpty()) {
                    kotlin.jvm.internal.g.d(C1712l9.d(), "access$getTAG$p(...)");
                    picasso2 = C1712l9.f15291b;
                    Objects.toString(picasso2);
                    picasso3 = C1712l9.f15291b;
                    if (picasso3 != null) {
                        picasso3.shutdown();
                    }
                    C1712l9.f15291b = null;
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
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
