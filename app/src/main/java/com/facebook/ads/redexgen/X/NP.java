package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NP implements View.OnClickListener {
    public final /* synthetic */ NI A00;
    public final /* synthetic */ V2 A01;

    public NP(V2 v22, NI ni2) {
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
            this.A01.A0B.ACj(C2U.A06);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
