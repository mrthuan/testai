package com.apm.insight.k;

import com.apm.insight.l.n;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static File f6628a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6629b = false;
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f6630d = "exception_modules";

    /* renamed from: e  reason: collision with root package name */
    private static String f6631e = "npth";

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, String> f6632f;

    public static void a(String str) {
        if (f6632f == null) {
            f6632f = new HashMap();
        }
        f6632f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    public static boolean b() {
        return c;
    }

    public static void c() {
        if (f6629b) {
            return;
        }
        c = true;
        File file = new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile");
        if (!file.exists()) {
            return;
        }
        try {
            com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.h.c(file)), false);
            f6629b = true;
        } catch (Throwable unused) {
            com.apm.insight.runtime.a.a((JSONArray) null, false);
        }
    }

    public static void d() {
        c();
        if (a(false)) {
            a.a();
        }
    }

    public static void e() {
        p.b().a(new Runnable() { // from class: com.apm.insight.k.k.1
            @Override // java.lang.Runnable
            public void run() {
                if (k.a(false)) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f6632f;
        if (map != null) {
            map.clear();
        }
    }

    private static File g() {
        if (f6628a == null) {
            f6628a = new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configInvalid");
        }
        return f6628a;
    }

    public static void a(boolean z10, JSONArray jSONArray) {
        try {
            com.apm.insight.l.h.a(new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.h.a(g(), f6632f);
        } catch (Throwable unused2) {
        }
    }

    public static boolean a() {
        return f6629b;
    }

    public static boolean a(boolean z10) {
        File g10 = g();
        try {
            Map<String, String> map = f6632f;
            if (map == null) {
                map = com.apm.insight.l.h.e(g10);
            }
            f6632f = map;
            if (map == null) {
                f6632f = new HashMap();
                return true;
            } else if (map.size() < com.apm.insight.entity.b.c()) {
                return true;
            } else {
                for (String str : com.apm.insight.entity.b.d()) {
                    if (!f6632f.containsKey(str)) {
                        return true;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                boolean z11 = false;
                for (Map.Entry<String, String> entry : f6632f.entrySet()) {
                    if (currentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.e.e(entry.getKey())) {
                        z11 = true;
                    }
                }
                com.apm.insight.l.p.a((Object) (z11 ? "config should be updated" : "config should not be updated"));
                return z11;
            }
        } catch (Throwable unused) {
            return true;
        }
    }
}
