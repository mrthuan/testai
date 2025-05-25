package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1340aI extends KL {
    public final /* synthetic */ C1337aF A00;
    public final /* synthetic */ C0894Jg A01;

    public C1340aI(C1337aF c1337aF, C0894Jg c0894Jg) {
        this.A00 = c1337aF;
        this.A01 = c0894Jg;
    }

    @Override // com.facebook.ads.redexgen.X.KL
    public final void A01() {
        C05735o c05735o;
        C05735o c05735o2;
        c05735o = this.A00.A00;
        if (c05735o.A00() != null) {
            c05735o2 = this.A00.A00;
            c05735o2.A00().onAdError(L8.A00(this.A01));
        }
    }
}
