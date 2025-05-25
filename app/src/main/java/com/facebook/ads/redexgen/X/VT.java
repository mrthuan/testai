package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class VT implements MP {
    public final /* synthetic */ C5Q A00;
    public final /* synthetic */ VP A01;

    public VT(VP vp, C5Q c5q) {
        this.A01 = vp;
        this.A00 = c5q;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final void ABX() {
        this.A01.A0D.A04(JE.A07, null);
        if (this.A01.A0b()) {
            return;
        }
        if (this.A01.A0Y()) {
            this.A01.A0X(this.A00);
        } else {
            this.A00.finish(1);
        }
    }
}
