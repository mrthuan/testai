package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.cj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1488cj extends KY {
    public final /* synthetic */ C04530w A00;

    public C1488cj(C04530w c04530w) {
        this.A00 = c04530w;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C04520v c04520v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c04520v = this.A00.A02;
        c04520v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
