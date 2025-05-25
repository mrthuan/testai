package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class KN implements SQ {
    @Override // com.facebook.ads.redexgen.X.SQ
    public final long A5L() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void AGr(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
