package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzlb extends zztw {
    private final zzcb zzc;

    public zzlb(zzlc zzlcVar, zzcc zzccVar) {
        super(zzccVar);
        this.zzc = new zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i10, zzca zzcaVar, boolean z10) {
        zzca zzd = this.zzb.zzd(i10, zzcaVar, z10);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzl(zzcaVar.zza, zzcaVar.zzb, zzcaVar.zzc, zzcaVar.zzd, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
