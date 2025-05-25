package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwz extends zzbwm {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxa zzb;

    public zzbwz(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxa zzbxaVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.f());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzg() {
        zzbxa zzbxaVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbxaVar = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zze(int i10) {
    }
}
