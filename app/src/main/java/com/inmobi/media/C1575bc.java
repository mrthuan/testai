package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.bc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1575bc {

    /* renamed from: d  reason: collision with root package name */
    public static final int f14971d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f14972e;

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadFactoryC1561ac f14973f;

    /* renamed from: g  reason: collision with root package name */
    public static final LinkedBlockingQueue f14974g;

    /* renamed from: h  reason: collision with root package name */
    public static ThreadPoolExecutor f14975h;

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f14976a;

    /* renamed from: b  reason: collision with root package name */
    public final G8 f14977b;
    public final WeakReference c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f14971d = Math.max(2, Math.min(availableProcessors - 1, 4));
        f14972e = (availableProcessors * 2) + 1;
        f14973f = new ThreadFactoryC1561ac();
        f14974g = new LinkedBlockingQueue(128);
    }

    public C1575bc(Zb vastMediaFile, int i10, CountDownLatch countDownLatch) {
        kotlin.jvm.internal.g.e(vastMediaFile, "vastMediaFile");
        G8 g82 = new G8(vastMediaFile.f14926a, null);
        this.f14977b = g82;
        g82.f14293t = false;
        g82.f14294u = false;
        g82.f14297x = false;
        g82.f14289p = i10;
        g82.f14292s = true;
        this.c = new WeakReference(vastMediaFile);
        this.f14976a = countDownLatch;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f14971d, f14972e, 30L, TimeUnit.SECONDS, f14974g, f14973f);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14975h = threadPoolExecutor;
    }

    public final void a() {
        ThreadPoolExecutor threadPoolExecutor = f14975h;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(new androidx.activity.i(this, 10));
        }
    }

    public static final void a(C1575bc this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            H8 b10 = this$0.f14977b.b();
            if (b10.b()) {
                CountDownLatch countDownLatch = this$0.f14976a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } else {
                this$0.a(b10);
            }
        } catch (Exception unused) {
            EnumC1849w3 errorCode = EnumC1849w3.f15554e;
            kotlin.jvm.internal.g.e(errorCode, "errorCode");
            CountDownLatch countDownLatch2 = this$0.f14976a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    public final void a(H8 h82) {
        CountDownLatch countDownLatch;
        try {
            try {
                Zb zb2 = (Zb) this.c.get();
                if (zb2 != null) {
                    zb2.c = (h82.f14322d * 1.0d) / 1048576;
                }
                countDownLatch = this.f14976a;
                if (countDownLatch == null) {
                    return;
                }
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
                countDownLatch = this.f14976a;
                if (countDownLatch == null) {
                    return;
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            CountDownLatch countDownLatch2 = this.f14976a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            throw th2;
        }
    }
}
