package com.bytedance.sdk.openadsdk.core.video.cJ;

import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableEvent.java */
/* loaded from: classes.dex */
public class cJ {
    public static void Qhi(tP tPVar) {
        if (bxS.cJ(tPVar)) {
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void Qhi(tP tPVar, long j10, long j11) {
        if (tPVar != null) {
            if (bxS.Gm(tPVar) || bxS.cJ(tPVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j10);
                    jSONObject.put("unzip_success_time", j11);
                } catch (JSONException e10) {
                    ABk.Qhi("PlayableEvent", "onSuccess json error", e10);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void Qhi(tP tPVar, int i10, String str) {
        if (tPVar != null) {
            if (bxS.Gm(tPVar) || bxS.cJ(tPVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    ABk.Qhi("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
