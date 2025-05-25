package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdapterResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    public final zzu f10033a;

    /* renamed from: b  reason: collision with root package name */
    public final AdError f10034b;

    public AdapterResponseInfo(zzu zzuVar) {
        AdError d10;
        this.f10033a = zzuVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.c;
        if (zzeVar == null) {
            d10 = null;
        } else {
            d10 = zzeVar.d();
        }
        this.f10034b = d10;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        zzu zzuVar = this.f10033a;
        jSONObject.put("Adapter", zzuVar.f10255a);
        jSONObject.put("Latency", zzuVar.f10256b);
        String str = zzuVar.f10258e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = zzuVar.f10259f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = zzuVar.f10260g;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = zzuVar.f10261h;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : zzuVar.f10257d.keySet()) {
            jSONObject2.put(str5, zzuVar.f10257d.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f10034b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.c());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
