package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxv implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;
    private final zzhfu zzg;

    public zzdxv(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar6;
        this.zzf = zzhfuVar7;
        this.zzg = zzhfuVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzdxu zzb() {
        zzcgj zzcgjVar = (zzcgj) this.zza.zzb();
        Context zza = ((zzcgp) this.zzb).zza();
        VersionInfoParcel zza2 = ((zzchc) this.zzc).zza();
        zzffg zza3 = ((zzcwh) this.zzd).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzdxu(zzcgjVar, zza, zza2, zza3, zzgcuVar, (String) this.zze.zzb(), (zzfkf) this.zzf.zzb(), (zzdsf) this.zzg.zzb());
    }
}
