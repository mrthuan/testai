package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class b0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25301a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f25302b;

    public b0(ViewGroup viewGroup, boolean z10) {
        this.f25301a = z10;
        this.f25302b = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        if (!this.f25301a) {
            this.f25302b.setVisibility(8);
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
