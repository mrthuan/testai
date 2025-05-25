package pdf.pdfreader.viewer.editor.free.office;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class v implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f26141a;

    public v(LottieAnimationView lottieAnimationView) {
        this.f26141a = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        LottieAnimationView lottieAnimationView = this.f26141a;
        lottieAnimationView.f6018h.c.removeAllListeners();
        lottieAnimationView.k(30, ShapeTypes.MATH_EQUAL);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.j();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }
}
