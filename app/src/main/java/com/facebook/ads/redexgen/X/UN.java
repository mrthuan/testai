package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UN implements O7 {
    public final WeakReference<BP> A00;

    public UN(BP bp2) {
        this.A00 = new WeakReference<>(bp2);
    }

    public /* synthetic */ UN(BP bp2, BU bu) {
        this(bp2);
    }

    @Override // com.facebook.ads.redexgen.X.O7
    public final void AC8(boolean z10) {
        BP cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A05();
        }
    }
}
