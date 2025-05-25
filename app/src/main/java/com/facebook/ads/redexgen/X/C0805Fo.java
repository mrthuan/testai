package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0805Fo extends AbstractC1457cE {
    public final C1314Zs A00;

    public C0805Fo(C3C c3c, List<W7> list, C1314Zs c1314Zs) {
        super(c3c, list, c1314Zs);
        this.A00 = c1314Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A01 */
    public final VW A0C(ViewGroup viewGroup, int i10) {
        return new VW(new C0964Mc(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A0H */
    public final void A0D(VW vw, int i10) {
        super.A0H(vw, i10);
        C0964Mc c0964Mc = (C0964Mc) vw.A0j();
        C0987Mz imageView = (C0987Mz) c0964Mc.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        W7 childAd = ((AbstractC1457cE) this).A01.get(i10);
        childAd.A11().A0K(this.A00);
        childAd.A1N(c0964Mc, c0964Mc);
    }
}
