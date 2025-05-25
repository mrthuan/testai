package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class FE {
    public FE A00;
    public C0829Gq A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public FE(long j10, int i10) {
        this.A04 = j10;
        this.A03 = i10 + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final FE A01() {
        this.A01 = null;
        FE fe2 = this.A00;
        this.A00 = null;
        return fe2;
    }

    public final void A02(C0829Gq c0829Gq, FE fe2) {
        this.A01 = c0829Gq;
        this.A00 = fe2;
        this.A02 = true;
    }
}
