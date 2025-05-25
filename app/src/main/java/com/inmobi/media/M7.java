package com.inmobi.media;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class M7 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14485a;

    public M7(O7 view) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f14485a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        O7 o72 = (O7) this.f14485a.get();
        if (o72 == null) {
            return;
        }
        int visibility = o72.getVisibility();
        if (visibility != 4 && visibility != 8) {
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.g.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            o72.f14551l = 360 * ((Float) animatedValue).floatValue();
            o72.invalidate();
            return;
        }
        Object animatedValue2 = animation.getAnimatedValue();
        kotlin.jvm.internal.g.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) animatedValue2).floatValue() >= 1.0d) {
            o72.a();
        }
    }
}
