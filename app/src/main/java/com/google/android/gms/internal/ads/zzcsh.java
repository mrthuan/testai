package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsh implements zzgcf {
    final /* synthetic */ zzgcf zza;
    final /* synthetic */ zzcsj zzb;

    public zzcsh(zzcsj zzcsjVar, zzgcf zzgcfVar) {
        this.zza = zzgcfVar;
        this.zzb = zzcsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsd
            @Override // java.lang.Runnable
            public final void run() {
                zzcsj.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsj.zzb(this.zzb, ((zzcsc) obj).zza, this.zza);
    }
}
