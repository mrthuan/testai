package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NX implements View.OnClickListener {
    public final /* synthetic */ V1 A00;

    public NX(V1 v12) {
        this.A00 = v12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
