package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfxa extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzfxa() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzfxa zzfxaVar, int i10) {
        return zzfxaVar.zzB()[i10];
    }

    public static /* synthetic */ Object zzi(zzfxa zzfxaVar) {
        Object obj = zzfxaVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzfxa zzfxaVar, int i10) {
        return zzfxaVar.zzC()[i10];
    }

    public static /* synthetic */ void zzn(zzfxa zzfxaVar, int i10, Object obj) {
        zzfxaVar.zzC()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zzb = zzfxj.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzfxb.zzc(obj2, zzb & zzv);
        if (zzc == 0) {
            return -1;
        }
        int i10 = ~zzv;
        int i11 = zzb & i10;
        do {
            int i12 = zzc - 1;
            int i13 = zzA()[i12];
            if ((i13 & i10) == i11 && zzfur.zza(obj, zzB()[i12])) {
                return i12;
            }
            zzc = i13 & zzv;
        } while (zzc != 0);
        return -1;
    }

    private final int zzx(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object zzd2 = zzfxb.zzd(i11);
        if (i13 != 0) {
            zzfxb.zze(zzd2, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i15 = 0; i15 <= i10; i15++) {
            int zzc = zzfxb.zzc(obj, i15);
            while (zzc != 0) {
                int i16 = zzc - 1;
                int i17 = zzA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int zzc2 = zzfxb.zzc(zzd2, i19);
                zzfxb.zze(zzd2, i19, zzc);
                zzA[i16] = ((~i14) & i18) | (zzc2 & i14);
                zzc = i17 & i10;
            }
        }
        this.zze = zzd2;
        zzz(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzfxb.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzgap.zzc(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzw(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i10 = 0; i10 < this.zzg; i10++) {
                if (zzfur.zza(obj, zzC()[i10])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzfwu zzfwuVar = new zzfwu(this);
            this.zzi = zzfwuVar;
            return zzfwuVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzfwx zzfwxVar = new zzfwx(this);
            this.zzh = zzfwxVar;
            return zzfwxVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzr()) {
            zzfuu.zzk(zzr(), "Arrays already allocated");
            int i10 = this.zzf;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfxb.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int zzb = zzfxj.zzb(obj);
        int zzv = zzv();
        int i13 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzfxb.zzc(obj3, i13);
        if (zzc == 0) {
            if (i12 > zzv) {
                zzv = zzx(zzv, zzfxb.zza(zzv), zzb, i11);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzfxb.zze(obj4, i13, i12);
            }
        } else {
            int i14 = ~zzv;
            int i15 = zzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = zzc - 1;
                int i18 = zzA[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && zzfur.zza(obj, zzB[i17])) {
                    Object obj5 = zzC[i17];
                    zzC[i17] = obj2;
                    return obj5;
                }
                int i20 = i18 & zzv;
                i16++;
                if (i20 == 0) {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i12 > zzv) {
                        zzv = zzx(zzv, zzfxb.zza(zzv), zzb, i11);
                    } else {
                        zzA[i17] = (i12 & zzv) | i19;
                    }
                } else {
                    zzc = i20;
                }
            }
        }
        int length = zzA().length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i11] = (~zzv) & zzb;
        zzB()[i11] = obj;
        zzC()[i11] = obj2;
        this.zzg = i12;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzfwz zzfwzVar = new zzfwz(this);
            this.zzj = zzfwzVar;
            return zzfwzVar;
        }
        return collection;
    }

    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i10) {
        this.zzf = zzgap.zzc(i10, 1, 1073741823);
    }

    public final void zzq(int i10, int i11) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size() - 1;
        if (i10 < size) {
            int i12 = i10 + 1;
            Object obj2 = zzB[size];
            zzB[i10] = obj2;
            zzC[i10] = zzC[size];
            zzB[size] = null;
            zzC[size] = null;
            zzA[i10] = zzA[size];
            zzA[size] = 0;
            int zzb = zzfxj.zzb(obj2) & i11;
            int zzc = zzfxb.zzc(obj, zzb);
            int i13 = size + 1;
            if (zzc == i13) {
                zzfxb.zze(obj, zzb, i12);
                return;
            }
            while (true) {
                int i14 = zzc - 1;
                int i15 = zzA[i14];
                int i16 = i15 & i11;
                if (i16 != i13) {
                    zzc = i16;
                } else {
                    zzA[i14] = (i15 & (~i11)) | (i11 & i12);
                    return;
                }
            }
        } else {
            zzB[i10] = null;
            zzC[i10] = null;
            zzA[i10] = 0;
        }
    }

    public final boolean zzr() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    public zzfxa(int i10) {
        zzp(8);
    }
}
