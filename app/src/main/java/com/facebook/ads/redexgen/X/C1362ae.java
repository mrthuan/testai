package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ae  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1362ae extends AbstractC05534t {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1361ad A01;

    public C1362ae(AbstractC1361ad abstractC1361ad) {
        this.A01 = abstractC1361ad;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05534t
    public final void A0L(FL fl2, int i10) {
        super.A0L(fl2, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05534t
    public final void A0M(FL fl2, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
