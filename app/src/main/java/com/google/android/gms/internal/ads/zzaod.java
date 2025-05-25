package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaod implements zzadi {
    private final zzaoa zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaod(zzaoa zzaoaVar, int i10, long j10, long j11) {
        this.zza = zzaoaVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzaoaVar.zzd;
        this.zzd = j12;
        this.zze = zzb(j12);
    }

    private final long zzb(long j10) {
        return zzet.zzt(j10 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j10) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadj zzadjVar = new zzadj(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j10 && max != this.zzd - 1) {
            long j11 = max + 1;
            return new zzadg(zzadjVar, new zzadj(zzb(j11), (j11 * this.zza.zzd) + this.zzc));
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
