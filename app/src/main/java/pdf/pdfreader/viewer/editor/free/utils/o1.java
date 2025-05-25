package pdf.pdfreader.viewer.editor.free.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ValueAnimatorUtils.java */
/* loaded from: classes3.dex */
public final class o1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28738a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f28739b;
    public final /* synthetic */ int c;

    public o1(ViewGroup viewGroup, int i10) {
        this.f28739b = viewGroup;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f28738a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        if (this.f28738a && (view = this.f28739b) != null && view.getParent() != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = this.c;
            view.setLayoutParams(layoutParams);
        }
    }
}
