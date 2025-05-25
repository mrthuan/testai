package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class a0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIExperienceActivity f24559a;

    public a0(AIExperienceActivity aIExperienceActivity) {
        this.f24559a = aIExperienceActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        AIExperienceActivity.b2(this.f24559a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }
}
