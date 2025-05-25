package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import androidx.activity.f;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicParserUtils.java */
/* loaded from: classes.dex */
public class Gm {
    public static void Qhi(String str, JSONObject jSONObject) {
        JSONObject Ri = com.bytedance.sdk.component.adexpress.cJ.Ri(str);
        if (Ri == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = Ri.optJSONObject("values");
        if (optJSONObject == null) {
            return;
        }
        Qhi(optJSONObject, jSONObject);
    }

    public static String cJ(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            if (str.indexOf(46) < 0) {
                str = str.concat(".png");
            }
            return f.m(str2, "static/images/", str);
        }
        return cJ.Qhi(str);
    }

    public static JSONObject Qhi(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject Ri = com.bytedance.sdk.component.adexpress.cJ.Ri(str);
        if (Ri == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return Qhi(jSONObject2, Ri.optJSONObject("themeValues"), jSONObject);
    }

    private static void Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject Qhi(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String Qhi(String str) {
        JSONObject optJSONObject;
        JSONObject Ri = com.bytedance.sdk.component.adexpress.cJ.Ri(str);
        if (Ri == null || (optJSONObject = Ri.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString("data");
    }

    public static String Qhi(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject Ri = com.bytedance.sdk.component.adexpress.cJ.Ri(str);
        if (Ri == null || (optJSONObject = Ri.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject.optString(str2);
    }

    public static JSONObject Qhi(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
