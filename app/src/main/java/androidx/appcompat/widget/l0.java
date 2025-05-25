package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StarCheckView.java */
/* loaded from: classes.dex */
public final class l0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StarCheckView f2616a;

    public l0(StarCheckView starCheckView) {
        this.f2616a = starCheckView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f2616a.f2411h = null;
    }
}
