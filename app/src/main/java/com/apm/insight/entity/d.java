package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.l.k;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f6465a;

    /* renamed from: b  reason: collision with root package name */
    private static JSONObject f6466b;

    private static void a() {
        JSONObject jSONObject;
        if (f6465a == null) {
            f6465a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + i.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f6466b == null) {
            try {
                f6466b = new JSONObject(h.c(f6465a));
            } catch (IOException unused) {
                jSONObject = new JSONObject();
                f6466b = jSONObject;
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
                f6466b = jSONObject;
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            d(jSONObject);
        } catch (Throwable unused) {
        }
    }

    private static void c(JSONObject jSONObject) {
        Object opt;
        a();
        JSONObject jSONObject2 = f6466b;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"slardar_filter".equals(next) && (opt = f6466b.opt(next)) != null) {
                try {
                    jSONObject.put(next, opt);
                } catch (JSONException unused) {
                }
            }
        }
    }

    private static void d(JSONObject jSONObject) {
        a();
        JSONObject jSONObject2 = f6466b;
        if (jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
        if (k.a(optJSONObject)) {
            return;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
            try {
                jSONObject.put("filters", optJSONObject2);
            } catch (JSONException unused) {
            }
        }
        a.b(optJSONObject2, optJSONObject);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            c(jSONObject);
        } catch (Throwable unused) {
        }
    }
}
