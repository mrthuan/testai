package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TD extends KY {
    public final /* synthetic */ TC A00;

    public TD(TC tc2) {
        this.A00 = tc2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1074Qi c1074Qi;
        T7 t72;
        AbstractC1121Sd abstractC1121Sd;
        AbstractC1127Sj abstractC1127Sj;
        c1074Qi = this.A00.A02;
        c1074Qi.A06();
        t72 = this.A00.A03;
        C06478w<AbstractC06488x, C06468v> eventBus = t72.getEventBus();
        abstractC1121Sd = this.A00.A05;
        abstractC1127Sj = this.A00.A04;
        eventBus.A04(abstractC1121Sd, abstractC1127Sj);
    }
}
