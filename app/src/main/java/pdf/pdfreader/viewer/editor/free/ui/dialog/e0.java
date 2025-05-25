package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: OperateInputPwdDialog.java */
/* loaded from: classes3.dex */
public final class e0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f27535a;

    /* compiled from: OperateInputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            e0 e0Var = e0.this;
            f0 f0Var = e0Var.f27535a;
            f0Var.J = false;
            f0Var.K = true;
            f0Var.D = SystemClock.elapsedRealtime();
            LottieAnimationView lottieAnimationView = e0Var.f27535a.A;
            if (lottieAnimationView != null) {
                lottieAnimationView.d();
            }
        }
    }

    /* compiled from: OperateInputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            e0 e0Var = e0.this;
            ViewGroup.LayoutParams layoutParams = e0Var.f27535a.f27560x.getLayoutParams();
            layoutParams.height = intValue;
            e0Var.f27535a.f27560x.setLayoutParams(layoutParams);
        }
    }

    public e0(f0 f0Var) {
        this.f27535a = f0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        f0 f0Var = this.f27535a;
        if (f0Var.isShowing() && (viewGroup = f0Var.f27561y) != null) {
            viewGroup.animate().alpha(1.0f).setDuration(500L).start();
            View s4 = f0Var.s();
            ViewParent parent = s4.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = s4.getMeasuredHeight();
                view.setLayoutParams(layoutParams);
            }
            f0Var.I = ValueAnimator.ofInt(f0Var.f27560x.getMeasuredHeight(), f0Var.f27561y.getMeasuredHeight());
            f0Var.I.addListener(new a());
            f0Var.I.addUpdateListener(new b());
            f0Var.I.setDuration(1000L);
            f0Var.I.start();
        }
    }
}
