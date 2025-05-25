package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12990b;
    public final /* synthetic */ TabLayout.f c;

    public b(TabLayout.f fVar, View view, View view2) {
        this.c = fVar;
        this.f12989a = view;
        this.f12990b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.f12989a, this.f12990b, valueAnimator.getAnimatedFraction());
    }
}
