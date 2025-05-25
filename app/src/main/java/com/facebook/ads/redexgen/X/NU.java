package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NU implements View.OnClickListener {
    public final /* synthetic */ NW A00;

    public NU(NW nw) {
        this.A00 = nw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NG ng2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ng2 = this.A00.A02;
            ng2.A8n();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
