package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzchx extends zzexg {
    private final zzeyj zza;
    private final zzcif zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;
    private final zzhfl zzi;
    private final zzhfl zzj;
    private final zzhfl zzk;
    private final zzhfl zzl;
    private final zzhfl zzm;

    public /* synthetic */ zzchx(zzcif zzcifVar, zzeyj zzeyjVar, zzchw zzchwVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        this.zzb = zzcifVar;
        this.zza = zzeyjVar;
        zzeyl zzeylVar = new zzeyl(zzeyjVar);
        this.zzc = zzeylVar;
        zzhfl zzc = zzhfb.zzc(zzdrf.zza());
        this.zzd = zzc;
        zzhfl zzc2 = zzhfb.zzc(zzdrd.zza());
        this.zze = zzc2;
        zzhfl zzc3 = zzhfb.zzc(zzdrh.zza());
        this.zzf = zzc3;
        zzhfl zzc4 = zzhfb.zzc(zzdrj.zza());
        this.zzg = zzc4;
        zzhff zzc5 = zzhfg.zzc(4);
        zzc5.zzb(zzfjf.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfjf.BUILD_URL, zzc2);
        zzc5.zzb(zzfjf.HTTP, zzc3);
        zzc5.zzb(zzfjf.PRE_PROCESS, zzc4);
        zzhfg zzc6 = zzc5.zzc();
        this.zzh = zzc6;
        zzhflVar = zzcifVar.zzh;
        zzhfl zzc7 = zzhfb.zzc(new zzdrk(zzeylVar, zzhflVar, zzfig.zza(), zzc6));
        this.zzi = zzc7;
        zzhfp zza = zzhfq.zza(0, 1);
        zza.zza(zzc7);
        zzhfq zzc8 = zza.zzc();
        this.zzj = zzc8;
        zzfjo zzfjoVar = new zzfjo(zzc8);
        this.zzk = zzfjoVar;
        zzfig zza2 = zzfig.zza();
        zzhflVar2 = zzcifVar.zze;
        this.zzl = zzhfb.zzc(new zzfjn(zza2, zzhflVar2, zzfjoVar));
        zzhflVar3 = zzcifVar.zzz;
        this.zzm = zzhfb.zzc(new zzfkg(zzhflVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final zzevr zza() {
        zzcgm zzcgmVar;
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzcgmVar = this.zzb.zza;
        Context zzb = zzcgmVar.zzb();
        zzhfk.zzb(zzb);
        zzbys zzbysVar = new zzbys();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        zzeyd zzeydVar = new zzeyd(zzbysVar, zzgcuVar, zzeyk.zza(this.zza));
        zzhfk.zzb(zzgcuVar);
        zzhflVar = this.zzb.zze;
        zzfkf zzfkfVar = (zzfkf) this.zzm.zzb();
        zzhflVar2 = this.zzb.zzM;
        zzdsk zzdskVar = (zzdsk) zzhflVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzetw(zzeydVar, 0L, (ScheduledExecutorService) zzhflVar.zzb()));
        return new zzevr(zzb, zzgcuVar, hashSet, zzfkfVar, zzdskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final zzfjl zzb() {
        return (zzfjl) this.zzl.zzb();
    }
}
