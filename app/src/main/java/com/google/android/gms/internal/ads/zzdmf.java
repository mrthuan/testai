package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdmf implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;
    private final zzhfu zzg;
    private final zzhfu zzh;
    private final zzhfu zzi;
    private final zzhfu zzj;
    private final zzhfu zzk;
    private final zzhfu zzl;
    private final zzhfu zzm;
    private final zzhfu zzn;
    private final zzhfu zzo;

    public zzdmf(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8, zzhfu zzhfuVar9, zzhfu zzhfuVar10, zzhfu zzhfuVar11, zzhfu zzhfuVar12, zzhfu zzhfuVar13, zzhfu zzhfuVar14, zzhfu zzhfuVar15, zzhfu zzhfuVar16, zzhfu zzhfuVar17) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar6;
        this.zzf = zzhfuVar8;
        this.zzg = zzhfuVar9;
        this.zzh = zzhfuVar10;
        this.zzi = zzhfuVar11;
        this.zzj = zzhfuVar12;
        this.zzk = zzhfuVar13;
        this.zzl = zzhfuVar14;
        this.zzm = zzhfuVar15;
        this.zzn = zzhfuVar16;
        this.zzo = zzhfuVar17;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzdme zzb() {
        Context context = (Context) this.zza.zzb();
        zzdln zzdlnVar = (zzdln) this.zzb.zzb();
        zzauo zzauoVar = (zzauo) this.zzc.zzb();
        VersionInfoParcel zza = ((zzchc) this.zzd).zza();
        zzhfu zzhfuVar = this.zze;
        com.google.android.gms.ads.internal.zza a10 = com.google.android.gms.ads.internal.zza.a();
        zzbav zzbavVar = (zzbav) zzhfuVar.zzb();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzdme(context, zzdlnVar, zzauoVar, zza, a10, zzbavVar, zzgcuVar, ((zzcwh) this.zzf).zza(), (zzdmw) this.zzg.zzb(), (zzdpl) this.zzh.zzb(), (ScheduledExecutorService) this.zzi.zzb(), (zzdsk) this.zzj.zzb(), (zzfll) this.zzk.zzb(), (zzedh) this.zzl.zzb(), (zzdog) this.zzm.zzb(), (zzeds) this.zzn.zzb(), (zzffk) this.zzo.zzb());
    }
}
