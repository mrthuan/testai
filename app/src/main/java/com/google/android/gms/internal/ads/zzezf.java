package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzezf implements zzevn {
    private final String zza;

    public zzezf(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                com.google.android.gms.ads.internal.util.zzbs.e("pii", jSONObject).put("adsid", this.zza);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }
}
