package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;
    private static final zznk zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzX(false);
        zzd = zzX(true);
        zze = new zznm();
    }

    public static zznk zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i10, int i11, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i10, i11);
        return obj2;
    }

    public static void zzC(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzE(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzc(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzoc zzocVar) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zze(i10, list);
        }
    }

    public static void zzG(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzg(i10, list, z10);
        }
    }

    public static void zzH(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzj(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzl(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzn(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzp(i10, list, z10);
        }
    }

    public static void zzL(int i10, List list, zzoc zzocVar, zzmt zzmtVar) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzkj) zzocVar).zzq(i10, list.get(i11), zzmtVar);
            }
        }
    }

    public static void zzM(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzs(i10, list, z10);
        }
    }

    public static void zzN(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzu(i10, list, z10);
        }
    }

    public static void zzO(int i10, List list, zzoc zzocVar, zzmt zzmtVar) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzkj) zzocVar).zzv(i10, list.get(i11), zzmtVar);
            }
        }
    }

    public static void zzP(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzx(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzz(i10, list, z10);
        }
    }

    public static void zzR(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzB(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzD(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzoc zzocVar) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzG(i10, list);
        }
    }

    public static void zzU(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzI(i10, list, z10);
        }
    }

    public static void zzV(int i10, List list, zzoc zzocVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzocVar.zzK(i10, list, z10);
        }
    }

    public static boolean zzW(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    private static zznk zzX(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zznk) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) + 1) * size;
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzka) list.get(i11)).zzd();
            zzx += zzki.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzu(zzlcVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzki.zzt(i10, (zzmi) list.get(i12), zzmtVar);
        }
        return i11;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzu(zzlcVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzy(zzlxVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzn(int i10, Object obj, zzmt zzmtVar) {
        if (obj instanceof zzlo) {
            int i11 = zzki.zzb;
            int zza2 = ((zzlo) obj).zza();
            return zzki.zzx(i10 << 3) + zzki.zzx(zza2) + zza2;
        }
        return zzki.zzx(i10 << 3) + zzki.zzv((zzmi) obj, zzmtVar);
    }

    public static int zzo(int i10, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx = zzki.zzx(zza2) + zza2 + zzx;
            } else {
                zzx = zzki.zzv((zzmi) obj, zzmtVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i10 = 0;
            while (i11 < size) {
                int zze2 = zzlcVar.zze(i11);
                i10 += zzki.zzx((zze2 >> 31) ^ (zze2 + zze2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzlxVar.zza(i11);
                i10 += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int i12 = zzki.zzb;
        boolean z10 = list instanceof zzlq;
        int zzx = zzki.zzx(i10 << 3) * size;
        if (z10) {
            zzlq zzlqVar = (zzlq) list;
            while (i11 < size) {
                Object zzf = zzlqVar.zzf(i11);
                if (zzf instanceof zzka) {
                    int zzd2 = ((zzka) zzf).zzd();
                    zzx = zzki.zzx(zzd2) + zzd2 + zzx;
                } else {
                    zzx = zzki.zzw((String) zzf) + zzx;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzka) {
                    int zzd3 = ((zzka) obj).zzd();
                    zzx = zzki.zzx(zzd3) + zzd3 + zzx;
                } else {
                    zzx = zzki.zzw((String) obj) + zzx;
                }
                i11++;
            }
        }
        return zzx;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzx(zzlcVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i10 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzy(zzlxVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzki.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
