package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.media.A4;
import com.inmobi.media.Y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Y1 implements InterfaceC1719m2 {

    /* renamed from: b  reason: collision with root package name */
    public static ThreadPoolExecutor f14861b;
    public static R1 c;

    /* renamed from: d  reason: collision with root package name */
    public static HandlerThread f14862d;

    /* renamed from: g  reason: collision with root package name */
    public static AdConfig.ImaiConfig f14865g;

    /* renamed from: k  reason: collision with root package name */
    public static final X1 f14869k;

    /* renamed from: a  reason: collision with root package name */
    public static final Y1 f14860a = new Y1();

    /* renamed from: e  reason: collision with root package name */
    public static List f14863e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicBoolean f14864f = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicBoolean f14866h = new AtomicBoolean(true);

    /* renamed from: i  reason: collision with root package name */
    public static final Object f14867i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashMap f14868j = new LinkedHashMap();

    static {
        Ha.a(new com.facebook.appevents.h(3));
        f14869k = new X1();
    }

    public static final HashMap a(Y1 y12, N1 n12) {
        y12.getClass();
        HashMap hashMap = new HashMap();
        try {
            AdConfig.ImaiConfig imaiConfig = f14865g;
            int maxRetries = ((imaiConfig != null ? imaiConfig.getMaxRetries() : 0) - n12.f14510f) + 1;
            if (maxRetries > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(maxRetries));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static final /* synthetic */ String f() {
        return "Y1";
    }

    public static void h() {
        try {
            AtomicBoolean atomicBoolean = f14864f;
            atomicBoolean.set(false);
            synchronized (f14867i) {
                if (!atomicBoolean.get()) {
                    HandlerThread handlerThread = f14862d;
                    if (handlerThread != null) {
                        handlerThread.getLooper().quit();
                        handlerThread.interrupt();
                    }
                    f14862d = null;
                    c = null;
                }
                tf.d dVar = tf.d.f30009a;
            }
        } catch (Exception unused) {
        }
    }

    public final void g() {
        HandlerThread handlerThread;
        try {
            if (K8.a() != null) {
                return;
            }
            synchronized (f14867i) {
                AtomicBoolean atomicBoolean = f14864f;
                if (atomicBoolean.compareAndSet(false, true)) {
                    if (f14862d == null) {
                        HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                        f14862d = handlerThread2;
                        J3.a(handlerThread2, "pingHandlerThread");
                    }
                    if (c == null && (handlerThread = f14862d) != null) {
                        Looper looper = handlerThread.getLooper();
                        kotlin.jvm.internal.g.d(looper, "getLooper(...)");
                        c = new R1(looper);
                    }
                    O1 b10 = AbstractC1882ya.b();
                    if (b10 != null && AbstractC1860x1.a((AbstractC1860x1) b10) != 0) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        R1 r12 = c;
                        if (r12 != null) {
                            r12.sendMessage(obtain);
                        }
                    }
                    atomicBoolean.set(false);
                    h();
                }
                tf.d dVar = tf.d.f30009a;
            }
        } catch (Exception unused) {
        }
    }

    public static final void b(Y1 y12, N1 n12) {
        y12.getClass();
        LinkedHashMap linkedHashMap = f14868j;
        D1 d12 = (D1) linkedHashMap.get(Integer.valueOf(n12.f14506a));
        if (d12 != null) {
            d12.a(n12);
        }
        linkedHashMap.remove(Integer.valueOf(n12.f14506a));
    }

    public static final void c(Y1 y12, N1 n12) {
        y12.getClass();
        int i10 = n12.f14510f;
        if (i10 > 0) {
            n12.f14510f = i10 - 1;
            n12.f14511g = System.currentTimeMillis();
            O1 b10 = AbstractC1882ya.b();
            b10.getClass();
            b10.b(n12, "id = ?", new String[]{String.valueOf(n12.f14506a)});
        }
    }

    public static final /* synthetic */ void a(Y1 y12) {
        y12.getClass();
        h();
    }

    public static final void a() {
        Y1 y12 = f14860a;
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new I4("Y1"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f14861b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f14862d = handlerThread;
            J3.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f14862d;
            kotlin.jvm.internal.g.b(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            kotlin.jvm.internal.g.d(looper, "getLooper(...)");
            c = new R1(looper);
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("ads", Ha.b(), y12);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            f14865g = ((AdConfig) a10).getImaiConfig();
            Ha.f().a(new int[]{10, 11, 2, 1}, W1.f14770a);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(Y1 y12, String str, boolean z10, D1 d12, A4 a42, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d12 = null;
        }
        y12.b(str, z10, d12, a42);
    }

    public final void b(String url, boolean z10, D1 d12, A4 a42) {
        kotlin.jvm.internal.g.e(url, "url");
        C1778q9 c1778q9 = Z1.f14900a;
        Z1.a(new qb.i0(a42, url, z10, d12), EnumC1765p9.f15379b);
    }

    public static final void c(String url, boolean z10, A4 a42) {
        kotlin.jvm.internal.g.e(url, "$url");
        try {
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("root", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
            if (((RootConfig) a10).isMonetizationDisabled()) {
                return;
            }
            AdConfig.ImaiConfig imaiConfig = f14865g;
            N1 n12 = new N1(url, null, z10, true, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
            if (a42 != null) {
                ((B4) a42).c("Y1", "Received click (" + url + ") for pinging in WebView");
            }
            a(n12, (D1) null, a42);
        } catch (Exception e10) {
            if (a42 != null) {
                ((B4) a42).b("Y1", Cc.a(e10, A5.a("Y1", "TAG", "SDK encountered unexpected error in pinging click over WebView; ")));
            }
        }
    }

    public static final void b(A4 a42, String url, boolean z10, D1 d12) {
        kotlin.jvm.internal.g.e(url, "$url");
        R1 r12 = c;
        if (r12 != null) {
            r12.f14603a = a42;
        }
        try {
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("root", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
            if (((RootConfig) a10).isMonetizationDisabled()) {
                return;
            }
            AdConfig.ImaiConfig imaiConfig = f14865g;
            N1 n12 = new N1(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
            if (a42 != null) {
                ((B4) a42).a("Y1", "Received click (" + url + ") for pinging over HTTP");
            }
            a(n12, d12, a42);
        } catch (Exception e10) {
            if (a42 != null) {
                ((B4) a42).b("Y1", Cc.a(e10, A5.a("Y1", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        AdConfig adConfig = config instanceof AdConfig ? (AdConfig) config : null;
        f14865g = adConfig != null ? adConfig.getImaiConfig() : null;
    }

    public final void a(String url, boolean z10, A4 a42) {
        kotlin.jvm.internal.g.e(url, "url");
        a(url, z10, (D1) null, a42);
    }

    public final void b(String url, boolean z10, A4 a42) {
        kotlin.jvm.internal.g.e(url, "url");
        R1 r12 = c;
        if (r12 != null) {
            r12.f14603a = a42;
        }
        C1778q9 c1778q9 = Z1.f14900a;
        Z1.a(new qb.f0(url, z10, a42), EnumC1765p9.c);
    }

    public static /* synthetic */ void a(Y1 y12, String str, boolean z10, D1 d12, A4 a42, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d12 = null;
        }
        y12.a(str, z10, d12, a42);
    }

    public final void a(final String url, final boolean z10, final D1 d12, final A4 a42) {
        kotlin.jvm.internal.g.e(url, "url");
        C1778q9 c1778q9 = Z1.f14900a;
        Z1.a(new Runnable() { // from class: qb.h0
            @Override // java.lang.Runnable
            public final void run() {
                Y1.a(A4.this, url, z10, d12);
            }
        }, EnumC1765p9.c);
    }

    public static final void a(A4 a42, String url, boolean z10, D1 d12) {
        kotlin.jvm.internal.g.e(url, "$url");
        try {
            R1 r12 = c;
            if (r12 != null) {
                r12.f14603a = a42;
            }
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("root", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
            if (((RootConfig) a10).isMonetizationDisabled()) {
                return;
            }
            AdConfig.ImaiConfig imaiConfig = f14865g;
            N1 n12 = new N1(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
            if (a42 != null) {
                ((B4) a42).a("Y1", "Received click (" + url + ") for pinging over HTTP");
            }
            a(n12, d12, a42);
        } catch (Exception e10) {
            if (a42 != null) {
                ((B4) a42).b("Y1", Cc.a(e10, A5.a("Y1", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public static /* synthetic */ void a(Y1 y12, String str, Map map, boolean z10, D1 d12, EnumC1765p9 enumC1765p9, A4 a42, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            d12 = null;
        }
        y12.a(str, map, z10, d12, enumC1765p9, a42);
    }

    public final void a(final String url, final Map<String, String> map, final boolean z10, final D1 d12, EnumC1765p9 priority, final A4 a42) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(priority, "priority");
        R1 r12 = c;
        if (r12 != null) {
            r12.f14603a = a42;
        }
        Z1.a(new Runnable() { // from class: qb.g0
            @Override // java.lang.Runnable
            public final void run() {
                Y1.a(url, map, z10, a42, d12);
            }
        }, priority);
    }

    public static final void a(String url, Map map, boolean z10, A4 a42, D1 d12) {
        kotlin.jvm.internal.g.e(url, "$url");
        try {
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("root", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
            if (((RootConfig) a10).isMonetizationDisabled()) {
                return;
            }
            AdConfig.ImaiConfig imaiConfig = f14865g;
            N1 n12 = new N1(url, map, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 193);
            if (a42 != null) {
                ((B4) a42).a("Y1", "Received click (" + url + ") for pinging over HTTP");
            }
            a(n12, d12, a42);
        } catch (Exception e10) {
            if (a42 != null) {
                ((B4) a42).b("Y1", Cc.a(e10, A5.a("Y1", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public static void a(N1 click, D1 d12, A4 a42) {
        N1 n12;
        R1 r12 = c;
        if (r12 != null) {
            r12.f14603a = a42;
        }
        if (a42 != null) {
            ((B4) a42).c("Y1", "record Click");
        }
        AdConfig.ImaiConfig imaiConfig = f14865g;
        if (imaiConfig != null) {
            O1 b10 = AbstractC1882ya.b();
            int maxDbEvents = imaiConfig.getMaxDbEvents();
            synchronized (b10) {
                kotlin.jvm.internal.g.e(click, "click");
                if (AbstractC1860x1.a((AbstractC1860x1) b10) >= maxDbEvents && (n12 = (N1) b10.b("ts= (SELECT MIN(ts) FROM click LIMIT 1)", null)) != null) {
                    f14860a.a(click, "DB_OVERLOAD");
                    b10.a("id = ?", new String[]{String.valueOf(n12.f14506a)});
                }
                b10.a(click);
            }
            if (d12 != null) {
                f14868j.put(Integer.valueOf(click.f14506a), d12);
            }
        }
        if (K8.a() != null) {
            if (a42 != null) {
                ((B4) a42).b("Y1", "No network available. Saving click for later processing ...");
            }
            f14864f.set(false);
            h();
            return;
        }
        if (a42 != null) {
            StringBuilder a10 = A5.a("Y1", "TAG", "submit click - ");
            a10.append(click.f14506a);
            ((B4) a42).a("Y1", a10.toString());
        }
        ThreadPoolExecutor threadPoolExecutor = f14861b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new l1.a(8, click, a42));
        }
    }

    public static final void a(N1 click, A4 a42) {
        kotlin.jvm.internal.g.e(click, "$click");
        SystemClock.elapsedRealtime();
        if (click.f14509e) {
            if (a42 != null) {
                ((B4) a42).c("Y1", "ping in web view");
            }
            new T1(f14869k, a42).a(click);
            return;
        }
        if (a42 != null) {
            ((B4) a42).c("Y1", "ping in http executor");
        }
        new U1(f14869k, a42).a(click);
    }

    public final void a(N1 click, String error) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.e(error, "error");
        LinkedHashMap linkedHashMap = f14868j;
        D1 d12 = (D1) linkedHashMap.get(Integer.valueOf(click.f14506a));
        if (d12 != null) {
            d12.a(click, error);
        }
        linkedHashMap.remove(Integer.valueOf(click.f14506a));
    }
}
