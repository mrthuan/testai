package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaho implements zzahr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaho(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzet.zzr(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzaho zzb(long j10, zzagi zzagiVar, long j11) {
        int length = zzagiVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzagiVar.zzb + zzagiVar.zzd[i12];
            j12 += zzagiVar.zzc + zzagiVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzaho(jArr, jArr2, j11);
    }

    private static Pair zzf(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int zzc = zzet.zzc(jArr, j10, true, true);
        long j11 = jArr[zzc];
        long j12 = jArr2[zzc];
        int i10 = zzc + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * (j14 - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zze(long j10) {
        return zzet.zzr(((Long) zzf(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        Pair zzf = zzf(zzet.zzu(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzadj zzadjVar = new zzadj(zzet.zzr(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
