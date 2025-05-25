package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NQ implements View.OnClickListener {
    public final /* synthetic */ NI A00;
    public final /* synthetic */ V2 A01;

    public NQ(V2 v22, NI ni2) {
        this.A01 = v22;
        this.A00 = ni2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A9n();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
