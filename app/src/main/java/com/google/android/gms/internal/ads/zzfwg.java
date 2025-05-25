package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
class zzfwg implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfwh zzc;

    public zzfwg(zzfwh zzfwhVar, Iterator it) {
        this.zzc = zzfwhVar;
        this.zzb = zzfwhVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.zza.remove();
        zzfwk zzfwkVar = this.zzc.zze;
        i10 = zzfwkVar.zzb;
        zzfwkVar.zzb = i10 - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public zzfwg(zzfwh zzfwhVar) {
        Iterator it;
        this.zzc = zzfwhVar;
        Collection collection = zzfwhVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
