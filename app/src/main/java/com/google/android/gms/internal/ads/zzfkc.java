package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfkc implements zzgcf {
    final /* synthetic */ zzfkf zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ boolean zzc;

    public zzfkc(zzfkf zzfkfVar, zzfju zzfjuVar, boolean z10) {
        this.zza = zzfkfVar;
        this.zzb = zzfjuVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfju zzfjuVar = this.zzb;
        if (zzfjuVar.zzk()) {
            zzfkf zzfkfVar = this.zza;
            zzfjuVar.zzh(th2);
            zzfjuVar.zzg(false);
            zzfkfVar.zza(zzfjuVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzfju zzfjuVar = this.zzb;
        zzfjuVar.zzg(true);
        this.zza.zza(zzfjuVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
