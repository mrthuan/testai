package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdoy implements zzhfc {
    private final zzhfu zza;

    public zzdoy(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        if (((zzcwh) this.zza).zza().zzo.zza == 3) {
            return "rewarded_interstitial";
        }
        return "rewarded";
    }
}
