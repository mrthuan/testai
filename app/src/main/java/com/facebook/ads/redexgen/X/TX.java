package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TX implements PG {
    public final /* synthetic */ TV A00;

    public TX(TV tv) {
        this.A00 = tv;
    }

    @Override // com.facebook.ads.redexgen.X.PG
    public final void ADw(int i10) {
        boolean A0H;
        this.A00.A0C(i10, true);
        A0H = this.A00.A0H();
        if (A0H) {
            this.A00.A07();
        } else {
            this.A00.A09(i10);
        }
    }
}
