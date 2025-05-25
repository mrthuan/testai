package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f4463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4464b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f4465d;

    public j(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.b0 b0Var) {
        this.f4465d = hVar;
        this.f4463a = b0Var;
        this.f4464b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4464b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        h hVar = this.f4465d;
        RecyclerView.b0 b0Var = this.f4463a;
        hVar.h(b0Var);
        hVar.f4436o.remove(b0Var);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4465d.getClass();
    }
}
