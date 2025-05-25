package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzebq {
    private final zzbuv zza;

    public zzebq(zzbuv zzbuvVar) {
        this.zza = zzbuvVar;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    return;
                }
                return;
            }
            com.google.android.gms.ads.internal.util.zze.h("DSID signal does not exist.");
        }
    }

    public final void zzb() {
        y9.a zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgT)).booleanValue()) {
            zzbzr.zzb(zza, "persistFlags");
        } else {
            zzbzr.zza(zza, "persistFlags");
        }
    }
}
