package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.m;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
/* loaded from: classes.dex */
public final class e implements c {
    public static e I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9565a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f9566b;
    public final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f9567d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f9568e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f9569f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f9570g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f9571h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f9572i;

    /* renamed from: j  reason: collision with root package name */
    public final Class<?> f9573j;

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f9574k;

    /* renamed from: l  reason: collision with root package name */
    public final Class<?> f9575l;

    /* renamed from: m  reason: collision with root package name */
    public final Class<?> f9576m;

    /* renamed from: n  reason: collision with root package name */
    public final Class<?> f9577n;

    /* renamed from: o  reason: collision with root package name */
    public final Class<?> f9578o;

    /* renamed from: p  reason: collision with root package name */
    public final Method f9579p;

    /* renamed from: q  reason: collision with root package name */
    public final Method f9580q;

    /* renamed from: r  reason: collision with root package name */
    public final Method f9581r;

    /* renamed from: s  reason: collision with root package name */
    public final Method f9582s;

    /* renamed from: t  reason: collision with root package name */
    public final Method f9583t;

    /* renamed from: u  reason: collision with root package name */
    public final Method f9584u;

    /* renamed from: v  reason: collision with root package name */
    public final Method f9585v;

    /* renamed from: w  reason: collision with root package name */
    public final Method f9586w;

    /* renamed from: x  reason: collision with root package name */
    public final Method f9587x;

    /* renamed from: y  reason: collision with root package name */
    public final Method f9588y;

    /* renamed from: z  reason: collision with root package name */
    public final Method f9589z;
    public static final a G = new a();
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    /* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        /* JADX WARN: Removed duplicated region for block: B:59:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.appevents.iap.e a(android.content.Context r50) {
            /*
                Method dump skipped, instructions count: 625
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.e.a.a(android.content.Context):com.facebook.appevents.iap.e");
        }

        public final synchronized e b(Context context) {
            e eVar;
            eVar = null;
            if (!k6.a.b(e.class)) {
                eVar = e.I;
            }
            if (eVar == null) {
                eVar = a(context);
            }
            return eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            kotlin.jvm.internal.g.e(proxy, "proxy");
            kotlin.jvm.internal.g.e(m10, "m");
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    /* loaded from: classes.dex */
    public final class b implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f9590a;

