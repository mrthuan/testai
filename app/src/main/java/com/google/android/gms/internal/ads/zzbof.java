package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbof {
    public final List zza;
    public final String zzb;
    public final String zzc;

    public zzbof(JSONObject jSONObject) {
        String str;
        jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzboh zzbohVar = zzuVar.f10571u;
        zzboh.zza(jSONObject, "clickurl");
        zzboh zzbohVar2 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "imp_urls");
        zzboh zzbohVar3 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "downloaded_imp_urls");
        zzboh zzbohVar4 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "fill_urls");
        zzboh zzbohVar5 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "video_start_urls");
        zzboh zzbohVar6 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "video_complete_urls");
        zzboh zzbohVar7 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzboh zzbohVar8 = zzuVar.f10571u;
            zzboh.zza(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        this.zzb = str;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        zzboh zzbohVar9 = zzuVar.f10571u;
        zzboh.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
