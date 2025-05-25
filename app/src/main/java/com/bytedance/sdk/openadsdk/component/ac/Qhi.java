package com.bytedance.sdk.openadsdk.component.ac;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* compiled from: PAGInterstitialAdWrapper.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ {
    private final PAGInterstitialAdInteractionListener Qhi;

    public Qhi(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.Qhi = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ
    public void Qhi() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Qhi;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ
    public void cJ() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Qhi;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Qhi;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
