package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class t implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Pdf2ImagePicPreviewActivity f25571a;

    public t(Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity) {
        this.f25571a = pdf2ImagePicPreviewActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        int i10 = Pdf2ImagePicPreviewActivity.I0;
        this.f25571a.b3().f1119e.setVisibility(8);
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
