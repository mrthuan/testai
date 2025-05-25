package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzjb extends zziw implements Set {
    private transient zzja zza;

    public static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return zzk(15, objArr2);
    }

    private static zzjb zzk(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzf = zzf(i10);
                Object[] objArr2 = new Object[zzf];
                int i11 = zzf - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    zzjd.zza(obj, i14);
                    int hashCode = obj.hashCode();
                    int zza = zzit.zza(hashCode);
                    while (true) {
                        int i15 = zza & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 == null) {
                            objArr[i13] = obj;
                            objArr2[i15] = obj;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzjg(obj3);
                }
                if (zzf(i13) < zzf / 2) {
                    return zzk(i13, objArr);
                }
                if (i13 < 10) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new zzjf(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzjg(obj4);
        }
        return zzjf.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzj() && ((zzjb) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.zza;
        if (zzjaVar == null) {
            zzja zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzjaVar;
    }

    public zzja zzh() {
        Object[] array = toArray();
        int i10 = zzja.zzd;
        return zzja.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
