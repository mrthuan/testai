package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialListener {
    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
