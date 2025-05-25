package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgmc {
    private static final zzgmc zza = new zzgmc();
    private final Map zzb = new HashMap();

    public static zzgmc zza() {
        return zza;
    }

    public final synchronized void zzb(zzgmb zzgmbVar, Class cls) {
        zzgmb zzgmbVar2 = (zzgmb) this.zzb.get(cls);
        if (zzgmbVar2 != null && !zzgmbVar2.equals(zzgmbVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgmbVar);
    }
}
