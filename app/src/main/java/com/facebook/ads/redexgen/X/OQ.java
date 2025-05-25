package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OQ implements View.OnClickListener {
    public final /* synthetic */ OS A00;

    public OQ(OS os) {
        this.A00 = os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
