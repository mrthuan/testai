package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdWrapper.java */
/* loaded from: classes.dex */
public class Tgh implements com.bytedance.sdk.openadsdk.apiImpl.ac.cJ {
    private final PAGAppOpenAdInteractionListener Qhi;
    private final AtomicBoolean cJ = new AtomicBoolean(false);

    public Tgh(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.Qhi = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.ac.cJ
    public void Qhi() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.Qhi;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.ac.cJ
    public void ac() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (!this.cJ.getAndSet(true) && (pAGAppOpenAdInteractionListener = this.Qhi) != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.ac.cJ
    public void cJ() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.Qhi;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.Qhi;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }
}
