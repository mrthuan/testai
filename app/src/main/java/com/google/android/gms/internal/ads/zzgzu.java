package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgzu extends zzgvy implements RandomAccess {
    private static final zzgzu zza = new zzgzu(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzgzu() {
        this(new Object[10], 0, true);
    }

    public static zzgzu zzd() {
        return zza;
    }

    private final String zze(int i10) {
        return a0.d.b("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzg(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zze(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgvy, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzdJ();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            int i12 = i10 + 1;
            Object[] objArr = this.zzb;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
            } else {
                Object[] objArr2 = new Object[androidx.appcompat.view.menu.d.a(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.zzb, i10, objArr2, i12, this.zzc - i10);
                this.zzb = objArr2;
            }
            this.zzb[i10] = obj;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zze(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzg(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgvy, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        zzdJ();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj = objArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zzdJ();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyk
    public final /* bridge */ /* synthetic */ zzgyk zzf(int i10) {
        if (i10 >= this.zzc) {
            return new zzgzu(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgzu(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdJ();
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        if (i10 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
