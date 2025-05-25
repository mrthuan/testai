package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1339aH extends KL {
    public final /* synthetic */ C1338aG A00;

    public C1339aH(C1338aG c1338aG) {
        this.A00 = c1338aG;
    }

    @Override // com.facebook.ads.redexgen.X.KL
    public final void A01() {
        C05735o c05735o;
        C05735o c05735o2;
        c05735o = this.A00.A01.A00;
        if (c05735o.A00() != null) {
            c05735o2 = this.A00.A01.A00;
            c05735o2.A00().onAdsLoaded();
        }
    }
}
