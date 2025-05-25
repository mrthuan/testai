package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzezg implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;

    public zzezg(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar6;
        this.zze = zzhfuVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbze zzbzeVar = (zzbze) this.zza.zzb();
        boolean booleanValue = ((zzeyu) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzeyv) this.zzc).zzb().booleanValue();
        zzbyt zzbytVar = new zzbyt();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzeze(zzbzeVar, booleanValue, booleanValue2, zzbytVar, zzgcuVar, ((zzeyr) this.zzd).zza(), (ScheduledExecutorService) this.zze.zzb());
    }
}
