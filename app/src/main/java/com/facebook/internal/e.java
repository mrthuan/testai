package com.facebook.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9761a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f9762b;
    public static final ConcurrentLinkedQueue<a> c;

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f9763d;

    /* renamed from: e  reason: collision with root package name */
    public static Long f9764e;

    /* renamed from: f  reason: collision with root package name */
    public static g6.b f9765f;

    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        kotlin.jvm.internal.i.a(e.class).b();
        f9762b = new AtomicBoolean(false);
        c = new ConcurrentLinkedQueue<>();
        f9763d = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.d dVar = com.facebook.d.f9685a;
        bundle.putString("sdk_version", "18.0.2");
        bundle.putString("fields", "gatekeepers");
        String str = com.facebook.e.f9701j;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        kotlin.jvm.internal.g.d(format, "format(format, *args)");
        com.facebook.e g10 = e.c.g(null, format, null);
        g10.f9706d = bundle;
        JSONObject jSONObject = g10.c().f9729d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean b(String name, String str, boolean z10) {
        HashMap hashMap;
        ConcurrentHashMap<String, g6.a> concurrentHashMap;
        Boolean bool;
        kotlin.jvm.internal.g.e(name, "name");
        f9761a.getClass();
        ArrayList<g6.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f9763d;
        if (!concurrentHashMap2.containsKey(str)) {
            hashMap = new HashMap();
        } else {
            g6.b bVar = f9765f;
            if (bVar != null && (concurrentHashMap = bVar.f17669a.get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                for (Map.Entry<String, g6.a> entry : concurrentHashMap.entrySet()) {
                    arrayList.add(entry.getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (g6.a aVar : arrayList) {
                    hashMap.put(aVar.f17667a, Boolean.valueOf(aVar.f17668b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    kotlin.jvm.internal.g.d(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                g6.b bVar2 = f9765f;
                if (bVar2 == null) {
                    bVar2 = new g6.b();
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    arrayList2.add(new g6.a((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue()));
                }
                ConcurrentHashMap<String, g6.a> concurrentHashMap3 = new ConcurrentHashMap<>();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    g6.a aVar2 = (g6.a) it.next();
                    concurrentHashMap3.put(aVar2.f17667a, aVar2);
                }
                bVar2.f17669a.put(str, concurrentHashMap3);
                f9765f = bVar2;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(name) && (bool = (Boolean) hashMap.get(name)) != null) {
            return bool.booleanValue();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[Catch: all -> 0x008b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x002f, B:16:0x0037, B:19:0x003c, B:21:0x0064, B:25:0x006f, B:26:0x0072, B:30:0x0080, B:23:0x006b, B:9:0x001a), top: B:38:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void c(com.facebook.internal.d r8) {
        /*
            java.lang.Class<com.facebook.internal.e> r0 = com.facebook.internal.e.class
            monitor-enter(r0)
            if (r8 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.e$a> r1 = com.facebook.internal.e.c     // Catch: java.lang.Throwable -> L8b
            r1.add(r8)     // Catch: java.lang.Throwable -> L8b
        La:
            java.lang.String r8 = com.facebook.d.b()     // Catch: java.lang.Throwable -> L8b
            com.facebook.internal.e r1 = com.facebook.internal.e.f9761a     // Catch: java.lang.Throwable -> L8b
            java.lang.Long r2 = com.facebook.internal.e.f9764e     // Catch: java.lang.Throwable -> L8b
            r1.getClass()     // Catch: java.lang.Throwable -> L8b
            r1 = 1
            r3 = 0
            if (r2 != 0) goto L1a
            goto L2c
        L1a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8b
            long r6 = r2.longValue()     // Catch: java.lang.Throwable -> L8b
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L3c
            java.util.concurrent.ConcurrentHashMap r2 = com.facebook.internal.e.f9763d     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r2.containsKey(r8)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L3c
            e()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L3c:
            android.content.Context r2 = com.facebook.d.a()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8b
            r5[r3] = r8     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "format(format, *args)"
            kotlin.jvm.internal.g.d(r4, r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r2.getSharedPreferences(r5, r3)     // Catch: java.lang.Throwable -> L8b
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch: java.lang.Throwable -> L8b
            boolean r7 = com.facebook.internal.p.v(r5)     // Catch: java.lang.Throwable -> L8b
            if (r7 != 0) goto L72
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> L8b
            r7.<init>(r5)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> L8b
            r6 = r7
            goto L6d
        L6b:
            com.facebook.d r5 = com.facebook.d.f9685a     // Catch: java.lang.Throwable -> L8b
        L6d:
            if (r6 == 0) goto L72
            d(r8, r6)     // Catch: java.lang.Throwable -> L8b
        L72:
            java.util.concurrent.Executor r5 = com.facebook.d.c()     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicBoolean r6 = com.facebook.internal.e.f9762b     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r6.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L80
            monitor-exit(r0)
            return
        L80:
            androidx.fragment.app.d r1 = new androidx.fragment.app.d     // Catch: java.lang.Throwable -> L8b
            r3 = 3
            r1.<init>(r3, r8, r2, r4)     // Catch: java.lang.Throwable -> L8b
            r5.execute(r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L8b:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.e.c(com.facebook.internal.d):void");
    }

    public static final synchronized JSONObject d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        synchronized (e.class) {
            jSONObject2 = (JSONObject) f9763d.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                } catch (JSONException unused) {
                    p pVar = p.f9815a;
                    com.facebook.d dVar = com.facebook.d.f9685a;
                }
            }
            f9763d.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = c;
            if (!concurrentLinkedQueue.isEmpty()) {
                a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new androidx.activity.b(poll, 7));
                }
            } else {
                return;
            }
        }
    }
}
