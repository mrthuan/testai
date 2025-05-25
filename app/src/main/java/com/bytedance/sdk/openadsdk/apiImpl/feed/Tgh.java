package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGNativeAdLoadListenerAdapter.java */
/* loaded from: classes.dex */
public class Tgh implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener Qhi;

    public Tgh(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.Qhi = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Tgh.1
            @Override // java.lang.Runnable
            public void run() {
                Tgh.this.Qhi.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.Tgh.2
            @Override // java.lang.Runnable
            public void run() {
                Tgh.this.Qhi.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
