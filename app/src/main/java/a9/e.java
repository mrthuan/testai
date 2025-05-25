package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f406a;

    public e(f fVar) {
        this.f406a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        f fVar = this.f406a;
        fVar.c();
        g2.c cVar = fVar.f419k;
        if (cVar != null) {
            cVar.a((l) fVar.f2009a);
        }
    }
}
