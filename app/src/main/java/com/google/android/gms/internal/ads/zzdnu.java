package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnu implements zzgcf {
    final /* synthetic */ zzfel zza;
    final /* synthetic */ zzfeo zzb;
    final /* synthetic */ zzcni zzc;
    final /* synthetic */ zzdoa zzd;

    public zzdnu(zzdoa zzdoaVar, zzfel zzfelVar, zzfeo zzfeoVar, zzcni zzcniVar) {
        this.zza = zzfelVar;
        this.zzb = zzfeoVar;
        this.zzc = zzcniVar;
        this.zzd = zzdoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzedh zzedhVar;
        zzfll zzfllVar;
        zzedh zzedhVar2;
        zzdsk zzdskVar;
        zzcej zzcejVar = (zzcej) obj;
        zzcejVar.zzW(this.zza, this.zzb);
        zzcgb zzN = zzcejVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjk)).booleanValue() && zzN != null) {
            zzcni zzcniVar = this.zzc;
            zzdoa zzdoaVar = this.zzd;
            zzedhVar = zzdoaVar.zzi;
            zzfllVar = zzdoaVar.zzj;
            zzN.zzI(zzcniVar, zzedhVar, zzfllVar);
            zzcni zzcniVar2 = this.zzc;
            zzdoa zzdoaVar2 = this.zzd;
            zzedhVar2 = zzdoaVar2.zzi;
            zzdskVar = zzdoaVar2.zzd;
            zzN.zzK(zzcniVar2, zzedhVar2, zzdskVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
    }
}
