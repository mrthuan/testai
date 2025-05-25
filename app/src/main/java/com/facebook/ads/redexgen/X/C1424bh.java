package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.redexgen.X.bh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1424bh implements InterfaceC06288d {
    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A6q() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final C06247x A78(C7j c7j) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A7o() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A8V() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean A9Y() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean A9d() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final Boolean A9i() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
