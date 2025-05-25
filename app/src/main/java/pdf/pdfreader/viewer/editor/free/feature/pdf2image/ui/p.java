package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.animation.Animator;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class p implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Pdf2ImageBigPicPreviewActivity f25564a;

    public p(Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity) {
        this.f25564a = pdf2ImageBigPicPreviewActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.g.e(animator, "animator");
        Pdf2ImageBigPicPreviewActivity.a aVar = Pdf2ImageBigPicPreviewActivity.f25491w0;
        Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = this.f25564a;
        pdf2ImageBigPicPreviewActivity.Z2().f1324p.setVisibility(8);
        pdf2ImageBigPicPreviewActivity.Z2().f1314f.setVisibility(8);
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
