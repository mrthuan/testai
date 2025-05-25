package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25563b;
    public final /* synthetic */ jl.a c;

    public /* synthetic */ o(jl.a aVar, int i10, int i11) {
        this.f25562a = i11;
        this.c = aVar;
        this.f25563b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        View view;
        int i10 = this.f25562a;
        int i11 = this.f25563b;
        jl.a aVar = this.c;
        switch (i10) {
            case 0:
                Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = (Pdf2ImageBigPicPreviewActivity) aVar;
                Pdf2ImageBigPicPreviewActivity.a aVar2 = Pdf2ImageBigPicPreviewActivity.f25491w0;
                kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, ea.a.p("R2gic1cw", "3kLt6u95"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("GG4hbVV0WG9u", "IeyH4133"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pdf2ImageBigPicPreviewActivity)) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuJG5qbiBsGiA7eUFlWWtYdDZpJC4zbAdhdA==", "tG1vKGUv"));
                    float floatValue = ((Float) animatedValue).floatValue();
                    ConstraintLayout constraintLayout = pdf2ImageBigPicPreviewActivity.Z2().f1324p;
                    kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4saS93N28cdFptKWEpbAByeQ==", "t8YYh6D8"));
                    ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                    if (layoutParams2 != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
                        ((ViewGroup.MarginLayoutParams) bVar).height = (int) (i11 * floatValue);
                        constraintLayout.setLayoutParams(bVar);
                        return;
                    }
                    throw new NullPointerException(ea.a.p("JnU7bFpjV24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA8eSdlWmFYZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdyFkMGUOLnVvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyKW1z", "LDHWz6gd"));
                }
                return;
            default:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) aVar;
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "5yYW7P1U"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("EG5abSd0O29u", "f7q3FR1i"));
                ImageView imageView = officeReaderActivity.K1;
                if (imageView != null && (view = officeReaderActivity.L1) != null) {
                    view.setTranslationX(imageView.getTranslationX());
                }
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWG5GbgVsBSBHeTtlU2sNdB5pWi4vbDlhdA==", "7kpiXbrS"));
                int floatValue2 = (int) (((Float) animatedValue2).floatValue() * i11);
                View view2 = officeReaderActivity.f25947n0;
                if (view2 != null) {
                    layoutParams = view2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.height = floatValue2;
                }
                View view3 = officeReaderActivity.f25947n0;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams);
                    return;
                }
                return;
        }
    }
}
