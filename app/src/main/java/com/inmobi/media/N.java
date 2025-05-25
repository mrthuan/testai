package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class N implements Q {

    /* renamed from: a  reason: collision with root package name */
    public AdConfig f14501a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f14502b;
    public final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14503d;

    public N(AdConfig adConfig) {
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        this.f14501a = adConfig;
        this.f14502b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.f14503d = new HashMap();
        Ha.a(new androidx.activity.i(this, 7));
    }

    public static final void a(N this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        ScheduledExecutorService scheduledExecutorService = P.f14562a;
        S s4 = (S) AbstractC1882ya.f15685a.getValue();
        s4.getClass();
        s4.f14621b = this$0;
    }

    public final void a() {
        if (!this.f14502b.get() && this.f14501a.getAdQuality().getEnabled()) {
            L l10 = new L(this);
            ScheduledExecutorService scheduledExecutorService = P.f14562a;
            P.a(new C1576c(l10));
        }
    }
}
