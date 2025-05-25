package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.by  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1441by implements C6X {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC1441by(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        A01(true);
    }
}
