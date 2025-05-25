package ao;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5111a;

    public n0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5111a = readerPreviewActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatImageView appCompatImageView;
        super.onAnimationEnd(animator);
        ReaderPreviewActivity readerPreviewActivity = this.f5111a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity) && (appCompatImageView = readerPreviewActivity.D0) != null) {
            appCompatImageView.setVisibility(4);
        }
    }
}
