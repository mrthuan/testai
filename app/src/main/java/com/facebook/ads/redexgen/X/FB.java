package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class FB extends AbstractC1105Rn {
    public final /* synthetic */ C05665h A00;

    public FB(C05665h c05665h) {
        this.A00 = c05665h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(SZ sz) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            W7.A0L(this.A00.A08.getInternalNativeAd()).A1e(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
