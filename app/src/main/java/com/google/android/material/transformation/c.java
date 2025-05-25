package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.c f13152a;

    public c(com.google.android.material.circularreveal.c cVar) {
        this.f13152a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.circularreveal.c cVar = this.f13152a;
        c.d revealInfo = cVar.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        cVar.setRevealInfo(revealInfo);
    }
}
