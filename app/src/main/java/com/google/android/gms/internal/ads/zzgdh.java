package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgdh extends zzgcs {
    final /* synthetic */ zzgdj zza;
    private final zzgbp zzb;

    public zzgdh(zzgdj zzgdjVar, zzgbp zzgbpVar) {
        this.zza = zzgdjVar;
        this.zzb = zzgbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final /* bridge */ /* synthetic */ Object zza() {
        zzgbp zzgbpVar = this.zzb;
        y9.a zza = zzgbpVar.zza();
        zzfuu.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbpVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((y9.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
