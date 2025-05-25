package ao;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5133b;

    public t(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5133b = readerPreviewActivity;
        this.f5132a = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageView imageView;
        ReaderPreviewActivity readerPreviewActivity = this.f5133b;
        View view = readerPreviewActivity.f26214l4;
        if (view != null && (imageView = readerPreviewActivity.f26208k4) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f5132a);
        View view2 = readerPreviewActivity.f26172e0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = floatValue;
            readerPreviewActivity.f26172e0.setLayoutParams(layoutParams);
        }
    }
}
