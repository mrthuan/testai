package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfdv implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzfdx zzd;
    final /* synthetic */ zzfdy zze;

    public zzfdv(zzfdy zzfdyVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzfdx zzfdxVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzfdxVar;
        this.zze = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfcc zzfccVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfdo zzfdoVar;
        zzdot zzk;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        zzfccVar = this.zze.zze;
        zzdou zzdouVar = (zzdou) zzfccVar.zzd();
        if (zzdouVar == null) {
            zza = zzfgi.zzb(th2, null);
        } else {
            zza = zzdouVar.zzb().zza(th2);
        }
        synchronized (this.zze) {
            if (zzdouVar == null) {
                zzfdoVar = this.zze.zzd;
                zzfdoVar.zzdB(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzh();
            } else {
                zzdouVar.zza().zzdB(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdo zzfdoVar2;
                        zzfdoVar2 = zzfdv.this.zze.zzd;
                        zzfdoVar2.zzdB(zza);
                    }
                });
            }
            zzfgd.zzb(zza.f10146a, th2, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzg;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zza(zza);
                zzfjuVar.zzh(th2);
                zzfjuVar.zzg(false);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzc(zza);
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzh(th2);
                zzfjuVar2.zzg(false);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdo zzfdoVar;
        Executor executor;
        final zzfdo zzfdoVar2;
        zzfdo zzfdoVar3;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzdop zzdopVar = (zzdop) obj;
        synchronized (this.zze) {
            zzday zzo = zzdopVar.zzo();
            zzfdoVar = this.zze.zzd;
            zzo.zzd(zzfdoVar);
            this.zza.zzb(zzdopVar);
            zzfdy zzfdyVar = this.zze;
            executor = zzfdyVar.zzb;
            zzfdoVar2 = zzfdyVar.zzd;
            Objects.requireNonNull(zzfdoVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdo.this.zzs();
                }
            });
            zzfdoVar3 = this.zze.zzd;
            zzfdoVar3.onAdMetadataChanged();
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzg;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zzb(zzdopVar.zzq().zzb);
                zzfjuVar.zzd(zzdopVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzdopVar.zzq().zzb);
                zzfkfVar.zze(zzdopVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
