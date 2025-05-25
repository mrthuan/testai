package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface S2SRewardedInterstitialAdListener extends RewardedInterstitialAdListener {
    void onRewardServerFailed();

    void onRewardServerSuccess();
}
