package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;

/* loaded from: classes2.dex */
public final class Q4 implements InterfaceC1719m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Q4 f14590a = new Q4();

    /* renamed from: b  reason: collision with root package name */
    public static final X2 f14591b;
    public static final C1877y5 c;

    static {
        tf.c a10 = kotlin.a.a(P4.f14569a);
        c = new C1877y5((CrashConfig) a10.getValue());
        Context d10 = Ha.d();
        if (d10 != null) {
            f14591b = new X2(d10, (CrashConfig) a10.getValue(), Ha.f());
        }
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        if (config instanceof CrashConfig) {
            C1877y5 c1877y5 = c;
            CrashConfig crashConfig = (CrashConfig) config;
            c1877y5.getClass();
            c1877y5.f15675a = crashConfig;
            S4 s4 = c1877y5.c;
            s4.getClass();
            s4.f14632a.f14174a = crashConfig.getCrashConfig().getSamplingPercent();
            s4.f14633b.f14174a = crashConfig.getCatchConfig().getSamplingPercent();
            s4.c.f14174a = crashConfig.getANRConfig().getWatchdog().getSamplingPercent();
            s4.f14634d.f14174a = crashConfig.getANRConfig().getAppExitReason().getSamplingPercent();
            A3 a32 = c1877y5.f15676b;
            if (a32 != null) {
                C1862x3 eventConfig = crashConfig.getEventConfig();
                kotlin.jvm.internal.g.e(eventConfig, "eventConfig");
                a32.f14123i = eventConfig;
            }
            X2 x22 = f14591b;
            if (x22 != null) {
                x22.f14827a = crashConfig;
            }
        }
    }
}
