package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzclw {
    private final Map zza;
    private final Map zzb;

    public zzclw(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfex zzfexVar) {
        for (zzfev zzfevVar : zzfexVar.zzb.zzc) {
            if (this.zza.containsKey(zzfevVar.zza)) {
                ((zzclz) this.zza.get(zzfevVar.zza)).zza(zzfevVar.zzb);
            } else if (this.zzb.containsKey(zzfevVar.zza)) {
                zzcly zzclyVar = (zzcly) this.zzb.get(zzfevVar.zza);
                JSONObject jSONObject = zzfevVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzclyVar.zza(hashMap);
            }
        }
    }
}
