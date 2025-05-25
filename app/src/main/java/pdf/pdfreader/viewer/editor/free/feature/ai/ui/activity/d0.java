package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class d0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIExperienceActivity f24572a;

    public d0(AIExperienceActivity aIExperienceActivity) {
        this.f24572a = aIExperienceActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String c22;
        kotlin.jvm.internal.g.e(animator, "animator");
        final AIExperienceActivity aIExperienceActivity = this.f24572a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
            String str = aIExperienceActivity.E;
            if (kotlin.jvm.internal.g.a(str, aIExperienceActivity.getString(R.string.arg_res_0x7f13001d))) {
                c22 = aIExperienceActivity.c2();
            } else if (kotlin.jvm.internal.g.a(str, aIExperienceActivity.getString(R.string.arg_res_0x7f130186))) {
                c22 = aIExperienceActivity.e2();
            } else if (kotlin.jvm.internal.g.a(str, aIExperienceActivity.getString(R.string.arg_res_0x7f1304a3))) {
                c22 = aIExperienceActivity.f2();
            } else if (kotlin.jvm.internal.g.a(str, aIExperienceActivity.getString(R.string.arg_res_0x7f13018c))) {
                c22 = aIExperienceActivity.g2();
            } else {
                c22 = aIExperienceActivity.c2();
            }
            aIExperienceActivity.d2().f738q.m(c22, -1L, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$startAnswerContentAnim$2$1
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                    invoke(charSequence, bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(CharSequence text, boolean z10) {
                    kotlin.jvm.internal.g.e(text, "text");
                    AIExperienceActivity.a2(AIExperienceActivity.this);
                }
            });
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
