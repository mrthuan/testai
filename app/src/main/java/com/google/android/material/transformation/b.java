package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.c f13150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f13151b;

    public b(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
        this.f13150a = cVar;
        this.f13151b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f13150a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f13150a.setCircularRevealOverlayDrawable(this.f13151b);
    }
}
