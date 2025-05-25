package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdiu implements zzgcf {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdiw zzb;

    public zzdiu(zzdiw zzdiwVar, String str, boolean z10) {
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjb zzdjbVar;
        zzdjb zzdjbVar2;
        zzdjbVar = this.zzb.zzd;
        zzdjbVar.zzT((zzcej) obj);
        zzdiw zzdiwVar = this.zzb;
        zzdjbVar2 = zzdiwVar.zzd;
        zzbzt zzp = zzdjbVar2.zzp();
        zzeeo zzf = zzdiwVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
