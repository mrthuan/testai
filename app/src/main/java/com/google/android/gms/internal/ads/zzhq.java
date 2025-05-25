package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhq {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzhq(float f10, float f11, long j10, float f12, long j11, long j12, float f13, zzhp zzhpVar) {
        this.zza = j11;
        this.zzb = j12;
    }

    private static long zzf(long j10, long j11, float f10) {
        return (((float) j11) * 9.999871E-4f) + (((float) j10) * 0.999f);
    }

    private final void zzg() {
        long j10;
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            j10 = this.zzd;
            if (j10 == -9223372036854775807L) {
                long j12 = this.zzf;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j10, long j11) {
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.zzm;
        if (j13 == -9223372036854775807L) {
            this.zzm = j12;
            this.zzn = 0L;
        } else {
            long max = Math.max(j12, zzf(j13, j12, 0.999f));
            this.zzm = max;
            this.zzn = zzf(this.zzn, Math.abs(j12 - max), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j14 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j14) {
            float zzr = (float) zzet.zzr(1000L);
            long[] jArr = {j14, this.zze, this.zzh - (((this.zzk - 1.0f) * zzr) + ((this.zzi - 1.0f) * zzr))};
            for (int i10 = 1; i10 < 3; i10++) {
                long j15 = jArr[i10];
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            this.zzh = j14;
        } else {
            j14 = Math.max(this.zzh, Math.min(j10 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), j14));
            this.zzh = j14;
            long j16 = this.zzg;
            if (j16 != -9223372036854775807L && j14 > j16) {
                this.zzh = j16;
                j14 = j16;
            }
        }
        long j17 = j10 - j14;
        if (Math.abs(j17) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float max2 = Math.max(this.zzj, Math.min((((float) j17) * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = max2;
        return max2;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzav zzavVar) {
        long j10 = zzavVar.zza;
        this.zzc = zzet.zzr(-9223372036854775807L);
        this.zzf = zzet.zzr(-9223372036854775807L);
        this.zzg = zzet.zzr(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }
}
