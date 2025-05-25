package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0971Mj implements View.OnClickListener {
    public final /* synthetic */ C0974Mm A00;

    public View$OnClickListenerC0971Mj(C0974Mm c0974Mm) {
        this.A00 = c0974Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
