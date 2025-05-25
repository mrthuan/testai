package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f12061a;

    /* renamed from: b  reason: collision with root package name */
    public int f12062b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f12063d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f12064e;

    /* renamed from: f  reason: collision with root package name */
    public int f12065f;

    /* renamed from: g  reason: collision with root package name */
    public int f12066g;

    /* renamed from: h  reason: collision with root package name */
    public int f12067h;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f12068i;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f12068i = null;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f12061a = new LinkedHashSet<>();
        this.f12065f = 0;
        this.f12066g = 2;
        this.f12067h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f12065f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f12062b = x8.a.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.c = x8.a.c(v10.getContext(), R.attr.motionDurationMedium4, ShapeTypes.FUNNEL);
        this.f12063d = x8.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.f17143d);
        this.f12064e = x8.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.c);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet<b> linkedHashSet = this.f12061a;
        boolean z10 = false;
        if (i10 > 0) {
            if (this.f12066g == 1) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f12068i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f12066g = 1;
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                s(view, this.f12065f + this.f12067h, this.c, this.f12064e);
            }
        } else if (i10 < 0) {
            if (this.f12066g == 2) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f12068i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f12066g = 2;
                Iterator<b> it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                s(view, 0, this.f12062b, this.f12063d);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void s(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f12068i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12061a = new LinkedHashSet<>();
        this.f12065f = 0;
        this.f12066g = 2;
        this.f12067h = 0;
    }
}
