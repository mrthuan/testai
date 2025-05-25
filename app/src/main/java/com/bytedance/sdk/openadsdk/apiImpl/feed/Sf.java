package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGNativeFeedAdWrapperListenerImpl.java */
/* loaded from: classes.dex */
public class Sf implements ROR {
    private final PAGNativeAdInteractionListener Qhi;

    public Sf(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.Qhi = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ROR
    public boolean cJ() {
        if (this.Qhi != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Sf.1
            @Override // java.lang.Runnable
            public void run() {
                if (Sf.this.Qhi != null) {
                    Sf.this.Qhi.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ROR
    public void Qhi(PAGNativeAd pAGNativeAd) {
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Sf.2
            @Override // java.lang.Runnable
            public void run() {
                if (Sf.this.Qhi != null) {
                    Sf.this.Qhi.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ROR
    public void Qhi() {
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Sf.3
            @Override // java.lang.Runnable
            public void run() {
                if (Sf.this.Qhi != null) {
                    Sf.this.Qhi.onAdDismissed();
                }
            }
        });
    }
}
