package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzlp extends zzjl implements RandomAccess, zzlq {
    @Deprecated
    public static final zzlq zza;
    private static final zzlp zzb;
    private final List zzc;

    static {
        zzlp zzlpVar = new zzlp(false);
        zzb = zzlpVar;
        zza = zzlpVar;
    }

    public zzlp() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            return ((zzka) obj).zzm(zzlj.zzb);
        }
        return zzlj.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbW();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzbW();
        if (collection instanceof zzlq) {
            collection = ((zzlq) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbW();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbW();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbW();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzlp(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final zzlq zze() {
        if (zzc()) {
            return new zznp(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
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
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            String zzm = zzkaVar.zzm(zzlj.zzb);
            if (zzkaVar.zzi()) {
                this.zzc.set(i10, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzlj.zzd(bArr);
        if (zznz.zzd(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final void zzi(zzka zzkaVar) {
        zzbW();
        this.zzc.add(zzkaVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlp(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzlp(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzlp(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
