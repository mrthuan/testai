package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1482cd extends KY {
    public final /* synthetic */ C1481cc A00;
    public final /* synthetic */ BN A01;

    public C1482cd(C1481cc c1481cc, BN bn2) {
        this.A00 = c1481cc;
        this.A01 = bn2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1102Rk c1102Rk;
        C1102Rk c1102Rk2;
        C1102Rk c1102Rk3;
        this.A00.A00.A0A();
        c1102Rk = this.A00.A00.A0C;
        if (c1102Rk != null) {
            BN bn2 = this.A01;
            c1102Rk2 = this.A00.A00.A0C;
            bn2.setAdViewabilityChecker(c1102Rk2);
            c1102Rk3 = this.A00.A00.A0C;
            c1102Rk3.A0U();
        }
    }
}
