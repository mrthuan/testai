package ao;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5140b;

    public v(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5140b = readerPreviewActivity;
        this.f5139a = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        ImageView imageView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i10 = (int) (this.f5139a * floatValue);
        ReaderPreviewActivity readerPreviewActivity = this.f5140b;
        View view = readerPreviewActivity.f26214l4;
        if (view != null && (imageView = readerPreviewActivity.f26208k4) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        View view2 = readerPreviewActivity.f26172e0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = i10;
            readerPreviewActivity.f26172e0.setLayoutParams(layoutParams);
        }
        if (!readerPreviewActivity.f26289y1) {
            RelativeLayout relativeLayout = readerPreviewActivity.P;
            if (relativeLayout != null) {
                readerPreviewActivity.f26195i3 = relativeLayout.getHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) readerPreviewActivity.P.getLayoutParams();
                marginLayoutParams.topMargin = -((int) (readerPreviewActivity.f26195i3 * floatValue));
                readerPreviewActivity.P.setLayoutParams(marginLayoutParams);
            }
            Point point = readerPreviewActivity.f26213l3;
            if (point != null && (viewGroup = readerPreviewActivity.f26242q3) != null) {
                viewGroup.setPadding((int) (point.x * floatValue), (int) (point.y * floatValue), 0, 0);
            }
        }
    }
}
