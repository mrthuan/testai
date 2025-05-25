package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface RewardedInterstitialAdListener extends AdListener {
    void onRewardedInterstitialClosed();

    void onRewardedInterstitialCompleted();
}
