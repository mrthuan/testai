package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.g;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12532a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12533b;
    public final /* synthetic */ g.f c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f12534d;

    public e(g gVar, boolean z10, d dVar) {
        this.f12534d = gVar;
        this.f12533b = z10;
        this.c = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12532a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        g gVar = this.f12534d;
        gVar.f12553r = 0;
        gVar.f12547l = null;
        if (!this.f12532a) {
            boolean z10 = this.f12533b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            gVar.f12557v.b(i10, z10);
            g.f fVar = this.c;
            if (fVar != null) {
                d dVar = (d) fVar;
                dVar.f12530a.a(dVar.f12531b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g gVar = this.f12534d;
        gVar.f12557v.b(0, this.f12533b);
        gVar.f12553r = 1;
        gVar.f12547l = animator;
        this.f12532a = false;
    }
}
