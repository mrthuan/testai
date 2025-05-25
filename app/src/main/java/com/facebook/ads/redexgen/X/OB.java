package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public abstract class OB {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else if (!z10) {
        } else {
            OA oa2 = new OA(onClickListener);
            view.setOnClickListener(oa2);
            view.setOnTouchListener(new O9(oa2));
        }
    }
}
