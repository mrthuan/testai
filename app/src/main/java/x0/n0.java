package x0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f31469a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public n0(View view) {
        this.f31469a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f31469a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f31469a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f31469a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(o0 o0Var) {
        View view = this.f31469a.get();
        if (view != null) {
            if (o0Var != null) {
                view.animate().setListener(new m0(o0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f31469a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
