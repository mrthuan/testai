package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Tu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1164Tu extends AbstractC1101Rj {
    public final /* synthetic */ AbstractC1160Tq A00;

    public C1164Tu(AbstractC1160Tq abstractC1160Tq) {
        this.A00 = abstractC1160Tq;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1101Rj
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A1U())) {
                this.A00.A04.AA6(this.A00.A01.A1U(), new O8().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0b()).A05());
                C0920Kh.A00(this.A00.A03).A0E(this.A00.A09.A83(), this.A00.A01.A1U());
                C1T.A07(this.A00.A01.A1Q(), this.A00.A03);
                this.A00.A03.A0E().A36();
                C2M.A02(this.A00.A01.A0a(), AbstractC0940Le.A00(this.A00.A01.A0c()));
                this.A00.A08.A4P(this.A00.A09.A7Z());
            }
        }
    }
}
