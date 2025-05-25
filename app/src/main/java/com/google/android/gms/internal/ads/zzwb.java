package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzwb extends zzcc {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzbc zzf;
    private final zzav zzg;

    static {
        zzam zzamVar = new zzam();
        zzamVar.zza("SinglePeriodTimeline");
        zzamVar.zzb(Uri.EMPTY);
        zzamVar.zzc();
    }

    public zzwb(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbc zzbcVar, zzav zzavVar) {
        this.zzc = j13;
        this.zzd = j14;
        this.zze = z10;
        zzbcVar.getClass();
        this.zzf = zzbcVar;
        this.zzg = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        if (zzb.equals(obj)) {
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
        Object obj;
        zzdi.zza(i10, 0, 1);
        if (z10) {
            obj = zzb;
        } else {
            obj = null;
        }
        zzcaVar.zzl(null, obj, 0, this.zzc, 0L, zzb.zza, false);
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i10, zzcb zzcbVar, long j10) {
        zzdi.zza(i10, 0, 1);
        Object obj = zzcb.zza;
        zzbc zzbcVar = this.zzf;
        long j11 = this.zzd;
        zzcbVar.zza(obj, zzbcVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j11, 0, 0, 0L);
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i10) {
        zzdi.zza(i10, 0, 1);
        return zzb;
    }
}
