package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzdj extends zzba implements RandomAccess, zzdk {
    @Deprecated
    public static final zzdk zza;
    private static final zzdj zzb;
    private final List zzc;

    static {
        zzdj zzdjVar = new zzdj(false);
        zzb = zzdjVar;
        zza = zzdjVar;
    }

    public zzdj() {
        this(10);
    }

    private static String zzi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbq) {
            return ((zzbq) obj).zzm(zzda.zzb);
        }
        return zzda.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzdk) {
            collection = ((zzdk) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzi(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ zzcz zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzdj(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final zzdk zze() {
        if (zzc()) {
            return new zzfk(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            String zzm = zzbqVar.zzm(zzda.zzb);
            if (zzbqVar.zzi()) {
                this.zzc.set(i10, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzda.zzd(bArr);
        if (zzfu.zzd(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzdj(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzdj(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
