package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class CB {
    public final C9 A00;

    public abstract void A0B(I4 i42, long j10) throws A0;

    public abstract boolean A0C(I4 i42) throws A0;

    public CB(C9 c92) {
        this.A00 = c92;
    }

    public final void A00(I4 i42, long j10) throws A0 {
        if (A0C(i42)) {
            A0B(i42, j10);
        }
    }
}
