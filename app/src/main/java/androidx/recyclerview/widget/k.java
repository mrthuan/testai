package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f4472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4473b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4474d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4475e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f4476f;

    public k(h hVar, RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4476f = hVar;
        this.f4472a = b0Var;
        this.f4473b = i10;
        this.c = view;
        this.f4474d = i11;
        this.f4475e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f4473b;
        View view = this.c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4474d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4475e.setListener(null);
        h hVar = this.f4476f;
        RecyclerView.b0 b0Var = this.f4472a;
        hVar.h(b0Var);
        hVar.f4437p.remove(b0Var);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4476f.getClass();
    }
}
