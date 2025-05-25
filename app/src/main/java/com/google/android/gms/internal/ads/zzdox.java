package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdox implements zzhfc {
    private final zzhfu zza;

    public zzdox(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbc.zza.EnumC0157zza enumC0157zza;
        if (((zzcwh) this.zza).zza().zzo.zza == 3) {
            enumC0157zza = zzbbc.zza.EnumC0157zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0157zza = zzbbc.zza.EnumC0157zza.REWARD_BASED_VIDEO_AD;
        }
        zzhfk.zzb(enumC0157zza);
        return enumC0157zza;
    }
}
