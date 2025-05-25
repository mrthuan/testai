package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class WM implements O7 {
    public final /* synthetic */ WJ A00;

    public WM(WJ wj2) {
        this.A00 = wj2;
    }

    @Override // com.facebook.ads.redexgen.X.O7
    public final void AC8(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        JP jp2;
        JP jp3;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            jp2 = this.A00.A02;
            if (jp2 != null) {
                jp3 = this.A00.A02;
                jp3.AD0(z10);
            }
        }
    }
}
