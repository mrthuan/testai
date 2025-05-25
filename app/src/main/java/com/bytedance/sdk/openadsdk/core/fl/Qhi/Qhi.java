package com.bytedance.sdk.openadsdk.core.fl.Qhi;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityLifecycleCallbackForSec.java */
/* loaded from: classes.dex */
public class Qhi implements Application.ActivityLifecycleCallbacks {
    private static volatile Qhi Qhi;
    private final cJ cJ;

    private Qhi(Application application) {
        this.cJ = cJ.Qhi(application);
    }

    public static Qhi Qhi(Application application) {
        if (Qhi == null) {
            synchronized (Qhi.class) {
                if (Qhi == null) {
                    Qhi = new Qhi(application);
                    application.registerActivityLifecycleCallbacks(Qhi);
                }
            }
        }
        return Qhi;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        cJ cJVar = this.cJ;
        if (cJVar != null) {
            cJVar.Qhi(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        cJ cJVar = this.cJ;
        if (cJVar != null) {
            cJVar.cJ(activity);
        }
    }

    public String Qhi(String str, long j10, int i10) {
        cJ cJVar = this.cJ;
        return cJVar != null ? cJVar.Qhi(str, j10, i10) : "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
