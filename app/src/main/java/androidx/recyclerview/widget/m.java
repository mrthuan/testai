package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.d f4485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4486b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f4487d;

    public m(h hVar, h.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4487d = hVar;
        this.f4485a = dVar;
        this.f4486b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4486b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h.d dVar = this.f4485a;
        RecyclerView.b0 b0Var = dVar.f4447b;
        h hVar = this.f4487d;
        hVar.h(b0Var);
        hVar.f4439r.remove(dVar.f4447b);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f4485a.f4447b;
        this.f4487d.getClass();
    }
}
