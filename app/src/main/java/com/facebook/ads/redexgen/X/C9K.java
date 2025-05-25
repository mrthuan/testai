package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9K extends AbstractC1105Rn {
    public final /* synthetic */ QG A00;

    public C9K(QG qg2) {
        this.A00 = qg2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(SZ sz) {
        if (QG.A07(this.A00) && QG.A08(this.A00)) {
            QG.A0B(this.A00, false);
            if (QG.A0A(this.A00, RE.A03) || QG.A09(this.A00)) {
                QG.A0C(this.A00, false);
                QG.A01(this.A00).postDelayed(new QO(this), QG.A00(this.A00));
            } else if (!QG.A0A(this.A00, RE.A02)) {
            } else {
                QG.A04(this.A00);
                QG.A05(this.A00, true, true);
            }
        }
    }
}
