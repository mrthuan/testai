package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzahs implements zzahr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahs(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
    }

    public static zzahs zzb(long j10, long j11, zzadc zzadcVar, zzek zzekVar) {
        int i10;
        int zzm;
        zzekVar.zzL(10);
        int zzg = zzekVar.zzg();
        if (zzg > 0) {
            int i11 = zzadcVar.zzd;
            if (i11 >= 32000) {
                i10 = 1152;
            } else {
                i10 = 576;
            }
            long zzt = zzet.zzt(zzg, i10 * 1000000, i11, RoundingMode.FLOOR);
            int zzq = zzekVar.zzq();
            int zzq2 = zzekVar.zzq();
            int zzq3 = zzekVar.zzq();
            zzekVar.zzL(2);
            long j12 = j11 + zzadcVar.zzc;
            long[] jArr = new long[zzq];
            long[] jArr2 = new long[zzq];
            int i12 = 0;
            long j13 = j11;
            while (i12 < zzq) {
                long j14 = zzt;
                jArr[i12] = (i12 * zzt) / zzq;
                jArr2[i12] = Math.max(j13, j12);
                if (zzq3 != 1) {
                    if (zzq3 != 2) {
                        if (zzq3 != 3) {
                            if (zzq3 != 4) {
                                return null;
                            }
                            zzm = zzekVar.zzp();
                        } else {
                            zzm = zzekVar.zzo();
                        }
                    } else {
                        zzm = zzekVar.zzq();
                    }
                } else {
                    zzm = zzekVar.zzm();
                }
                j13 += zzm * zzq2;
                i12++;
                zzt = j14;
                zzq = zzq;
            }
            long j15 = zzt;
            if (j10 != -1 && j10 != j13) {
                StringBuilder h10 = androidx.activity.r.h("VBRI data size mismatch: ", j10, ", ");
                h10.append(j13);
                zzea.zzf("VbriSeeker", h10.toString());
            }
            return new zzahs(jArr, jArr2, j15, j13, zzadcVar.zzf);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zze(long j10) {
        return this.zza[zzet.zzc(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long[] jArr = this.zza;
        int zzc = zzet.zzc(jArr, j10, true, true);
        zzadj zzadjVar = new zzadj(jArr[zzc], this.zzb[zzc]);
        if (zzadjVar.zzb < j10) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i10 = zzc + 1;
                return new zzadg(zzadjVar, new zzadj(jArr2[i10], this.zzb[i10]));
            }
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
