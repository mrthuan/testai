package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeaa implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;
    private final zzhfu zzg;
    private final zzhfu zzh;

    public zzeaa(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8, zzhfu zzhfuVar9) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar5;
        this.zzf = zzhfuVar6;
        this.zzg = zzhfuVar7;
        this.zzh = zzhfuVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzdzz zzb() {
        zzczm zzb = ((zzczn) this.zza).zzb();
        zzdzh zzb2 = ((zzdzi) this.zzb).zzb();
        zzfjl zzfjlVar = (zzfjl) this.zzc.zzb();
        zzffg zza = ((zzcwh) this.zzd).zza();
        VersionInfoParcel zza2 = ((zzchc) this.zze).zza();
        zzfki zzfkiVar = (zzfki) this.zzf.zzb();
        zzfkf zzfkfVar = (zzfkf) this.zzg.zzb();
        Context zza3 = ((zzcgp) this.zzh).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzdzz(zzb, zzb2, zzfjlVar, zza, zza2, zzfkiVar, zzfkfVar, zza3, zzgcuVar);
    }
}
