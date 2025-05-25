package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.iap.d;
import com.facebook.appevents.iap.e;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: InAppPurchaseAutoLogger.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9542a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f9543b = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.appevents.iap.e, T] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, com.facebook.appevents.iap.d] */
    public static final synchronized void b(Context context, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        boolean z10;
        synchronized (b.class) {
            if (k6.a.b(b.class)) {
                return;
            }
            AtomicBoolean atomicBoolean = f9543b;
            if (atomicBoolean.get()) {
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                ref$ObjectRef.element = d.f9544l.c(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                ref$ObjectRef.element = e.G.b(context);
            }
            if (ref$ObjectRef.element == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (FeatureManager.c(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging)) {
                ProtectedModeManager protectedModeManager = ProtectedModeManager.f9605a;
                if (!k6.a.b(ProtectedModeManager.class)) {
                    z10 = ProtectedModeManager.f9606b;
                } else {
                    z10 = false;
                }
                if (!z10 || billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                    ((c) ref$ObjectRef.element).a(InAppPurchaseUtils.IAPProductType.INAPP, new a6.e(0, ref$ObjectRef, billingClientVersion, context));
                }
            }
            ((c) ref$ObjectRef.element).a(InAppPurchaseUtils.IAPProductType.INAPP, new l1.a(3, billingClientVersion, context));
        }
    }

    public final void a(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        if (k6.a.b(this)) {
            return;
        }
        try {
            f fVar = f.f9592a;
            boolean z10 = false;
            if (!k6.a.b(f.class)) {
                z10 = !com.facebook.d.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
            }
            if (z10) {
                f.e();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                d.b bVar = d.f9544l;
                f.d(d.b.b(), d.b.d(), false, str, billingClientVersion, z10);
                f.d(d.b.e(), d.b.d(), true, str, billingClientVersion, z10);
                d.b.b().clear();
                d.b.e().clear();
            } else {
                e.a aVar = e.G;
                ConcurrentHashMap concurrentHashMap6 = null;
                if (!k6.a.b(e.class)) {
                    concurrentHashMap = e.J;
                } else {
                    concurrentHashMap = null;
                }
                if (!k6.a.b(e.class)) {
                    concurrentHashMap2 = e.L;
                } else {
                    concurrentHashMap2 = null;
                }
                f.d(concurrentHashMap, concurrentHashMap2, false, str, billingClientVersion, z10);
                if (!k6.a.b(e.class)) {
                    concurrentHashMap3 = e.K;
                } else {
                    concurrentHashMap3 = null;
                }
                if (!k6.a.b(e.class)) {
                    concurrentHashMap4 = e.L;
                } else {
                    concurrentHashMap4 = null;
                }
                f.d(concurrentHashMap3, concurrentHashMap4, true, str, billingClientVersion, z10);
                if (!k6.a.b(e.class)) {
                    concurrentHashMap5 = e.J;
                } else {
                    concurrentHashMap5 = null;
                }
                concurrentHashMap5.clear();
                if (!k6.a.b(e.class)) {
                    concurrentHashMap6 = e.K;
                }
                concurrentHashMap6.clear();
            }
            if (z10) {
                f.f();
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
