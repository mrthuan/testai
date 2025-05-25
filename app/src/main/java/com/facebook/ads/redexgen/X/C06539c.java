package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06539c extends AbstractC1125Sh {
    public final /* synthetic */ C06519a A00;

    public C06539c(C06519a c06519a) {
        this.A00 = c06519a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C1126Si c1126Si) {
        new Handler(Looper.getMainLooper()).post(new QA(this));
    }
}
