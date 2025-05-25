package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PB implements View.OnClickListener {
    public final /* synthetic */ UP A00;

    public PB(UP up) {
        this.A00 = up;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QB qb2;
        QB qb3;
        if (KQ.A02(this)) {
            return;
        }
        try {
            qb2 = this.A00.A02;
            if (qb2 == null) {
                return;
            }
            qb3 = this.A00.A02;
            qb3.AGm();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
