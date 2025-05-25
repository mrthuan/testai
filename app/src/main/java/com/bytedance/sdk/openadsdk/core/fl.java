package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConvertTracker.java */
/* loaded from: classes.dex */
public class fl {
    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str, "convert_track", jSONObject);
    }
}
