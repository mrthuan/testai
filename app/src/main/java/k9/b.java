package k9;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19643a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19644b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f19643a = i10;
        this.f19644b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f19643a;
        Object obj = this.f19644b;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                gVar.getClass();
                gVar.f19684d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                n nVar = (n) obj;
                nVar.getClass();
                nVar.f19684d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.c cVar = (pdf.pdfreader.viewer.editor.free.feature.billing.dialog.c) obj;
                int i11 = pdf.pdfreader.viewer.editor.free.feature.billing.dialog.c.f24875j;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("O2hYc10w", "88uJRFb4"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "CXddp4yg"));
                if (cVar.isShowing() && valueAnimator.getAnimatedValue() != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("CHUkbFNjC24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiASeThlU2sFdCRpCC5ybDhhdA==", "7efHsj7p"));
                    float floatValue = ((Float) animatedValue).floatValue();
                    cVar.p().c.setAlpha(1.0f - floatValue);
                    cVar.p().f1097b.setAlpha(floatValue);
                    return;
                }
                return;
            case 3:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "bPOxaEaT"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "s6ZDsrWt"));
                if (!imageAdjustActivity.isFinishing()) {
                    ViewPager2 viewPager2 = imageAdjustActivity.y2().f695z;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue2, ea.a.p("DHUYbBdjDW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAWeQRlF2sDdCRpCC5ybDhhdA==", "x4bt7l9g"));
                    viewPager2.c(((Float) animatedValue2).floatValue());
                    return;
                }
                return;
            default:
                View view = (View) obj;
                if (view != null && view.getParent() != null) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
