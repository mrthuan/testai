package pdf.pdfreader.viewer.editor.free.ui.widget.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m1.c;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: e  reason: collision with root package name */
    public static final m1.a f28376e = new m1.a();

    /* renamed from: f  reason: collision with root package name */
    public static final c f28377f = new c();

    /* renamed from: a  reason: collision with root package name */
    public int f28378a;

    /* renamed from: b  reason: collision with root package name */
    public int f28379b;
    public ViewPropertyAnimator c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28380d;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f28378a = 0;
        this.f28379b = 2;
        this.f28380d = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f28378a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 > 0) {
            t(view);
        } else if (i10 < 0) {
            u(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void s(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.c = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public final void t(V v10) {
        if (this.f28379b != 1 && this.f28380d) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f28379b = 1;
            s(v10, this.f28378a + 0, 175L, f28376e);
        }
    }

    public final void u(V v10) {
        if (this.f28379b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f28379b = 2;
        s(v10, 0, 225L, f28377f);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28378a = 0;
        this.f28379b = 2;
        this.f28380d = true;
    }
}
