package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f405a;

    public d(f fVar) {
        this.f405a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        f fVar = this.f405a;
        fVar.f416h = (fVar.f416h + 4) % fVar.f415g.c.length;
    }
}
