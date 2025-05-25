package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class E9 implements InterfaceC1719m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final S5 f14227a;

    /* renamed from: b  reason: collision with root package name */
    public static X5 f14228b;
    public static final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public static TelemetryConfig f14229d;

    /* renamed from: e  reason: collision with root package name */
    public static CrashConfig f14230e;

    /* renamed from: f  reason: collision with root package name */
    public static final ReentrantLock f14231f;

    /* renamed from: g  reason: collision with root package name */
    public static final D9 f14232g;

    /* renamed from: h  reason: collision with root package name */
    public static final ReferenceQueue f14233h;

    /* renamed from: i  reason: collision with root package name */
    public static final ConcurrentHashMap f14234i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicBoolean f14235j;

    static {
        E9 e92 = new E9();
        f14227a = S5.c;
        c = new AtomicBoolean(false);
        f14231f = new ReentrantLock();
        f14232g = D9.f14203a;
        f14233h = new ReferenceQueue();
        f14234i = new ConcurrentHashMap();
        f14235j = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("telemetry", Ha.b(), e92);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f14229d = (TelemetryConfig) a10;
        Config a11 = C1705l2.a("crashReporting", Ha.b(), e92);
        kotlin.jvm.internal.g.c(a11, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        f14230e = (CrashConfig) a11;
    }

    public static B4 a(String logType, String placementType, boolean z10) {
        kotlin.jvm.internal.g.e(logType, "logType");
        kotlin.jvm.internal.g.e(placementType, "placementType");
        Context d10 = Ha.d();
        if (d10 != null) {
            try {
                b();
                TelemetryConfig.LoggingConfig loggingConfig = f14229d.getLoggingConfig();
                double b10 = b(logType, placementType, loggingConfig);
                S5 logLevel = a(logType, placementType, loggingConfig);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                kotlin.jvm.internal.g.e(logLevel, "logLevel");
                return new B4(d10, b10, logLevel, !loggingConfig.getEnabled(), z10, maxNoOfEntries, loggingConfig.getExpiry() * 1000, false);
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
                return null;
            }
        }
        return null;
    }

    public static void b() {
        if (f14228b != null) {
            return;
        }
        ReentrantLock reentrantLock = f14231f;
        if (reentrantLock.tryLock()) {
            try {
                if (f14228b == null && c.get()) {
                    Context d10 = Ha.d();
                    if (d10 != null) {
                        TelemetryConfig.LoggingConfig loggingConfig = f14229d.getLoggingConfig();
                        f14228b = new X5(d10, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    X5 x52 = f14228b;
                    if (x52 != null) {
                        E4.a(x52);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                f14231f.unlock();
                throw th2;
            }
        }
    }

    public static final void c() {
        WeakReference weakReference;
        A4 a42;
        while (c.get()) {
            Reference remove = f14233h.remove();
            ConcurrentHashMap concurrentHashMap = f14234i;
            if (kotlin.collections.m.o0(concurrentHashMap.keySet(), remove)) {
                Pair pair = (Pair) concurrentHashMap.get(remove);
                if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (a42 = (A4) weakReference.get()) != null) {
                    ((B4) a42).a("ReferenceTracker", androidx.activity.r.g(new StringBuilder(" reference "), (String) pair.getFirst(), " reference is GCed."));
                }
                kotlin.jvm.internal.k.b(concurrentHashMap).remove(remove);
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                    f14234i.remove(entry.getKey());
                }
            }
        }
    }

    public static S5 a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return T5.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return T5.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return T5.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return T5.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return T5.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return T5.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return T5.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return T5.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return T5.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return T5.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f14227a;
    }

    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return loggingConfig.getBanner().getAb().getSamplePercent();
                    }
                    return loggingConfig.getBanner().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return loggingConfig.getNative().getAb().getSamplePercent();
                    }
                    return loggingConfig.getNative().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return loggingConfig.getInt_native().getAb().getSamplePercent();
                    }
                    return loggingConfig.getInt_native().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.g.a(str2, "AB")) {
                        return loggingConfig.getInt_html().getAb().getSamplePercent();
                    }
                    return loggingConfig.getInt_html().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static void a(Object obj, A4 a42) {
        kotlin.jvm.internal.g.e(obj, "obj");
        try {
            if (f14229d.getLoggingConfig().getEnabled()) {
                if (a42 != null) {
                    ((B4) a42).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (a42 != null) {
                    f14234i.put(new PhantomReference(obj, f14233h), new Pair(obj.toString(), new WeakReference(a42)));
                    if (f14235j.getAndSet(true)) {
                        return;
                    }
                    try {
                        AbstractC1597d6.f15015b.submit(new u5.a(1));
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        if (config instanceof TelemetryConfig) {
            f14229d = (TelemetryConfig) config;
            X5 x52 = f14228b;
            if (x52 != null) {
                x52.f14840g.set(true);
            }
            f14228b = null;
            Vb.f14759a.execute(new c6.b(1));
        } else if (config instanceof CrashConfig) {
            f14230e = (CrashConfig) config;
        }
    }

    public static final void a() {
        b();
    }
}
