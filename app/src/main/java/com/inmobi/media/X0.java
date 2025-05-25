package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class X0 implements InterfaceC1719m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final X0 f14813a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14814b;
    public static AdConfig.AssetCacheConfig c;

    /* renamed from: d  reason: collision with root package name */
    public static AdConfig.VastVideoConfig f14815d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f14816e;

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadPoolExecutor f14817f;

    /* renamed from: g  reason: collision with root package name */
    public static T0 f14818g;

    /* renamed from: h  reason: collision with root package name */
    public static HandlerThread f14819h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicBoolean f14820i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicBoolean f14821j;

    /* renamed from: k  reason: collision with root package name */
    public static final ConcurrentHashMap f14822k;

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayList f14823l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicBoolean f14824m;

    /* renamed from: n  reason: collision with root package name */
    public static final V0 f14825n;

    /* renamed from: o  reason: collision with root package name */
    public static final W0 f14826o;

    static {
        X0 x02 = new X0();
        f14813a = x02;
        f14814b = new Object();
        f14820i = new AtomicBoolean(false);
        f14821j = new AtomicBoolean(false);
        f14823l = new ArrayList();
        f14824m = new AtomicBoolean(true);
        f14825n = V0.f14746a;
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("ads", Ha.b(), x02);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        AdConfig adConfig = (AdConfig) a10;
        c = adConfig.getAssetCacheConfig();
        f14815d = adConfig.getVastVideo();
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new I4("X0".concat("-AP")));
        kotlin.jvm.internal.g.d(newCachedThreadPool, "newCachedThreadPool(...)");
        f14816e = newCachedThreadPool;
        int i10 = G3.f14267a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new I4("X0".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14817f = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        f14819h = handlerThread;
        J3.a(handlerThread, "assetFetcher");
        HandlerThread handlerThread2 = f14819h;
        kotlin.jvm.internal.g.b(handlerThread2);
        Looper looper = handlerThread2.getLooper();
        kotlin.jvm.internal.g.d(looper, "getLooper(...)");
        f14818g = new T0(looper, x02);
        f14822k = new ConcurrentHashMap(2, 0.9f, 2);
        f14826o = new W0();
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        if (config instanceof AdConfig) {
            AdConfig adConfig = (AdConfig) config;
            c = adConfig.getAssetCacheConfig();
            f14815d = adConfig.getVastVideo();
            return;
        }
        c = null;
        f14815d = null;
    }

    public final void b(C1674j c1674j) {
        String str = c1674j.c;
        AdConfig.AssetCacheConfig assetCacheConfig = c;
        if (str == null || str.length() == 0 || assetCacheConfig == null) {
            return;
        }
        File file = new File(str);
        long min = Math.min((c1674j.f15201g - c1674j.f15199e) + System.currentTimeMillis(), (assetCacheConfig.getTimeToLive() * 1000) + System.currentTimeMillis());
        int nextInt = new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        String url = c1674j.f15197b;
        int maxRetries = assetCacheConfig.getMaxRetries();
        long j10 = c1674j.f15202h;
        kotlin.jvm.internal.g.e(url, "url");
        C1674j c1674j2 = new C1674j(nextInt, url, str, maxRetries, currentTimeMillis, currentTimeMillis2, min, j10);
        c1674j2.f15199e = System.currentTimeMillis();
        AbstractC1882ya.a().a(c1674j2);
        long j11 = c1674j.f15199e;
        c1674j2.f15204j = AbstractC1702l.a(c1674j, file, j11, j11);
        c1674j2.f15203i = true;
        a(c1674j2, (byte) -1);
    }

    public final synchronized void c(String str) {
        int size = f14823l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1688k c1688k = (C1688k) f14823l.get(i10);
            Iterator it = c1688k.f15246h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.g.a(((C1894z9) it.next()).f15710b, str)) {
                        c1688k.f15241b++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized void d(String str) {
        int size = f14823l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1688k c1688k = (C1688k) f14823l.get(i10);
            Set set = c1688k.f15246h;
            HashSet hashSet = c1688k.f15243e;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.g.a(((C1894z9) it.next()).f15710b, str)) {
                    if (!hashSet.contains(str)) {
                        c1688k.f15243e.add(str);
                        c1688k.f15240a++;
                    }
                }
            }
        }
    }

    public final synchronized void e() {
        ArrayList arrayList = new ArrayList();
        int size = f14823l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1688k c1688k = (C1688k) f14823l.get(i10);
            if (c1688k.f15240a == c1688k.f15246h.size()) {
                try {
                    Y0 y02 = (Y0) c1688k.f15242d.get();
                    if (y02 != null) {
                        y02.a(c1688k);
                    }
                    arrayList.add(c1688k);
                } catch (Exception e10) {
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                }
            }
        }
        b(arrayList);
    }

    public final synchronized void a(C1674j c1674j) {
        int size = f14823l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1688k c1688k = (C1688k) f14823l.get(i10);
            Iterator it = c1688k.f15246h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.g.a(((C1894z9) it.next()).f15710b, c1674j.f15197b)) {
                    if (!c1688k.f15245g.contains(c1674j)) {
                        c1688k.f15245g.add(c1674j);
                    }
                }
            }
        }
    }

    public final void c() {
        if (f14824m.get()) {
            f14821j.set(false);
            if (K8.a() != null) {
                B6 f10 = Ha.f();
                V0 v02 = f14825n;
                f10.a(v02);
                Ha.f().a(new int[]{10, 2, 1}, v02);
                return;
            }
            synchronized (f14814b) {
                if (f14820i.compareAndSet(false, true)) {
                    if (f14819h == null) {
                        HandlerThread handlerThread = new HandlerThread("assetFetcher");
                        f14819h = handlerThread;
                        J3.a(handlerThread, "assetFetcher");
                    }
                    if (f14818g == null) {
                        HandlerThread handlerThread2 = f14819h;
                        kotlin.jvm.internal.g.b(handlerThread2);
                        Looper looper = handlerThread2.getLooper();
                        kotlin.jvm.internal.g.d(looper, "getLooper(...)");
                        f14818g = new T0(looper, this);
                    }
                    if (AbstractC1882ya.a().b().isEmpty()) {
                        d();
                    } else {
                        B6 f11 = Ha.f();
                        V0 v03 = f14825n;
                        f11.a(v03);
                        Ha.f().a(new int[]{10, 2, 1}, v03);
                        T0 t02 = f14818g;
                        kotlin.jvm.internal.g.b(t02);
                        t02.sendEmptyMessage(1);
                    }
                }
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    public static void d() {
        if (f14824m.get()) {
            synchronized (f14814b) {
                f14820i.set(false);
                f14822k.clear();
                HandlerThread handlerThread = f14819h;
                if (handlerThread != null) {
                    handlerThread.getLooper().quit();
                    handlerThread.interrupt();
                    f14819h = null;
                    f14818g = null;
                }
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
        r19.f15206l = 4;
        r19.f15198d = 0;
        com.inmobi.media.C1716m.a(r6, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
        r18.f15296a.a(r19);
        r14 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
        r7 = r8;
        r1.flush();
        r3.disconnect();
        r10 = android.os.SystemClock.elapsedRealtime();
        r8 = new com.inmobi.media.H8();
        r8.f14323e = r3.getHeaderFields();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
        r14 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
        r19.f15204j = com.inmobi.media.AbstractC1702l.a(r19, r6, r12, r10);
        r19.f15205k = r10 - r12;
        r1 = r7.f15296a;
        r2 = r6.getAbsolutePath();
        kotlin.jvm.internal.g.d(r2, "getAbsolutePath(...)");
        r1.a(r8, r2, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
        r2 = r15;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v39, types: [int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.inmobi.media.C1674j r19, com.inmobi.media.R0 r20) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.X0.a(com.inmobi.media.j, com.inmobi.media.R0):boolean");
    }

    public final synchronized void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f14823l.remove(arrayList.get(i10));
        }
    }

    public static void b() {
        ArrayList a10 = AbstractC1882ya.a().a();
        long j10 = 0;
        if (!a10.isEmpty()) {
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                String str = ((C1674j) it.next()).c;
                if (str != null) {
                    j10 += new File(str).length();
                }
            }
        }
        AdConfig.AssetCacheConfig assetCacheConfig = c;
        if (assetCacheConfig != null) {
            assetCacheConfig.getMaxCacheSize();
            if (j10 > assetCacheConfig.getMaxCacheSize()) {
                Q0 a11 = AbstractC1882ya.a();
                a11.getClass();
                ArrayList a12 = AbstractC1860x1.a(a11, null, null, null, null, "ts ASC ", 1, 15);
                C1674j c1674j = a12.isEmpty() ? null : (C1674j) a12.get(0);
                if (c1674j != null) {
                    if (f14824m.get()) {
                        Q0 a13 = AbstractC1882ya.a();
                        a13.getClass();
                        a13.a("id = ?", new String[]{String.valueOf(c1674j.f15196a)});
                        String str2 = c1674j.c;
                        if (str2 != null) {
                            File file = new File(str2);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                    b();
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static final void b(C1688k assetBatch) {
        kotlin.jvm.internal.g.e(assetBatch, "$assetBatch");
        synchronized (f14813a) {
            ArrayList arrayList = f14823l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f15246h.size();
        for (C1894z9 c1894z9 : assetBatch.f15246h) {
            String str = c1894z9.f15710b;
            X0 x02 = f14813a;
            C1674j a10 = AbstractC1882ya.a().a(str);
            if (a10 != null && a10.a()) {
                x02.b(a10);
            } else {
                a(str);
            }
        }
    }

    public static final void b(C1688k assetBatch, String adType) {
        kotlin.jvm.internal.g.e(assetBatch, "$assetBatch");
        kotlin.jvm.internal.g.e(adType, "$adType");
        synchronized (f14813a) {
            ArrayList arrayList = f14823l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f15246h.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C1894z9 c1894z9 : assetBatch.f15246h) {
            String str = c1894z9.f15710b;
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() > 0 && c1894z9.f15709a == 2) {
                arrayList2.add(c1894z9.f15710b);
            } else {
                arrayList3.add(c1894z9.f15710b);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Context d10 = Ha.d();
                if (d10 != null) {
                    C1712l9 c1712l9 = C1712l9.f15290a;
                    RequestCreator load = c1712l9.a(d10).load(str2);
                    Object a10 = c1712l9.a(new U0(countDownLatch, str2, elapsedRealtime, adType));
                    load.fetch(a10 instanceof Callback ? (Callback) a10 : null);
                }
            } catch (Exception unused) {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused2) {
        }
        X0 x02 = f14813a;
        x02.e();
        x02.a((byte) 0);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            X0 x03 = f14813a;
            C1674j a11 = AbstractC1882ya.a().a(str3);
            if (a11 != null && a11.a()) {
                x03.b(a11);
            } else {
                a(str3);
            }
        }
    }

    public final synchronized void a(C1674j c1674j, byte b10) {
        a(c1674j);
        f14822k.remove(c1674j.f15197b);
        if (b10 == -1) {
            d(c1674j.f15197b);
            e();
            return;
        }
        c(c1674j.f15197b);
        a(b10);
    }

    public final synchronized void a(byte b10) {
        ArrayList arrayList = new ArrayList();
        int size = f14823l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1688k c1688k = (C1688k) f14823l.get(i10);
            if (c1688k.f15241b > 0) {
                try {
                    Y0 y02 = (Y0) c1688k.f15242d.get();
                    if (y02 != null) {
                        y02.a(c1688k, b10);
                    }
                    arrayList.add(c1688k);
                } catch (Exception e10) {
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                }
            }
        }
        b(arrayList);
    }

    public static final void b(String remoteUrl) {
        kotlin.jvm.internal.g.e(remoteUrl, "$remoteUrl");
        C1674j a10 = AbstractC1882ya.a().a(remoteUrl);
        if (a10 != null) {
            if (a10.a()) {
                f14813a.b(a10);
            } else {
                a(a10, f14826o);
            }
        }
    }

    public static void a() {
        if (f14824m.get()) {
            synchronized (f14814b) {
                ArrayList a10 = AbstractC1882ya.a().a();
                if (a10.isEmpty()) {
                    return;
                }
                Iterator it = a10.iterator();
                while (it.hasNext()) {
                    C1674j c1674j = (C1674j) it.next();
                    c1674j.getClass();
                    if (System.currentTimeMillis() > c1674j.f15201g && f14824m.get()) {
                        Q0 a11 = AbstractC1882ya.a();
                        a11.getClass();
                        a11.a("id = ?", new String[]{String.valueOf(c1674j.f15196a)});
                        String str = c1674j.c;
                        if (str != null) {
                            File file = new File(str);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                }
                b();
                a(a10);
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    public static void a(ArrayList arrayList) {
        File[] listFiles;
        File b10 = Ha.f14324a.b(Ha.d());
        if (!b10.exists() || (listFiles = b10.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.g.a(file.getAbsolutePath(), ((C1674j) it.next()).c)) {
                        break;
                    }
                } else {
                    file.getAbsolutePath();
                    file.delete();
                    break;
                }
            }
        }
    }

    public static void a(C1688k assetBatch) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        if (f14824m.get()) {
            f14816e.execute(new androidx.activity.b(assetBatch, 12));
        }
    }

    public static void a(C1688k assetBatch, String adType) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        kotlin.jvm.internal.g.e(adType, "adType");
        if (f14824m.get()) {
            f14816e.execute(new n0.g(12, assetBatch, adType));
        }
    }

    public static void a(String url) {
        C1674j c1674j;
        AdConfig.AssetCacheConfig assetCacheConfig = c;
        if (assetCacheConfig != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            int maxRetries = assetCacheConfig.getMaxRetries();
            long timeToLive = assetCacheConfig.getTimeToLive();
            kotlin.jvm.internal.g.e(url, "url");
            c1674j = new C1674j(Integer.MAX_VALUE & new Random().nextInt(), url, null, maxRetries, currentTimeMillis, currentTimeMillis2, System.currentTimeMillis() + timeToLive, 0L);
        } else {
            c1674j = null;
        }
        if (AbstractC1882ya.a().a(url) == null && c1674j != null) {
            Q0 a10 = AbstractC1882ya.a();
            synchronized (a10) {
                a10.a(c1674j, "url = ?", new String[]{c1674j.f15197b});
            }
        }
        f14817f.execute(new b7.g(url, 6));
    }
}
