package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5Z implements BidderTokenProviderApi {
    public final C6W A00 = new C6W();

    public final C6W A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C05605b.A09(context));
    }
}
