package com.google.android.gms.internal.measurement;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzjo {
    public static int zza(byte[] bArr, int i10, zzjn zzjnVar) {
        int zzj = zzj(bArr, i10, zzjnVar);
        int i11 = zzjnVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzjnVar.zzc = zzka.zzb;
                    return zzj;
                }
                zzjnVar.zzc = zzka.zzl(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzll.zzf();
        }
        throw zzll.zzd();
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i10, int i11, int i12, zzjn zzjnVar) {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i10, i11, i12, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i10, int i11, zzjn zzjnVar) {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i10, i11, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzmt zzmtVar, int i10, byte[] bArr, int i11, int i12, zzli zzliVar, zzjn zzjnVar) {
        int zzd = zzd(zzmtVar, bArr, i11, i12, zzjnVar);
        zzliVar.add(zzjnVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzjnVar);
            if (i10 != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i12, zzjnVar);
            zzliVar.add(zzjnVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i10, zzjnVar);
        int i11 = zzjnVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i10, zzjn zzjnVar) {
        int zzj = zzj(bArr, i10, zzjnVar);
        int i11 = zzjnVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            zzjnVar.zzc = new String(bArr, zzj, i11, zzlj.zzb);
            return zzj + i11;
        }
        throw zzll.zzd();
    }

    public static int zzh(byte[] bArr, int i10, zzjn zzjnVar) {
        int zzj = zzj(bArr, i10, zzjnVar);
        int i11 = zzjnVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            int i12 = zznz.zza;
            int length = bArr.length;
            if ((((length - zzj) - i11) | zzj | i11) >= 0) {
                int i13 = zzj + i11;
                char[] cArr = new char[i11];
                int i14 = 0;
                while (zzj < i13) {
                    byte b10 = bArr[zzj];
                    if (!zznv.zzd(b10)) {
                        break;
                    }
                    zzj++;
                    cArr[i14] = (char) b10;
                    i14++;
                }
                while (zzj < i13) {
                    int i15 = zzj + 1;
                    byte b11 = bArr[zzj];
                    if (zznv.zzd(b11)) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        zzj = i15;
                        while (true) {
                            i14 = i16;
                            if (zzj < i13) {
                                byte b12 = bArr[zzj];
                                if (zznv.zzd(b12)) {
                                    zzj++;
                                    i16 = i14 + 1;
                                    cArr[i14] = (char) b12;
                                }
                            }
                        }
                    } else if (b11 < -32) {
                        if (i15 < i13) {
                            zznv.zzc(b11, bArr[i15], cArr, i14);
                            zzj = i15 + 1;
                            i14++;
                        } else {
                            throw zzll.zzc();
                        }
                    } else if (b11 < -16) {
                        if (i15 < i13 - 1) {
                            int i17 = i15 + 1;
                            zznv.zzb(b11, bArr[i15], bArr[i17], cArr, i14);
                            zzj = i17 + 1;
                            i14++;
                        } else {
                            throw zzll.zzc();
                        }
                    } else if (i15 < i13 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        zznv.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        i14 += 2;
                        zzj = i19 + 1;
                    } else {
                        throw zzll.zzc();
                    }
                }
                zzjnVar.zzc = new String(cArr, 0, i14);
                return i13;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i11)));
        }
        throw zzll.zzd();
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zznl zznlVar, zzjn zzjnVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zznlVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzll.zzb();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zznl zzf = zznl.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzj = zzj(bArr, i11, zzjnVar);
                            int i16 = zzjnVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzi = zzi(i15, bArr, zzj, i12, zzf, zzjnVar);
                                i15 = i16;
                                i11 = zzi;
                            } else {
                                i11 = zzj;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zznlVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzll.zze();
                    }
                    int zzj2 = zzj(bArr, i11, zzjnVar);
                    int i17 = zzjnVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzj2) {
                            if (i17 == 0) {
                                zznlVar.zzj(i10, zzka.zzb);
                            } else {
                                zznlVar.zzj(i10, zzka.zzl(bArr, zzj2, i17));
                            }
                            return zzj2 + i17;
                        }
                        throw zzll.zzf();
                    }
                    throw zzll.zzd();
                }
                zznlVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            }
            int zzm = zzm(bArr, i11, zzjnVar);
            zznlVar.zzj(i10, Long.valueOf(zzjnVar.zzb));
            return zzm;
        }
        throw zzll.zzb();
    }

    public static int zzj(byte[] bArr, int i10, zzjn zzjnVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzjnVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzjnVar);
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzjn zzjnVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & ShapeTypes.VERTICAL_SCROLL;
        if (b10 >= 0) {
            zzjnVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzjnVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzjnVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzjnVar.zza = i18 | (b13 << Field.NUMCHARS);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzjnVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i11, zzjnVar);
        zzlcVar.zzh(zzjnVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzjnVar);
            if (i10 != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i10, zzjn zzjnVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzjnVar.zzb = j10;
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
        zzjnVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i10, int i11, int i12, zzjn zzjnVar) {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i10, i11, i12, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i10, int i11, zzjn zzjnVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzjnVar);
            i13 = zzjnVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzmtVar.zzh(obj, bArr, i14, i15, zzjnVar);
            zzjnVar.zzc = obj;
            return i15;
        }
        throw zzll.zzf();
    }

    public static long zzp(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
