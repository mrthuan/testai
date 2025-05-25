package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.h;
import androidx.activity.f;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i10, int i11, zzec zzecVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (!zzI(obj2, i10)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzs = zzs(i10) & 1048575;
        Object object = unsafe.getObject(obj2, zzs);
        if (object != null) {
            zzeo zzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzs);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, zzs, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzM(obj2, i11, i10)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzs = zzs(i10) & 1048575;
        Object object = unsafe.getObject(obj2, zzs);
        if (object != null) {
            zzeo zzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, zzs, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, zzs, zze);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzs);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, zzs, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzD(Object obj, int i10) {
        int zzp = zzp(i10);
        long j10 = 1048575 & zzp;
        if (j10 == 1048575) {
            return;
        }
        zzfp.zzq(obj, j10, (1 << (zzp >>> 20)) | zzfp.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzfp.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        if (zzI(obj, i10) == zzI(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzI(Object obj, int i10) {
        int zzp = zzp(i10);
        long j10 = zzp & 1048575;
        if (j10 == 1048575) {
            int zzs = zzs(i10);
            long j11 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzfp.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzfp.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzfp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzfp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzfp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzfp.zzw(obj, j11);
                case 8:
                    Object zzf = zzfp.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzbq) {
                        if (zzbq.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzfp.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzbq.zzb.equals(zzfp.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzfp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzfp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzfp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzfp.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzfp.zzc(obj, j10) & (1 << (zzp >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzI(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzK(Object obj, int i10, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        if (zzfp.zzc(obj, zzp(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzfp.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzfx zzfxVar) {
        if (obj instanceof String) {
            zzfxVar.zzG(i10, (String) obj);
        } else {
            zzfxVar.zzd(i10, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar == zzfg.zzc()) {
            zzfg zzf = zzfg.zzf();
            zzcsVar.zzc = zzf;
            return zzf;
        }
        return zzfgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzdz r34, com.google.android.gms.internal.play_billing.zzei r35, com.google.android.gms.internal.play_billing.zzdq r36, com.google.android.gms.internal.play_billing.zzff r37, com.google.android.gms.internal.play_billing.zzce r38, com.google.android.gms.internal.play_billing.zzdx r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzfp.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzfp.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzfp.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
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

    private static int zzr(int i10) {
        return (i10 >>> 20) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzfp.zzf(obj, j10)).longValue();
    }

    private final zzcw zzu(int i10) {
        int i11 = i10 / 3;
        return (zzcw) this.zzd[i11 + i11 + 1];
    }

    private final zzeo zzv(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzeo zzeoVar = (zzeo) objArr[i12];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzb2 = zzel.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzeo zzv = zzv(i10);
        int zzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzeo zzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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
            StringBuilder f10 = h.f("Field ", str, " for ", name, " not found. Known fields are ");
            f10.append(arrays);
            throw new RuntimeException(f10.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzw5;
        int zzd;
        int zzw6;
        int zzh;
        int i14;
        int size;
        int zzl;
        int zzw7;
        int zzw8;
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
            int zzs = zzs(i18);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i23 = iArr[i18];
            int i24 = iArr[i18 + 2];
            int i25 = i24 & i20;
            if (zzr <= 17) {
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
            int i26 = zzs & i20;
            if (zzr >= zzcj.zzJ.zza()) {
                zzcj.zzW.zza();
            }
            long j10 = i26;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(j11);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        long j12 = unsafe.getLong(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(j12);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(unsafe.getInt(obj, j10));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw4 = zzby.zzw(i23 << 3);
                        zzh = zzw4 + 1;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        int i27 = i23 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzbq) {
                            zzw5 = zzby.zzw(i27);
                            zzd = ((zzbq) object).zzd();
                            zzw6 = zzby.zzw(zzd);
                            i19 = f.g(zzw6, zzd, zzw5, i19);
                            break;
                        } else {
                            zzw3 = zzby.zzw(i27);
                            zzx = zzby.zzv((String) object);
                            i19 = zzx + zzw3 + i19;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzh = zzeq.zzh(i23, unsafe.getObject(obj, j10), zzv(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw5 = zzby.zzw(i23 << 3);
                        zzd = ((zzbq) unsafe.getObject(obj, j10)).zzd();
                        zzw6 = zzby.zzw(zzd);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        int i28 = unsafe.getInt(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzw(i28);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(unsafe.getInt(obj, j10));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        int i29 = unsafe.getInt(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzw((i29 >> 31) ^ (i29 + i29));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        long j13 = unsafe.getLong(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx((j13 >> 63) ^ (j13 + j13));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i18, i12, i11, i13)) {
                        zzh = zzby.zzt(i23, (zzec) unsafe.getObject(obj, j10), zzv(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzeq.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 19:
                    zzh = zzeq.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 20:
                    i14 = i10;
                    List list = (List) unsafe.getObject(obj, j10);
                    int i30 = zzeq.zza;
                    if (list.size() != 0) {
                        i14 = (zzby.zzw(i23 << 3) * list.size()) + zzeq.zzg(list);
                    }
                    i19 += i14;
                    break;
                case 21:
                    i14 = i10;
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzeq.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzeq.zzl(list2);
                        zzw7 = zzby.zzw(i23 << 3);
                        int i32 = size;
                        i15 = zzw7;
                        i16 = i32;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 22:
                    i14 = i10;
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzeq.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzeq.zzf(list3);
                        zzw7 = zzby.zzw(i23 << 3);
                        int i322 = size;
                        i15 = zzw7;
                        i16 = i322;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 23:
                    zzh = zzeq.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 24:
                    zzh = zzeq.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 25:
                    i14 = i10;
                    int i34 = zzeq.zza;
                    int size2 = ((List) unsafe.getObject(obj, j10)).size();
                    if (size2 != 0) {
                        i14 = (zzby.zzw(i23 << 3) + 1) * size2;
                    }
                    i19 += i14;
                    break;
                case 26:
                    i14 = i10;
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzeq.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzw8 = zzby.zzw(i23 << 3) * size3;
                        if (list4 instanceof zzdk) {
                            zzdk zzdkVar = (zzdk) list4;
                            while (i14 < size3) {
                                Object zzf = zzdkVar.zzf(i14);
                                if (zzf instanceof zzbq) {
                                    int zzd2 = ((zzbq) zzf).zzd();
                                    zzw8 = zzby.zzw(zzd2) + zzd2 + zzw8;
                                } else {
                                    zzw8 = zzby.zzv((String) zzf) + zzw8;
                                }
                                i14++;
                            }
                        } else {
                            while (i14 < size3) {
                                Object obj2 = list4.get(i14);
                                if (obj2 instanceof zzbq) {
                                    int zzd3 = ((zzbq) obj2).zzd();
                                    zzw8 = zzby.zzw(zzd3) + zzd3 + zzw8;
                                } else {
                                    zzw8 = zzby.zzv((String) obj2) + zzw8;
                                }
                                i14++;
                            }
                        }
                        i14 = zzw8;
                    }
                    i19 += i14;
                    break;
                case 27:
                    i14 = i10;
                    List list5 = (List) unsafe.getObject(obj, j10);
                    zzeo zzv = zzv(i18);
                    int i36 = zzeq.zza;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int zzw9 = zzby.zzw(i23 << 3) * size4;
                        while (i14 < size4) {
                            Object obj3 = list5.get(i14);
                            if (obj3 instanceof zzdi) {
                                int zza2 = ((zzdi) obj3).zza();
                                zzw9 = zzby.zzw(zza2) + zza2 + zzw9;
                            } else {
                                zzw9 = zzby.zzu((zzec) obj3, zzv) + zzw9;
                            }
                            i14++;
                        }
                        i14 = zzw9;
                    }
                    i19 += i14;
                    break;
                case 28:
                    i14 = i10;
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzeq.zza;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        zzw8 = zzby.zzw(i23 << 3) * size5;
                        while (i14 < list6.size()) {
                            int zzd4 = ((zzbq) list6.get(i14)).zzd();
                            zzw8 += zzby.zzw(zzd4) + zzd4;
                            i14++;
                        }
                        i14 = zzw8;
                    }
                    i19 += i14;
                    break;
                case 29:
                    i14 = i10;
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i38 = zzeq.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzl = zzeq.zzk(list7);
                        zzw7 = zzby.zzw(i23 << 3);
                        int i3222 = size;
                        i15 = zzw7;
                        i16 = i3222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 30:
                    i14 = i10;
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzeq.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzeq.zza(list8);
                        zzw7 = zzby.zzw(i23 << 3);
                        int i32222 = size;
                        i15 = zzw7;
                        i16 = i32222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    break;
                case 31:
                    zzh = zzeq.zzb(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 32:
                    zzh = zzeq.zzd(i23, (List) unsafe.getObject(obj, j10), i10);
                    i19 += zzh;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzeq.zza;
                    i16 = list9.size();
                    if (i16 != 0) {
                        zzl = zzeq.zzi(list9);
                        i15 = zzby.zzw(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzeq.zza;
                    i16 = list10.size();
                    if (i16 != 0) {
                        zzl = zzeq.zzj(list10);
                        i15 = zzby.zzw(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 35:
                    zzw5 = zzeq.zze((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzw5 = zzeq.zzc((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzw5 = zzeq.zzg((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzw5 = zzeq.zzl((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzw5 = zzeq.zzf((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzw5 = zzeq.zze((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzw5 = zzeq.zzc((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i42 = zzeq.zza;
                    zzw5 = ((List) unsafe.getObject(obj, j10)).size();
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzw5 = zzeq.zzk((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzw5 = zzeq.zza((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzw5 = zzeq.zzc((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzw5 = zzeq.zze((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzw5 = zzeq.zzi((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzw5 = zzeq.zzj((List) unsafe.getObject(obj, j10));
                    if (zzw5 > 0) {
                        zzd = zzby.zzw(i23 << 3);
                        zzw6 = zzby.zzw(zzw5);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    zzeo zzv2 = zzv(i18);
                    int i43 = zzeq.zza;
                    int size6 = list11.size();
                    if (size6 != 0) {
                        zzw8 = i10;
                        while (i10 < size6) {
                            zzw8 += zzby.zzt(i23, (zzec) list11.get(i10), zzv2);
                            i10++;
                        }
                        i14 = zzw8;
                        i19 += i14;
                        break;
                    }
                    i14 = i10;
                    i19 += i14;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj, j10);
                    zzdv zzdvVar = (zzdv) zzw(i18);
                    if (zzdwVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzdwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzM(obj, i23, i18)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i23, i18)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i23, i18)) {
                        long zzt = zzt(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(zzt);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i23, i18)) {
                        long zzt2 = zzt(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(zzt2);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i23, i18)) {
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(zzo(obj, j10));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i23, i18)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i23, i18)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i23, i18)) {
                        zzw4 = zzby.zzw(i23 << 3);
                        zzh = zzw4 + 1;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i23, i18)) {
                        int i44 = i23 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzbq) {
                            zzw5 = zzby.zzw(i44);
                            zzd = ((zzbq) object2).zzd();
                            zzw6 = zzby.zzw(zzd);
                            i19 = f.g(zzw6, zzd, zzw5, i19);
                            break;
                        } else {
                            zzw3 = zzby.zzw(i44);
                            zzx = zzby.zzv((String) object2);
                            i19 = zzx + zzw3 + i19;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i23, i18)) {
                        zzh = zzeq.zzh(i23, unsafe.getObject(obj, j10), zzv(i18));
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i23, i18)) {
                        zzw5 = zzby.zzw(i23 << 3);
                        zzd = ((zzbq) unsafe.getObject(obj, j10)).zzd();
                        zzw6 = zzby.zzw(zzd);
                        i19 = f.g(zzw6, zzd, zzw5, i19);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i23, i18)) {
                        int zzo = zzo(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzw(zzo);
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i23, i18)) {
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx(zzo(obj, j10));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i23, i18)) {
                        zzw2 = zzby.zzw(i23 << 3);
                        zzh = zzw2 + 4;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i23, i18)) {
                        zzw = zzby.zzw(i23 << 3);
                        zzh = zzw + 8;
                        i19 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i23, i18)) {
                        int zzo2 = zzo(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzw((zzo2 >> 31) ^ (zzo2 + zzo2));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i23, i18)) {
                        long zzt3 = zzt(obj, j10);
                        zzw3 = zzby.zzw(i23 << 3);
                        zzx = zzby.zzx((zzt3 >> 63) ^ (zzt3 + zzt3));
                        i19 = zzx + zzw3 + i19;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i23, i18)) {
                        zzh = zzby.zzt(i23, (zzec) unsafe.getObject(obj, j10), zzv(i18));
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
        zzff zzffVar = this.zzm;
        int zza3 = i19 + zzffVar.zza(zzffVar.zzd(obj));
        if (this.zzh) {
            zzci zzb2 = this.zzn.zzb(obj);
            int i45 = 0;
            for (int i46 = 0; i46 < zzb2.zza.zzb(); i46++) {
                Map.Entry zzg = zzb2.zza.zzg(i46);
                i45 += zzci.zzb((zzch) zzg.getKey(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzb2.zza.zzc()) {
                i45 += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i45;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int zzs = zzs(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i16 = iArr[i14];
            long j10 = i15;
            int i17 = 37;
            switch (zzr) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j10));
                    byte[] bArr = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j10));
                    i13 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j10);
                    byte[] bArr2 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j10);
                    byte[] bArr3 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j10);
                    byte[] bArr4 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    floatToIntBits = zzda.zza(zzfp.zzw(obj, j10));
                    i13 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    floatToIntBits = ((String) zzfp.zzf(obj, j10)).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object zzf = zzfp.zzf(obj, j10);
                    if (zzf != null) {
                        i17 = zzf.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 10:
                    i11 = i13 * 53;
                    floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j10);
                    byte[] bArr5 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    zzc = zzfp.zzc(obj, j10);
                    i13 = i10 + zzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j10);
                    byte[] bArr6 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object zzf2 = zzfp.zzf(obj, j10);
                    if (zzf2 != null) {
                        i17 = zzf2.hashCode();
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
                    floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr8 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr9 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr10 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzda.zza(zzN(obj, j10));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = ((String) zzfp.zzf(obj, j10)).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr11 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzo(obj, j10);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzt(obj, j10);
                        byte[] bArr12 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzfp.zzf(obj, j10).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i13 * 53);
        if (this.zzh) {
            return (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cee, code lost:
        if (r6 == 1048575) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0cf0, code lost:
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0cf4, code lost:
        r3 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0cf8, code lost:
        if (r3 >= r0.zzk) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0cfa, code lost:
        r5 = r0.zzi;
        r6 = r0.zzc;
        r5 = r5[r3];
        r6 = r6[r5];
        r6 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r0.zzs(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d0c, code lost:
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d13, code lost:
        if (r0.zzu(r5) != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d15, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d18, code lost:
        r6 = (com.google.android.gms.internal.play_billing.zzdw) r6;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d20, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d21, code lost:
        if (r8 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d25, code lost:
        if (r1 != r37) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d2c, code lost:
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d2f, code lost:
        if (r1 > r37) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d31, code lost:
        if (r4 != r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d33, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d38, code lost:
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c89 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x0635 -> B:262:0x0636). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x06e0 -> B:295:0x06e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x072e -> B:315:0x072f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzbc r39) {
        /*
            Method dump skipped, instructions count: 3530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzs = zzs(i10);
                int i11 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j10 = i11;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                this.zzl.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i10], i10)) {
                        zzv(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzI(obj, i10)) {
                    zzv(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzs = zzs(i10);
            int i11 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i10)) {
                        zzfp.zzo(obj, j10, zzfp.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i10)) {
                        zzfp.zzp(obj, j10, zzfp.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i10)) {
                        zzfp.zzr(obj, j10, zzfp.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i10)) {
                        zzfp.zzr(obj, j10, zzfp.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i10)) {
                        zzfp.zzr(obj, j10, zzfp.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i10)) {
                        zzfp.zzm(obj, j10, zzfp.zzw(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i10)) {
                        zzfp.zzs(obj, j10, zzfp.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzI(obj2, i10)) {
                        zzfp.zzs(obj, j10, zzfp.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i10)) {
                        zzfp.zzr(obj, j10, zzfp.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i10)) {
                        zzfp.zzq(obj, j10, zzfp.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i10)) {
                        zzfp.zzr(obj, j10, zzfp.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i10);
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
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i13 = zzeq.zza;
                    zzfp.zzs(obj, j10, zzdx.zza(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10)));
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
                    if (zzM(obj2, i12, i10)) {
                        zzfp.zzs(obj, j10, zzfp.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i12, i10)) {
                        zzfp.zzs(obj, j10, zzfp.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        zzc(obj, bArr, i10, i11, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c9  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r24, com.google.android.gms.internal.play_billing.zzfx r25) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzs = zzs(i10);
            long j10 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i10) && Double.doubleToLongBits(zzfp.zza(obj, j10)) == Double.doubleToLongBits(zzfp.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i10) && Float.floatToIntBits(zzfp.zzb(obj, j10)) == Float.floatToIntBits(zzfp.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i10) && zzfp.zzd(obj, j10) == zzfp.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i10) && zzfp.zzd(obj, j10) == zzfp.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i10) && zzfp.zzd(obj, j10) == zzfp.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i10) && zzfp.zzw(obj, j10) == zzfp.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i10) && zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i10) && zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i10) && zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i10) && zzfp.zzd(obj, j10) == zzfp.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i10) && zzfp.zzc(obj, j10) == zzfp.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i10) && zzfp.zzd(obj, j10) == zzfp.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i10) && zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
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
                    zzG = zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10));
                    break;
                case 50:
                    zzG = zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10));
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
                    long zzp = zzp(i10) & 1048575;
                    if (zzfp.zzc(obj, zzp) == zzfp.zzc(obj2, zzp) && zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzs = zzs(i15);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr != 60 && zzr != 68) {
                        if (zzr != 49) {
                            if (zzr == 50 && !((zzdw) zzfp.zzf(obj, zzs & 1048575)).isEmpty()) {
                                zzdv zzdvVar = (zzdv) zzw(i15);
                                throw null;
                            }
                        }
                    } else if (zzM(obj, i16, i15) && !zzK(obj, zzs, zzv(i15))) {
                        return false;
                    }
                }
                List list = (List) zzfp.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzv = zzv(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzv.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzJ(obj, i15, i10, i11, i19) && !zzK(obj, zzs, zzv(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (this.zzh && !this.zzn.zzb(obj).zzj()) {
            return false;
        }
        return true;
    }
}
