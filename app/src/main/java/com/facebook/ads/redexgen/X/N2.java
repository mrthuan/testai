package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N2 implements View.OnClickListener {
    public final /* synthetic */ V7 A00;

    public N2(V7 v72) {
        this.A00 = v72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        N4 n42;
        if (KQ.A02(this)) {
            return;
        }
        try {
            n42 = this.A00.A07;
            n42.ABy();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
