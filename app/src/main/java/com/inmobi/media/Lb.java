package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Lb {

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f14437a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashSet f14438b = new LinkedHashSet();
    public static Pb c;

    public static void a() {
        synchronized (f14437a) {
            c = null;
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static boolean b() {
        boolean z10;
        synchronized (f14437a) {
            Pb pb2 = c;
            if (pb2 != null) {
                if (!pb2.B.get()) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    public static void c() {
        Pb pb2;
        synchronized (f14437a) {
            if (b() && (pb2 = c) != null) {
                pb2.B.compareAndSet(false, true);
            }
            tf.d dVar = tf.d.f30009a;
        }
        d();
    }

    public static void d() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig();
        synchronized (f14437a) {
            String url = unifiedIdServiceConfig.getUrl();
            Config a10 = C1705l2.a("signals", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            Pb pb2 = new Pb(url, new Ib(((SignalsConfig) a10).getIncludeIdParams()), Ha.b(), unifiedIdServiceConfig.getMaxRetries(), unifiedIdServiceConfig.getRetryInterval(), unifiedIdServiceConfig.getTimeout());
            c = pb2;
            G4 g42 = new G4(new Mb(pb2, f14438b), pb2);
            HashMap hashMap = new HashMap();
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("UnifiedIdNetworkCallRequested", hashMap, EnumC1686jb.f15238a);
            ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(g42);
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static void e() {
        synchronized (f14437a) {
            Pb pb2 = c;
            if (pb2 != null) {
                pb2.B.compareAndSet(false, true);
            }
            c = null;
            f14438b.clear();
            tf.d dVar = tf.d.f30009a;
        }
    }
}
