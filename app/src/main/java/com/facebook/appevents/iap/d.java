package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.j;

/* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
/* loaded from: classes.dex */
public final class d implements com.facebook.appevents.iap.c {

    /* renamed from: m  reason: collision with root package name */
    public static d f9545m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9550a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f9551b;
    public final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f9552d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f9553e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f9554f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f9555g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f9556h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f9557i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f9558j;

    /* renamed from: k  reason: collision with root package name */
    public final h f9559k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f9544l = new b();

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicBoolean f9546n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    public static final ConcurrentHashMap f9547o = new ConcurrentHashMap();

    /* renamed from: p  reason: collision with root package name */
    public static final ConcurrentHashMap f9548p = new ConcurrentHashMap();

    /* renamed from: q  reason: collision with root package name */
    public static final ConcurrentHashMap f9549q = new ConcurrentHashMap();

    /* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f9560a;

        public a(Runnable runnable) {
            this.f9560a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            AtomicBoolean atomicBoolean;
            Object obj;
            Method c;
            AtomicBoolean atomicBoolean2;
            if (k6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.g.e(proxy, "proxy");
                kotlin.jvm.internal.g.e(m10, "m");
                if (kotlin.jvm.internal.g.a(m10.getName(), "onBillingSetupFinished")) {
                    if (objArr != null) {
                        obj = kotlin.collections.f.E(0, objArr);
                    } else {
                        obj = null;
                    }
                    Class<?> a10 = InAppPurchaseUtils.a("com.android.billingclient.api.BillingResult");
                    if (a10 != null && (c = InAppPurchaseUtils.c(a10, "getResponseCode", new Class[0])) != null && kotlin.jvm.internal.g.a(InAppPurchaseUtils.d(a10, c, obj, new Object[0]), 0)) {
                        b bVar = d.f9544l;
                        if (!k6.a.b(d.class)) {
                            atomicBoolean2 = d.f9546n;
                        } else {
                            atomicBoolean2 = null;
                        }
                        atomicBoolean2.set(true);
                        Runnable runnable = this.f9560a;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m10.getName();
                    kotlin.jvm.internal.g.d(name, "m.name");
                    if (j.F(name, "onBillingServiceDisconnected", false)) {
                        b bVar2 = d.f9544l;
                        if (!k6.a.b(d.class)) {
                            atomicBoolean = d.f9546n;
                        } else {
                            atomicBoolean = null;
                        }
                        atomicBoolean.set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    /* loaded from: classes.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.facebook.appevents.iap.d a(android.content.Context r19) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.d.b.a(android.content.Context):com.facebook.appevents.iap.d");
        }

        public static ConcurrentHashMap b() {
            if (!k6.a.b(d.class)) {
                try {
                    return d.f9547o;
                } catch (Throwable th2) {
                    k6.a.a(d.class, th2);
                }
            }
            return null;
        }

        public static ConcurrentHashMap d() {
            if (!k6.a.b(d.class)) {
                try {
                    return d.f9549q;
                } catch (Throwable th2) {
                    k6.a.a(d.class, th2);
                }
            }
            return null;
        }

        public static ConcurrentHashMap e() {
            if (!k6.a.b(d.class)) {
                try {
                    return d.f9548p;
                } catch (Throwable th2) {
                    k6.a.a(d.class, th2);
                }
            }
            return null;
        }

        public final synchronized d c(Context context) {
            d dVar;
            dVar = null;
            if (!k6.a.b(d.class)) {
                dVar = d.f9545m;
            }
            if (dVar == null) {
                dVar = a(context);
            }
            return dVar;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final InAppPurchaseUtils.IAPProductType f9561a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f9562b;

        public c(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
            this.f9561a = iAPProductType;
            this.f9562b = runnable;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[Catch: Exception -> 0x003d, all -> 0x00fd, TryCatch #6 {all -> 0x00fd, blocks: (B:5:0x0009, B:10:0x0024, B:13:0x002c, B:16:0x0032, B:17:0x003d, B:20:0x0047, B:21:0x004b, B:29:0x005a, B:37:0x0069, B:39:0x0074, B:43:0x007b, B:46:0x0087, B:48:0x0099, B:49:0x00a3, B:35:0x0065, B:27:0x0056, B:51:0x00ad, B:53:0x00b4, B:75:0x00f7, B:56:0x00bf, B:59:0x00c9, B:68:0x00e9), top: B:88:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x007b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x007a A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.d.c.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (k6.a.b(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return tf.d.f30009a;
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    /* renamed from: com.facebook.appevents.iap.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0140d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (k6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.g.e(proxy, "proxy");
                kotlin.jvm.internal.g.e(m10, "m");
                return null;
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    /* loaded from: classes.dex */
    public final class e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f9563a;

