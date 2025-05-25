package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhet extends AbstractList {
    private static final zzheu zzc = zzheu.zzb(zzhet.class);
    final List zza;
    final Iterator zzb;

    public zzhet(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.zza.size() > i10) {
            return this.zza.get(i10);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhes(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzheu zzheuVar = zzc;
        zzheuVar.zza("potentially expensive size() call");
        zzheuVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
