package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.g;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g.f f12536b;
    public final /* synthetic */ g c;

    public f(g gVar, boolean z10, d dVar) {
        this.c = gVar;
        this.f12535a = z10;
        this.f12536b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.c;
        gVar.f12553r = 0;
        gVar.f12547l = null;
        g.f fVar = this.f12536b;
        if (fVar != null) {
            ((d) fVar).f12530a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g gVar = this.c;
        gVar.f12557v.b(0, this.f12535a);
        gVar.f12553r = 2;
        gVar.f12547l = animator;
    }
}
