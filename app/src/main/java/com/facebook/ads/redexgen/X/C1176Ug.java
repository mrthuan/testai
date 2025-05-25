package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ug  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1176Ug extends KY {
    public final /* synthetic */ OL A00;

    public C1176Ug(OL ol2) {
        this.A00 = ol2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        OL ol2 = this.A00;
        runnable = this.A00.A08;
        i10 = this.A00.A07;
        ol2.postOnAnimationDelayed(runnable, i10);
    }
}
