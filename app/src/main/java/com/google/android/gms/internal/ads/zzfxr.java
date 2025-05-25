package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfxr<E> extends zzfxm<E> implements List<E>, RandomAccess {
    private static final zzfzy zza = new zzfxp(zzfzd.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfxo zzi(int i10) {
        return new zzfxo(i10);
    }

    public static zzfxr zzj(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzfzd.zza;
        }
        return new zzfzd(objArr, i10);
    }

    public static zzfxr zzk(Collection collection) {
        if (collection instanceof zzfxm) {
            zzfxr zzd2 = ((zzfxm) collection).zzd();
            if (zzd2.zzf()) {
                Object[] array = zzd2.toArray();
                return zzj(array, array.length);
            }
            return zzd2;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfzb.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzfxr zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfzd.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfzb.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfxr zzm() {
        return zzfzd.zza;
    }

    public static zzfxr zzn(Object obj) {
        Object[] objArr = {obj};
        zzfzb.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfxr zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfzb.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfxr zzp(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfzb.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfxr zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfzb.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfxr zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfzb.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    public static zzfxr zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        zzfzb.zzb(objArr, 9);
        return zzj(objArr, 9);
    }

    public static zzfxr zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        zzfzb.zzb(objArr, 10);
        return zzj(objArr, 10);
    }

    @SafeVarargs
    public static zzfxr zzu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = new Object[192];
        objArr2[0] = "Blues";
        objArr2[1] = "Classic Rock";
        objArr2[2] = "Country";
        objArr2[3] = "Dance";
        objArr2[4] = "Disco";
        objArr2[5] = "Funk";
        objArr2[6] = "Grunge";
        objArr2[7] = "Hip-Hop";
        objArr2[8] = "Jazz";
        objArr2[9] = "Metal";
        objArr2[10] = "New Age";
        objArr2[11] = "Oldies";
        System.arraycopy(objArr, 0, objArr2, 12, ShapeTypes.MATH_EQUAL);
        zzfzb.zzb(objArr2, 192);
        return zzj(objArr2, 192);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfxm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzfur.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfur.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfxm
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfxm
    public final zzfzx zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfxr subList(int i10, int i11) {
        zzfuu.zzi(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzfzd.zza;
        }
        return new zzfxq(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzv */
    public final zzfzy listIterator(int i10) {
        zzfuu.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfxp(this, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfxm
    @Deprecated
    public final zzfxr zzd() {
        return this;
    }
}
