package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class TW implements PH {
    public final /* synthetic */ TV A00;

    public TW(TV tv) {
        this.A00 = tv;
    }

    @Override // com.facebook.ads.redexgen.X.PH
    public final void AE4(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.PH
    public final void AE6(View view) {
        UO uo2 = (UO) view;
        uo2.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) uo2.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
