package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class XX implements FG {
    public final int A00;
    public final /* synthetic */ C0757Dg A01;

    public XX(C0757Dg c0757Dg, int i10) {
        this.A01 = c0757Dg;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final boolean A9b() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final void AAm() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final int AEn(C06709u c06709u, C1292Yw c1292Yw, boolean z10) {
        return this.A01.A0P(this.A00, c06709u, c1292Yw, z10);
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final int AGp(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
