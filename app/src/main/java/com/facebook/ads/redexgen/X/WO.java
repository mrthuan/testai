package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class WO implements JR {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ WJ A01;

    public WO(WJ wj2, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = wj2;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.JR
    public final void AGT() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.JR
    public final void AGY(NativeAd nativeAd) {
        this.A01.A0I(W7.A0L(nativeAd.getInternalNativeAd()), new WK(W7.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.JR
    public final void AHF() {
        this.A01.A0D();
    }
}
