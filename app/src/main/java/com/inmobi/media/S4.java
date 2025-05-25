package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;

/* loaded from: classes2.dex */
public final class S4 {

    /* renamed from: a  reason: collision with root package name */
    public final Ca f14632a;

    /* renamed from: b  reason: collision with root package name */
    public final Ca f14633b;
    public final Ca c;

    /* renamed from: d  reason: collision with root package name */
    public final Ca f14634d;

    public S4(CrashConfig config) {
        kotlin.jvm.internal.g.e(config, "config");
        this.f14632a = new Ca(config.getCrashConfig().getSamplingPercent());
        this.f14633b = new Ca(config.getCatchConfig().getSamplingPercent());
        this.c = new Ca(config.getANRConfig().getWatchdog().getSamplingPercent());
        this.f14634d = new Ca(config.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
