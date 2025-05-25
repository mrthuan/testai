package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeix implements zzhfc {
    private final zzeiw zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;

    public zzeix(zzeiw zzeiwVar, zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4) {
        this.zza = zzeiwVar;
        this.zzb = zzhfuVar;
        this.zzc = zzhfuVar2;
        this.zzd = zzhfuVar3;
        this.zze = zzhfuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzeiq) this.zzc).zzb(), (zzeey) this.zzd.zzb(), (zzfll) this.zze.zzb());
    }
}
