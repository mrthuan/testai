package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import android.text.SpannableString;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class m0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISelfInfoActivity f24622a;

    public m0(AISelfInfoActivity aISelfInfoActivity) {
        this.f24622a = aISelfInfoActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
        final AISelfInfoActivity aISelfInfoActivity = this.f24622a;
        aISelfInfoActivity.b2().f873d.j();
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity)) {
            String string = aISelfInfoActivity.getString(R.string.arg_res_0x7f130041, "");
            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGEvXzBlCWYMaQx0M29sZzt0XyBAIik=", "eSbAlkVs"));
            SpannableString spannableString = new SpannableString(string.concat(" "));
            spannableString.setSpan(new so.b(aISelfInfoActivity, R.drawable.ic_emoji_self_smile), spannableString.length() - 1, spannableString.length(), 33);
            aISelfInfoActivity.b2().f881l.l(null, 25L, spannableString, 0, new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$setAiInfo1$1
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
                    AISelfInfoActivity aISelfInfoActivity2 = AISelfInfoActivity.this;
                    aISelfInfoActivity2.f24414u.postDelayed(aISelfInfoActivity2.C, 500L);
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
