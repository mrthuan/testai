package com.bytedance.sdk.openadsdk.core.CJ;

import com.bytedance.sdk.component.ROR.Qhi.Qhi;
import com.bytedance.sdk.component.ROR.cJ;
import com.bytedance.sdk.component.ROR.cJ.fl;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.iMK.ac;
import com.bytedance.sdk.openadsdk.utils.js;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrequentCallEventHelper.java */
/* loaded from: classes.dex */
public class Gm {
    public static void Qhi(String str, long j10) {
        JSONObject cJ = cJ(str, j10);
        fl cJ2 = ac.Qhi().cJ().cJ();
        cJ2.cJ(js.CJ("/api/ad/union/sdk/stats/"));
        cJ2.CJ(cJ.toString());
        cJ2.Qhi(6);
        cJ2.Qhi("uploadFrequentEvent");
        cJ2.Qhi(new Qhi() { // from class: com.bytedance.sdk.openadsdk.core.CJ.Gm.1
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, cJ cJVar) {
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                iOException.getMessage();
            }
        });
    }

    private static JSONObject cJ(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
