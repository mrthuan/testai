package com.google.android.gms.internal.play_billing;

import b.a;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzal implements Map, Serializable {
    private transient zzam zza;
    private transient zzam zzb;
    private transient zzaf zzc;

    public static zzal zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzad.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzad.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzad.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzat.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
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
        return zzau.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzam zzamVar = this.zzb;
        if (zzamVar == null) {
            zzam zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzamVar;
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
        if (size >= 0) {
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
        throw new IllegalArgumentException(a.c("size cannot be negative but was: ", size));
    }

    public abstract zzaf zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzaf values() {
        zzaf zzafVar = this.zzc;
        if (zzafVar == null) {
            zzaf zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzafVar;
    }

    public abstract zzam zzd();

    public abstract zzam zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzam entrySet() {
        zzam zzamVar = this.zza;
        if (zzamVar == null) {
            zzam zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzamVar;
    }
}
