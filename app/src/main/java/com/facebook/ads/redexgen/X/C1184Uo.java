package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Uo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1184Uo extends KY {
    public final /* synthetic */ O6 A00;

    public C1184Uo(O6 o62) {
        this.A00 = o62;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
