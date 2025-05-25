package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.animation.Animator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class c0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25305a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f25306b;

    public c0(ConstraintLayout constraintLayout, boolean z10) {
        this.f25305a = z10;
        this.f25306b = constraintLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        if (!this.f25305a) {
            this.f25306b.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }
}
