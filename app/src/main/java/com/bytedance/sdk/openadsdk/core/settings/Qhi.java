package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.Tgh;
import com.bytedance.sdk.openadsdk.core.settings.hpZ;
import org.json.JSONObject;

/* compiled from: APMSettings.java */
/* loaded from: classes.dex */
public class Qhi extends hpZ {
    public Qhi() {
        super("tt_set_apm.prop", new hpZ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.settings.Qhi.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.hpZ.Qhi
            public void Qhi() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.hpZ.Qhi
            public void cJ() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh
    public void Qhi(JSONObject jSONObject) {
        Tgh.Qhi Qhi = Qhi();
        if (jSONObject.has("apm_url")) {
            Qhi.Qhi("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    Qhi.Qhi("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        Qhi.Qhi();
        CJ();
    }
}
