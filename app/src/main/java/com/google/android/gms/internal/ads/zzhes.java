package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhes implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhet zzb;

    public zzhes(zzhet zzhetVar) {
        this.zzb = zzhetVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhet zzhetVar = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzhetVar.zza.get(i10);
        }
        zzhet zzhetVar2 = this.zzb;
        zzhetVar2.zza.add(zzhetVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
