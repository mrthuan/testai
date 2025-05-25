package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import f2.v;
import java.util.Iterator;
import w8.w;

/* compiled from: BaseSlider.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseSlider f12919a;

    public c(BaseSlider baseSlider) {
        this.f12919a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f12919a;
        v d10 = w.d(baseSlider);
        Iterator it = baseSlider.f12890k.iterator();
        while (it.hasNext()) {
            d10.a((m9.a) it.next());
        }
    }
}
