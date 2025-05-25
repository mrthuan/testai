package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeqr implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzeqr(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqg(((zzewa) this.zza).zzb(), ((Long) zzbdh.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
