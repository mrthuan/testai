package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0716Bq extends T7 {
    public C0716Bq(C1314Zs c1314Zs) {
        super(c1314Zs);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int newWidthSpec = View.MeasureSpec.getMode(i10);
        if (newWidthSpec == 1073741824) {
            i11 = i10;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i11);
            if (newWidthSpec2 == 1073741824) {
                i10 = i11;
            }
        }
        super.onMeasure(i10, i11);
    }
}
