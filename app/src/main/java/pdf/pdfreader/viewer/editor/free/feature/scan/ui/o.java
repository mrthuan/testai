package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.Animator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* compiled from: CameraActivity.kt */
/* loaded from: classes3.dex */
public final class o implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraActivity f25838a;

    public o(CameraActivity cameraActivity) {
        this.f25838a = cameraActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.g.e(p02, "p0");
        CameraActivity cameraActivity = this.f25838a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(cameraActivity)) {
            return;
        }
        cameraActivity.f25727s0 = false;
        CameraActivity.l2(cameraActivity);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        float width;
        int width2;
        kotlin.jvm.internal.g.e(p02, "p0");
        CameraActivity cameraActivity = this.f25838a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(cameraActivity)) {
            return;
        }
        int[] iArr = new int[2];
        cameraActivity.q2().f916n.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        cameraActivity.q2().f919q.getLocationInWindow(iArr2);
        if (cameraActivity.f25719k0) {
            width = ((cameraActivity.q2().f919q.getWidth() / 2) + (cameraActivity.q2().f919q.getWidth() + (iArr2[0] - iArr[0]))) - cameraActivity.q2().f915m.getWidth();
            width2 = cameraActivity.q2().f916n.getWidth();
        } else {
            width = (cameraActivity.q2().f919q.getWidth() + (iArr2[0] - iArr[0])) - cameraActivity.q2().f915m.getWidth();
            width2 = cameraActivity.q2().f916n.getWidth();
        }
        cameraActivity.f25729u0 = new ScaleAnimation(1.0f, cameraActivity.q2().f915m.getWidth() / cameraActivity.q2().f916n.getWidth(), 1.0f, cameraActivity.q2().f915m.getHeight() / cameraActivity.q2().f916n.getHeight(), 0, (width2 * 0.12f) + width, 0, (cameraActivity.q2().f916n.getHeight() * 0.12f) + ((cameraActivity.q2().f919q.getHeight() + (cameraActivity.q2().f919q.getHeight() + (iArr2[1] - iArr[1]))) - cameraActivity.q2().f915m.getHeight()));
        ScaleAnimation scaleAnimation = cameraActivity.f25729u0;
        if (scaleAnimation != null) {
            scaleAnimation.setDuration(230L);
        }
        ScaleAnimation scaleAnimation2 = cameraActivity.f25729u0;
        if (scaleAnimation2 != null) {
            scaleAnimation2.setFillBefore(true);
        }
        ScaleAnimation scaleAnimation3 = cameraActivity.f25729u0;
        if (scaleAnimation3 != null) {
            scaleAnimation3.setAnimationListener(new a(cameraActivity));
        }
        cameraActivity.q2().f916n.startAnimation(cameraActivity.f25729u0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p02) {
        kotlin.jvm.internal.g.e(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p02) {
        kotlin.jvm.internal.g.e(p02, "p0");
    }

    /* compiled from: CameraActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CameraActivity f25839a;

        public a(CameraActivity cameraActivity) {
            this.f25839a = cameraActivity;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            CameraActivity cameraActivity = this.f25839a;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(cameraActivity)) {
                return;
            }
            cameraActivity.q2().f916n.setVisibility(8);
            cameraActivity.q2().f917o.setVisibility(8);
            cameraActivity.f25727s0 = false;
            CameraActivity.l2(cameraActivity);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
