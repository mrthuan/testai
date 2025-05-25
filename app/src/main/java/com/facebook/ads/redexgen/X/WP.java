package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class WP implements InterfaceC1080Qo {
    public final /* synthetic */ WJ A00;

    public WP(WJ wj2) {
        this.A00 = wj2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1080Qo
    public final void AE2() {
        AtomicBoolean atomicBoolean;
        JP jp2;
        JP jp3;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        jp2 = this.A00.A02;
        if (jp2 != null) {
            jp3 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            jp3.AD0(atomicBoolean2.get());
        }
    }
}
