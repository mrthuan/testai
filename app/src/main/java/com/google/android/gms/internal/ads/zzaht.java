package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaht {
    public final zzadc zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaht(zzadc zzadcVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.zza = new zzadc(zzadcVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzaht zzb(zzadc zzadcVar, zzek zzekVar) {
        int i10;
        long j10;
        long[] jArr;
        int i11;
        int i12;
        int zzg = zzekVar.zzg();
        if ((zzg & 1) != 0) {
            i10 = zzekVar.zzp();
        } else {
            i10 = -1;
        }
        if ((zzg & 2) != 0) {
            j10 = zzekVar.zzu();
        } else {
            j10 = -1;
        }
        long j11 = j10;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr2[i13] = zzekVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzekVar.zzL(4);
        }
        if (zzekVar.zzb() >= 24) {
            zzekVar.zzL(21);
            int zzo = zzekVar.zzo();
            i12 = zzo & 4095;
            i11 = zzo >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new zzaht(zzadcVar, i10, j11, jArr, i11, i12);
    }

    public final long zza() {
        long j10 = this.zzb;
        if (j10 != -1 && j10 != 0) {
            zzadc zzadcVar = this.zza;
            return zzet.zzs((j10 * zzadcVar.zzg) - 1, zzadcVar.zzd);
        }
        return -9223372036854775807L;
    }
}
