package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0977Mp implements View.OnClickListener {
    public final /* synthetic */ VA A00;

    public View$OnClickListenerC0977Mp(VA va2) {
        this.A00 = va2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JF jf2;
        MR mr;
        N9 n92;
        if (KQ.A02(this)) {
            return;
        }
        try {
            jf2 = this.A00.A0N;
            jf2.A04(JE.A07, null);
            mr = this.A00.A0Q;
            n92 = this.A00.A0R;
            mr.A4P(n92.A7I());
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
