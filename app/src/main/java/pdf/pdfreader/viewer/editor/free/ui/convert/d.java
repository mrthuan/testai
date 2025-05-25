package pdf.pdfreader.viewer.editor.free.ui.convert;

import android.animation.Animator;
import kotlin.jvm.internal.g;

/* compiled from: Animator.kt */
/* loaded from: classes3.dex */
public final class d implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderImgPreviewActivity f27417a;

    public d(ReaderImgPreviewActivity readerImgPreviewActivity) {
        this.f27417a = readerImgPreviewActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        g.e(animator, "animator");
        ReaderImgPreviewActivity readerImgPreviewActivity = this.f27417a;
        readerImgPreviewActivity.f27404a0 = false;
        readerImgPreviewActivity.f27405b0 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g.e(animator, "animator");
        ReaderImgPreviewActivity readerImgPreviewActivity = this.f27417a;
        readerImgPreviewActivity.f27404a0 = false;
        readerImgPreviewActivity.f27405b0 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        g.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g.e(animator, "animator");
    }
}
