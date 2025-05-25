package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1221Wa extends KY {
    public final /* synthetic */ WY A00;

    public C1221Wa(WY wy) {
        this.A00 = wy;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        long j10;
        long j11;
        WY.A00(this.A00);
        j10 = this.A00.A01;
        if (j10 > 0) {
            try {
                j11 = this.A00.A01;
                Thread.sleep(j11);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
