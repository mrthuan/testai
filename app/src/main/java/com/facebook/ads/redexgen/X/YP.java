package com.facebook.ads.redexgen.X;

import com.inmobi.commons.core.configs.CrashConfig;

/* loaded from: assets/audience_network.dex */
public class YP implements C6 {
    public final /* synthetic */ YO A00;

    public YP(YO yo2) {
        this.A00 = yo2;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        AbstractC0745Ct abstractC0745Ct;
        long j10;
        abstractC0745Ct = this.A00.A0B;
        j10 = this.A00.A07;
        return abstractC0745Ct.A03(j10);
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        AbstractC0745Ct abstractC0745Ct;
        long j11;
        long A00;
        long j12;
        if (j10 == 0) {
            j12 = this.A00.A09;
            return new C5(new C7(0L, j12));
        }
        abstractC0745Ct = this.A00.A0B;
        long A04 = abstractC0745Ct.A04(j10);
        YO yo2 = this.A00;
        j11 = this.A00.A09;
        A00 = yo2.A00(j11, A04, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        return new C5(new C7(j10, A00));
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }
}
