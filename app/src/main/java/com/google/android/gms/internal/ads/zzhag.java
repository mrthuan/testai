package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhag {
    public static final /* synthetic */ int zza = 0;
    private static final zzhas zzb;

    static {
        int i10 = zzgzt.zza;
        zzb = new zzhau();
    }

    public static void zzA(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzhbh zzhbhVar, zzhae zzhaeVar) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzgxe) zzhbhVar).zzv(i10, list.get(i11), zzhaeVar);
            }
        }
    }

    public static void zzC(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzy(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzA(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzC(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzE(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzhbh zzhbhVar) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzH(i10, list);
        }
    }

    public static void zzH(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzJ(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzL(i10, list, z10);
        }
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(zzgxzVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgxd.zzD(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgxd.zzD(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(zzgxzVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(zzgyyVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(int i10, Object obj, zzhae zzhaeVar) {
        int i11 = i10 << 3;
        if (obj instanceof zzgyu) {
            int zzD = zzgxd.zzD(i11);
            int zza2 = ((zzgyu) obj).zza();
            return zzgxd.zzD(zza2) + zza2 + zzD;
        }
        return zzgxd.zzA((zzgzj) obj, zzhaeVar) + zzgxd.zzD(i11);
    }

    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i10 = 0;
            while (i11 < size) {
                int zzd = zzgxzVar.zzd(i11);
                i10 += zzgxd.zzD((zzd >> 31) ^ (zzd + zzd));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgxd.zzD((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzgyyVar.zza(i11);
                i10 += zzgxd.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgxd.zzE((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzD(zzgxzVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzD(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(zzgyyVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgxd.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzhas zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zzgye zzgyeVar, Object obj2, zzhas zzhasVar) {
        if (zzgyeVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgyeVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzo(obj, i10, intValue, obj2, zzhasVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgyeVar.zza(intValue2)) {
                    obj2 = zzo(obj, i10, intValue2, obj2, zzhasVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzhas zzhasVar) {
        if (obj2 == null) {
            obj2 = zzhasVar.zza(obj);
        }
        zzhasVar.zzh(obj2, i10, i11);
        return obj2;
    }

    public static void zzp(zzgxj zzgxjVar, Object obj, Object obj2) {
        if (((zzgxu) obj2).zza.zza.isEmpty()) {
            return;
        }
        zzgxu zzgxuVar = (zzgxu) obj;
        throw null;
    }

    public static void zzq(zzhas zzhasVar, Object obj, Object obj2) {
        zzgxy zzgxyVar = (zzgxy) obj;
        zzhat zzhatVar = zzgxyVar.zzt;
        zzhat zzhatVar2 = ((zzgxy) obj2).zzt;
        if (!zzhat.zzc().equals(zzhatVar2)) {
            if (zzhat.zzc().equals(zzhatVar)) {
                zzhatVar = zzhat.zze(zzhatVar, zzhatVar2);
            } else {
                zzhatVar.zzd(zzhatVar2);
            }
        }
        zzgxyVar.zzt = zzhatVar;
    }

    public static void zzr(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzc(i10, list, z10);
        }
    }

    public static void zzs(int i10, List list, zzhbh zzhbhVar) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zze(i10, list);
        }
    }

    public static void zzt(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzg(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzj(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzl(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzn(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzp(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzhbh zzhbhVar, zzhae zzhaeVar) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzgxe) zzhbhVar).zzq(i10, list.get(i11), zzhaeVar);
            }
        }
    }

    public static void zzz(int i10, List list, zzhbh zzhbhVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzhbhVar.zzs(i10, list, z10);
        }
    }
}
