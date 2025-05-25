package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.aW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1354aW extends KL {
    public final /* synthetic */ C1353aV A00;

    public C1354aW(C1353aV c1353aV) {
        this.A00 = c1353aV;
    }

    @Override // com.facebook.ads.redexgen.X.KL
    public final void A01() {
        C5P c5p;
        C5P c5p2;
        C5P c5p3;
        c5p = this.A00.A01;
        if (c5p.A06() != null) {
            c5p2 = this.A00.A01;
            AdListener A06 = c5p2.A06();
            c5p3 = this.A00.A01;
            A06.onLoggingImpression(c5p3.A07());
        }
    }
}
