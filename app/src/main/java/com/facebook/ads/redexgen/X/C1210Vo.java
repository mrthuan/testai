package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Vo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1210Vo extends KY {
    public final /* synthetic */ LH A00;

    public C1210Vo(LH lh2) {
        this.A00 = lh2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        Handler handler;
        long j10;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j10 = this.A00.A02;
            handler.postDelayed(this, j10);
        }
    }
}
