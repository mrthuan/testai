package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Md  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class animation.Animation$AnimationListenerC0965Md implements Animation.AnimationListener {
    public final /* synthetic */ C5Q A00;
    public final /* synthetic */ VP A01;
    public final /* synthetic */ VP A02;

    public animation.Animation$AnimationListenerC0965Md(VP vp, VP vp2, C5Q c5q) {
        this.A01 = vp;
        this.A02 = vp2;
        this.A00 = c5q;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        M3.A0H(this.A02);
        new Handler().postDelayed(new VS(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
