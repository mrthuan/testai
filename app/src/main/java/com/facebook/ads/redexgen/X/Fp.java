package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Fp extends AbstractC1457cE {
    public final C1314Zs A00;
    public final JW A01;

    public Fp(C1314Zs c1314Zs, C3C c3c, List<W7> list, JW jw) {
        super(c3c, list, c1314Zs);
        this.A00 = c1314Zs;
        this.A01 = jw == null ? new JW() : jw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A01 */
    public final VW A0C(ViewGroup viewGroup, int i10) {
        return new VW(new MX(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A0H */
    public final void A0D(VW vw, int i10) {
        super.A0H(vw, i10);
        MX mx = (MX) vw.A0j();
        A0F(mx.getImageCardView(), i10);
        if (((AbstractC1457cE) this).A01.get(i10) != null) {
            mx.setTitle(((AbstractC1457cE) this).A01.get(i10).getAdHeadline());
            mx.setSubtitle(((AbstractC1457cE) this).A01.get(i10).getAdLinkDescription());
            mx.setButtonText(((AbstractC1457cE) this).A01.get(i10).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mx);
        ((AbstractC1457cE) this).A01.get(i10).A1O(mx, mx, arrayList);
    }
}
