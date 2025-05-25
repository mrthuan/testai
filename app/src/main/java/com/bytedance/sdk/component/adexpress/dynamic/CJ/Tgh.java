package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DiffUtils.java */
/* loaded from: classes.dex */
public class Tgh {
    public static JSONObject Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 == null || jSONObject2.length() <= 0 || jSONObject == null) {
            return jSONObject;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                Object opt2 = jSONObject2.opt(next);
                if (opt2 == null) {
                    jSONObject3.put(next, opt);
                } else if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                    jSONObject3.put(next, Qhi((JSONObject) opt, (JSONObject) opt2));
                } else if ((opt instanceof JSONArray) && (opt2 instanceof JSONArray)) {
                    jSONObject3.put(next, Qhi((JSONArray) opt, (JSONArray) opt2));
                } else {
                    jSONObject3.put(next, opt2);
                }
            }
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (!jSONObject.has(next2)) {
                    jSONObject3.put(next2, jSONObject2.opt(next2));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    private static JSONArray Qhi(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return jSONArray;
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        JSONArray jSONArray3 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object opt = jSONArray.opt(i10);
                Object opt2 = jSONArray2.opt(i10);
                if (opt2 == null) {
                    jSONArray3.put(i10, opt);
                } else if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                    jSONArray3.put(i10, Qhi((JSONObject) opt, (JSONObject) opt2));
                } else if ((opt instanceof JSONArray) && (opt2 instanceof JSONArray)) {
                    jSONArray3.put(i10, Qhi((JSONArray) opt, (JSONArray) opt2));
                } else {
                    jSONArray3.put(i10, opt2);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONArray3;
    }
}