        public e(Runnable runnable) {
            this.f9563a = runnable;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: Exception -> 0x003a, all -> 0x009b, TryCatch #1 {Exception -> 0x003a, blocks: (B:20:0x0044, B:29:0x0055, B:37:0x0064, B:39:0x006f, B:43:0x0076, B:46:0x0082, B:35:0x0060, B:27:0x0051), top: B:56:0x0044 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0076 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0075 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                r5 = this;
                java.lang.String r0 = "productId"
                java.lang.Class<com.facebook.appevents.iap.d> r1 = com.facebook.appevents.iap.d.class
                boolean r2 = k6.a.b(r5)
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.String r2 = "proxy"
                kotlin.jvm.internal.g.e(r6, r2)     // Catch: java.lang.Throwable -> L9b
                java.lang.String r6 = "m"
                kotlin.jvm.internal.g.e(r7, r6)     // Catch: java.lang.Throwable -> L9b
                java.lang.String r6 = r7.getName()     // Catch: java.lang.Throwable -> L9b
                java.lang.String r7 = "onSkuDetailsResponse"
                boolean r6 = kotlin.jvm.internal.g.a(r6, r7)     // Catch: java.lang.Throwable -> L9b
                if (r6 != 0) goto L22
                return
            L22:
                r6 = 0
                if (r8 == 0) goto L2b
                r7 = 1
                java.lang.Object r7 = kotlin.collections.f.E(r7, r8)     // Catch: java.lang.Throwable -> L9b
                goto L2c
            L2b:
                r7 = r6
            L2c:
                if (r7 == 0) goto L9a
                boolean r8 = r7 instanceof java.util.List     // Catch: java.lang.Throwable -> L9b
                if (r8 != 0) goto L34
                goto L9a
            L34:
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L9b
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
            L3a:
                boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L9b
                if (r8 == 0) goto L95
                java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L9b
                boolean r2 = k6.a.b(r1)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                com.facebook.appevents.iap.d r3 = com.facebook.appevents.iap.d.this
                if (r2 == 0) goto L4d
                goto L54
            L4d:
                java.lang.Class<?> r2 = r3.c     // Catch: java.lang.Throwable -> L50
                goto L55
            L50:
                r2 = move-exception
                k6.a.a(r1, r2)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
            L54:
                r2 = r6
            L55:
                boolean r4 = k6.a.b(r1)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                if (r4 == 0) goto L5c
                goto L63
            L5c:
                java.lang.reflect.Method r3 = r3.f9555g     // Catch: java.lang.Throwable -> L5f
                goto L64
            L5f:
                r3 = move-exception
                k6.a.a(r1, r3)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
            L63:
                r3 = r6
            L64:
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                java.lang.Object r8 = com.facebook.appevents.iap.InAppPurchaseUtils.d(r2, r3, r8, r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                boolean r2 = r8 instanceof java.lang.String     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                if (r2 == 0) goto L72
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                goto L73
            L72:
                r8 = r6
            L73:
                if (r8 != 0) goto L76
                goto L3a
            L76:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                r2.<init>(r8)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                boolean r8 = r2.has(r0)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                if (r8 != 0) goto L82
                goto L3a
            L82:
                java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                com.facebook.appevents.iap.d$b r3 = com.facebook.appevents.iap.d.f9544l     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                java.util.concurrent.ConcurrentHashMap r3 = com.facebook.appevents.iap.d.b.d()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                java.lang.String r4 = "skuID"
                kotlin.jvm.internal.g.d(r8, r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                r3.put(r8, r2)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L9b
                goto L3a
            L95:
                java.lang.Runnable r6 = r5.f9563a     // Catch: java.lang.Throwable -> L9b
                r6.run()     // Catch: java.lang.Throwable -> L9b
            L9a:
                return
            L9b:
                r6 = move-exception
                k6.a.a(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.d.e.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (k6.a.b(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return tf.d.f30009a;
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return null;
            }
        }
    }

    public d() {
        throw null;
    }

    public d(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, h hVar) {
        this.f9550a = obj;
        this.f9551b = cls;
        this.c = cls2;
        this.f9552d = cls3;
        this.f9553e = cls4;
        this.f9554f = cls5;
        this.f9555g = method;
        this.f9556h = method2;
        this.f9557i = method3;
        this.f9558j = method4;
        this.f9559k = hVar;
    }

    @Override // com.facebook.appevents.iap.c
    public final void a(InAppPurchaseUtils.IAPProductType productType, Runnable runnable) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(productType, "productType");
            androidx.fragment.app.d dVar = new androidx.fragment.app.d(2, this, productType, runnable);
            if (!k6.a.b(this)) {
                if (f9546n.get()) {
                    dVar.run();
                } else {
                    c(dVar);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void c(Runnable runnable) {
        Method c10;
        Class<?> cls = this.f9551b;
        if (k6.a.b(this)) {
            return;
        }
        try {
            Class<?> a10 = InAppPurchaseUtils.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (c10 = InAppPurchaseUtils.c(cls, "startConnection", a10)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a(runnable));
            Object obj = null;
            if (!k6.a.b(this)) {
                obj = this.f9550a;
            }
            InAppPurchaseUtils.d(cls, c10, obj, newProxyInstance);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
