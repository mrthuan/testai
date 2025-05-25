package ao;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5136a;

    public u(ReaderPreviewActivity readerPreviewActivity) {
        this.f5136a = readerPreviewActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        super.onAnimationEnd(animator);
        ReaderPreviewActivity readerPreviewActivity = this.f5136a;
        View view = readerPreviewActivity.f26214l4;
        if (view != null && (imageView = readerPreviewActivity.f26208k4) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        readerPreviewActivity.K4();
        if (readerPreviewActivity.f26186g5 == 0) {
            readerPreviewActivity.f26186g5 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        }
    }
}
