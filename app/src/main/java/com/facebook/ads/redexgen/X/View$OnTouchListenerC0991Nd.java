package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0991Nd implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        switch (motionEvent.getAction()) {
            case 0:
                i10 = C0997Nj.A0H;
                M3.A0M(view, i10);
                break;
            case 1:
                M3.A0M(view, 0);
                break;
        }
        return false;
    }
}
