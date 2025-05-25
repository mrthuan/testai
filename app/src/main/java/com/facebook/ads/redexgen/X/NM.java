package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NM implements View.OnClickListener {
    public final /* synthetic */ V3 A00;

    public NM(V3 v32) {
        this.A00 = v32;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9n();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
