package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class AbstractAdListener implements InterstitialAdExtendedListener, RewardedVideoAdExtendedListener, RewardedInterstitialAdExtendedListener {
    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdExtendedListener
    public void onRewardedInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialClosed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialCompleted() {
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
    }
}
