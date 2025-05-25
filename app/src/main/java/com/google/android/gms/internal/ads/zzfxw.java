package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfxw<E> extends zzfxm<E> implements Set<E> {
    private transient zzfxr zza;

    public static int zzh(int i10) {
        boolean z10;
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzf(z10, "collection too large");
        return 1073741824;
    }

    public static zzfxv zzj(int i10) {
        return new zzfxv(i10);
    }

    public static zzfxw zzl(Collection collection) {
        if ((collection instanceof zzfxw) && !(collection instanceof SortedSet)) {
            zzfxw zzfxwVar = (zzfxw) collection;
            if (!zzfxwVar.zzf()) {
                return zzfxwVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfxw zzm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return zzv(length, (Object[]) objArr.clone());
            }
            return new zzfzu(objArr[0]);
        }
        return zzfzj.zza;
    }

    public static zzfxw zzn() {
        return zzfzj.zza;
    }

    public static zzfxw zzo(Object obj) {
        return new zzfzu(obj);
    }

    public static zzfxw zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfxw zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfxw zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfxw zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[11];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 5);
        return zzv(11, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfxw zzv(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzh = zzh(i10);
                Object[] objArr2 = new Object[zzh];
                int i11 = zzh - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    zzfzb.zza(obj, i14);
                    int hashCode = obj.hashCode();
                    int zza = zzfxj.zza(hashCode);
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
                    Objects.requireNonNull(obj3);
                    return new zzfzu(obj3);
                }
                if (zzh(i13) < zzh / 2) {
                    return zzv(i13, objArr);
                }
                if (zzw(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new zzfzj(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzfzu(obj4);
        }
        return zzfzj.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i10, int i11) {
        if (i10 < (i11 >> 1) + (i11 >> 2)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfxw) && zzu() && ((zzfxw) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfzt.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfzt.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxm
    public zzfxr zzd() {
        zzfxr zzfxrVar = this.zza;
        if (zzfxrVar == null) {
            zzfxr zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfzx iterator();

    public zzfxr zzi() {
        Object[] array = toArray();
        int i10 = zzfxr.zzd;
        return zzfxr.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
