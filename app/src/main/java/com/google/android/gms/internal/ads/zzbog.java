package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbog {
    public final List zza;

    public zzbog(JSONObject jSONObject) {
        if (com.google.android.gms.ads.internal.util.client.zzm.g(2)) {
            com.google.android.gms.ads.internal.util.zze.h("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                zzbof zzbofVar = new zzbof(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(zzbofVar.zzc);
                arrayList.add(zzbofVar);
                if (i10 < 0) {
                    Iterator it = zzbofVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzboh zzbohVar = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "click_urls");
            zzboh zzbohVar2 = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "imp_urls");
            zzboh zzbohVar3 = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "downloaded_imp_urls");
            zzboh zzbohVar4 = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "nofill_urls");
            zzboh zzbohVar5 = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            zzbvz.zza(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
