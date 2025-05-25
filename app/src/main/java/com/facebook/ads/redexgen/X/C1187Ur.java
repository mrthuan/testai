package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ur  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1187Ur extends KY {
    public final WeakReference<C1102Rk> A00;

    public C1187Ur(C1102Rk c1102Rk) {
        this.A00 = new WeakReference<>(c1102Rk);
    }

    public C1187Ur(WeakReference<C1102Rk> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1102Rk viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
