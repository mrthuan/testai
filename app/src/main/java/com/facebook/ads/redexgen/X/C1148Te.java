package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Te  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1148Te implements LZ {
    public final /* synthetic */ C06519a A00;

    public C1148Te(C06519a c06519a) {
        this.A00 = c06519a;
    }

    @Override // com.facebook.ads.redexgen.X.LZ
    public final void ACu(String str) {
        Handler handler;
        handler = this.A00.A0F;
        handler.postDelayed(new Q8(this), 2000L);
    }

    @Override // com.facebook.ads.redexgen.X.LZ
    public final void ACv(String str) {
        this.A00.A0D(JE.A0a);
    }
}
