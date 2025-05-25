package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzabx implements zzadi {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzabx(long j10, long j11, int i10, int i11, boolean z10) {
        long zzc;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzc = zzc(j10, j11, i10);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j10) {
        return zzc(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11 = this.zzd;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        if (i10 != 0) {
            long j12 = this.zzc;
            long j13 = (((this.zze * j10) / 8000000) / j12) * j12;
            if (i10 != 0) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.zzb + Math.max(j13, 0L);
            long zzb = zzb(max);
            zzadj zzadjVar = new zzadj(zzb, max);
            if (this.zzd != -1 && zzb < j10) {
                long j14 = max + this.zzc;
                if (j14 < this.zza) {
                    return new zzadg(zzadjVar, new zzadj(zzb(j14), j14));
                }
            }
            return new zzadg(zzadjVar, zzadjVar);
        }
        zzadj zzadjVar2 = new zzadj(0L, this.zzb);
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        if (this.zzd == -1) {
            return false;
        }
        return true;
    }
}
