package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.cF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1458cF implements O7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1457cE A01;
    public final /* synthetic */ W7 A02;

    public C1458cF(AbstractC1457cE abstractC1457cE, int i10, W7 w7) {
        this.A01 = abstractC1457cE;
        this.A00 = i10;
        this.A02 = w7;
    }

    @Override // com.facebook.ads.redexgen.X.O7
    public final void AC8(boolean z10) {
        AbstractC1101Rj abstractC1101Rj;
        if (this.A00 == 0) {
            W7 w7 = this.A02;
            abstractC1101Rj = this.A01.A04;
            w7.A1b(abstractC1101Rj);
        }
        this.A02.A1e(z10, true);
    }
}
