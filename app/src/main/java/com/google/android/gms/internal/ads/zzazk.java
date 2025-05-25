package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazk extends zzazr {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzazk(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.f());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zzd(zzazp zzazpVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzazl(zzazpVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zzb(int i10) {
    }
}
