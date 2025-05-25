package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class PV extends AbstractC06488x<C9O> {
    public final /* synthetic */ PC A00;

    public PV(PC pc2) {
        this.A00 = pc2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C9O c9o) {
        T7 t72;
        T7 t73;
        T7 t74;
        String A02;
        t72 = this.A00.A00;
        if (t72 == null) {
            return;
        }
        PC pc2 = this.A00;
        PC pc3 = this.A00;
        t73 = this.A00.A00;
        int duration = t73.getDuration();
        t74 = this.A00.A00;
        A02 = pc3.A02(duration - t74.getCurrentPositionInMillis());
        pc2.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    public final Class<C9O> A01() {
        return C9O.class;
    }
}
