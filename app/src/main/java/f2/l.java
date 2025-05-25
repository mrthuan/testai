package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y.b f17060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f17061b;

    public l(k kVar, y.b bVar) {
        this.f17061b = kVar;
        this.f17060a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17060a.remove(animator);
        this.f17061b.f17047m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17061b.f17047m.add(animator);
    }
}
