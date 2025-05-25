package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f454a;

    public q(r rVar) {
        this.f454a = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        r rVar = this.f454a;
        rVar.c();
        g2.c cVar = rVar.f465k;
        if (cVar != null) {
            cVar.a((l) rVar.f2009a);
        }
    }
}
