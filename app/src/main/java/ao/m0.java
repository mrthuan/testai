package ao;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class m0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5106a;

    public m0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5106a = readerPreviewActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue;
        ReaderPreviewActivity readerPreviewActivity = this.f5106a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity) && (animatedValue = valueAnimator.getAnimatedValue(ea.a.p("UG8nbwFGEGERdF1vbg==", "BW8PB5Oe"))) != null && readerPreviewActivity.C0 != null) {
            readerPreviewActivity.C0.setImageTintList(ColorStateList.valueOf(((Integer) new ArgbEvaluator().evaluate(((Float) animatedValue).floatValue(), Integer.valueOf(androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorSurface)), Integer.valueOf(androidx.core.content.a.getColor(readerPreviewActivity, R.color.color_100_DD202A)))).intValue()));
        }
    }
}
