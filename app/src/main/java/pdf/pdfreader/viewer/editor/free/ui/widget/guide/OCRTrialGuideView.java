package pdf.pdfreader.viewer.editor.free.ui.widget.guide;

import am.r2;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.c;
import kl.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: OCRTrialGuideView.kt */
/* loaded from: classes3.dex */
public final class OCRTrialGuideView extends BaseGuidePopView<r2> {

    /* compiled from: OCRTrialGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<String> f28392a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f28393b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ OCRTrialGuideView f28394d;

        public a(Ref$ObjectRef<String> ref$ObjectRef, int i10, String str, OCRTrialGuideView oCRTrialGuideView) {
            this.f28392a = ref$ObjectRef;
            this.f28393b = i10;
            this.c = str;
            this.f28394d = oCRTrialGuideView;
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            if (textPaint != null) {
                float measureText = textPaint.measureText(this.f28392a.element, 0, this.f28393b);
                String str = this.c;
                float measureText2 = textPaint.measureText(str, 0, str.length());
                float textSize = textPaint.getTextSize();
                OCRTrialGuideView oCRTrialGuideView = this.f28394d;
                textPaint.setShader(new LinearGradient(measureText, 0.0f, measureText2, textSize, androidx.core.content.a.getColor(oCRTrialGuideView.getContext(), R.color.color_100_FFBD51), androidx.core.content.a.getColor(oCRTrialGuideView.getContext(), R.color.color_100_FF5532), Shader.TileMode.CLAMP));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OCRTrialGuideView(Context context) {
        this(context, null, 0, 14);
        g.e(context, ea.a.p("LG9fdBx4dA==", "tNDi3NgO"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView
    public View getCloseView() {
        r2 binding = getBinding();
        if (binding != null) {
            return binding.f1419b;
        }
        return null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView
    public AppCompatTextView getContentTv() {
        r2 binding = getBinding();
        if (binding != null) {
            return binding.c;
        }
        return null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView
    public LottieAnimationView getLottieView() {
        r2 binding = getBinding();
        if (binding != null) {
            return binding.f1420d;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.CharSequence, java.lang.String] */
    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.guide.BaseGuidePopView
    public final r2 t() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_ocr_trial_guide, this);
        int i10 = R.id.bottomGuideline;
        if (((Guideline) c.u(this, R.id.bottomGuideline)) != null) {
            i10 = R.id.closeImg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) c.u(this, R.id.closeImg);
            if (appCompatImageView != null) {
                i10 = R.id.contentTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) c.u(this, R.id.contentTv);
                if (appCompatTextView != null) {
                    i10 = R.id.endGuideline;
                    if (((Guideline) c.u(this, R.id.endGuideline)) != null) {
                        i10 = R.id.ocrTrialGuideAnimView;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) c.u(this, R.id.ocrTrialGuideAnimView);
                        if (lottieAnimationView != null) {
                            i10 = R.id.startGuideline;
                            if (((Guideline) c.u(this, R.id.startGuideline)) != null) {
                                i10 = R.id.topGuideline;
                                if (((Guideline) c.u(this, R.id.topGuideline)) != null) {
                                    r2 r2Var = new r2(this, appCompatImageView, appCompatTextView, lottieAnimationView);
                                    ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mCG8DKBRvOnRWeD8pXyAWaBtzKQ==", "znwTTVuS");
                                    BillingConfigImpl.c.getClass();
                                    String valueOf = String.valueOf(BillingConfigImpl.j());
                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                    ?? string = getContext().getString(R.string.arg_res_0x7f130597, valueOf);
                                    g.d(string, ea.a.p("Om8gdD14Hy4vZRJTQHI-bl8oAC46dERploDXYTJ0K283cxFnKHQ0MWQgAHJRZRRvTW4mKQ==", "VqYNXkfJ"));
                                    ref$ObjectRef.element = string;
                                    ?? K = j.K(j.K(string, ea.a.p("c2I-", "ugAGPyvg"), ""), ea.a.p("cy9TPg==", "zuhvTDzf"), "");
                                    ref$ObjectRef.element = K;
                                    int V = k.V(K, valueOf, 0, false, 6);
                                    if (V >= 0 && V < ((String) ref$ObjectRef.element).length()) {
                                        SpannableString spannableString = new SpannableString((CharSequence) ref$ObjectRef.element);
                                        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.colorAccent)), V, valueOf.length() + V, 33);
                                        spannableString.setSpan(new a(ref$ObjectRef, V, valueOf, this), V, valueOf.length() + V, 33);
                                        appCompatTextView.setText(spannableString);
                                    }
                                    return r2Var;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpAWhVSQA6IA==", "uuDwDCaC").concat(getResources().getResourceName(i10)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OCRTrialGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        g.e(context, ea.a.p("Nm9ZdCR4dA==", "OyU7AdpW"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OCRTrialGuideView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        g.e(context, ea.a.p("LG9fdBx4dA==", "DhzMexku"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OCRTrialGuideView(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto Lb
            r5 = r0
        Lb:
            java.lang.String r6 = "LG9fdBx4dA=="
            java.lang.String r1 = "POPXMm42"
            java.lang.String r6 = ea.a.p(r6, r1)
            kotlin.jvm.internal.g.e(r3, r6)
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.guide.OCRTrialGuideView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
