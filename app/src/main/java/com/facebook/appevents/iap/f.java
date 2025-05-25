package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.q;
import kotlin.text.k;
import org.json.JSONObject;

/* compiled from: InAppPurchaseLoggerManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9592a = new f();

    public static final void c() {
        if (k6.a.b(f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = com.facebook.d.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
        }
    }

    public static final void d(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap, boolean z10, String str, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11) {
        if (k6.a.b(f.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.g.e(skuDetailsMap, "skuDetailsMap");
            f fVar = f9592a;
            LinkedHashMap b10 = fVar.b(fVar.a(purchaseDetailsMap, z10), skuDetailsMap, str);
            if (!k6.a.b(fVar)) {
                for (Map.Entry entry : b10.entrySet()) {
                    c6.g.e((String) entry.getKey(), (String) entry.getValue(), z10, billingClientVersion, z11);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
        }
    }

    public static final void e() {
        Collection collection;
        if (k6.a.b(f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long max = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    collection = new HashSet();
                } else {
                    collection = stringSet;
                }
                copyOnWriteArraySet.addAll(collection);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long parseLong = Long.parseLong((String) k.h0((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(parseLong).length() - 13) < Math.log10(1000.0d)) {
                            max = Math.max(max, parseLong);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", max).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", max).apply();
            c();
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
        }
    }

    public static final void f() {
        if (k6.a.b(f.class)) {
            return;
        }
        try {
            try {
                com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
        }
    }

    public static final void g() {
        if (k6.a.b(f.class)) {
            return;
        }
        try {
            f();
            try {
                SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long currentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", currentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", currentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
        }
    }

    public final HashMap a(ConcurrentHashMap purchaseDetailsMap, boolean z10) {
        long j10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            if (z10) {
                j10 = sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L);
            } else {
                j10 = sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            }
            long j11 = 0;
            for (Map.Entry entry : q.D0(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j12 = jSONObject.getLong("purchaseTime");
                        if (j12 <= j10) {
                            purchaseDetailsMap.remove(str);
                        }
                        j11 = Math.max(j11, j12);
                    }
                } catch (Exception unused) {
                }
            }
            if (j11 >= j10) {
                if (z10) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", j11).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", j11).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final LinkedHashMap b(HashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap, String str) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.g.e(skuDetailsMap, "skuDetailsMap");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get((String) entry.getKey());
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String jSONObject3 = jSONObject.toString();
                        kotlin.jvm.internal.g.d(jSONObject3, "purchaseDetail.toString()");
                        String jSONObject4 = jSONObject2.toString();
                        kotlin.jvm.internal.g.d(jSONObject4, "skuDetail.toString()");
                        linkedHashMap.put(jSONObject3, jSONObject4);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
