package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UT extends KY {
    public final /* synthetic */ UQ A00;

    public UT(UQ uq) {
        this.A00 = uq;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        PD pd2;
        z10 = this.A00.A0Z;
        if (!z10) {
            pd2 = this.A00.A0M;
            M3.A0F(1000, pd2);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
