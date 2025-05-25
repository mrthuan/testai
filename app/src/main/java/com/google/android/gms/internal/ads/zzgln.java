package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgln {
    public static final zzgln zza = new zzgll().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgln)) {
            return false;
        }
        return this.zzb.equals(((zzgln) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
