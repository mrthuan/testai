package com.google.android.gms.internal.play_billing;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzbd {
    public static int zza(byte[] bArr, int i10, zzbc zzbcVar) {
        int zzh = zzh(bArr, i10, zzbcVar);
        int i11 = zzbcVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzh) {
                if (i11 == 0) {
                    zzbcVar.zzc = zzbq.zzb;
                    return zzh;
                }
                zzbcVar.zzc = zzbq.zzl(bArr, zzh, i11);
                return zzh + i11;
            }
            throw zzdc.zzg();
        }
        throw zzdc.zzd();
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzeo zzeoVar, byte[] bArr, int i10, int i11, int i12, zzbc zzbcVar) {
        Object zze = zzeoVar.zze();
        int zzl = zzl(zze, zzeoVar, bArr, i10, i11, i12, zzbcVar);
        zzeoVar.zzf(zze);
        zzbcVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzeo zzeoVar, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        Object zze = zzeoVar.zze();
        int zzm = zzm(zze, zzeoVar, bArr, i10, i11, zzbcVar);
        zzeoVar.zzf(zze);
        zzbcVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzeo zzeoVar, int i10, byte[] bArr, int i11, int i12, zzcz zzczVar, zzbc zzbcVar) {
        int zzd = zzd(zzeoVar, bArr, i11, i12, zzbcVar);
        zzczVar.add(zzbcVar.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzbcVar);
            if (i10 != zzbcVar.zza) {
                break;
            }
            zzd = zzd(zzeoVar, bArr, zzh, i12, zzbcVar);
            zzczVar.add(zzbcVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int zzh = zzh(bArr, i10, zzbcVar);
        int i11 = zzbcVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzdc.zzg();
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzfg zzfgVar, zzbc zzbcVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzfgVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzdc.zzb();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzfg zzf = zzfg.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzh = zzh(bArr, i11, zzbcVar);
                            int i16 = zzbcVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzg = zzg(i15, bArr, zzh, i12, zzf, zzbcVar);
                                i15 = i16;
                                i11 = zzg;
                            } else {
                                i11 = zzh;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzfgVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzdc.zze();
                    }
                    int zzh2 = zzh(bArr, i11, zzbcVar);
                    int i17 = zzbcVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzh2) {
                            if (i17 == 0) {
                                zzfgVar.zzj(i10, zzbq.zzb);
                            } else {
                                zzfgVar.zzj(i10, zzbq.zzl(bArr, zzh2, i17));
                            }
                            return zzh2 + i17;
                        }
                        throw zzdc.zzg();
                    }
                    throw zzdc.zzd();
                }
                zzfgVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            }
            int zzk = zzk(bArr, i11, zzbcVar);
            zzfgVar.zzj(i10, Long.valueOf(zzbcVar.zzb));
            return zzk;
        }
        throw zzdc.zzb();
    }

    public static int zzh(byte[] bArr, int i10, zzbc zzbcVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzbcVar.zza = b10;
            return i11;
        }
        return zzi(b10, bArr, i11, zzbcVar);
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzbc zzbcVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & ShapeTypes.VERTICAL_SCROLL;
        if (b10 >= 0) {
            zzbcVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzbcVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzbcVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzbcVar.zza = i18 | (b13 << Field.NUMCHARS);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzbcVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int zzh = zzh(bArr, i11, zzbcVar);
        zzctVar.zzg(zzbcVar.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzbcVar);
            if (i10 != zzbcVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i10, zzbc zzbcVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzbcVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzbcVar.zzb = j11;
        return i12;
    }

    public static int zzl(Object obj, zzeo zzeoVar, byte[] bArr, int i10, int i11, int i12, zzbc zzbcVar) {
        int zzc = ((zzef) zzeoVar).zzc(obj, bArr, i10, i11, i12, zzbcVar);
        zzbcVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzeo zzeoVar, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzbcVar);
            i13 = zzbcVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzeoVar.zzh(obj, bArr, i14, i15, zzbcVar);
            zzbcVar.zzc = obj;
            return i15;
        }
        throw zzdc.zzg();
    }

    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
