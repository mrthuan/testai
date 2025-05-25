package com.bytedance.sdk.openadsdk.apiImpl.Qhi;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGBannerAdListenerAdapter.java */
/* loaded from: classes.dex */
public class Qhi implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener Qhi;

    public Qhi(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.Qhi = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                Qhi.this.Qhi.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: Qhi */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Qhi.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                Qhi.this.Qhi.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
