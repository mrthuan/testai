package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* loaded from: classes2.dex */
public final class Z3 extends C1739n9 {

    /* renamed from: p  reason: collision with root package name */
    public final int f14902p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Z3(com.inmobi.commons.core.configs.AdConfig.ViewabilityConfig r3, byte r4, com.inmobi.media.A4 r5) {
        /*
            r2 = this;
            com.inmobi.media.T3 r0 = com.inmobi.media.W3.f14772k
            java.lang.String r1 = "visibilityChecker"
            kotlin.jvm.internal.g.e(r0, r1)
            r2.<init>(r0, r3, r4, r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.f14902p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Z3.<init>(com.inmobi.commons.core.configs.AdConfig$ViewabilityConfig, byte, com.inmobi.media.A4):void");
    }

    @Override // com.inmobi.media.C1739n9, com.inmobi.media.wc
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f15348n;
        if (viewabilityConfig != null) {
            return viewabilityConfig.getWebVisibilityThrottleMillis();
        }
        return this.f14902p;
    }
}
