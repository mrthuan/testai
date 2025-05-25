package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchView;

/* compiled from: SearchViewAnimationHelper.java */
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12830a;

    public a(e eVar) {
        this.f12830a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.f12830a;
        if (!eVar.f12834a.c()) {
            eVar.f12834a.d();
        }
        eVar.f12834a.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        e eVar = this.f12830a;
        eVar.c.setVisibility(0);
        SearchBar searchBar = eVar.f12845m;
        searchBar.f12790a0.getClass();
        View centerView = searchBar.getCenterView();
        if (centerView instanceof f8.a) {
            ((f8.a) centerView).a();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
