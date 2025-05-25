package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Th  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1151Th extends KY {
    public final /* synthetic */ Q6 A00;
    public final /* synthetic */ Q7 A01;

    public C1151Th(Q7 q72, Q6 q6) {
        this.A01 = q72;
        this.A00 = q6;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1152Ti(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
