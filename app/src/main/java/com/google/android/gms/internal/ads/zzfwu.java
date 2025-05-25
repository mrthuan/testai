package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfwu extends AbstractSet {
    final /* synthetic */ zzfxa zza;

    public zzfwu(zzfxa zzfxaVar) {
        this.zza = zzfxaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfur.zza(zzfxa.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfxa zzfxaVar = this.zza;
        Map zzl = zzfxaVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfws(zzfxaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i10;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfxa zzfxaVar = this.zza;
            if (!zzfxaVar.zzr()) {
                zzv = zzfxaVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzfxa zzfxaVar2 = this.zza;
                Object zzi = zzfxa.zzi(zzfxaVar2);
                zzA = zzfxaVar2.zzA();
                zzB = zzfxaVar2.zzB();
                zzC = zzfxaVar2.zzC();
                int zzb = zzfxb.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
                if (zzb != -1) {
                    this.zza.zzq(zzb, zzv);
                    zzfxa zzfxaVar3 = this.zza;
                    i10 = zzfxaVar3.zzg;
                    zzfxaVar3.zzg = i10 - 1;
                    this.zza.zzo();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
