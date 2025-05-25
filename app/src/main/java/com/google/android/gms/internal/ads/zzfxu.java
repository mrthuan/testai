package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfxu implements Map, Serializable {
    private transient zzfxw zza;
    private transient zzfxw zzb;
    private transient zzfxm zzc;

    public static zzfxu zzc(Map map) {
        int i10;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        zzfxt zzfxtVar = new zzfxt(i10);
        zzfxtVar.zzb(entrySet);
        return zzfxtVar.zzc();
    }

    public static zzfxu zzd() {
        return zzfzi.zza;
    }

    public static zzfxu zze(Object obj, Object obj2) {
        zzfwo.zzb("dialog_not_shown_reason", obj2);
        return zzfzi.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfyo.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfzt.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwo.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzfxm zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfxm values() {
        zzfxm zzfxmVar = this.zzc;
        if (zzfxmVar == null) {
            zzfxm zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfxmVar;
    }

    public abstract zzfxw zzf();

    public abstract zzfxw zzg();

    @Override // java.util.Map
    /* renamed from: zzh */
    public final zzfxw entrySet() {
        zzfxw zzfxwVar = this.zza;
        if (zzfxwVar == null) {
            zzfxw zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzfxwVar;
    }

    @Override // java.util.Map
    /* renamed from: zzi */
    public final zzfxw keySet() {
        zzfxw zzfxwVar = this.zzb;
        if (zzfxwVar == null) {
            zzfxw zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzfxwVar;
    }
}
