package com.bytedance.sdk.openadsdk.component.ac;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGInterstitialProxyListener.java */
/* loaded from: classes.dex */
public class cJ implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener Qhi;

    public cJ(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.Qhi = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.Qhi != null) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ac.cJ.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = cJ.this.Qhi;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi != null) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ac.cJ.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = cJ.this.Qhi;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
