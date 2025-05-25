package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class U4 implements LG {
    public final /* synthetic */ B8 A00;

    public U4(B8 b82) {
        this.A00 = b82;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        Q4 q42;
        Q4 q43;
        int i10;
        q42 = this.A00.A05;
        q42.ADa(false);
        q43 = this.A00.A05;
        i10 = this.A00.A02;
        q43.ABi(i10);
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        Q4 q42;
        int i10;
        q42 = this.A00.A05;
        i10 = this.A00.A02;
        q42.ABz(i10 - f10);
    }
}
