package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzezq implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzezs zzd;
    final /* synthetic */ zzezt zze;

    public zzezq(zzezt zzeztVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzezs zzezsVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzezsVar;
        this.zze = zzeztVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcvx, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfcc zzfccVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfaj zzfajVar;
        zzcvw zzm;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        zzfccVar = this.zze.zze;
        zzcou zzcouVar = (zzcou) zzfccVar.zzd();
        if (zzcouVar == null) {
            zza = zzfgi.zzb(th2, null);
        } else {
            zza = zzcouVar.zzb().zza(th2);
        }
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcouVar == null) {
                    zzfajVar = this.zze.zzd;
                    zzfajVar.zzdB(zza);
                    zzm = this.zze.zzm(this.zzd);
                    zzm.zzh().zzb().zzc().zzh();
                } else {
                    zzcouVar.zzc().zzdB(zza);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhq)).booleanValue()) {
                        executor = this.zze.zzc;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezp
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzfaj zzfajVar2;
                                zzfajVar2 = zzezq.this.zze.zzd;
                                zzfajVar2.zzdB(zza);
                            }
                        });
                    }
                }
                zzfgd.zzb(zza.f10146a, th2, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                    zzfkiVar = this.zze.zzh;
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
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzfaj zzfajVar;
        zzcru zzcruVar = (zzcru) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhq)).booleanValue()) {
                zzday zzo = zzcruVar.zzo();
                zzfajVar = this.zze.zzd;
                zzo.zzb(zzfajVar);
            }
            this.zza.zzb(zzcruVar);
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzh;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zzb(zzcruVar.zzq().zzb);
                zzfjuVar.zzd(zzcruVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzcruVar.zzq().zzb);
                zzfkfVar.zze(zzcruVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
