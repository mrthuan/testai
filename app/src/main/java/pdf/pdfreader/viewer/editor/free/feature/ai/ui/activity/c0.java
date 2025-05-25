package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class c0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIExperienceActivity f24569a;

    public c0(AIExperienceActivity aIExperienceActivity) {
        this.f24569a = aIExperienceActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        AIExperienceActivity aIExperienceActivity = this.f24569a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
            AIExperienceActivity.a aVar = AIExperienceActivity.L;
            aIExperienceActivity.d2().f734m.j();
            aIExperienceActivity.f24390u.postDelayed(aIExperienceActivity.H, 1800L);
        }
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
