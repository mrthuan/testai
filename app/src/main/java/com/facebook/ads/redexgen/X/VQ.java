package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class VQ implements LG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VP A01;

    public VQ(VP vp, int i10) {
        this.A01 = vp;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        MR mr;
        this.A01.A03 = false;
        this.A01.A0T();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07 && this.A01.A06 != null) {
            this.A01.A06.A05();
            mr = this.A01.A09;
            mr.A4P(new V5().A6F());
        }
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
