package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TJ extends AbstractC05364c<TH> {
    public final int A00;
    public final C1314Zs A01;
    public final View$OnClickListenerC1178Ui A02;
    public final List<String> A03;

    public TJ(C1314Zs c1314Zs, List<String> screenshotUrls, int i10, View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1314Zs;
        this.A02 = view$OnClickListenerC1178Ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A02 */
    public final TH A0C(ViewGroup viewGroup, int i10) {
        TI ti2 = new TI(this.A01);
        if (C0877Im.A17(this.A01)) {
            ti2.setOnClickListener(new View$OnClickListenerC1067Qb(this));
        }
        return new TH(ti2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A03 */
    public final void A0D(TH th2, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i10 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i10 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        th2.A0j().setLayoutParams(marginLayoutParams);
        th2.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    public final int A0E() {
        return this.A03.size();
    }
}
