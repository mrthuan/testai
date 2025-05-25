package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A7 extends AbstractC1125Sh {
    public final /* synthetic */ A6 A00;

    public A7(A6 a62) {
        this.A00 = a62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C1126Si c1126Si) {
        new Handler(Looper.getMainLooper()).post(new Q0(this));
    }
}
