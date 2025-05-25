package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnv implements zzhfc {
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

    public zzcnv(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8, zzhfu zzhfuVar9, zzhfu zzhfuVar10, zzhfu zzhfuVar11, zzhfu zzhfuVar12, zzhfu zzhfuVar13, zzhfu zzhfuVar14, zzhfu zzhfuVar15) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar3;
        this.zzc = zzhfuVar4;
        this.zzd = zzhfuVar5;
        this.zze = zzhfuVar6;
        this.zzf = zzhfuVar7;
        this.zzg = zzhfuVar8;
        this.zzh = zzhfuVar9;
        this.zzi = zzhfuVar10;
        this.zzj = zzhfuVar11;
        this.zzk = zzhfuVar12;
        this.zzl = zzhfuVar14;
        this.zzm = zzhfuVar15;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcgp) this.zza).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzcnu(zza, zzgcuVar, (Executor) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), ((zzcso) this.zzd).zza(), ((zzcsl) this.zze).zza(), (zzflh) this.zzf.zzb(), (zzffs) this.zzg.zzb(), (View) this.zzh.zzb(), (zzcej) this.zzi.zzb(), (zzauo) this.zzj.zzb(), (zzbcz) this.zzk.zzb(), new zzbdb(), (zzfkf) this.zzl.zzb(), ((zzcwe) this.zzm).zza());
    }
}
