package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class k0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISelfInfoActivity f24614a;

    public k0(AISelfInfoActivity aISelfInfoActivity) {
        this.f24614a = aISelfInfoActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        AISelfInfoActivity.a2(this.f24614a);
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
