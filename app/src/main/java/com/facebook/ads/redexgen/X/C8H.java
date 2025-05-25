package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8H extends AbstractC1089Qx {
    public final /* synthetic */ OY A00;

    public C8H(OY oy) {
        this.A00 = oy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C1090Qy c1090Qy) {
        T7 t72;
        Handler handler;
        t72 = this.A00.A01;
        if (t72 == null || c1090Qy.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new R3(this));
    }
}
