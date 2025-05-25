package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1430bn extends KY {
    public final /* synthetic */ C0806Fq A00;
    public final /* synthetic */ C04771u A01;
    public final /* synthetic */ C0795Fe A02;

    public C1430bn(C0795Fe c0795Fe, C04771u c04771u, C0806Fq c0806Fq) {
        this.A02 = c0795Fe;
        this.A01 = c04771u;
        this.A00 = c0806Fq;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A5F(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C0894Jg(adErrorType, ""));
    }
}
