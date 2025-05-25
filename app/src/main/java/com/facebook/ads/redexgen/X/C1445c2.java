package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.c2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1445c2 implements InterfaceC04721p {
    public final /* synthetic */ C04641h A00;

    public C1445c2(C04641h c04641h) {
        this.A00 = c04641h;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04721p
    public final void AD2(AdError adError) {
        InterfaceC04631g interfaceC04631g;
        interfaceC04631g = this.A00.A04;
        interfaceC04631g.AB4(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04721p
    public final void AD3() {
        InterfaceC04631g interfaceC04631g;
        interfaceC04631g = this.A00.A04;
        interfaceC04631g.AB5();
    }
}
