package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfvv extends zzfyk {
    final /* synthetic */ zzfvx zza;

    public zzfvv(zzfvx zzfvxVar) {
        this.zza = zzfvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfwq.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfvw(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfvx zzfvxVar = this.zza;
        zzfwk.zzo(zzfvxVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zza() {
        return this.zza;
    }
}
