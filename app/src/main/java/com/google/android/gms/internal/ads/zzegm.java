package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegm implements zzgcf {
    final /* synthetic */ zzegn zza;

    public zzegm(zzegn zzegnVar) {
        this.zza = zzegnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzcql zzcqlVar;
        zzcws zzcwsVar;
        zzcqlVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcqlVar.zzd().zza(th2);
        zzcwsVar = this.zza.zzd;
        zzcwsVar.zzdB(zza);
        zzfgd.zzb(zza.f10146a, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpk) obj).zzk();
    }
}
