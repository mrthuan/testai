package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsi implements zzgcf {
    final /* synthetic */ zzgcf zza;
    final /* synthetic */ zzcsj zzb;

    public zzcsi(zzcsj zzcsjVar, zzgcf zzgcfVar) {
        this.zza = zzgcfVar;
        this.zzb = zzcsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsd
            @Override // java.lang.Runnable
            public final void run() {
                zzcsj.this.zzd();
            }
        });
        this.zza.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsd
            @Override // java.lang.Runnable
            public final void run() {
                zzcsj.this.zzd();
            }
        });
        this.zza.zzb((zzcru) obj);
    }
}
