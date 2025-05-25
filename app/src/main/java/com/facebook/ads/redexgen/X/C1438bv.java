package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1438bv extends KY {
    public final /* synthetic */ AbstractC1437bu A00;
    public final /* synthetic */ C0894Jg A01;

    public C1438bv(AbstractC1437bu abstractC1437bu, C0894Jg c0894Jg) {
        this.A00 = abstractC1437bu;
        this.A01 = c0894Jg;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        this.A00.A0B.A0E().A5F(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
