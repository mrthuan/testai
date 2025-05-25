package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.h1;
import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;

/* compiled from: PreviewPDF2WordStateView.kt */
/* loaded from: classes3.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h1 f25612a;

    public a(h1 h1Var) {
        this.f25612a = h1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        g.e(animation, "animation");
        h1 h1Var = this.f25612a;
        h1Var.c.f6018h.c.removeAllListeners();
        LottieAnimationView lottieAnimationView = h1Var.c;
        lottieAnimationView.k(30, 230);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.j();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        g.e(animation, "animation");
    }
}
