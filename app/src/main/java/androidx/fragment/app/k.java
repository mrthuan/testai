package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.j;
import java.util.Objects;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f3838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3839b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f3840d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j.a f3841e;

    public k(j jVar, View view, boolean z10, SpecialEffectsController.Operation operation, j.a aVar) {
        this.f3838a = jVar;
        this.f3839b = view;
        this.c = z10;
        this.f3840d = operation;
        this.f3841e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.g.e(anim, "anim");
        ViewGroup viewGroup = this.f3838a.f3717a;
        View viewToAnimate = this.f3839b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.c;
        SpecialEffectsController.Operation operation = this.f3840d;
        if (z10) {
            SpecialEffectsController.Operation.State state = operation.f3721a;
            kotlin.jvm.internal.g.d(viewToAnimate, "viewToAnimate");
            state.applyState(viewToAnimate);
        }
        this.f3841e.a();
        if (g0.J(2)) {
            Objects.toString(operation);
        }
    }
}