        public b(Object[] objArr) {
            this.f9590a = objArr;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            kotlin.jvm.internal.g.e(proxy, "proxy");
            kotlin.jvm.internal.g.e(m10, "m");
            String name = m10.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                Object[] objArr2 = this.f9590a;
                e eVar = e.this;
                switch (hashCode) {
                    case -1642587947:
                        if (name.equals("onPurchaseHistoryResponse") && !k6.a.b(e.class)) {
                            try {
                                eVar.h(objArr2, objArr);
                                return null;
                            } catch (Throwable th2) {
                                k6.a.a(e.class, th2);
                                return null;
                            }
                        }
                        return null;
                    case -1599362358:
                        if (name.equals("onQueryPurchasesResponse") && !k6.a.b(e.class)) {
                            try {
                                eVar.i(objArr2, objArr);
                                return null;
                            } catch (Throwable th3) {
                                k6.a.a(e.class, th3);
                                return null;
                            }
                        }
                        return null;
                    case -79406125:
                        if (name.equals("onBillingSetupFinished") && !k6.a.b(e.class)) {
                            try {
                                eVar.f(objArr2, objArr);
                                return null;
                            } catch (Throwable th4) {
                                k6.a.a(e.class, th4);
                                return null;
                            }
                        }
                        return null;
                    case 1227540564:
                        if (name.equals("onBillingServiceDisconnected") && !k6.a.b(e.class)) {
                            try {
                                eVar.getClass();
                                if (!k6.a.b(eVar)) {
                                    e.H.set(false);
                                    return null;
                                }
                                return null;
                            } catch (Throwable th5) {
                                k6.a.a(e.class, th5);
                                return null;
                            }
                        }
                        return null;
                    case 1940131955:
                        if (name.equals("onProductDetailsResponse") && !k6.a.b(e.class)) {
                            try {
                                eVar.g(objArr2, objArr);
                                return null;
                            } catch (Throwable th6) {
                                k6.a.a(e.class, th6);
                                return null;
                            }
                        }
                        return null;
                    default:
                        return null;
                }
            }
            return null;
        }
    }

    public e() {
        throw null;
    }

    public e(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.f9565a = obj;
        this.f9566b = cls;
        this.c = cls2;
        this.f9567d = cls3;
        this.f9568e = cls4;
        this.f9569f = cls5;
        this.f9570g = cls6;
        this.f9571h = cls7;
        this.f9572i = cls8;
        this.f9573j = cls9;
        this.f9574k = cls10;
        this.f9575l = cls11;
        this.f9576m = cls12;
        this.f9577n = cls13;
        this.f9578o = cls14;
        this.f9579p = method;
        this.f9580q = method2;
        this.f9581r = method3;
        this.f9582s = method4;
        this.f9583t = method5;
        this.f9584u = method6;
        this.f9585v = method7;
        this.f9586w = method8;
        this.f9587x = method9;
        this.f9588y = method10;
        this.f9589z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    @Override // com.facebook.appevents.iap.c
    public final void a(InAppPurchaseUtils.IAPProductType productType, Runnable runnable) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(productType, "productType");
            androidx.fragment.app.f fVar = new androidx.fragment.app.f(1, this, productType, runnable);
            if (!k6.a.b(this)) {
                if (H.get()) {
                    fVar.run();
                } else {
                    j(fVar);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final String c(String str) {
        List<String> a10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            kotlin.text.e find$default = Regex.find$default(new Regex("jsonString='(.*?)'"), str, 0, 2, null);
            if (find$default == null || (a10 = find$default.a()) == null) {
                return null;
            }
            return (String) m.t0(1, a10);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final Object d(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list) {
        Class<?> cls = this.f9573j;
        Class<?> cls2 = this.f9575l;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Object d10 = InAppPurchaseUtils.d(cls2, this.A, InAppPurchaseUtils.d(cls2, this.C, InAppPurchaseUtils.d(cls2, this.B, InAppPurchaseUtils.d(this.f9569f, this.f9589z, null, new Object[0]), it.next()), iAPProductType.getType()), new Object[0]);
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return InAppPurchaseUtils.d(cls, this.f9587x, InAppPurchaseUtils.d(cls, this.f9588y, InAppPurchaseUtils.d(this.f9571h, this.f9586w, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final Object e(InAppPurchaseUtils.IAPProductType iAPProductType) {
        Class<?> cls = this.f9574k;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            return InAppPurchaseUtils.d(cls, this.f9582s, InAppPurchaseUtils.d(cls, this.f9583t, InAppPurchaseUtils.d(this.f9572i, this.f9581r, null, new Object[0]), iAPProductType.getType()), new Object[0]);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x000b, B:19:0x001c, B:21:0x0032, B:23:0x0039, B:31:0x0045, B:33:0x004b, B:35:0x004f), top: B:39:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object[] r6, java.lang.Object[] r7) {
        /*
            r5 = this;
            boolean r0 = k6.a.b(r5)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L18
            int r2 = r7.length     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L14
            goto L18
        L14:
            r2 = r1
            goto L19
        L16:
            r6 = move-exception
            goto L53
        L18:
            r2 = r0
        L19:
            if (r2 == 0) goto L1c
            return
        L1c:
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L16
            java.lang.Class<?> r2 = r5.f9570g     // Catch: java.lang.Throwable -> L16
            java.lang.reflect.Method r3 = r5.F     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
            java.lang.Object r7 = com.facebook.appevents.iap.InAppPurchaseUtils.d(r2, r3, r7, r4)     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
            boolean r7 = kotlin.jvm.internal.g.a(r7, r2)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L52
            java.util.concurrent.atomic.AtomicBoolean r7 = com.facebook.appevents.iap.e.H     // Catch: java.lang.Throwable -> L16
            r7.set(r0)     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L43
            int r7 = r6.length     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L3e
            r7 = r0
            goto L3f
        L3e:
            r7 = r1
        L3f:
            if (r7 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 != 0) goto L52
            r6 = r6[r1]     // Catch: java.lang.Throwable -> L16
            boolean r7 = r6 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L52
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L52
            r6.run()     // Catch: java.lang.Throwable -> L16
        L52:
            return
        L53:
            k6.a.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.e.f(java.lang.Object[], java.lang.Object[]):void");
    }

    public final void g(Object[] objArr, Object[] objArr2) {
        Object E;
        Object obj;
        String str;
        String c;
        if (k6.a.b(this)) {
            return;
        }
        if (objArr != null) {
            try {
                E = kotlin.collections.f.E(0, objArr);
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return;
            }
        } else {
            E = null;
        }
        if (objArr2 != null) {
            obj = kotlin.collections.f.E(1, objArr2);
        } else {
            obj = null;
        }
        if (obj != null && (obj instanceof List)) {
            for (Object obj2 : (List) obj) {
                try {
                    Object d10 = InAppPurchaseUtils.d(this.f9567d, this.D, obj2, new Object[0]);
                    if (d10 instanceof String) {
                        str = (String) d10;
                    } else {
                        str = null;
                    }
                    if (str != null && (c = c(str)) != null) {
                        JSONObject jSONObject = new JSONObject(c);
                        if (jSONObject.has("productId")) {
                            String productId = jSONObject.getString("productId");
                            ConcurrentHashMap concurrentHashMap = L;
                            kotlin.jvm.internal.g.d(productId, "productId");
                            concurrentHashMap.put(productId, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (E != null && (E instanceof Runnable)) {
                ((Runnable) E).run();
            }
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        Object E;
        Object obj;
        String str;
        if (k6.a.b(this)) {
            return;
        }
        if (objArr != null) {
            try {
                E = kotlin.collections.f.E(0, objArr);
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return;
            }
        } else {
            E = null;
        }
        if (E != null && (E instanceof InAppPurchaseUtils.IAPProductType)) {
            Object E2 = kotlin.collections.f.E(1, objArr);
            if (!(E2 instanceof Runnable)) {
                return;
            }
            if (objArr2 != null) {
                obj = kotlin.collections.f.E(1, objArr2);
            } else {
                obj = null;
            }
            if (obj != null && (obj instanceof List)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    try {
                        Object d10 = InAppPurchaseUtils.d(this.f9568e, this.f9584u, obj2, new Object[0]);
                        if (d10 instanceof String) {
                            str = (String) d10;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                if (!L.containsKey(productId)) {
                                    kotlin.jvm.internal.g.d(productId, "productId");
                                    arrayList.add(productId);
                                }
                                if (E == InAppPurchaseUtils.IAPProductType.INAPP) {
                                    ConcurrentHashMap concurrentHashMap = J;
                                    kotlin.jvm.internal.g.d(productId, "productId");
                                    concurrentHashMap.put(productId, jSONObject);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = K;
                                    kotlin.jvm.internal.g.d(productId, "productId");
                                    concurrentHashMap2.put(productId, jSONObject);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    InAppPurchaseUtils.IAPProductType iAPProductType = (InAppPurchaseUtils.IAPProductType) E;
                    Runnable runnable = (Runnable) E2;
                    if (!k6.a.b(this)) {
                        a6.g gVar = new a6.g(0, this, runnable, iAPProductType, arrayList);
                        if (!k6.a.b(this)) {
                            if (H.get()) {
                                gVar.run();
                                return;
                            } else {
                                j(gVar);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ((Runnable) E2).run();
            }
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        Object E;
        Object obj;
        String str;
        if (k6.a.b(this)) {
            return;
        }
        if (objArr != null) {
            try {
                E = kotlin.collections.f.E(0, objArr);
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return;
            }
        } else {
            E = null;
        }
        if (E != null && (E instanceof InAppPurchaseUtils.IAPProductType)) {
            Object E2 = kotlin.collections.f.E(1, objArr);
            if (!(E2 instanceof Runnable)) {
                return;
            }
            if (objArr2 != null) {
                obj = kotlin.collections.f.E(1, objArr2);
            } else {
                obj = null;
            }
            if (obj != null && (obj instanceof List)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    Object d10 = InAppPurchaseUtils.d(this.c, this.f9579p, obj2, new Object[0]);
                    if (d10 instanceof String) {
                        str = (String) d10;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String productId = jSONObject.getString("productId");
                            if (!L.containsKey(productId)) {
                                kotlin.jvm.internal.g.d(productId, "productId");
                                arrayList.add(productId);
                            }
                            if (E == InAppPurchaseUtils.IAPProductType.INAPP) {
                                ConcurrentHashMap concurrentHashMap = J;
                                kotlin.jvm.internal.g.d(productId, "productId");
                                concurrentHashMap.put(productId, jSONObject);
                            } else {
                                ConcurrentHashMap concurrentHashMap2 = K;
                                kotlin.jvm.internal.g.d(productId, "productId");
                                concurrentHashMap2.put(productId, jSONObject);
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InAppPurchaseUtils.IAPProductType iAPProductType = (InAppPurchaseUtils.IAPProductType) E;
                    Runnable runnable = (Runnable) E2;
                    if (!k6.a.b(this)) {
                        a6.g gVar = new a6.g(0, this, runnable, iAPProductType, arrayList);
                        if (!k6.a.b(this)) {
                            if (H.get()) {
                                gVar.run();
                                return;
                            } else {
                                j(gVar);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ((Runnable) E2).run();
            }
        }
    }

    public final void j(Runnable runnable) {
        Class<?> cls = this.f9576m;
        if (k6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b(new Object[]{runnable}));
            Class<?> cls2 = this.f9566b;
            Method method = this.E;
            Object obj = null;
            if (!k6.a.b(this)) {
                obj = this.f9565a;
            }
            InAppPurchaseUtils.d(cls2, method, obj, newProxyInstance);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
