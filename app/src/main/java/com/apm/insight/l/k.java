package com.apm.insight.l;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {
    public static int a(JSONObject jSONObject, int i10, String... strArr) {
        JSONObject c = c(jSONObject, strArr);
        if (c == null) {
            return i10;
        }
        int optInt = c.optInt(strArr[strArr.length - 1], i10);
        p.a("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + optInt);
        return optInt;
    }

    public static String b(JSONObject jSONObject, String... strArr) {
        JSONObject c = c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        String optString = c.optString(strArr[strArr.length - 1]);
        p.a("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + optString);
        return optString;
    }

    public static JSONObject c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            p.a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
            if (jSONObject == null) {
                p.a("JSONUtil", "err get json: not found node:" + strArr[i10]);
                return null;
            }
        }
        return jSONObject;
    }

    public static JSONArray a(int i10, int i11, JSONArray jSONArray) {
        int i12 = i11 + i10;
        if (jSONArray.length() <= i12) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i13 = 0; i13 < i10; i13++) {
            jSONArray2.put(jSONArray.opt(i13));
        }
        while (i10 < i12) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i12 - i10)));
            i10++;
        }
        return jSONArray2;
    }

    public static HashMap<String, Object> b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    public static JSONArray a(JSONObject jSONObject, String... strArr) {
        JSONObject c = c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        JSONArray optJSONArray = c.optJSONArray(strArr[strArr.length - 1]);
        p.a("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + optJSONArray);
        return optJSONArray;
    }

    public static JSONArray a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return a(jSONObject) || a(jSONObject.optJSONArray(str));
    }
}
