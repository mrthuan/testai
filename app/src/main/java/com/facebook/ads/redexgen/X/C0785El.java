package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.El  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0785El extends AbstractC1125Sh {
    public final /* synthetic */ C05665h A00;

    public C0785El(C05665h c05665h) {
        this.A00 = c05665h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C1126Si c1126Si) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            W7.A0L(this.A00.A08.getInternalNativeAd()).A1e(false, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onError();
    }
}
