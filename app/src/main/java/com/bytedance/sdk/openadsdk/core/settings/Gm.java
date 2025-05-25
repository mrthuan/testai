package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.Tgh;
import org.json.JSONObject;

/* compiled from: MediationInitSettings.java */
/* loaded from: classes.dex */
public class Gm extends hpZ {
    public Gm() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            Tgh.Qhi Qhi = Qhi();
            Qhi.Qhi("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            Qhi.Qhi();
            CJ();
        }
    }
}
