package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: SearchViewAnimationHelper.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12832a;

    public c(e eVar) {
        this.f12832a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.f12832a;
        if (!eVar.f12834a.c()) {
            eVar.f12834a.d();
        }
        eVar.f12834a.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        e eVar = this.f12832a;
        eVar.c.setVisibility(0);
        eVar.f12834a.setTransitionState(SearchView.TransitionState.SHOWING);
    }
}
