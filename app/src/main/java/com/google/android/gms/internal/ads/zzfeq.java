package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfeq {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfeq(JsonReader jsonReader) {
        JSONObject f10 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
        this.zzd = f10;
        this.zza = f10.optString("ad_html", null);
        this.zzb = f10.optString("ad_base_url", null);
        this.zzc = f10.optJSONObject("ad_json");
    }
}
