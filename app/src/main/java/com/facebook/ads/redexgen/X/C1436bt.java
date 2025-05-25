package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1436bt extends KY {
    public final /* synthetic */ C1478cZ A00;
    public final /* synthetic */ C04771u A01;
    public final /* synthetic */ C0799Fi A02;

    public C1436bt(C0799Fi c0799Fi, C04771u c04771u, C1478cZ c1478cZ) {
        this.A02 = c0799Fi;
        this.A01 = c04771u;
        this.A00 = c1478cZ;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        C0894Jg A00 = C0894Jg.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A5F(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
