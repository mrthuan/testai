package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzhao extends AbstractMap {
    private boolean zzc;
    private volatile zzham zzd;
    private List zza = Collections.emptyList();
    private Map zzb = Collections.emptyMap();
    private Map zze = Collections.emptyMap();

    private zzhao() {
    }

    public static /* bridge */ /* synthetic */ Object zzd(zzhao zzhaoVar, int i10) {
        return zzhaoVar.zzl(i10);
    }

    public static /* bridge */ /* synthetic */ List zzf(zzhao zzhaoVar) {
        return zzhaoVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzhao zzhaoVar) {
        return zzhaoVar.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzhao zzhaoVar) {
        zzhaoVar.zzn();
    }

    private final int zzk(Comparable comparable) {
        int size = this.zza.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzhai) this.zza.get(size)).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((zzhai) this.zza.get(i11)).zza());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public final Object zzl(int i10) {
        zzn();
        Object value = ((zzhai) this.zza.remove(i10)).getValue();
        if (!this.zzb.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zza;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzhai(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzb = treeMap;
            this.zze = treeMap.descendingMap();
        }
        return (SortedMap) this.zzb;
    }

    public final void zzn() {
        if (!this.zzc) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zza.isEmpty()) {
            this.zza.clear();
        }
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzk(comparable) < 0 && !this.zzb.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zzd == null) {
            this.zzd = new zzham(this, null);
        }
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhao)) {
            return super.equals(obj);
        }
        zzhao zzhaoVar = (zzhao) obj;
        int size = size();
        if (size != zzhaoVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb == zzhaoVar.zzb()) {
            for (int i10 = 0; i10 < zzb; i10++) {
                if (!zzg(i10).equals(zzhaoVar.zzg(i10))) {
                    return false;
                }
            }
            if (zzb == size) {
                return true;
            }
            return this.zzb.equals(zzhaoVar.zzb);
        }
        return entrySet().equals(zzhaoVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzhai) this.zza.get(zzk)).getValue();
        }
        return this.zzb.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb; i11++) {
            i10 += ((zzhai) this.zza.get(i11)).hashCode();
        }
        if (this.zzb.size() > 0) {
            return this.zzb.hashCode() + i10;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzb.isEmpty()) {
            return null;
        }
        return this.zzb.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zza.size();
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.zzc) {
            if (this.zzb.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzb);
            }
            this.zzb = unmodifiableMap;
            if (this.zze.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zze);
            }
            this.zze = unmodifiableMap2;
            this.zzc = true;
        }
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final Iterable zzc() {
        if (this.zzb.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzb.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzhai) this.zza.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zza.isEmpty() && !(this.zza instanceof ArrayList)) {
            this.zza = new ArrayList(16);
        }
        int i10 = -(zzk + 1);
        if (i10 >= 16) {
            return zzm().put(comparable, obj);
        }
        if (this.zza.size() == 16) {
            zzhai zzhaiVar = (zzhai) this.zza.remove(15);
            zzm().put(zzhaiVar.zza(), zzhaiVar.getValue());
        }
        this.zza.add(i10, new zzhai(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i10) {
        return (Map.Entry) this.zza.get(i10);
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public /* synthetic */ zzhao(zzhan zzhanVar) {
    }
}
