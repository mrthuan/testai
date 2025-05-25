package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfwk extends zzfwn implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfwk(Map map) {
        zzfuu.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfwk zzfwkVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfwkVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwkVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final Collection zzf() {
        return new zzfwm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final Iterator zzg() {
        return new zzfvu(this);
    }

    public final List zzh(Object obj, List list, zzfwh zzfwhVar) {
        if (list instanceof RandomAccess) {
            return new zzfwd(this, obj, list, zzfwhVar);
        }
        return new zzfwj(this, obj, list, zzfwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfwb(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwe(this, (SortedMap) map);
        }
        return new zzfvx(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfwc(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwf(this, (SortedMap) map);
        }
        return new zzfwa(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzp() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn, com.google.android.gms.internal.ads.zzfyp
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
