package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OF implements View.OnClickListener {
    public final /* synthetic */ C1180Uk A00;

    public OF(C1180Uk c1180Uk) {
        this.A00 = c1180Uk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
