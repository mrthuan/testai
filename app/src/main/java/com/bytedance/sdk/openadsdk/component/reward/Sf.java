package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGRewardProxyListener.java */
/* loaded from: classes.dex */
public class Sf implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener Qhi;

    public Sf(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.Qhi = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.Qhi != null) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sf.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = Sf.this.Qhi;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi != null) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sf.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = Sf.this.Qhi;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
