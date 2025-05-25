package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TI extends OV {
    public final ImageView A00;
    public final C1314Zs A01;

    public TI(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A01 = c1314Zs;
        this.A00 = new ImageView(c1314Zs);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1183Un downloadImageTask = new AsyncTaskC1183Un(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
