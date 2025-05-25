package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* compiled from: InitLifecycleHelper.java */
/* loaded from: classes.dex */
public class pA {
    private final com.bytedance.sdk.openadsdk.utils.Qhi Qhi = new com.bytedance.sdk.openadsdk.utils.Qhi();
    private boolean cJ;

    /* compiled from: InitLifecycleHelper.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private static final pA Qhi = new pA();
    }

    public static pA Qhi() {
        return Qhi.Qhi;
    }

    public boolean CJ() {
        return this.Qhi.Qhi();
    }

    public boolean ac() {
        return this.cJ;
    }

    public void cJ() {
        try {
            Context Qhi2 = HzH.Qhi();
            if (Qhi2 instanceof Application) {
                ((Application) Qhi2).registerActivityLifecycleCallbacks(this.Qhi);
                this.cJ = true;
            } else if (Qhi2 != null && Qhi2.getApplicationContext() != null) {
                ((Application) Qhi2.getApplicationContext()).registerActivityLifecycleCallbacks(this.Qhi);
                this.cJ = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }

    public com.bytedance.sdk.openadsdk.utils.Qhi fl() {
        return this.Qhi;
    }

    public boolean Qhi(boolean z10) {
        return this.Qhi.Qhi(z10);
    }
}
