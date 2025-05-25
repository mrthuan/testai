package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfkd implements zzgcf {
    final /* synthetic */ zzfkf zza;
    final /* synthetic */ zzfju zzb;

    public zzfkd(zzfkf zzfkfVar, zzfju zzfjuVar) {
        this.zza = zzfkfVar;
        this.zzb = zzfjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzfju zzfjuVar = this.zzb;
        zzfjuVar.zzh(th2);
        zzfjuVar.zzg(false);
        this.zza.zza(zzfjuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
    }
}
