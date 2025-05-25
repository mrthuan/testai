package nn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.g;

/* compiled from: SwitchAnimator.kt */
/* loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f22608a;

    public d(cg.a<tf.d> aVar) {
        this.f22608a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        g.e(animation, "animation");
        super.onAnimationEnd(animation);
        cg.a<tf.d> aVar = this.f22608a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
