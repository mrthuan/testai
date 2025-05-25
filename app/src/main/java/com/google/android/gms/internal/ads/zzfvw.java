package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfvw implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfvx zzc;

    public zzfvw(zzfvx zzfvxVar) {
        this.zzc = zzfvxVar;
        this.zza = zzfvxVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        int i10;
        if (this.zzb != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzk(z10, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfwk zzfwkVar = this.zzc.zzb;
        i10 = zzfwkVar.zzb;
        zzfwkVar.zzb = i10 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
