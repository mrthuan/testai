package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwd implements zzgcf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwf zzb;

    public zzdwd(zzdwf zzdwfVar, String str) {
        this.zza = str;
        this.zzb = zzdwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdvt zzdvtVar;
        ((zzduw) obj).zze();
        zzdvtVar = this.zzb.zzd;
        zzdvtVar.zzk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
    }
}
