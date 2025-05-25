package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JN implements View.OnTouchListener {
    public final /* synthetic */ WJ A00;
    public final /* synthetic */ boolean A01;

    public JN(WJ wj2, boolean z10) {
        this.A00 = wj2;
        this.A01 = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
