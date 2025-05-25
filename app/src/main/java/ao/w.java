package ao;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5143a;

    public w(ReaderPreviewActivity readerPreviewActivity) {
        this.f5143a = readerPreviewActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        super.onAnimationEnd(animator);
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5143a;
        readerPreviewActivity.K4();
        View view = readerPreviewActivity.f26214l4;
        if (view != null && (imageView = readerPreviewActivity.f26208k4) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        if (readerPreviewActivity.f26186g5 == 0) {
            readerPreviewActivity.f26186g5 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        }
        if (!readerPreviewActivity.f26289y1) {
            readerPreviewActivity.f26289y1 = true;
        }
    }
}
