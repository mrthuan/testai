package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehw implements zzgcf {
    final /* synthetic */ zzfel zza;
    final /* synthetic */ zzehx zzb;

    public zzehw(zzehx zzehxVar, zzfel zzfelVar) {
        this.zza = zzfelVar;
        this.zzb = zzehxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzehy zzehyVar;
        zzehy zzehyVar2;
        zzehy zzehyVar3;
        synchronized (this.zzb) {
            zzehyVar = this.zzb.zzh;
            zzehyVar.zzb(th2, this.zza);
            zzehyVar2 = this.zzb.zzh;
            zzfel zza = zzehyVar2.zza();
            if (this.zza.zzav) {
                while (zza != null) {
                    this.zzb.zze(zza);
                    zzehyVar3 = this.zzb.zzh;
                    zza = zzehyVar3.zza();
                }
            } else if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzehy zzehyVar;
        zzehy zzehyVar2;
        zzeio zzeioVar = (zzeio) obj;
        synchronized (this.zzb) {
            zzehyVar = this.zzb.zzh;
            zzehyVar.zzc(zzeioVar, this.zza);
            zzehyVar2 = this.zzb.zzh;
            zzfel zza = zzehyVar2.zza();
            if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }
}
