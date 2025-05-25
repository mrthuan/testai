package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfja implements zzgcf {
    final /* synthetic */ zzfiq zza;
    final /* synthetic */ zzfjc zzb;

    public zzfja(zzfjc zzfjcVar, zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
        this.zzb = zzfjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfje zzfjeVar;
        zzfjeVar = this.zzb.zza.zzd;
        zzfjeVar.zzb(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzfje zzfjeVar;
        zzfjeVar = this.zzb.zza.zzd;
        zzfjeVar.zzd(this.zza);
    }
}
