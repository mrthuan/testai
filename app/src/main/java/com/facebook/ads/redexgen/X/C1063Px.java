package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Px  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1063Px implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ A6 A00;

    public C1063Px(A6 a62) {
        this.A00 = a62;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        T7 t72;
        T7 t73;
        t72 = this.A00.A0Z;
        t72.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        t73 = this.A00.A0Z;
        t73.requestLayout();
    }
}
