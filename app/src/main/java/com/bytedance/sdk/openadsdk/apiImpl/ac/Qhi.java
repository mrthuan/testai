package com.bytedance.sdk.openadsdk.apiImpl.ac;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: PAGAppOpenAdListenerAdapter.java */
/* loaded from: classes.dex */
public class Qhi implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener Qhi;

    public Qhi(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.Qhi = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
    public void onError(final int i10, final String str) {
        if (this.Qhi == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.ac.Qhi.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.ac.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
