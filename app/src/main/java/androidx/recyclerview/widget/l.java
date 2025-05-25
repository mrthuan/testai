package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.d f4482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4483b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f4484d;

    public l(h hVar, h.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4484d = hVar;
        this.f4482a = dVar;
        this.f4483b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4483b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h.d dVar = this.f4482a;
        RecyclerView.b0 b0Var = dVar.f4446a;
        h hVar = this.f4484d;
        hVar.h(b0Var);
        hVar.f4439r.remove(dVar.f4446a);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f4482a.f4446a;
        this.f4484d.getClass();
    }
}
