package com.facebook.appevents.iap;

import a6.j;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9534a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f9535b = new AtomicBoolean(false);
    public static Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f9536d;

    /* renamed from: e  reason: collision with root package name */
    public static a6.b f9537e;

    /* renamed from: f  reason: collision with root package name */
    public static a6.d f9538f;

    /* renamed from: g  reason: collision with root package name */
    public static Intent f9539g;

    /* renamed from: h  reason: collision with root package name */
    public static Object f9540h;

    /* renamed from: i  reason: collision with root package name */
    public static InAppPurchaseUtils.BillingClientVersion f9541i;

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.facebook.appevents.iap.a r7, android.content.Context r8, java.util.ArrayList r9, boolean r10) {
        /*
            r7.getClass()
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto Lb
            goto Lad
        Lb:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L19:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
            r2.<init>(r1)     // Catch: org.json.JSONException -> L19
            java.lang.String r3 = "productId"
            java.lang.String r2 = r2.getString(r3)     // Catch: org.json.JSONException -> L19
            java.lang.String r3 = "sku"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: org.json.JSONException -> L19
            java.lang.String r3 = "purchase"
            kotlin.jvm.internal.g.d(r1, r3)     // Catch: org.json.JSONException -> L19
            r7.put(r2, r1)     // Catch: org.json.JSONException -> L19
            r0.add(r2)     // Catch: org.json.JSONException -> L19
            goto L19
        L41:
            java.lang.Object r9 = com.facebook.appevents.iap.a.f9540h
            a6.j r1 = a6.j.f80a
            java.lang.Class<a6.j> r2 = a6.j.class
            boolean r3 = k6.a.b(r2)
            if (r3 == 0) goto L4e
            goto L7d
        L4e:
            java.util.LinkedHashMap r3 = r1.j(r0)     // Catch: java.lang.Throwable -> L79
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
        L5b:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L71
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L79
            boolean r6 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L5b
            r4.add(r5)     // Catch: java.lang.Throwable -> L79
            goto L5b
        L71:
            java.util.LinkedHashMap r8 = r1.g(r8, r4, r9, r10)     // Catch: java.lang.Throwable -> L79
            r3.putAll(r8)     // Catch: java.lang.Throwable -> L79
            goto L7e
        L79:
            r8 = move-exception
            k6.a.a(r2, r8)
        L7d:
            r3 = 0
        L7e:
            java.util.Set r8 = r3.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L86:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r0 = r9.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L86
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.a.f9541i
            r2 = 0
            c6.g.e(r0, r9, r10, r1, r2)
            goto L86
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.a.a(com.facebook.appevents.iap.a, android.content.Context, java.util.ArrayList, boolean):void");
    }

    public static final void b(InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.g.e(billingClientVersion, "billingClientVersion");
        f9534a.getClass();
        if (c == null) {
            if (InAppPurchaseUtils.a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            c = valueOf;
            if (!kotlin.jvm.internal.g.a(valueOf, Boolean.FALSE)) {
                if (InAppPurchaseUtils.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f9536d = Boolean.valueOf(z11);
                j jVar = j.f80a;
                if (!k6.a.b(j.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = j.f83e;
                        long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j10 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j10 > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        k6.a.a(j.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                kotlin.jvm.internal.g.d(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                f9539g = intent;
                f9537e = new a6.b();
                f9538f = new a6.d();
            }
        }
        if (!kotlin.jvm.internal.g.a(c, Boolean.FALSE) && c6.g.d()) {
            f9541i = billingClientVersion;
            if (f9535b.compareAndSet(false, true)) {
                Context a10 = com.facebook.d.a();
                if (a10 instanceof Application) {
                    Application application = (Application) a10;
                    a6.d dVar = f9538f;
                    if (dVar != null) {
                        application.registerActivityLifecycleCallbacks(dVar);
                        Intent intent2 = f9539g;
                        if (intent2 != null) {
                            a6.b bVar = f9537e;
                            if (bVar != null) {
                                a10.bindService(intent2, bVar, 1);
                                return;
                            } else {
                                kotlin.jvm.internal.g.i("serviceConnection");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.g.i("intent");
                        throw null;
                    }
                    kotlin.jvm.internal.g.i("callbacks");
                    throw null;
                }
            }
        }
    }
}
