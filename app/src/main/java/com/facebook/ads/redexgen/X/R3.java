package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class R3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C8H A00;

    public R3(C8H c8h) {
        this.A00 = c8h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new OZ(this), 2000L);
    }
}
