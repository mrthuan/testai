package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, e> f6756a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f6757b = null;
    private JSONObject c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6758d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f6759e;

    public e(JSONObject jSONObject, String str) {
        this.f6759e = str;
        a(jSONObject);
        f6756a.put(this.f6759e, this);
        com.apm.insight.l.p.a((Object) ("after update aid " + str));
    }

    public static JSONObject c(String str) {
        e eVar = f6756a.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static e d(String str) {
        return f6756a.get(str);
    }

    public static long e(String str) {
        e eVar = f6756a.get(str);
        if (eVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.l.k.b(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean f(String str) {
        e eVar = f6756a.get(str);
        if (eVar != null && eVar.b()) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        e eVar = f6756a.get(str);
        if (eVar != null && eVar.c()) {
            return true;
        }
        return false;
    }

    public static boolean h(String str) {
        e eVar = f6756a.get(str);
        if (eVar != null && eVar.d()) {
            return true;
        }
        return false;
    }

    public JSONObject a() {
        return this.f6757b;
    }

    public boolean b() {
        JSONObject jSONObject = this.f6757b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    public static void a(String str, JSONObject jSONObject) {
        e eVar = f6756a.get(str);
        if (eVar != null) {
            eVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    public static boolean b(String str) {
        return f6756a.get(str) != null;
    }

    public boolean c() {
        JSONObject jSONObject = this.f6757b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean d() {
        JSONObject jSONObject = this.f6757b;
        return jSONObject != null && 1 == com.apm.insight.l.k.a(jSONObject, 0, "crash_module", "switcher");
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f6757b = jSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        boolean z10 = true;
        this.f6758d = (optJSONObject.optInt("switcher") == 1 && optJSONObject.optInt("err_sampling_rate") == 1) ? false : false;
    }

    public boolean a(String str) {
        if (this.f6757b == null) {
            return false;
        }
        return this.f6758d;
    }
}
