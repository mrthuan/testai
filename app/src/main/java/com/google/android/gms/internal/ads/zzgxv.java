package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxv implements zzgxm {
    final int zza;
    final zzhbf zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgxv(zzgyd zzgydVar, int i10, zzhbf zzhbfVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzhbfVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgxv) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final zzhbf zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final zzhbg zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final boolean zze() {
        return this.zzc;
    }
}
