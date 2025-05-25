package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.Ze  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1300Ze extends KY {
    public final /* synthetic */ C1313Zr A00;

    public C1300Ze(C1313Zr c1313Zr) {
        this.A00 = c1313Zr;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
