package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzvg implements zzvx {
    final /* synthetic */ zzvj zza;
    private final int zzb;

    public zzvg(zzvj zzvjVar, int i10) {
        this.zza = zzvjVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zza(zzjz zzjzVar, zzhd zzhdVar, int i10) {
        return this.zza.zzf(this.zzb, zzjzVar, zzhdVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzb(long j10) {
        return this.zza.zzh(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final void zzd() {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
