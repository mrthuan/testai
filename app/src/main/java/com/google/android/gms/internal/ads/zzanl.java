package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzanl {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    public zzanl(int i10) {
    }

    private final int zze(zzacl zzaclVar) {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzaclVar.zzj();
        return 0;
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar, int i10) {
        if (i10 <= 0) {
            zze(zzaclVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaclVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j11 = zzd - min;
            if (zzaclVar.zzf() != j11) {
                zzadfVar.zza = j11;
            } else {
                this.zzb.zzH(min);
                zzaclVar.zzj();
                ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
                zzek zzekVar = this.zzb;
                int zzd2 = zzekVar.zzd();
                int zze = zzekVar.zze();
                int i11 = zze - 188;
                while (true) {
                    if (i11 < zzd2) {
                        break;
                    }
                    byte[] zzM = zzekVar.zzM();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 >= zzd2 && i14 < zze && zzM[i14] == 71) {
                            i13++;
                            if (i13 == 5) {
                                long zzb = zzanu.zzb(zzekVar, i11, i10);
                                if (zzb != -9223372036854775807L) {
                                    j10 = zzb;
                                    break;
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                        i12++;
                    }
                    i11--;
                }
                this.zzg = j10;
                this.zze = true;
                return 0;
            }
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzaclVar);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800L, zzaclVar.zzd());
            if (zzaclVar.zzf() != 0) {
                zzadfVar.zza = 0L;
            } else {
                this.zzb.zzH(min2);
                zzaclVar.zzj();
                ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzek zzekVar2 = this.zzb;
                int zzd3 = zzekVar2.zzd();
                int zze2 = zzekVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzekVar2.zzM()[zzd3] == 71) {
                        long zzb2 = zzanu.zzb(zzekVar2, zzd3, i10);
                        if (zzb2 != -9223372036854775807L) {
                            j10 = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j10;
                this.zzd = true;
                return 0;
            }
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzaclVar);
                return 0;
            }
            zzer zzerVar = this.zza;
            this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j12);
            zze(zzaclVar);
            return 0;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
