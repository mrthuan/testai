package ao;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class g2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout.LayoutParams f5047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f5048b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout.LayoutParams f5049d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ float f5050e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ float f5051f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5052g;

    public g2(ReaderPreviewActivity readerPreviewActivity, LinearLayout.LayoutParams layoutParams, float f10, float f11, LinearLayout.LayoutParams layoutParams2, float f12, float f13) {
        this.f5052g = readerPreviewActivity;
        this.f5047a = layoutParams;
        this.f5048b = f10;
        this.c = f11;
        this.f5049d = layoutParams2;
        this.f5050e = f12;
        this.f5051f = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10 = this.c;
        float f11 = this.f5048b;
        float b10 = a0.a.b((Float) valueAnimator.getAnimatedValue(), f10 - f11, f11);
        LinearLayout.LayoutParams layoutParams = this.f5047a;
        layoutParams.weight = b10;
        ReaderPreviewActivity readerPreviewActivity = this.f5052g;
        readerPreviewActivity.J3.setLayoutParams(layoutParams);
        float f12 = this.f5051f;
        float f13 = this.f5050e;
        float b11 = a0.a.b((Float) valueAnimator.getAnimatedValue(), f12 - f13, f13);
        LinearLayout.LayoutParams layoutParams2 = this.f5049d;
        layoutParams2.weight = b11;
        readerPreviewActivity.K3.setLayoutParams(layoutParams2);
    }
}
