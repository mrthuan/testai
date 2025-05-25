package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0992Ne implements View.OnClickListener {
    public final /* synthetic */ C0997Nj A00;

    public View$OnClickListenerC0992Ne(C0997Nj c0997Nj) {
        this.A00 = c0997Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0996Ni interfaceC0996Ni;
        InterfaceC0996Ni interfaceC0996Ni2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0996Ni = this.A00.A05;
            if (interfaceC0996Ni == null) {
                return;
            }
            interfaceC0996Ni2 = this.A00.A05;
            interfaceC0996Ni2.ABX();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
