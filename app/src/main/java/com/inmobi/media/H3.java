package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class H3 {
    public static I3 a(String json) {
        kotlin.jvm.internal.g.e(json, "json");
        I3 i32 = new I3();
        i32.f14342b = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            i32.f14341a = true;
            if (jSONObject.has("useCustomClose")) {
                i32.f14343d = true;
            }
            i32.c = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return i32;
    }
}
