package k9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f19667a;

    public m(n nVar) {
        this.f19667a = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f19667a;
        nVar.q();
        nVar.f19681r.start();
    }
}
