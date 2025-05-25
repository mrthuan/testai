package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1075Qj implements View.OnTouchListener {
    public final /* synthetic */ T7 A00;

    public View$OnTouchListenerC1075Qj(T7 t72) {
        this.A00 = t72;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C06478w c06478w;
        c06478w = this.A00.A0B;
        c06478w.A02(new C1090Qy(view, motionEvent));
        return false;
    }
}
