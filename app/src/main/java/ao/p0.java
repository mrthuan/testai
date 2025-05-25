package ao;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5119a;

    public p0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5119a = readerPreviewActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ReaderPreviewActivity readerPreviewActivity = this.f5119a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity)) {
            return;
        }
        View view = readerPreviewActivity.A0;
        if (view != null) {
            view.setVisibility(4);
        }
        ConstraintLayout constraintLayout = readerPreviewActivity.f26295z0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        View view2 = readerPreviewActivity.E3;
        if (view2 != null) {
            view2.setBackgroundColor(androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorEditDivider));
        }
        View view3 = readerPreviewActivity.E0;
        if (view3 != null) {
            view3.setVisibility(4);
        }
    }
}
