package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class Ej extends C1359ab {
    public Ej(C5Q c5q) {
        super(c5q);
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final /* bridge */ /* synthetic */ void A3p(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        super.A3p(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final /* bridge */ /* synthetic */ void A3q(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3q(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final void A4P(String str) {
        super.A4P(str);
        if (this.A00.get() == null) {
            return;
        }
        String A03 = EnumC1087Qv.A08.A03();
        String rewardedVideoError = EnumC1087Qv.A09.A03();
        if (str.equals(A03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final /* bridge */ /* synthetic */ void A4Q(String str, C06468v c06468v) {
        super.A4Q(str, c06468v);
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final /* bridge */ /* synthetic */ void A9l(String str, C1Z c1z) {
        super.A9l(str, c1z);
    }

    @Override // com.facebook.ads.redexgen.X.C1359ab, com.facebook.ads.redexgen.X.MR
    public final /* bridge */ /* synthetic */ void ABR(int i10) {
        super.ABR(i10);
    }
}
