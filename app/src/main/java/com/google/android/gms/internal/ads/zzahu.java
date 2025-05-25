package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzahu implements zzahr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahu(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzahu zzb(zzaht zzahtVar, long j10) {
        long[] jArr;
        long zza = zzahtVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j11 = zzahtVar.zzc;
        if (j11 != -1 && (jArr = zzahtVar.zzf) != null) {
            zzadc zzadcVar = zzahtVar.zza;
            return new zzahu(j10, zzadcVar.zzc, zza, zzadcVar.zzf, j11, jArr);
        }
        zzadc zzadcVar2 = zzahtVar.zza;
        return new zzahu(j10, zzadcVar2.zzc, zza, zzadcVar2.zzf, -1L, null);
    }

    private final long zzf(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zze(long j10) {
        long j11;
        double d10;
        if (zzh()) {
            long j12 = j10 - this.zza;
            if (j12 > this.zzb) {
                long[] jArr = this.zzg;
                zzdi.zzb(jArr);
                double d11 = (j12 * 256.0d) / this.zze;
                int zzc = zzet.zzc(jArr, (long) d11, true, true);
                long zzf = zzf(zzc);
                long j13 = jArr[zzc];
                int i10 = zzc + 1;
                long zzf2 = zzf(i10);
                if (zzc == 99) {
                    j11 = 256;
                } else {
                    j11 = jArr[i10];
                }
                if (j13 == j11) {
                    d10 = 0.0d;
                } else {
                    d10 = (d11 - j13) / (j11 - j13);
                }
                return Math.round(d10 * (zzf2 - zzf)) + zzf;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        double d10;
        if (!zzh()) {
            zzadj zzadjVar = new zzadj(0L, this.zza + this.zzb);
            return new zzadg(zzadjVar, zzadjVar);
        }
        long max = Math.max(0L, Math.min(j10, this.zzc));
        double d11 = (max * 100.0d) / this.zzc;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.zzg;
                zzdi.zzb(jArr);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = androidx.activity.f.e(d10, d13, d11 - i10, d13);
            }
        }
        long j11 = this.zze;
        zzadj zzadjVar2 = new zzadj(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d12 / 256.0d) * j11), j11 - 1)));
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        if (this.zzg != null) {
            return true;
        }
        return false;
    }
}
