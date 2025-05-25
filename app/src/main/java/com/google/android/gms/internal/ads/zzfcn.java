package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfcn implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzdgp zzd;
    final /* synthetic */ zzfco zze;

    public zzfcn(zzfco zzfcoVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzdgp zzdgpVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzdgpVar;
        this.zze = zzfcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th2);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdB(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhr)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk zzemkVar;
                        zzemkVar = zzfcn.this.zze.zzd;
                        zzemkVar.zzdB(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfck
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdo zzfdoVar;
                        zzfdoVar = zzfcn.this.zze.zze;
                        zzfdoVar.zzdB(zza);
                    }
                });
            }
            zzfgd.zzb(zza.f10146a, th2, "InterstitialAdLoader.onFailure");
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
    public final void zzb(Object obj) {
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        Executor executor2;
        zzemk zzemkVar;
        zzfdo zzfdoVar;
        zzdfo zzdfoVar = (zzdfo) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbbn zzbbnVar = zzbbw.zzhr;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                zzday zzo = zzdfoVar.zzo();
                zzemkVar = this.zze.zzd;
                zzo.zza(zzemkVar);
                zzfdoVar = this.zze.zze;
                zzo.zzd(zzfdoVar);
            }
            this.zza.zzb(zzdfoVar);
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk zzemkVar2;
                        zzemkVar2 = zzfcn.this.zze.zzd;
                        zzemkVar2.zzs();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdo zzfdoVar2;
                        zzfdoVar2 = zzfcn.this.zze.zze;
                        zzfdoVar2.zzs();
                    }
                });
            }
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzg;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zzb(zzdfoVar.zzq().zzb);
                zzfjuVar.zzd(zzdfoVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzdfoVar.zzq().zzb);
                zzfkfVar.zze(zzdfoVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
