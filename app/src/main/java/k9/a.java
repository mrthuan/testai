package k9;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.x;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19642b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f19641a = i10;
        this.f19642b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f19641a;
        float f10 = 0.0f;
        Float f11 = null;
        Object obj = this.f19642b;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = gVar.f19684d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
            case 1:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) obj;
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("R2gic1cw", "SBc5pcnz"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("Um4ibRJ0C29u", "3lZCz8FS"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("WHU4bG9jO24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBCeSRlb2s1dCRpCC5ybDhhdA==", "FI6TOZqp"));
                    if (((Float) animatedValue).floatValue() > 0.0f && aIExperienceActivity.d2().f739r.getVisibility() != 0) {
                        aIExperienceActivity.d2().f739r.setVisibility(0);
                        aIExperienceActivity.d2().f739r.post(new x(aIExperienceActivity, 1));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(view, ea.a.p("VXYKZXc=", "Nzqc32IY"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("C24NbRh0DG9u", "YqjdyeJx"));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuVm5hbhRsVSBHeTtlU2sNdB5pWi4gbnQ=", "9La9SIfP"));
                int intValue = ((Integer) animatedValue2).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = intValue;
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuK25DbiZsVCBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHIrdR4uH2FBb0Z0G2EBYQ9z", "DnS8sgY1"));
            case 3:
                CameraActivity cameraActivity = (CameraActivity) obj;
                int i11 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "rmxvI4Ft"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("Lm5YbRh0Xm9u", "2dwgbFyl"));
                LinearLayout linearLayout = cameraActivity.q2().C;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4fb0ZlJWEvbzF0cWgvbGQ=", "H4gJ5hmm"));
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(cameraActivity)) {
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        if (animatedValue3 instanceof Float) {
                            f11 = (Float) animatedValue3;
                        }
                        if (f11 != null) {
                            f10 = f11.floatValue();
                        }
                        layoutParams3.height = (int) ((f10 * (cameraActivity.q2().B.getMeasuredHeight() - cameraActivity.q2().C.getMeasuredHeight())) + cameraActivity.q2().C.getMeasuredHeight());
                        linearLayout.setLayoutParams(layoutParams3);
                        return;
                    }
                    return;
                }
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuW25ZbhtsPyBHeTtlU2EMZABvXWRHdz9kI2VGLgppLWVVcjhhF28mdB1MKnkcdRZQE3JVbXM=", "4tnSrnFX"));
            case 4:
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = (ReaderImg2PDFChooseActivity) obj;
                ReaderImg2PDFChooseActivity.a aVar3 = ReaderImg2PDFChooseActivity.M0;
                kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("NmgYc2sw", "NzBqOHsi"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "zWb6tdvs"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerImg2PDFChooseActivity)) {
                    Object animatedValue4 = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue4, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJG5Gbj5sPSBHeTtlU2sNdB5pWi4gbnQ=", "KkKQ7iB5"));
                    int intValue2 = ((Integer) animatedValue4).intValue();
                    LinearLayout linearLayout2 = readerImg2PDFChooseActivity.f27343b0;
                    if (linearLayout2 != null) {
                        ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
                        if (layoutParams4 != null) {
                            layoutParams4.height = intValue2;
                            linearLayout2.setLayoutParams(layoutParams4);
                            return;
                        }
                        throw new NullPointerException(ea.a.p("NnVVbEJjEG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAseUllQmEfZDpvD2Qadj5lTy4EaSx3cXIbdQEuHWE7by10aWEQYRxz", "GzX9bqF2"));
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "JIAs8VEz"));
                    throw null;
                }
                return;
            default:
                ReaderImgPreviewActivity readerImgPreviewActivity = (ReaderImgPreviewActivity) obj;
                String str = ReaderImgPreviewActivity.f27400d0;
                kotlin.jvm.internal.g.e(readerImgPreviewActivity, ea.a.p("PGgHc3ww", "kmHnXsKp"));
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("PnQ=", "7NWTF7gw"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerImgPreviewActivity)) {
                    Object animatedValue5 = valueAnimator.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue5, ea.a.p("InVbbFVjL24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA4eUdlVWshdCRpCC59bnQ=", "fxL7uNED"));
                    int intValue3 = ((Integer) animatedValue5).intValue();
                    LinearLayout linearLayout3 = readerImgPreviewActivity.P;
                    if (linearLayout3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = linearLayout3.getLayoutParams();
                        if (layoutParams5 != null) {
                            layoutParams5.height = intValue3;
                            linearLayout3.setLayoutParams(layoutParams5);
                            return;
                        }
                        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJG59bhZsKyBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHIkdSAuL2E-b0Z0G2EBYQ9z", "KPcGw8ZS"));
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "XeWIDZeb"));
                    throw null;
                }
                return;
        }
    }
}
