package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1018Oe implements View.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC1178Ui A00;
    public final /* synthetic */ String A01;

    public View$OnClickListenerC1018Oe(View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui, String str) {
        this.A00 = view$OnClickListenerC1178Ui;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
