package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzfk extends AbstractList implements RandomAccess, zzdk {
    private final zzdk zza;

    public zzfk(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzdj) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzfj(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzfi(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final zzdk zze() {
        return this;
    }
}
