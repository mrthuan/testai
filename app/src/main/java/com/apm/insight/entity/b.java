package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.h;
import com.apm.insight.l.k;
import com.apm.insight.l.p;
import com.apm.insight.l.u;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<h> f6463a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<Integer, h> f6464b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    public static File a(File file) {
        return new File(file, "all_data.json");
    }

    public static String b(Object obj) {
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next != null && next.a(obj)) {
                return next.b();
            }
        }
        return null;
    }

    public static int c() {
        return f6463a.size();
    }

    public static List<String> d() {
        h next;
        ArrayList arrayList = new ArrayList();
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.b());
        }
        return arrayList;
    }

    public static JSONArray a() {
        h next;
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.c());
        }
        return jSONArray;
    }

    public static JSONArray b() {
        h next;
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.a((CrashType) null));
        }
        return jSONArray;
    }

    public static JSONArray a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = f6463a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h next = it.next();
            if (next != null && next.a(obj)) {
                jSONArray.put(next.a(CrashType.JAVA, (JSONArray) null));
                break;
            }
        }
        return jSONArray;
    }

    public static JSONArray a(Object obj, Throwable th2, StackTraceElement[] stackTraceElementArr) {
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next != null && next.a(obj)) {
                JSONArray a10 = next.a(stackTraceElementArr, th2);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", next.b());
                    jSONObject.put("lines", a10);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    public static JSONArray a(String str) {
        h next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<h> it = f6463a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.insight.runtime.a.b(next.b())) {
                JSONArray a10 = next.a(split);
                if (!k.a(a10)) {
                    jSONArray.put(next.a(CrashType.ANR, a10));
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i10);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && com.apm.insight.runtime.a.c(String.valueOf(optJSONObject.opt("aid"))) && (TextUtils.isEmpty(optJSONObject.optString("package")) || a(str, optJSONObject.optJSONArray("so_list"), str2, optJSONObject.optJSONArray("so_list")))) {
                jSONArray2.put(optJSONObject2);
            }
        }
        return jSONArray2;
    }

    public static JSONArray a(Throwable th2, Thread thread, File file) {
        h next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] b10 = u.b(th2);
        Iterator<h> it = f6463a.iterator();
        while (true) {
            if (!it.hasNext() || (next = it.next()) == null) {
                break;
            } else if (com.apm.insight.runtime.a.a(next.b())) {
                JSONArray a10 = next.a(b10, th2, thread != null ? thread.getName() : null);
                if (!k.a(a10)) {
                    jSONArray.put(next.a(CrashType.JAVA, a10));
                }
            } else {
                p.a((Object) ("not enable javaCrash aid: " + next.b()));
            }
        }
        if (k.a(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                com.apm.insight.l.h.a(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    public static void a(h hVar) {
        f6463a.add(hVar);
        if (hVar.d()) {
            f6464b.put(4444, hVar);
        }
    }

    public static void a(JSONObject jSONObject, JSONArray jSONArray, a aVar) {
        JSONObject optJSONObject;
        p.a((Object) ("uploadFromFile with allData " + jSONArray));
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i10)) != null; i10++) {
            if (k.a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                com.apm.insight.entity.a.b(jSONObject2, jSONObject);
                com.apm.insight.entity.a.b(jSONObject2, optJSONObject);
                aVar.a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        com.apm.insight.entity.a.b(jSONObject3, jSONObject);
        try {
            jSONObject3.put("all_data", jSONArray2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        aVar.a(jSONObject3);
    }

    public static boolean a(String str, JSONArray jSONArray, String str2, JSONArray jSONArray2) {
        if (!k.a(jSONArray)) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (str.contains(jSONArray.optString(i10))) {
                    return true;
                }
            }
        }
        if (!k.a(jSONArray2)) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String optString = jSONArray2.optString(i11);
                if (optString != null && optString.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
