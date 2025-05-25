package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class A9 extends R8 {
    public final /* synthetic */ A6 A00;

    public A9(A6 a62) {
        this.A00 = a62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A00 */
    public final void A03(C9O c9o) {
        float f10;
        T7 t72;
        Q4 q42;
        this.A00.A0d(c9o);
        f10 = this.A00.A01;
        t72 = this.A00.A0Z;
        float duration = (f10 * t72.getDuration()) + c9o.A00();
        q42 = this.A00.A0X;
        q42.ABz(duration);
    }
}
