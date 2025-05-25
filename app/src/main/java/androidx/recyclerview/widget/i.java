package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f4456a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4457b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f4458d;

    public i(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.b0 b0Var) {
        this.f4458d = hVar;
        this.f4456a = b0Var;
        this.f4457b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4457b.setListener(null);
        this.c.setAlpha(1.0f);
        h hVar = this.f4458d;
        RecyclerView.b0 b0Var = this.f4456a;
        hVar.h(b0Var);
        hVar.f4438q.remove(b0Var);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4458d.getClass();
    }
}
