package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.38  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass38 extends C05263r {
    public C0711Bl A00;
    public List<QK> A01;

    public AnonymousClass38(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A00 = new C0711Bl(this, 1, null, null, null);
    }

    public final void A1y(C1102Rk c1102Rk) {
        if (this.A00 != null) {
            this.A00.A0c(c1102Rk);
        }
    }

    public C0711Bl getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
