package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.w2;
import android.animation.Animator;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: PreviewAIGuideView.java */
/* loaded from: classes3.dex */
public final class e implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PreviewAIGuideView f28384a;

    public e(PreviewAIGuideView previewAIGuideView) {
        this.f28384a = previewAIGuideView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PreviewAIGuideView previewAIGuideView = this.f28384a;
        previewAIGuideView.f28272q.f1604d.f6018h.c.removeListener(this);
        w2 w2Var = previewAIGuideView.f28272q;
        w2Var.f1604d.k(ShapeTypes.FLOW_CHART_EXTRACT, 269);
        w2Var.f1604d.setRepeatCount(-1);
        w2Var.f1604d.j();
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
