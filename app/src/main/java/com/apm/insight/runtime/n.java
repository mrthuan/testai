package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    protected static JSONObject f6779a = new JSONObject();

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String a10 = a.a(jSONObject);
            File file = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/configCrash/configNative");
            if (a10 != null) {
                JSONObject jSONObject2 = new JSONObject(a10);
                f6779a = jSONObject2;
                com.apm.insight.l.h.a(file, b(jSONObject2), false);
            } else {
                f6779a = new JSONObject();
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    private static JSONArray b(JSONArray jSONArray, f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (com.apm.insight.l.k.a(jSONArray)) {
            return jSONArray2;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                com.apm.insight.d a10 = com.apm.insight.c.a();
                a10.a("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (a(optJSONObject, fVar)) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    public static boolean a(String str, f fVar) {
        if (f6779a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new f();
        }
        JSONObject optJSONObject = f6779a.optJSONObject(str);
        if (optJSONObject == null || a(optJSONObject.optJSONArray("disable"), fVar)) {
            return false;
        }
        return a(optJSONObject.optJSONArray("enable"), fVar);
    }

    public static JSONObject b(JSONObject jSONObject) {
        StringBuilder sb2;
        Iterator<String> keys = jSONObject.keys();
        f fVar = new f();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    com.apm.insight.c.a().a("NPTH_CATCH", new IllegalArgumentException(a0.a.h("err config with key: ", next)));
                } else {
                    if (a(optJSONObject.optJSONArray("disable"), fVar)) {
                        sb2 = new StringBuilder("match diable ");
                    } else {
                        JSONArray b10 = b(optJSONObject.optJSONArray("enable"), fVar);
                        if (com.apm.insight.l.k.a(b10)) {
                            sb2 = new StringBuilder("not match ");
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", b10));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb2.append(next);
                    com.apm.insight.l.p.a((Object) sb2.toString());
                }
            }
        }
        return jSONObject2;
    }

    private static boolean a(JSONArray jSONArray, f fVar) {
        if (com.apm.insight.l.k.a(jSONArray)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                com.apm.insight.c.a().a("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (a(optJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, f fVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z10 = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!a(jSONObject.optJSONObject(next), fVar.b(next.substring(7)))) {
                        com.apm.insight.l.p.a((Object) "not match ".concat(next));
                        return false;
                    }
                    z10 = true;
                } else {
                    if (!next.startsWith("java_")) {
                        com.apm.insight.l.p.a((Object) "no rules match ".concat(next));
                    } else if (!a(jSONObject.optJSONObject(next), fVar.a(next.substring(5)))) {
                        com.apm.insight.l.p.a((Object) "not match ".concat(next));
                        return false;
                    }
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private static boolean a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (String.valueOf(optJSONArray.opt(i10)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
