package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgzm<T> implements zzhae<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhaz.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgzj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhas zzm;
    private final zzgxj zzn;

    private zzgzm(int[] iArr, Object[] objArr, int i10, int i11, zzgzj zzgzjVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgzp zzgzpVar, zzgyw zzgywVar, zzhas zzhasVar, zzgxj zzgxjVar, zzgze zzgzeVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgzjVar instanceof zzgxy;
        boolean z11 = false;
        if (zzgxjVar != null && (zzgzjVar instanceof zzgxu)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzm = zzhasVar;
        this.zzn = zzgxjVar;
        this.zzg = zzgzjVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzhae zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzhae zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder f10 = android.support.v4.media.session.h.f("Field ", str, " for ", name, " not found. Known fields are ");
            f10.append(arrays);
            throw new RuntimeException(f10.toString());
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i10) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzhae zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzR(obj2, i11, i10)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i10) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzhae zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i10, zzgzw zzgzwVar) {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzhaz.zzv(obj, j10, zzgzwVar.zzs());
        } else if (this.zzi) {
            zzhaz.zzv(obj, j10, zzgzwVar.zzr());
        } else {
            zzhaz.zzv(obj, j10, zzgzwVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzhaz.zzt(obj, j10, (1 << (zzr >>> 20)) | zzhaz.zzd(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzhaz.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        if (zzN(obj, i10) == zzN(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i10) {
        if ((i10 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 == 1048575) {
            int zzu = zzu(i10);
            long j11 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhaz.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhaz.zzc(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhaz.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhaz.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhaz.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhaz.zzz(obj, j11);
                case 8:
                    Object zzh = zzhaz.zzh(obj, j11);
                    if (zzh instanceof String) {
                        if (((String) zzh).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzh instanceof zzgwm) {
                        if (zzgwm.zzb.equals(zzh)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzhaz.zzh(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgwm.zzb.equals(zzhaz.zzh(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhaz.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhaz.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhaz.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhaz.zzh(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhaz.zzd(obj, j10) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i10, zzhae zzhaeVar) {
        return zzhaeVar.zzl(zzhaz.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgxy) {
            return ((zzgxy) obj).zzcf();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzhaz.zzd(obj, zzr(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzhaz.zzh(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzhbh zzhbhVar) {
        if (obj instanceof String) {
            zzhbhVar.zzG(i10, (String) obj);
        } else {
            zzhbhVar.zzd(i10, (zzgwm) obj);
        }
    }

    public static zzhat zzd(Object obj) {
        zzgxy zzgxyVar = (zzgxy) obj;
        zzhat zzhatVar = zzgxyVar.zzt;
        if (zzhatVar == zzhat.zzc()) {
            zzhat zzf = zzhat.zzf();
            zzgxyVar.zzt = zzf;
            return zzf;
        }
        return zzhatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgzm zzm(java.lang.Class r33, com.google.android.gms.internal.ads.zzgzg r34, com.google.android.gms.internal.ads.zzgzp r35, com.google.android.gms.internal.ads.zzgyw r36, com.google.android.gms.internal.ads.zzhas r37, com.google.android.gms.internal.ads.zzgxj r38, com.google.android.gms.internal.ads.zzgze r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzm.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzp, com.google.android.gms.internal.ads.zzgyw, com.google.android.gms.internal.ads.zzhas, com.google.android.gms.internal.ads.zzgxj, com.google.android.gms.internal.ads.zzgze):com.google.android.gms.internal.ads.zzgzm");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzhaz.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzhaz.zzh(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzhaz.zzh(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzs(i10, 0);
        }
        return -1;
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzhaz.zzh(obj, j10)).longValue();
    }

    private final zzgye zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgye) this.zzd[i11 + i11 + 1];
    }

    private final zzhae zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhae zzhaeVar = (zzhae) objArr[i12];
        if (zzhaeVar != null) {
            return zzhaeVar;
        }
        zzhae zzb2 = zzgzt.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzhas zzhasVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh = zzhaz.zzh(obj, zzu(i10) & 1048575);
        if (zzh == null || zzw(i10) == null) {
            return obj2;
        }
        zzgzd zzgzdVar = (zzgzd) zzh;
        zzgzc zzgzcVar = (zzgzc) zzz(i10);
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzD5;
        int zzd;
        int zzD6;
        int zzh;
        int i14;
        int size;
        int zzl;
        int zzD7;
        int zzD8;
        int i15;
        int i16;
        Unsafe unsafe = zzb;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        while (i18 < this.zzc.length) {
            int zzu = zzu(i18);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i23 = iArr[i18];
            int i24 = iArr[i18 + 2];
            int i25 = i24 & i20;
            if (zzt <= 17) {
                if (i25 != i21) {
                    if (i25 == i20) {
                        i17 = i22;
                        i10 = i17;
                    } else {
                        i10 = i22;
                        i17 = unsafe.getInt(obj, i25);
                    }
                    i21 = i25;
                } else {
                    i10 = i22;
                }
                i11 = i17;
                i13 = 1 << (i24 >>> 20);
                i12 = i21;
            } else {
                i10 = i22;
                i11 = i17;
                i12 = i21;
                i13 = i10;
            }
            int i26 = zzu & i20;
            if (zzt >= zzgxo.zzJ.zza()) {
                zzgxo.zzW.zza();
            }
            long j10 = i26;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(j11);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j12 = unsafe.getLong(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(j12);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(unsafe.getInt(obj, j10));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD4 = zzgxd.zzD(i23 << 3);
                        zzh = zzD4 + 1;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i27 = i23 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzgwm) {
                            zzD5 = zzgxd.zzD(i27);
                            zzd = ((zzgwm) object).zzd();
                            zzD6 = zzgxd.zzD(zzd);
                            i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                            break;
                        } else {
                            zzD3 = zzgxd.zzD(i27);
                            zzE = zzgxd.zzC((String) object);
                            i19 = zzE + zzD3 + i19;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzhag.zzh(i23, unsafe.getObject(obj, j10), zzx(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD5 = zzgxd.zzD(i23 << 3);
                        zzd = ((zzgwm) unsafe.getObject(obj, j10)).zzd();
                        zzD6 = zzgxd.zzD(zzd);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i28 = unsafe.getInt(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzD(i28);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(unsafe.getInt(obj, j10));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i29 = unsafe.getInt(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzD((i29 >> 31) ^ (i29 + i29));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j13 = unsafe.getLong(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE((j13 >> 63) ^ (j13 + j13));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzgxd.zzy(i23, (zzgzj) unsafe.getObject(obj, j10), zzx(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzhag.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 19:
                    zzh = zzhag.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 20:
                    i14 = i10;
                    List list = (List) unsafe.getObject(obj, j10);
                    int i30 = zzhag.zza;
                    if (list.size() != 0) {
                        i14 = (zzgxd.zzD(i23 << 3) * list.size()) + zzhag.zzg(list);
                    }
                    i19 += i14;
                    break;
                case 21:
                    i14 = i10;
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzhag.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzhag.zzl(list2);
                        zzD7 = zzgxd.zzD(i23 << 3);
                        int i32 = size;
                        i15 = zzD7;
                        i16 = i32;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 22:
                    i14 = i10;
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzhag.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzhag.zzf(list3);
                        zzD7 = zzgxd.zzD(i23 << 3);
                        int i322 = size;
                        i15 = zzD7;
                        i16 = i322;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 23:
                    zzh = zzhag.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 24:
                    zzh = zzhag.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 25:
                    i14 = i10;
                    int i34 = zzhag.zza;
                    int size2 = ((List) unsafe.getObject(obj, j10)).size();
                    if (size2 != 0) {
                        i14 = (zzgxd.zzD(i23 << 3) + 1) * size2;
                    }
                    i19 += i14;
                    break;
                case 26:
                    i14 = i10;
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzhag.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzD8 = zzgxd.zzD(i23 << 3) * size3;
                        if (list4 instanceof zzgyv) {
                            zzgyv zzgyvVar = (zzgyv) list4;
                            while (i14 < size3) {
                                Object zzc = zzgyvVar.zzc();
                                if (zzc instanceof zzgwm) {
                                    int zzd2 = ((zzgwm) zzc).zzd();
                                    zzD8 = zzgxd.zzD(zzd2) + zzd2 + zzD8;
                                } else {
                                    zzD8 = zzgxd.zzC((String) zzc) + zzD8;
                                }
                                i14++;
                            }
                        } else {
                            while (i14 < size3) {
                                Object obj2 = list4.get(i14);
                                if (obj2 instanceof zzgwm) {
                                    int zzd3 = ((zzgwm) obj2).zzd();
                                    zzD8 = zzgxd.zzD(zzd3) + zzd3 + zzD8;
                                } else {
                                    zzD8 = zzgxd.zzC((String) obj2) + zzD8;
                                }
                                i14++;
                            }
                        }
                        i14 = zzD8;
                    }
                    i19 += i14;
                    break;
                case 27:
                    i14 = i10;
                    List list5 = (List) unsafe.getObject(obj, j10);
                    zzhae zzx = zzx(i18);
                    int i36 = zzhag.zza;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int zzD9 = zzgxd.zzD(i23 << 3) * size4;
                        while (i14 < size4) {
                            Object obj3 = list5.get(i14);
                            if (obj3 instanceof zzgyu) {
                                int zza2 = ((zzgyu) obj3).zza();
                                zzD9 = zzgxd.zzD(zza2) + zza2 + zzD9;
                            } else {
                                zzD9 = zzgxd.zzA((zzgzj) obj3, zzx) + zzD9;
                            }
                            i14++;
                        }
                        i14 = zzD9;
                    }
                    i19 += i14;
                    break;
                case 28:
                    i14 = i10;
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzhag.zza;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        zzD8 = zzgxd.zzD(i23 << 3) * size5;
                        while (i14 < list6.size()) {
                            int zzd4 = ((zzgwm) list6.get(i14)).zzd();
                            zzD8 += zzgxd.zzD(zzd4) + zzd4;
                            i14++;
                        }
                        i14 = zzD8;
                    }
                    i19 += i14;
                    break;
                case 29:
                    i14 = i10;
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i38 = zzhag.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzl = zzhag.zzk(list7);
                        zzD7 = zzgxd.zzD(i23 << 3);
                        int i3222 = size;
                        i15 = zzD7;
                        i16 = i3222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 30:
                    i14 = i10;
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzhag.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzhag.zza(list8);
                        zzD7 = zzgxd.zzD(i23 << 3);
                        int i32222 = size;
                        i15 = zzD7;
                        i16 = i32222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 31:
                    zzh = zzhag.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 32:
                    zzh = zzhag.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzhag.zza;
                    i16 = list9.size();
                    if (i16 != 0) {
                        zzl = zzhag.zzi(list9);
                        i15 = zzgxd.zzD(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzhag.zza;
                    i16 = list10.size();
                    if (i16 != 0) {
                        zzl = zzhag.zzj(list10);
                        i15 = zzgxd.zzD(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 35:
                    zzD5 = zzhag.zze((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzD5 = zzhag.zzc((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzD5 = zzhag.zzg((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzD5 = zzhag.zzl((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzD5 = zzhag.zzf((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzD5 = zzhag.zze((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzD5 = zzhag.zzc((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i42 = zzhag.zza;
                    zzD5 = ((List) unsafe.getObject(obj, j10)).size();
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzD5 = zzhag.zzk((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzD5 = zzhag.zza((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzD5 = zzhag.zzc((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzD5 = zzhag.zze((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzD5 = zzhag.zzi((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzD5 = zzhag.zzj((List) unsafe.getObject(obj, j10));
                    if (zzD5 > 0) {
                        zzd = zzgxd.zzD(i23 << 3);
                        zzD6 = zzgxd.zzD(zzD5);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    zzhae zzx2 = zzx(i18);
                    int i43 = zzhag.zza;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        zzD8 = i10;
                        while (i10 < size6) {
                            zzD8 += zzgxd.zzy(i23, (zzgzj) list11.get(i10), zzx2);
                            i10++;
                        }
                        i14 = zzD8;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 50:
                    zzgzd zzgzdVar = (zzgzd) unsafe.getObject(obj, j10);
                    zzgzc zzgzcVar = (zzgzc) zzz(i18);
                    if (zzgzdVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgzdVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i23, i18)) {
                        long zzv = zzv(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(zzv);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i23, i18)) {
                        long zzv2 = zzv(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(zzv2);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i23, i18)) {
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(zzp(obj, j10));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i23, i18)) {
                        zzD4 = zzgxd.zzD(i23 << 3);
                        zzh = zzD4 + 1;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i23, i18)) {
                        int i44 = i23 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzgwm) {
                            zzD5 = zzgxd.zzD(i44);
                            zzd = ((zzgwm) object2).zzd();
                            zzD6 = zzgxd.zzD(zzd);
                            i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                            break;
                        } else {
                            zzD3 = zzgxd.zzD(i44);
                            zzE = zzgxd.zzC((String) object2);
                            i19 = zzE + zzD3 + i19;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzhag.zzh(i23, unsafe.getObject(obj, j10), zzx(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i23, i18)) {
                        zzD5 = zzgxd.zzD(i23 << 3);
                        zzd = ((zzgwm) unsafe.getObject(obj, j10)).zzd();
                        zzD6 = zzgxd.zzD(zzd);
                        i19 = androidx.activity.f.g(zzD6, zzd, zzD5, i19);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i23, i18)) {
                        int zzp = zzp(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzD(zzp);
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i23, i18)) {
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE(zzp(obj, j10));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgxd.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgxd.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i23, i18)) {
                        int zzp2 = zzp(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzD((zzp2 >> 31) ^ (zzp2 + zzp2));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i23, i18)) {
                        long zzv3 = zzv(obj, j10);
                        zzD3 = zzgxd.zzD(i23 << 3);
                        zzE = zzgxd.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i19 = zzE + zzD3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzgxd.zzy(i23, (zzgzj) unsafe.getObject(obj, j10), zzx(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
            }
            i18 += 3;
            i22 = 0;
            i20 = 1048575;
            i17 = i11;
            i21 = i12;
        }
        int zza3 = ((zzgxy) obj).zzt.zza() + i19;
        if (this.zzh) {
            zzgxn zzgxnVar = ((zzgxu) obj).zza;
            int i45 = 0;
            for (int i46 = 0; i46 < zzgxnVar.zza.zzb(); i46++) {
                Map.Entry zzg = zzgxnVar.zza.zzg(i46);
                i45 += zzgxn.zzc((zzgxm) zzg.getKey(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzgxnVar.zza.zzc()) {
                i45 += zzgxn.zzc((zzgxm) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i45;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzd;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int zzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i16 = iArr[i14];
            long j10 = i15;
            int i17 = 37;
            switch (zzt) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhaz.zzb(obj, j10));
                    byte[] bArr = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 1:
                    i11 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhaz.zzc(obj, j10));
                    i13 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j10);
                    byte[] bArr2 = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j10);
                    byte[] bArr3 = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 4:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j10);
                    byte[] bArr4 = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 6:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 7:
                    i11 = i13 * 53;
                    floatToIntBits = zzgyl.zza(zzhaz.zzz(obj, j10));
                    i13 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    floatToIntBits = ((String) zzhaz.zzh(obj, j10)).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object zzh = zzhaz.zzh(obj, j10);
                    if (zzh != null) {
                        i17 = zzh.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 10:
                    i11 = i13 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 12:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 13:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j10);
                    byte[] bArr5 = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 15:
                    i10 = i13 * 53;
                    zzd = zzhaz.zzd(obj, j10);
                    i13 = i10 + zzd;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j10);
                    byte[] bArr6 = zzgyl.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object zzh2 = zzhaz.zzh(obj, j10);
                    if (zzh2 != null) {
                        i17 = zzh2.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzgyl.zza(zzS(obj, j10));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = ((String) zzhaz.zzh(obj, j10)).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j10);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzgyl.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzgxy) obj).zzt.hashCode() + (i13 * 53);
        if (this.zzh) {
            return (hashCode * 53) + ((zzgxu) obj).zza.zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b6f, code lost:
        if (r5 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b71, code lost:
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b75, code lost:
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b7a, code lost:
        if (r11 >= r12.zzl) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b7c, code lost:
        zzy(r34, r12.zzj[r11], null, r12.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b8f, code lost:
        if (r9 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b91, code lost:
        if (r6 != r10) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b98, code lost:
        throw com.google.android.gms.internal.ads.zzgyn.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b99, code lost:
        if (r6 > r10) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b9b, code lost:
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b9d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ba2, code lost:
        throw com.google.android.gms.internal.ads.zzgyn.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x04c4 -> B:190:0x04c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x0564 -> B:223:0x0565). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:242:0x05b4 -> B:243:0x05b5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgwa r39) {
        /*
            Method dump skipped, instructions count: 3124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgwa):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final Object zze() {
        return ((zzgxy) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgxy) {
                zzgxy zzgxyVar = (zzgxy) obj;
                zzgxyVar.zzbV();
                zzgxyVar.zzbU();
                zzgxyVar.zzbX();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzgyk) zzhaz.zzh(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzgzd) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzr(obj, j10, zzhaz.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzs(obj, j10, zzhaz.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzu(obj, j10, zzhaz.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzu(obj, j10, zzhaz.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzu(obj, j10, zzhaz.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzp(obj, j10, zzhaz.zzz(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzv(obj, j10, zzhaz.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzv(obj, j10, zzhaz.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzu(obj, j10, zzhaz.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzt(obj, j10, zzhaz.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzhaz.zzu(obj, j10, zzhaz.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzgyk zzgykVar = (zzgyk) zzhaz.zzh(obj, j10);
                    zzgyk zzgykVar2 = (zzgyk) zzhaz.zzh(obj2, j10);
                    int size = zzgykVar.size();
                    int size2 = zzgykVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgykVar.zzc()) {
                            zzgykVar = zzgykVar.zzf(size2 + size);
                        }
                        zzgykVar.addAll(zzgykVar2);
                    }
                    if (size > 0) {
                        zzgykVar2 = zzgykVar;
                    }
                    zzhaz.zzv(obj, j10, zzgykVar2);
                    break;
                case 50:
                    int i13 = zzhag.zza;
                    zzhaz.zzv(obj, j10, zzgze.zzb(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i12, i10)) {
                        zzhaz.zzv(obj, j10, zzhaz.zzh(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzhaz.zzv(obj, j10, zzhaz.zzh(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzhag.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzhag.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x051d A[LOOP:5: B:143:0x0519->B:145:0x051d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x052e  */
    @Override // com.google.android.gms.internal.ads.zzhae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r10, com.google.android.gms.internal.ads.zzgzw r11, com.google.android.gms.internal.ads.zzgxi r12) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzm.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgzw, com.google.android.gms.internal.ads.zzgxi):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgwa zzgwaVar) {
        zzc(obj, bArr, i10, i11, 0, zzgwaVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0683  */
    @Override // com.google.android.gms.internal.ads.zzhae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzhbh r25) {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzm.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhbh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzJ;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzhaz.zzb(obj, j10)) == Double.doubleToLongBits(zzhaz.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzhaz.zzc(obj, j10)) == Float.floatToIntBits(zzhaz.zzc(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzhaz.zzf(obj, j10) == zzhaz.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzhaz.zzf(obj, j10) == zzhaz.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzhaz.zzf(obj, j10) == zzhaz.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzhaz.zzz(obj, j10) == zzhaz.zzz(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzhaz.zzf(obj, j10) == zzhaz.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzhaz.zzd(obj, j10) == zzhaz.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzhaz.zzf(obj, j10) == zzhaz.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzJ = zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10));
                    break;
                case 50:
                    zzJ = zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzr = zzr(i10) & 1048575;
                    if (zzhaz.zzd(obj, zzr) == zzhaz.zzd(obj2, zzr) && zzhag.zzJ(zzhaz.zzh(obj, j10), zzhaz.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzJ) {
                return false;
            }
        }
        if (!((zzgxy) obj).zzt.equals(((zzgxy) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgxu) obj).zza.equals(((zzgxu) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzgzd) zzhaz.zzh(obj, zzu & 1048575)).isEmpty()) {
                                zzgzc zzgzcVar = (zzgzc) zzz(i15);
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                        return false;
                    }
                }
                List list = (List) zzhaz.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhae zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (this.zzh && !((zzgxu) obj).zza.zzi()) {
            return false;
        }
        return true;
    }
}
