package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.sDy;

/* compiled from: PAGMrcVisibilityTracker.java */
/* loaded from: classes.dex */
public class ROR {
    public static boolean Qhi(View view, int i10) {
        return Qhi(view, false, i10);
    }

    public static boolean Qhi(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return sDy.Qhi(view, z10 ? 30 : 50, i10);
    }
}
