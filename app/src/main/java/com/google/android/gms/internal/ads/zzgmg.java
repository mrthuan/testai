package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgmg {
    private static final zzgmg zza = new zzgmg();
    private final Map zzb = new HashMap();

    public static zzgmg zzb() {
        return zza;
    }

    public final synchronized zzgen zza(String str) {
        if (this.zzb.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgen) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgen zzgenVar) {
        if (this.zzb.containsKey(str)) {
            if (((zzgen) this.zzb.get(str)).equals(zzgenVar)) {
                return;
            }
            String valueOf = String.valueOf(this.zzb.get(str));
            String valueOf2 = String.valueOf(zzgenVar);
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
        }
        this.zzb.put(str, zzgenVar);
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgen) entry.getValue());
        }
    }
}
