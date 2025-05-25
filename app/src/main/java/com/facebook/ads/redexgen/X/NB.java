package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NB implements View.OnClickListener {
    public final /* synthetic */ ND A00;

    public NB(ND nd2) {
        this.A00 = nd2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NG ng2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ng2 = this.A00.A04;
            ng2.A9m();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
