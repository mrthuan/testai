package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Na  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0988Na implements View.OnClickListener {
    public final /* synthetic */ NI A00;
    public final /* synthetic */ V1 A01;

    public View$OnClickListenerC0988Na(V1 v12, NI ni2) {
        this.A01 = v12;
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
