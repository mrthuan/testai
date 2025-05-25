package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgkw {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgkw(Map map, Map map2, zzgkv zzgkvVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgku zza() {
        return new zzgku(null);
    }

    public final Enum zzb(Object obj) {
        Enum r02 = (Enum) this.zzb.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) {
        Object obj = this.zza.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
