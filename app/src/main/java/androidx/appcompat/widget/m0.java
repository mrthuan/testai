package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StarCheckView.java */
/* loaded from: classes.dex */
public final class m0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StarCheckView f2619a;

    public m0(StarCheckView starCheckView) {
        this.f2619a = starCheckView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f2619a.f2413j = null;
    }
}
