package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.animation.Animator;

/* compiled from: AIHistoryGuideView.java */
/* loaded from: classes3.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AIHistoryGuideView f24775a;

    public f(AIHistoryGuideView aIHistoryGuideView) {
        this.f24775a = aIHistoryGuideView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f24775a.f24740q.f899f.f6018h.c.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
