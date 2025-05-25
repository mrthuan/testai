package pe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import pe.a;

/* compiled from: CheckHelper.java */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.b f28934a;

    public b(a.b bVar) {
        this.f28934a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        a.this.f28930e = null;
    }
}
