package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1146Tc implements QB {
    public final /* synthetic */ C06519a A00;

    public C1146Tc(C06519a c06519a) {
        this.A00 = c06519a;
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final void A8w() {
        AbstractC1022Oi abstractC1022Oi;
        AbstractC1022Oi abstractC1022Oi2;
        abstractC1022Oi = this.A00.A02;
        if (abstractC1022Oi instanceof BX) {
            abstractC1022Oi2 = this.A00.A02;
            ((BX) abstractC1022Oi2).A16();
            JF.A02(JE.A0c, null, ((AbstractC1160Tq) this.A00).A01.A1U(), ((AbstractC1160Tq) this.A00).A03.A09());
        }
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final void AGm() {
        AbstractC1022Oi abstractC1022Oi;
        AbstractC1022Oi abstractC1022Oi2;
        C9S c9s;
        abstractC1022Oi = this.A00.A02;
        if (abstractC1022Oi instanceof BX) {
            abstractC1022Oi2 = this.A00.A02;
            c9s = this.A00.A0K;
            ((BX) abstractC1022Oi2).A18(c9s);
            JF.A02(JE.A0c, null, ((AbstractC1160Tq) this.A00).A01.A1U(), ((AbstractC1160Tq) this.A00).A03.A09());
        }
        this.A00.A0a();
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final void AH0() {
        AbstractC1022Oi abstractC1022Oi;
        AbstractC1022Oi abstractC1022Oi2;
        this.A00.A0V();
        abstractC1022Oi = this.A00.A02;
        if (abstractC1022Oi instanceof BX) {
            abstractC1022Oi2 = this.A00.A02;
            ((BX) abstractC1022Oi2).getAdDetailsView().setVisibility(8);
        }
    }
}
