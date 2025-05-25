package pdf.pdfreader.viewer.editor.free.office;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f26125b;
    public final /* synthetic */ jl.a c;

    public /* synthetic */ n(jl.a aVar, int i10, int i11) {
        this.f26124a = i11;
        this.c = aVar;
        this.f26125b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        int i10 = this.f26124a;
        int i11 = this.f26125b;
        jl.a aVar = this.c;
        switch (i10) {
            case 0:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) aVar;
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "jUCmZsnI"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("Lm5YbRh0Xm9u", "R6w8WM4V"));
                ImageView imageView = officeReaderActivity.K1;
                if (imageView != null && (view = officeReaderActivity.L1) != null) {
                    view.setTranslationX(imageView.getTranslationX());
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuBW5abidsBSA7eUFlWWtYdDZpJC4zbAdhdA==", "mhT3jwRi"));
                float floatValue = ((Float) animatedValue).floatValue();
                View view2 = officeReaderActivity.f25947n0;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = (int) (floatValue * i11);
                    view2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            default:
                LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) aVar;
                int i12 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("O2hYc10w", "ZETu8Y2c"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "mTnouf6X"));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5hbhFsHCA7eUFlWWtYdDZpJC4zbAdhdA==", "GszunLdp"));
                languageChooseActivity.b2().f943e.setTranslationY(i11 * ((Float) animatedValue2).floatValue());
                return;
        }
    }
}
