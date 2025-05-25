package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class P implements InterfaceC1719m2 {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f14562a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f14563b;
    public static final tf.c c;

    /* renamed from: d  reason: collision with root package name */
    public static N f14564d;

    /* renamed from: e  reason: collision with root package name */
    public static AdConfig f14565e;

    static {
        P p10 = new P();
        c = kotlin.a.a(O.f14536a);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("ads", Ha.b(), p10);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f14565e = (AdConfig) a10;
    }

    public static void a(long j10, C1590d execute) {
        kotlin.jvm.internal.g.e(execute, "execute");
        ScheduledExecutorService scheduledExecutorService = f14562a;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, new I4("AdQualityComponent-aqHandler"));
            kotlin.jvm.internal.g.d(newScheduledThreadPool, "newScheduledThreadPool(...)");
            f14562a = newScheduledThreadPool;
        }
        ScheduledExecutorService scheduledExecutorService2 = f14562a;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.schedule(new qb.f(execute, 0), j10, TimeUnit.MILLISECONDS);
        } else {
            kotlin.jvm.internal.g.i("aqHandlerExecutor");
            throw null;
        }
    }

    public static final void b(cg.a tmp0) {
        kotlin.jvm.internal.g.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(C1576c execute) {
        kotlin.jvm.internal.g.e(execute, "execute");
        ExecutorService executorService = f14563b;
        if (executorService == null || executorService.isShutdown()) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new I4("AdQualityComponent-aqBeacon"));
            kotlin.jvm.internal.g.d(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            f14563b = newSingleThreadExecutor;
        }
        ExecutorService executorService2 = f14563b;
        if (executorService2 != null) {
            executorService2.submit(new qb.g(execute, 0));
        } else {
            kotlin.jvm.internal.g.i("aqBeaconExecutor");
            throw null;
        }
    }

    public static final void a(cg.a tmp0) {
        kotlin.jvm.internal.g.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        if (config instanceof AdConfig) {
            AdConfig adConfig = (AdConfig) config;
            f14565e = adConfig;
            N n10 = f14564d;
            if (n10 != null) {
                n10.f14501a = adConfig;
                if (!n10.f14502b.get()) {
                    if (adConfig.getAdQuality().getEnabled()) {
                        n10.a();
                    }
                } else if (!n10.f14502b.get() || adConfig.getAdQuality().getEnabled()) {
                } else {
                    n10.f14502b.set(false);
                    ExecutorService executorService = f14563b;
                    if (executorService != null) {
                        executorService.shutdown();
                        try {
                            try {
                                executorService.shutdownNow();
                            } catch (InterruptedException unused) {
                                executorService.shutdownNow();
                                Thread.currentThread().interrupt();
                            }
                        } catch (Exception unused2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    public static void a(Activity activity, S9 renderView, String url, boolean z10, JSONObject extras, M9 listener) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(renderView, "renderView");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(extras, "extras");
        kotlin.jvm.internal.g.e(listener, "listener");
        W adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.f14767i = url;
            adQualityManager.f14768j = extras;
            adQualityManager.a("report ad starting");
            if (z10) {
                adQualityManager.a("report ad capture");
                adQualityManager.a(activity, 0L, true, listener);
            } else {
                adQualityManager.a("report ad report");
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            listener.f14487a.b("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        N n10 = f14564d;
        if (n10 != null) {
            n10.f14503d.put(url, new WeakReference(listener));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                tf.c cVar = c;
                if (((CopyOnWriteArrayList) cVar.getValue()).size() < f14565e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) cVar.getValue()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.g.i("executor");
        throw null;
    }

    public static void a(S9 adView, S9 renderView, String url, boolean z10, JSONObject extras, M9 listener) {
        kotlin.jvm.internal.g.e(adView, "adView");
        kotlin.jvm.internal.g.e(renderView, "renderView");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(extras, "extras");
        kotlin.jvm.internal.g.e(listener, "listener");
        W adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.f14767i = url;
            adQualityManager.f14768j = extras;
            if (z10) {
                adQualityManager.a((View) adView, 0L, true, listener);
            } else {
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            listener.f14487a.b("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        N n10 = f14564d;
        if (n10 != null) {
            n10.f14503d.put(url, new WeakReference(listener));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                tf.c cVar = c;
                if (((CopyOnWriteArrayList) cVar.getValue()).size() < f14565e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) cVar.getValue()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.g.i("executor");
        throw null;
    }
}
