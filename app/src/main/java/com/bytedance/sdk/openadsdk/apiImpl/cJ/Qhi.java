package com.bytedance.sdk.openadsdk.apiImpl.cJ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGInterstitialAdListenerAdapter.java */
/* loaded from: classes.dex */
public class Qhi implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener Qhi;

    public Qhi(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.Qhi = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.cJ.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.cJ.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
