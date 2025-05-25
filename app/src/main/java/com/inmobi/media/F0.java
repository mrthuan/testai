package com.inmobi.media;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14242a = "F0";

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14243b = new ArrayList();
    public boolean c;

    public static E0 a(ValueAnimator valueAnimator, W6 w62) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        K7 k72 = w62.f14788d.f14850k;
        if (k72 != null) {
            J7 j72 = k72.f14397a;
            J7 j73 = k72.f14398b;
            if (j73 != null) {
                valueAnimator.setDuration(j73.a() * 1000);
            }
            if (j72 != null) {
                valueAnimator.setStartDelay(j72.a() * 1000);
            }
        }
        return new E0(valueAnimator);
    }

    public static ValueAnimator b(View view, float f10, float f11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ofFloat.addUpdateListener(new g8.a(1, layoutParams instanceof C1584c7 ? (C1584c7) layoutParams : null, view));
        return ofFloat;
    }

    public static final void b(C1584c7 c1584c7, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.g.e(view, "$view");
        kotlin.jvm.internal.g.e(valueAnimator, "valueAnimator");
        if (c1584c7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.g.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c1584c7.f14987b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c1584c7);
        view.requestLayout();
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            Iterator it = this.f14243b.iterator();
            while (it.hasNext()) {
                E0 e02 = (E0) it.next();
                Animator animator = e02.f14209a;
                kotlin.jvm.internal.g.c(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                e02.f14210b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    e02.c = true;
                }
                valueAnimator.cancel();
            }
        }
    }

    public static ValueAnimator a(View view, float f10, float f11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ofFloat.addUpdateListener(new g8.b(1, layoutParams instanceof C1584c7 ? (C1584c7) layoutParams : null, view));
        return ofFloat;
    }

    public static final void a(C1584c7 c1584c7, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.g.e(view, "$view");
        kotlin.jvm.internal.g.e(valueAnimator, "valueAnimator");
        if (c1584c7 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.g.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c1584c7.f14986a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c1584c7);
        view.requestLayout();
    }

    public final void a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E0 e02 = (E0) it.next();
            if (!e02.c) {
                Animator animator = e02.f14209a;
                kotlin.jvm.internal.g.c(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setCurrentPlayTime(e02.f14210b);
                valueAnimator.start();
            }
            if (!this.f14243b.contains(e02)) {
                this.f14243b.add(e02);
            }
        }
    }

    public final void a() {
        Iterator it = this.f14243b.iterator();
        while (it.hasNext()) {
            ((E0) it.next()).f14209a.cancel();
        }
        this.f14243b.clear();
    }
}
