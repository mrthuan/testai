package d9;

import android.animation.ValueAnimator;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.PreviewSeekBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16164b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f16163a = i10;
        this.f16164b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f16163a;
        Object obj = this.f16164b;
        switch (i10) {
            case 0:
                n.d dVar = (n.d) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (dVar.f22267i != animatedFraction) {
                    dVar.f22267i = animatedFraction;
                    dVar.invalidateSelf();
                    return;
                }
                return;
            case 1:
                View view = (View) obj;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(view, ea.a.p("bXZeZXc=", "pFI7TkT7"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("BHQ=", "yxmL7nIE"));
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue, ea.a.p("K3UdbBljKG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAxeQFlGWsmdCRpCC5ybDhhdA==", "U4Eq9Ihj"));
                view.setAlpha(((Float) animatedValue).floatValue());
                return;
            default:
                PreviewSeekBar previewSeekBar = (PreviewSeekBar) obj;
                int i11 = PreviewSeekBar.C;
                kotlin.jvm.internal.g.e(previewSeekBar, ea.a.p("R2gic1cw", "pJYx4aF5"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "fDuUdEDf"));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuLm5AbjFsOCA7eUFlWWtYdDZpJC4zbAdhdA==", "oYL6AmDT"));
                float floatValue = ((Float) animatedValue2).floatValue();
                previewSeekBar.f28429t = floatValue;
                int i12 = (int) (floatValue / previewSeekBar.f28424o);
                if (i12 != previewSeekBar.f28428s) {
                    previewSeekBar.f28428s = i12;
                    return;
                } else {
                    previewSeekBar.invalidate();
                    return;
                }
        }
    }
}
