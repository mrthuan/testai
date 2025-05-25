package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05815w implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C05815w(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad2) {
        this.A00.onAdClicked(ad2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad2) {
        this.A00.onAdLoaded(ad2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
        this.A00.onError(ad2, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
        this.A00.onLoggingImpression(ad2);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        if (this.A00 instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) this.A00).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
