package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeng implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzdhl zzd;
    final /* synthetic */ zzenh zze;

    public zzeng(zzenh zzenhVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzdhl zzdhlVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzdhlVar;
        this.zze = zzenhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzcgj zzcgjVar;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th2);
        this.zzd.zzb().zzdB(zza);
        zzcgjVar = this.zze.zzb;
        zzcgjVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // java.lang.Runnable
            public final void run() {
                zzemx zzemxVar;
                zzemxVar = zzeng.this.zze.zzd;
                zzemxVar.zza().zzdB(zza);
            }
        });
        zzfgd.zzb(zza.f10146a, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbdl.zzc.zze()).booleanValue() && (zzfkfVar = this.zzb) != null) {
            zzfkfVar.zzc(zza);
            zzfju zzfjuVar = this.zzc;
            zzfjuVar.zzh(th2);
            zzfjuVar.zzg(false);
            zzfkfVar.zza(zzfjuVar);
            zzfkfVar.zzh();
            return;
        }
        zzenh zzenhVar = this.zze;
        zzfju zzfjuVar2 = this.zzc;
        zzfkiVar = zzenhVar.zze;
        zzfjuVar2.zza(zza);
        zzfjuVar2.zzh(th2);
        zzfjuVar2.zzg(false);
        zzfkiVar.zzb(zzfjuVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemx zzemxVar;
        zzcgj zzcgjVar;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzcru zzcruVar = (zzcru) obj;
        synchronized (this.zze) {
            zzday zzo = zzcruVar.zzo();
            zzemxVar = this.zze.zzd;
            zzo.zza(zzemxVar.zzd());
            this.zza.zzb(zzcruVar);
            zzcgjVar = this.zze.zzb;
            zzcgjVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzene
                @Override // java.lang.Runnable
                public final void run() {
                    zzemx zzemxVar2;
                    zzemxVar2 = zzeng.this.zze.zzd;
                    zzemxVar2.zzb().zzs();
                }
            });
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zze;
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
