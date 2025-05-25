package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ob  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1015Ob {
    public static final int A00 = M3.A00();

    public static void A00(C1314Zs c1314Zs, ViewGroup viewGroup, String str) {
        new AsyncTaskC1183Un(viewGroup, c1314Zs).A07(str);
        View view = new View(c1314Zs);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        M3.A0R(view, c1314Zs);
        viewGroup.addView(view, 0);
    }
}
