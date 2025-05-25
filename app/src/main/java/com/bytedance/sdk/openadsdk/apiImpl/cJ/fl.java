package com.bytedance.sdk.openadsdk.apiImpl.CJ;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PARewardedAdListenerAdapter.java */
/* loaded from: classes.dex */
public class fl implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener Qhi;

    public fl(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.Qhi = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.CJ.fl.1
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.CJ.fl.2
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
