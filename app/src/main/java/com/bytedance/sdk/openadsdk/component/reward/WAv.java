package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* compiled from: PAGRewardedAdWrapper.java */
/* loaded from: classes.dex */
public class WAv implements com.bytedance.sdk.openadsdk.apiImpl.CJ.ac {
    private final PAGRewardedAdInteractionListener Qhi;
    private final PAGRewardedAdInteractionCallback cJ;

    public WAv(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.Qhi = pAGRewardedAdInteractionListener;
        this.cJ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.CJ.ac
    public void Qhi() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Qhi;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.cJ;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.CJ.ac
    public void cJ() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Qhi;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.cJ;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Qhi;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.cJ;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public WAv(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.cJ = pAGRewardedAdInteractionCallback;
        this.Qhi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.CJ.ac
    public void Qhi(boolean z10, int i10, String str, int i11, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Qhi;
        if (pAGRewardedAdInteractionListener != null) {
            if (z10) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.cJ;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z10) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
            }
        }
    }
}
