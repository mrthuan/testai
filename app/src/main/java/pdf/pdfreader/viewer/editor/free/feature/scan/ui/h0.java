package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f25814a;

    public h0(LottieAnimationView lottieAnimationView) {
        this.f25814a = lottieAnimationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        LottieAnimationView lottieAnimationView = this.f25814a;
        lottieAnimationView.f6018h.c.removeListener(this);
        lottieAnimationView.setMinFrame(105);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.j();
    }
}
