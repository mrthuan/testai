package androidx.appcompat.widget;

import android.animation.ValueAnimator;

/* compiled from: StarCheckView.java */
/* loaded from: classes.dex */
public final class k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StarCheckView f2615a;

    public k0(StarCheckView starCheckView) {
        this.f2615a = starCheckView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2615a.invalidate();
    }
}
