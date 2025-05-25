package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* loaded from: assets/audience_network.dex */
public class ZU implements C7n {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ ZT A01;

    public ZU(ZT zt, AdvertisingId advertisingId) {
        this.A01 = zt;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7n
    public final boolean A9W() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7n
    public final String getId() {
        return this.A00.getId();
    }
}
