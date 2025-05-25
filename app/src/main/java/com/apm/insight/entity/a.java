package com.apm.insight.entity;

import android.content.Context;
import com.apm.insight.i;
import com.apm.insight.l.k;
import com.apm.insight.l.n;
import com.apm.insight.l.p;
import com.apm.insight.l.u;
import com.apm.insight.nativecrash.NativeImpl;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected JSONObject f6461a;

    /* renamed from: b  reason: collision with root package name */
    protected Header f6462b;

    public a() {
        this.f6461a = new JSONObject();
    }

    public a a(int i10, String str) {
        try {
            this.f6461a.put("miniapp_id", i10);
            this.f6461a.put("miniapp_version", str);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public a b(String str, String str2) {
        Object opt = h().opt("data");
        a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : h(), "custom", str, str2);
        return this;
    }

    public a c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject e10 = e("filters");
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    e10.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            a("filters", e10);
        }
        return this;
    }

    public boolean d() {
        return c(i.f());
    }

    public JSONObject e(String str) {
        Object opt = h().opt("data");
        JSONObject optJSONObject = opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : h();
        if (optJSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 == null) {
            JSONObject jSONObject = new JSONObject();
            a(str, jSONObject);
            return jSONObject;
        }
        return optJSONObject2;
    }

    public boolean f() {
        return b(i.f());
    }

    public boolean g() {
        return a(i.f());
    }

    public JSONObject h() {
        return this.f6461a;
    }

    public Header i() {
        if (this.f6462b == null) {
            Header header = new Header(i.g());
            this.f6462b = header;
            a(header);
        }
        return this.f6462b;
    }

    public a(JSONObject jSONObject) {
        this.f6461a = jSONObject;
    }

    public static boolean d(String str) {
        return com.apm.insight.nativecrash.d.b(str) > 350;
    }

    public a a(long j10) {
        try {
            a("app_start_time", Long.valueOf(j10));
            a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public a b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e10) {
                    p.b((Throwable) e10);
                }
            }
            try {
                this.f6461a.put("sdk_info", jSONObject);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return this;
    }

    public void c() {
        a("is_64_devices", String.valueOf(Header.a()));
        a("is_64_runtime", String.valueOf(NativeImpl.e()));
        a("is_x86_devices", String.valueOf(Header.b()));
    }

    public boolean e() {
        return d(i.f());
    }

    public static a a(long j10, Context context, String str) {
        a aVar = new a();
        aVar.a("is_dart", (Object) 1);
        aVar.a("crash_time", Long.valueOf(j10));
        aVar.a("process_name", (Object) com.apm.insight.l.a.c(context));
        aVar.a("data", (Object) str);
        com.apm.insight.l.a.a(context, aVar.h());
        return aVar;
    }

    public a b(JSONObject jSONObject) {
        a(this.f6461a, jSONObject);
        return this;
    }

    public void c(JSONObject jSONObject) {
        b(this.f6461a, jSONObject);
    }

    public static a a(long j10, Context context, Thread thread, Throwable th2) {
        if (j10 == 0) {
            j10 = System.currentTimeMillis();
        }
        a aVar = new a();
        aVar.a("isJava", (Object) 1);
        aVar.a("data", (Object) u.a(th2));
        aVar.a("crash_time", Long.valueOf(j10));
        aVar.a("process_name", (Object) com.apm.insight.l.a.c(context));
        if (!com.apm.insight.l.a.b(context)) {
            aVar.a("remote_process", (Object) 1);
        }
        String name = thread == null ? null : thread.getName();
        if (name != null) {
            aVar.a("crash_thread_name", (Object) name);
        }
        return aVar;
    }

    public static boolean c(String str) {
        return com.apm.insight.nativecrash.d.a(str) > 960;
    }

    public void b() {
        a("has_logcat", String.valueOf(a()));
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt2 = jSONObject.opt(next);
                if (opt2 == null) {
                    opt = jSONObject2.opt(next);
                } else {
                    if (opt2 instanceof JSONObject) {
                        jSONObject3 = jSONObject.getJSONObject(next);
                        jSONObject4 = jSONObject2.getJSONObject(next);
                    } else if (opt2 instanceof JSONArray) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                        if (optJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) opt2;
                            if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (optJSONArray.opt(0) instanceof JSONObject)) {
                                jSONObject3 = jSONArray.getJSONObject(0);
                                jSONObject4 = optJSONArray.getJSONObject(0);
                            } else {
                                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                    jSONArray.put(optJSONArray.get(i10));
                                }
                            }
                        }
                    } else {
                        opt = jSONObject2.opt(next);
                    }
                    b(jSONObject3, jSONObject4);
                }
                jSONObject.put(next, opt);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public a a(Header header) {
        a("header", header.f());
        this.f6462b = header;
        return this;
    }

    public static boolean b(String str) {
        return ((long) com.apm.insight.nativecrash.d.c(str)) > com.apm.insight.nativecrash.c.i();
    }

    public a a(com.apm.insight.runtime.a.b bVar) {
        a("activity_trace", bVar.g());
        a("activity_track", bVar.i());
        return this;
    }

    public a a(String str, String str2) {
        Object opt = h().opt("data");
        a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : h(), "filters", str, str2);
        return this;
    }

    public a a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = h().optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            a("custom_long", optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    public a a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String str : list) {
            jSONArray.put(str);
        }
        a("patch_info", (Object) jSONArray);
        return this;
    }

    public a a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            this.f6461a.put("plugin_info", jSONArray);
            return this;
        }
        for (String str : map.keySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, str);
            jSONObject.put("version_code", map.get(str));
            jSONArray.put(jSONObject);
        }
        this.f6461a.put("plugin_info", jSONArray);
        return this;
    }

    public a a(JSONObject jSONObject) {
        a("header", jSONObject);
        return this;
    }

    public void a(String str, Object obj) {
        try {
            this.f6461a.put(str, obj);
        } catch (Exception e10) {
            p.b((Throwable) e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            try {
                optJSONObject = new JSONObject();
                jSONObject.put(str, optJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        optJSONObject.put(str2, str3);
    }

    public static void a(JSONObject jSONObject, Throwable th2) {
        String str = "npth_err_info";
        if (jSONObject.opt("npth_err_info") != null) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (jSONObject.opt("npth_err_info" + i10) == null) {
                    try {
                        str = "npth_err_info" + i10;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
            return;
        }
        jSONObject.put(str, u.a(th2));
    }

    public static void a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put("storage", jSONObject2);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String str = "1M - 64M";
        String str2 = optLong <= 1024 ? "0 - 1K" : optLong <= 65536 ? "1K - 64K" : optLong <= 524288 ? "64K - 512K" : optLong <= 1048576 ? "512K - 1M" : optLong <= 67108864 ? "1M - 64M" : "64M - ";
        String str3 = optLong3 <= 1024 ? "0 - 1K" : optLong3 <= 65536 ? "1K - 64K" : optLong3 <= 524288 ? "64K - 512K" : optLong3 <= 1048576 ? "512K - 1M" : optLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        if (optLong2 <= 1024) {
            str = "0 - 1K";
        } else if (optLong2 <= 65536) {
            str = "1K - 64K";
        } else if (optLong2 <= 524288) {
            str = "64K - 512K";
        } else if (optLong2 <= 1048576) {
            str = "512K - 1M";
        } else if (optLong2 > 67108864) {
            str = "64M - ";
        }
        a(jSONObject, "filters", "inner_free", str2);
        a(jSONObject, "filters", "inner_free_real", str3);
        a(jSONObject, "filters", "sdcard_free", str);
    }

    public boolean a() {
        Object opt = h().opt("data");
        return opt instanceof JSONArray ? !k.a(((JSONArray) opt).optJSONObject(0), "logcat") : !k.a(this.f6461a, "logcat");
    }

    public static boolean a(String str) {
        return n.d(str).exists();
    }
}
