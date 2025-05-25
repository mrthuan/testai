package v8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ExtendedFloatingActionButton.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30764a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f30765b;

    public c(a aVar) {
        this.f30765b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f30764a = true;
        this.f30765b.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f30765b;
        hVar.a();
        if (!this.f30764a) {
            hVar.e();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f30765b.onAnimationStart(animator);
        this.f30764a = false;
    }
}
