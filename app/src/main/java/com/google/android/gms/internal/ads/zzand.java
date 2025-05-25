package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzand {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    public static long zzc(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        if (zzekVar.zzb() >= 9) {
            byte[] bArr = new byte[9];
            zzekVar.zzG(bArr, 0, 9);
            zzekVar.zzK(zzd);
            byte b10 = bArr[0];
            if ((b10 & 196) == 68) {
                byte b11 = bArr[2];
                if ((b11 & 4) == 4) {
                    byte b12 = bArr[4];
                    if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j10 = b10;
                        long j11 = b11;
                        long j12 = (j11 & 3) << 13;
                        return j12 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (((248 & j11) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzacl zzaclVar) {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzaclVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar) {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaclVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j11 = zzd - min;
            if (zzaclVar.zzf() != j11) {
                zzadfVar.zza = j11;
                return 1;
            }
            this.zzb.zzH(min);
            zzaclVar.zzj();
            ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
            zzek zzekVar = this.zzb;
            int zzd2 = zzekVar.zzd();
            int zze = zzekVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzekVar.zzM(), zze) == 442) {
                    zzekVar.zzK(zze + 4);
                    long zzc = zzc(zzekVar);
                    if (zzc != -9223372036854775807L) {
                        j10 = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j10;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzaclVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000L, zzaclVar.zzd());
            if (zzaclVar.zzf() != 0) {
                zzadfVar.zza = 0L;
                return 1;
            }
            this.zzb.zzH(min2);
            zzaclVar.zzj();
            ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min2, false);
            zzek zzekVar2 = this.zzb;
            int zzd3 = zzekVar2.zzd();
            int zze2 = zzekVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzekVar2.zzM(), zzd3) == 442) {
                    zzekVar2.zzK(zzd3 + 4);
                    long zzc2 = zzc(zzekVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j10 = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j10;
            this.zzd = true;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzaclVar);
                return 0;
            }
            zzer zzerVar = this.zza;
            this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j12);
            zzf(zzaclVar);
            return 0;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
