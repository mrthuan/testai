package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.We  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class View$OnAttachStateChangeListenerC1225We extends AbstractC1540dm implements View.OnAttachStateChangeListener {
    public final View A00;

    public View$OnAttachStateChangeListenerC1225We(View view) {
        this.A00 = view;
        this.A00.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return C3T.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
