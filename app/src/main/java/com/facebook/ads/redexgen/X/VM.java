package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class VM extends AbstractC0968Mg {
    public final O5 A00;

    public VM(C1314Zs c1314Zs, View.OnClickListener onClickListener) {
        super(c1314Zs, onClickListener);
        this.A00 = new O5(c1314Zs);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final VM A0F(String str) {
        new AsyncTaskC1183Un(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new VN(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0968Mg
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
