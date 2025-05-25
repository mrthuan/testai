package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.Ac  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0678Ac extends AbstractC1125Sh {
    public final /* synthetic */ C0677Ab A00;

    public C0678Ac(C0677Ab c0677Ab) {
        this.A00 = c0677Ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C1126Si c1126Si) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1058Ps(this));
    }
}
