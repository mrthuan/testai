package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzuc extends zzcc {
    private final zzbc zzb;

    public zzuc(zzbc zzbcVar) {
        this.zzb = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        if (obj == zzub.zzc) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i10, zzca zzcaVar, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = zzub.zzc;
        }
        zzcaVar.zzl(num, obj, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i10, zzcb zzcbVar, long j10) {
        zzcbVar.zza(zzcb.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcbVar.zzk = true;
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i10) {
        return zzub.zzc;
    }
}
