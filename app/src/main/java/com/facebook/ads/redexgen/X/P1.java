package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UQ A00;

    public P1(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A0A;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A0A;
        view2.requestLayout();
    }
}
