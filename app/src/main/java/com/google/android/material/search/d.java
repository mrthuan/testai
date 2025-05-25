package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: SearchViewAnimationHelper.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12833a;

    public d(e eVar) {
        this.f12833a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.f12833a;
        eVar.c.setVisibility(8);
        if (!eVar.f12834a.c()) {
            eVar.f12834a.b();
        }
        eVar.f12834a.setTransitionState(SearchView.TransitionState.HIDDEN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12833a.f12834a.setTransitionState(SearchView.TransitionState.HIDING);
    }
}
