package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PP implements View.OnTouchListener {
    public final /* synthetic */ BO A00;

    public PP(BO bo2) {
        this.A00 = bo2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PT pt;
        pt = this.A00.A0E;
        pt.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
