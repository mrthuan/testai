package com.facebook.appevents.iap;

import com.facebook.appevents.iap.InAppPurchaseUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f9598g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static h f9599h;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f9600a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f9601b;
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f9602d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f9603e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f9604f;

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static h a() {
            Class<?> a10 = InAppPurchaseUtils.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a11 = InAppPurchaseUtils.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a10 == null || a11 == null) {
                return null;
            }
            Method c = InAppPurchaseUtils.c(a10, "newBuilder", new Class[0]);
            Method c10 = InAppPurchaseUtils.c(a11, "setType", String.class);
            Method c11 = InAppPurchaseUtils.c(a11, "setSkusList", List.class);
            Method c12 = InAppPurchaseUtils.c(a11, "build", new Class[0]);
            if (c == null || c10 == null || c11 == null || c12 == null) {
                return null;
            }
            h hVar = new h(a10, a11, c, c10, c11, c12);
            if (!k6.a.b(h.class)) {
                try {
                    h.f9599h = hVar;
                } catch (Throwable th2) {
                    k6.a.a(h.class, th2);
                }
            }
            if (k6.a.b(h.class)) {
                return null;
            }
            try {
                return h.f9599h;
            } catch (Throwable th3) {
                k6.a.a(h.class, th3);
                return null;
            }
        }
    }

    public h(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f9600a = cls;
        this.f9601b = cls2;
        this.c = method;
        this.f9602d = method2;
        this.f9603e = method3;
        this.f9604f = method4;
    }

    public final Object a(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list) {
        Object d10;
        Object d11;
        Class<?> cls = this.f9601b;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            Object d12 = InAppPurchaseUtils.d(this.f9600a, this.c, null, new Object[0]);
            if (d12 != null && (d10 = InAppPurchaseUtils.d(cls, this.f9602d, d12, iAPProductType.getType())) != null && (d11 = InAppPurchaseUtils.d(cls, this.f9603e, d10, list)) != null) {
                return InAppPurchaseUtils.d(cls, this.f9604f, d11, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
