package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfaw implements zzgcf {
    final /* synthetic */ zzfkf zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzcql zzc;
    final /* synthetic */ zzfax zzd;

    public zzfaw(zzfax zzfaxVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzcql zzcqlVar) {
        this.zza = zzfkfVar;
        this.zzb = zzfjuVar;
        this.zzc = zzcqlVar;
        this.zzd = zzfaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        boolean z10;
        zzfki zzfkiVar;
        com.google.android.gms.ads.internal.client.zze zzeVar3;
        zzfkf zzfkfVar;
        com.google.android.gms.ads.internal.client.zze zzeVar4;
        zzczj zzczjVar;
        zzdbp zzdbpVar;
        this.zzd.zzn = this.zzc.zzd().zza(th2);
        synchronized (this.zzd) {
            zzcws zzf = this.zzc.zzf();
            zzeVar = this.zzd.zzn;
            zzf.zzdB(zzeVar);
            zzeVar2 = this.zzd.zzn;
            zzfgd.zzb(zzeVar2.f10146a, th2, "BannerAdLoader.onFailure");
            zzfax zzfaxVar = this.zzd;
            z10 = zzfaxVar.zzm;
            if (z10) {
                zzfaxVar.zzu();
                zzfax zzfaxVar2 = this.zzd;
                zzczjVar = zzfaxVar2.zzh;
                zzdbpVar = zzfaxVar2.zzj;
                zzczjVar.zzd(zzdbpVar.zzc());
            }
            if (((Boolean) zzbdl.zzc.zze()).booleanValue() && (zzfkfVar = this.zza) != null) {
                zzeVar4 = this.zzd.zzn;
                zzfkfVar.zzc(zzeVar4);
                zzfju zzfjuVar = this.zzb;
                zzfjuVar.zzh(th2);
                zzfjuVar.zzg(false);
                zzfkfVar.zza(zzfjuVar);
                zzfkfVar.zzh();
            } else {
                zzfax zzfaxVar3 = this.zzd;
                zzfkiVar = zzfaxVar3.zzi;
                zzfju zzfjuVar2 = this.zzb;
                zzeVar3 = zzfaxVar3.zzn;
                zzfjuVar2.zza(zzeVar3);
                zzfjuVar2.zzh(th2);
                zzfjuVar2.zzg(false);
                zzfkiVar.zzb(zzfjuVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzcpk zzcpkVar = (zzcpk) obj;
        synchronized (this.zzd) {
            zzfax zzfaxVar = this.zzd;
            z10 = zzfaxVar.zzm;
            if (z10) {
                zzfaxVar.zzr();
            }
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zza) == null) {
                zzfkiVar = this.zzd.zzi;
                zzfju zzfjuVar = this.zzb;
                zzfjuVar.zzb(zzcpkVar.zzq().zzb);
                zzfjuVar.zzd(zzcpkVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzcpkVar.zzq().zzb);
                zzfkfVar.zze(zzcpkVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzb;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
