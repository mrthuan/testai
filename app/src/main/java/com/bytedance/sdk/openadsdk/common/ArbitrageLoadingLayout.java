package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* loaded from: classes.dex */
public class ArbitrageLoadingLayout extends LandingPageLoadingLayout {
    public ArbitrageLoadingLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout
    public void Qhi() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ArbitrageLoadingLayout.1
            @Override // java.lang.Runnable
            public void run() {
                ArbitrageLoadingLayout arbitrageLoadingLayout = ArbitrageLoadingLayout.this;
                if (arbitrageLoadingLayout.Qhi != null) {
                    arbitrageLoadingLayout.setVisibility(0);
                }
            }
        });
    }

    public void Qhi(tP tPVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.cJ();
        }
    }
}
