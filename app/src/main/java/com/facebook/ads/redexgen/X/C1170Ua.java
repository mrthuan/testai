package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ua  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1170Ua implements LG {
    public final /* synthetic */ BX A00;

    public C1170Ua(BX bx) {
        this.A00 = bx;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        MQ mq;
        MQ mq2;
        this.A00.A08 = false;
        mq = this.A00.A04;
        if (mq != null) {
            mq2 = this.A00.A04;
            mq2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        MQ mq;
        MQ mq2;
        mq = this.A00.A04;
        if (mq != null) {
            mq2 = this.A00.A04;
            mq2.setProgressImmediate(100.0f * (1.0f - (f10 / ((float) this.A00.getAdInfo().A0H().A00()))));
        }
    }
}
