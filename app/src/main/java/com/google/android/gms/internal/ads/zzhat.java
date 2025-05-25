package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhat {
    private static final zzhat zza = new zzhat(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhat(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhat zzc() {
        return zza;
    }

    public static zzhat zze(zzhat zzhatVar, zzhat zzhatVar2) {
        int i10 = zzhatVar.zzb + zzhatVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhatVar.zzc, i10);
        System.arraycopy(zzhatVar2.zzc, 0, copyOf, zzhatVar.zzb, zzhatVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhatVar.zzd, i10);
        System.arraycopy(zzhatVar2.zzd, 0, copyOf2, zzhatVar.zzb, zzhatVar2.zzb);
        return new zzhat(i10, copyOf, copyOf2, true);
    }

    public static zzhat zzf() {
        return new zzhat();
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhat)) {
            return false;
        }
        zzhat zzhatVar = (zzhat) obj;
        int i10 = this.zzb;
        if (i10 == zzhatVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhatVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhatVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int zzD2;
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 5) {
                                    ((Integer) this.zzd[i12]).intValue();
                                    zzD2 = zzgxd.zzD(i14 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzgyn.zza());
                                }
                            } else {
                                int zzD3 = zzgxd.zzD(i14 << 3);
                                zzD = zzD3 + zzD3;
                                zzE = ((zzhat) this.zzd[i12]).zza();
                            }
                        } else {
                            int zzD4 = zzgxd.zzD(i14 << 3);
                            int zzd = ((zzgwm) this.zzd[i12]).zzd();
                            i11 = zzgxd.zzD(zzd) + zzd + zzD4 + i11;
                        }
                    } else {
                        ((Long) this.zzd[i12]).longValue();
                        zzD2 = zzgxd.zzD(i14 << 3) + 8;
                    }
                    i11 = zzD2 + i11;
                } else {
                    int i16 = i14 << 3;
                    long longValue = ((Long) this.zzd[i12]).longValue();
                    zzD = zzgxd.zzD(i16);
                    zzE = zzgxd.zzE(longValue);
                }
                i11 = zzE + zzD + i11;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int zzD = zzgxd.zzD(8);
                int zzD2 = zzgxd.zzD(this.zzc[i12] >>> 3) + zzgxd.zzD(16);
                int zzD3 = zzgxd.zzD(24);
                int zzd = ((zzgwm) this.zzd[i12]).zzd();
                i11 = androidx.activity.f.g(zzD + zzD, zzD2, zzgxd.zzD(zzd) + zzd + zzD3, i11);
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final zzhat zzd(zzhat zzhatVar) {
        if (zzhatVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzhatVar.zzb;
        zzn(i10);
        System.arraycopy(zzhatVar.zzc, 0, this.zzc, this.zzb, zzhatVar.zzb);
        System.arraycopy(zzhatVar.zzd, 0, this.zzd, this.zzb, zzhatVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzgzl.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzhbh zzhbhVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhbhVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzhbh zzhbhVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    zzhbhVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzgyn.zza());
                                }
                            } else {
                                zzhbhVar.zzF(i13);
                                ((zzhat) obj).zzl(zzhbhVar);
                                zzhbhVar.zzh(i13);
                            }
                        } else {
                            zzhbhVar.zzd(i13, (zzgwm) obj);
                        }
                    } else {
                        zzhbhVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzhbhVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean zzm(int i10, zzgww zzgwwVar) {
        int zzl;
        zzg();
        int i11 = i10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzj(i10, Integer.valueOf(zzgwwVar.zzf()));
                                return true;
                            }
                            throw zzgyn.zza();
                        }
                        return false;
                    }
                    zzhat zzhatVar = new zzhat();
                    do {
                        zzl = zzgwwVar.zzl();
                        if (zzl == 0) {
                            break;
                        }
                    } while (zzhatVar.zzm(zzl, zzgwwVar));
                    zzgwwVar.zzy(4 | ((i10 >>> 3) << 3));
                    zzj(i10, zzhatVar);
                    return true;
                }
                zzj(i10, zzgwwVar.zzv());
                return true;
            }
            zzj(i10, Long.valueOf(zzgwwVar.zzn()));
            return true;
        }
        zzj(i10, Long.valueOf(zzgwwVar.zzo()));
        return true;
    }

    private zzhat() {
        this(0, new int[8], new Object[8], true);
    }
}
