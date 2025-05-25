package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PdfShowPwdDialog.java */
/* loaded from: classes3.dex */
public final class h2 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f27616a;

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h2 h2Var = h2.this;
            g2 g2Var = h2Var.f27616a;
            g2Var.L = false;
            g2Var.M = true;
            g2Var.I = SystemClock.elapsedRealtime();
            LottieAnimationView lottieAnimationView = h2Var.f27616a.E;
            if (lottieAnimationView != null) {
                lottieAnimationView.d();
            }
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            h2 h2Var = h2.this;
            ViewGroup.LayoutParams layoutParams = h2Var.f27616a.B.getLayoutParams();
            layoutParams.height = intValue;
            h2Var.f27616a.B.setLayoutParams(layoutParams);
        }
    }

    public h2(g2 g2Var) {
        this.f27616a = g2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        g2 g2Var = this.f27616a;
        if (g2Var.isShowing() && (viewGroup = g2Var.C) != null) {
            viewGroup.animate().alpha(1.0f).setDuration(500L).start();
            View s4 = g2Var.s();
            ViewParent parent = s4.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = s4.getMeasuredHeight();
                view.setLayoutParams(layoutParams);
            }
            g2Var.K = ValueAnimator.ofInt(g2Var.B.getMeasuredHeight(), g2Var.C.getMeasuredHeight());
            g2Var.K.addListener(new a());
            g2Var.K.addUpdateListener(new b());
            g2Var.K.setDuration(1000L);
            g2Var.K.start();
        }
    }
}
