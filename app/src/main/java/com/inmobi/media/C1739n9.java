package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.inmobi.media.n9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1739n9 extends wc {

    /* renamed from: n  reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f15348n;

    /* renamed from: o  reason: collision with root package name */
    public final int f15349o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739n9(qc visibilityChecker, AdConfig.ViewabilityConfig viewabilityConfig, byte b10, A4 a42) {
        super(visibilityChecker, b10, a42);
        kotlin.jvm.internal.g.e(visibilityChecker, "visibilityChecker");
        this.f15348n = viewabilityConfig;
        this.f15349o = 100;
    }

    @Override // com.inmobi.media.wc
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f15348n;
        if (viewabilityConfig != null) {
            return viewabilityConfig.getVisibilityThrottleMillis();
        }
        return this.f15349o;
    }

    @Override // com.inmobi.media.wc
    public final void d() {
        g();
    }
}
