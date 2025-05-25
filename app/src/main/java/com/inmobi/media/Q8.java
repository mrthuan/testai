package com.inmobi.media;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Q8 extends G8 {

    /* renamed from: y  reason: collision with root package name */
    public final P8 f14601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q8(P8 novatiqData, A4 a42) {
        super(novatiqData.c.getBeaconUrl(), a42);
        kotlin.jvm.internal.g.e(novatiqData, "novatiqData");
        this.f14601y = novatiqData;
        this.f14293t = false;
        this.f14294u = false;
        this.f14297x = false;
    }

    @Override // com.inmobi.media.G8
    public final void f() {
        A4 a42 = this.f14278e;
        if (a42 != null) {
            this.f14601y.getClass();
            ((B4) a42).a("Novatiq", "preparing Novatiq request with data - hyperId - " + this.f14601y.f14581a + " - sspHost - " + this.f14601y.f14582b + " - pubId - inmobi");
        }
        super.f();
        HashMap hashMap = this.f14283j;
        if (hashMap != null) {
            hashMap.put("sptoken", this.f14601y.f14581a);
        }
        HashMap hashMap2 = this.f14283j;
        if (hashMap2 != null) {
            this.f14601y.getClass();
            hashMap2.put("sspid", "i6i");
        }
        HashMap hashMap3 = this.f14283j;
        if (hashMap3 != null) {
            hashMap3.put("ssphost", this.f14601y.f14582b);
        }
        HashMap hashMap4 = this.f14283j;
        if (hashMap4 != null) {
            this.f14601y.getClass();
            hashMap4.put("pubid", "inmobi");
        }
    }
}
