package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class d extends d0 {

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f17006a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17007b = false;

        public a(View view) {
            this.f17006a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a0 a0Var = w.f17090a;
            View view = this.f17006a;
            a0Var.h0(view, 1.0f);
            if (this.f17007b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            View view = this.f17006a;
            if (f0.d.h(view) && view.getLayerType() == 0) {
                this.f17007b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        if ((i10 & (-4)) == 0) {
            this.f17009y = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // f2.d0
    public final ObjectAnimator L(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        float f10;
        Float f11;
        float f12 = 0.0f;
        if (rVar != null && (f11 = (Float) rVar.f17075a.get("android:fade:transitionAlpha")) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        if (f10 != 1.0f) {
            f12 = f10;
        }
        return N(view, f12, 1.0f);
    }

    @Override // f2.d0
    public final ObjectAnimator M(ViewGroup viewGroup, View view, r rVar) {
        float f10;
        Float f11;
        w.f17090a.getClass();
        if (rVar != null && (f11 = (Float) rVar.f17075a.get("android:fade:transitionAlpha")) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 1.0f;
        }
        return N(view, f10, 0.0f);
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        w.f17090a.h0(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f17091b, f11);
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    @Override // f2.k
    public final void h(r rVar) {
        J(rVar);
        rVar.f17075a.put("android:fade:transitionAlpha", Float.valueOf(w.f17090a.g0(rVar.f17076b)));
    }
}
