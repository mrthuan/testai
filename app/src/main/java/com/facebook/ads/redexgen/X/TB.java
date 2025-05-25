package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class TB extends KY {
    public final /* synthetic */ T7 A00;

    public TB(T7 t72) {
        this.A00 = t72;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        C06478w c06478w;
        Handler handler;
        int i10;
        z10 = this.A00.A03;
        if (!z10) {
            c06478w = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c06478w.A02(new AbstractC1128Sk(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.9O
            });
            handler = this.A00.A07;
            i10 = this.A00.A00;
            handler.postDelayed(this, i10);
        }
    }
}
