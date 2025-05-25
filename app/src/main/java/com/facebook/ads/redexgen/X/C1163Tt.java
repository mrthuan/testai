package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1163Tt implements LG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KY A01;
    public final /* synthetic */ AbstractC1160Tq A02;

    public C1163Tt(AbstractC1160Tq abstractC1160Tq, int i10, KY ky) {
        this.A02 = abstractC1160Tq;
        this.A00 = i10;
        this.A01 = ky;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
