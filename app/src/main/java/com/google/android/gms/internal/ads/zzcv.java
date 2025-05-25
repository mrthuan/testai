package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzcv(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = this.zzb * i10;
                i17 += Math.abs(sArr[i19 + i18] - sArr[(i19 + i11) + i18]);
            }
            int i20 = i17 * i15;
            int i21 = i13 * i11;
            if (i20 < i21) {
                i13 = i17;
            }
            if (i20 < i21) {
                i15 = i11;
            }
            int i22 = i17 * i14;
            int i23 = i16 * i11;
            if (i22 > i23) {
                i16 = i17;
            }
            if (i22 > i23) {
                i14 = i11;
            }
            i11++;
        }
        this.zzu = i13 / i15;
        this.zzv = i16 / i14;
        return i15;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] zzl = zzl(this.zzl, this.zzm, i11);
        this.zzl = zzl;
        int i12 = this.zzm;
        int i13 = this.zzb;
        System.arraycopy(sArr, i10 * i13, zzl, i12 * i13, i11 * i13);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.zzh / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.zzb;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i12 * i13) + (i16 * i10) + i14];
                    i14++;
                }
            }
            this.zzi[i13] = (short) (i15 / i12);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i16])) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzk() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        float f10 = this.zzc / this.zzd;
        double d10 = f10;
        int i20 = (d10 > 1.00001d ? 1 : (d10 == 1.00001d ? 0 : -1));
        int i21 = this.zzm;
        if (i20 <= 0 && d10 >= 0.99999d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i22 = this.zzk;
            if (i22 >= this.zzh) {
                int i23 = 0;
                do {
                    int i24 = this.zzr;
                    if (i24 > 0) {
                        int min = Math.min(this.zzh, i24);
                        zzh(this.zzj, i23, min);
                        this.zzr -= min;
                        i23 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i25 = this.zza;
                        if (i25 > 4000) {
                            i10 = i25 / 4000;
                        } else {
                            i10 = 1;
                        }
                        if (this.zzb == 1 && i10 == 1) {
                            i11 = zzg(sArr, i23, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i23, i10);
                            int zzg = zzg(this.zzi, 0, this.zzf / i10, this.zzg / i10);
                            if (i10 != 1) {
                                int i26 = zzg * i10;
                                int i27 = i10 * 4;
                                int i28 = this.zzf;
                                int i29 = i26 - i27;
                                if (i29 >= i28) {
                                    i28 = i29;
                                }
                                int i30 = i26 + i27;
                                int i31 = this.zzg;
                                if (i30 > i31) {
                                    i30 = i31;
                                }
                                if (this.zzb == 1) {
                                    i11 = zzg(sArr, i23, i28, i30);
                                } else {
                                    zzi(sArr, i23, 1);
                                    i11 = zzg(this.zzi, 0, i28, i30);
                                }
                            } else {
                                i11 = zzg;
                            }
                        }
                        int i32 = this.zzu;
                        int i33 = this.zzv;
                        if (i32 != 0 && (i15 = this.zzs) != 0 && i33 <= i32 * 3 && i32 + i32 > this.zzt * 3) {
                            i12 = i15;
                        } else {
                            i12 = i11;
                        }
                        int i34 = i23 + i12;
                        this.zzt = i32;
                        this.zzs = i11;
                        float f11 = i12;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f12 = (-1.0f) + f10;
                            if (f10 >= 2.0f) {
                                i14 = (int) (f11 / f12);
                            } else {
                                this.zzr = (int) (((2.0f - f10) * f11) / f12);
                                i14 = i12;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i14);
                            this.zzl = zzl;
                            int i35 = i14;
                            zzj(i14, this.zzb, zzl, this.zzm, sArr2, i23, sArr2, i34);
                            this.zzm += i35;
                            i23 = i12 + i35 + i23;
                        } else {
                            int i36 = i12;
                            short[] sArr3 = this.zzj;
                            float f13 = 1.0f - f10;
                            if (f10 < 0.5f) {
                                i13 = (int) ((f11 * f10) / f13);
                            } else {
                                this.zzr = (int) ((((f10 + f10) - 1.0f) * f11) / f13);
                                i13 = i36;
                            }
                            int i37 = i36 + i13;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i37);
                            this.zzl = zzl2;
                            int i38 = this.zzb;
                            System.arraycopy(sArr3, i23 * i38, zzl2, this.zzm * i38, i38 * i36);
                            zzj(i13, this.zzb, this.zzl, this.zzm + i36, sArr3, i34, sArr3, i23);
                            this.zzm += i37;
                            i23 += i13;
                        }
                    }
                } while (this.zzh + i23 <= i22);
                int i39 = this.zzk - i23;
                short[] sArr4 = this.zzj;
                int i40 = this.zzb;
                System.arraycopy(sArr4, i23 * i40, sArr4, 0, i40 * i39);
                this.zzk = i39;
            }
        }
        float f14 = this.zze * this.zzd;
        if (f14 != 1.0f && this.zzm != i21) {
            int i41 = this.zza;
            int i42 = (int) (i41 / f14);
            while (true) {
                if (i42 <= 16384 && i41 <= 16384) {
                    break;
                }
                i42 /= 2;
                i41 /= 2;
            }
            int i43 = this.zzm - i21;
            short[] zzl3 = zzl(this.zzn, this.zzo, i43);
            this.zzn = zzl3;
            short[] sArr5 = this.zzl;
            int i44 = this.zzb;
            System.arraycopy(sArr5, i21 * i44, zzl3, this.zzo * i44, i44 * i43);
            this.zzm = i21;
            this.zzo += i43;
            int i45 = 0;
            while (true) {
                i16 = this.zzo;
                i17 = i16 - 1;
                if (i45 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.zzp + 1;
                    int i46 = i18 * i42;
                    i19 = this.zzq;
                    if (i46 <= i19 * i41) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i47 = 0;
                    while (true) {
                        int i48 = this.zzb;
                        if (i47 < i48) {
                            short[] sArr6 = this.zzl;
                            int i49 = this.zzm * i48;
                            short[] sArr7 = this.zzn;
                            int i50 = (i45 * i48) + i47;
                            short s4 = sArr7[i50];
                            short s10 = sArr7[i50 + i48];
                            int i51 = this.zzp;
                            int i52 = i51 * i42;
                            int i53 = (i51 + 1) * i42;
                            int i54 = i53 - (this.zzq * i41);
                            int i55 = i53 - i52;
                            sArr6[i49 + i47] = (short) ((((i55 - i54) * s10) + (s4 * i54)) / i55);
                            i47++;
                        }
                    }
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i18;
                if (i18 == i41) {
                    this.zzp = 0;
                    if (i19 == i42) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzdi.zzf(z10);
                    this.zzq = 0;
                }
                i45++;
            }
            if (i17 != 0) {
                short[] sArr8 = this.zzn;
                int i56 = this.zzb;
                System.arraycopy(sArr8, i17 * i56, sArr8, 0, (i16 - i17) * i56);
                this.zzo -= i17;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i10 = this.zzm - min;
        this.zzm = i10;
        int i11 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        int i12 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zze;
        float f12 = this.zzd;
        int i13 = i12 + ((int) ((((i11 / (f10 / f12)) + this.zzo) / (f11 * f12)) + 0.5f));
        int i14 = this.zzh;
        this.zzj = zzl(this.zzj, i11, i14 + i14 + i11);
        int i15 = 0;
        while (true) {
            int i16 = this.zzh;
            int i17 = this.zzb;
            i10 = i16 + i16;
            if (i15 >= i10 * i17) {
                break;
            }
            this.zzj[(i17 * i11) + i15] = 0;
            i15++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i13) {
            this.zzm = i13;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] zzl = zzl(this.zzj, this.zzk, i11);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
