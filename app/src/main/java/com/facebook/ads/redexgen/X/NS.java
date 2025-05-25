package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NS implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ NI A01;
    public final /* synthetic */ V2 A02;

    public NS(V2 v22, NI ni2, C2W c2w) {
        this.A02 = v22;
        this.A01 = ni2;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACt(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
