package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.f2;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.inmobi.commons.core.configs.TelemetryConfig;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: PreviewEditGuideView.kt */
/* loaded from: classes3.dex */
public final class PreviewEditGuideView extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f28275s = 0;

    /* renamed from: q  reason: collision with root package name */
    public final f2 f28276q;

    /* renamed from: r  reason: collision with root package name */
    public l0 f28277r;

    /* compiled from: PreviewEditGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l0 {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            l0 l0Var = PreviewEditGuideView.this.f28277r;
            if (l0Var != null) {
                kotlin.jvm.internal.g.b(l0Var);
                l0Var.a(v10);
            }
        }
    }

    /* compiled from: PreviewEditGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kl.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28279a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PreviewEditGuideView f28280b;
        public final /* synthetic */ Context c;

        public b(String str, PreviewEditGuideView previewEditGuideView, Context context) {
            this.f28279a = str;
            this.f28280b = previewEditGuideView;
            this.c = context;
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            if (textPaint != null) {
                String p10 = ea.a.p("TGI-", "WopZlHmL");
                String str = this.f28279a;
                float measureText = textPaint.measureText(kotlin.text.j.K(kotlin.text.j.K(str, ea.a.p("D2I-", "sSI3i1ep"), ""), ea.a.p("US8yPg==", "fHmP2lfw"), ""), 0, kotlin.text.k.V(str, p10, 0, false, 6));
                float measuredWidth = ((AppCompatTextView) this.f28280b.f28276q.f901h).getMeasuredWidth();
                float textSize = textPaint.getTextSize();
                Context context = this.c;
                textPaint.setShader(new LinearGradient(measureText, 0.0f, measuredWidth, textSize, androidx.core.content.a.getColor(context, R.color.color_100_FFBD51), androidx.core.content.a.getColor(context, R.color.color_100_FF5532), Shader.TileMode.CLAMP));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewEditGuideView(Context context) {
        this(context, null, 0, 14);
        kotlin.jvm.internal.g.e(context, ea.a.p("G286dC54dA==", "NvxTKDPH"));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.g.e(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        f2 f2Var = this.f28276q;
        if (f2Var == null) {
            return;
        }
        if (i10 == 0) {
            f2Var.f899f.j();
            postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 14), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
            scaleAnimation.setDuration(300L);
            scaleAnimation.setFillAfter(true);
            ((AppCompatTextView) f2Var.f901h).startAnimation(scaleAnimation);
            return;
        }
        f2Var.f899f.i();
    }

    public final void setOnCloseClickListener(l0 l0Var) {
        this.f28277r = l0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewEditGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "oRdNmRta"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewEditGuideView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        kotlin.jvm.internal.g.e(context, ea.a.p("VG8EdAB4dA==", "QV7jeTJP"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PreviewEditGuideView(android.content.Context r12, android.util.AttributeSet r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r15 = r15 & 4
            r0 = 0
            if (r15 == 0) goto Lb
            r14 = r0
        Lb:
            java.lang.String r15 = "UG8ldBZ4dA=="
            java.lang.String r1 = "lomhuSF4"
            java.lang.String r15 = ea.a.p(r15, r1)
            kotlin.jvm.internal.g.e(r12, r15)
            r11.<init>(r12, r13, r14, r0)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r12)
            r14 = 2131558748(0x7f0d015c, float:1.874282E38)
            r13.inflate(r14, r11)
            r13 = 2131362689(0x7f0a0381, float:1.8345166E38)
            android.view.View r6 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            if (r6 == 0) goto Lc2
            r13 = 2131362690(0x7f0a0382, float:1.8345168E38)
            android.view.View r7 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            if (r7 == 0) goto Lc2
            r13 = 2131362691(0x7f0a0383, float:1.834517E38)
            android.view.View r8 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            if (r8 == 0) goto Lc2
            r13 = 2131362692(0x7f0a0384, float:1.8345172E38)
            android.view.View r9 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            if (r9 == 0) goto Lc2
            r13 = 2131364005(0x7f0a08a5, float:1.8347835E38)
            android.view.View r14 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            androidx.appcompat.widget.AppCompatImageView r14 = (androidx.appcompat.widget.AppCompatImageView) r14
            if (r14 == 0) goto Lc2
            r13 = 2131364006(0x7f0a08a6, float:1.8347837E38)
            android.view.View r15 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            if (r15 == 0) goto Lc2
            r13 = 2131364007(0x7f0a08a7, float:1.8347839E38)
            android.view.View r1 = com.google.android.play.core.assetpacks.c.u(r11, r13)
            r10 = r1
            com.airbnb.lottie.LottieAnimationView r10 = (com.airbnb.lottie.LottieAnimationView) r10
            if (r10 == 0) goto Lc2
            am.f2 r13 = new am.f2
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = r10
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f28276q = r13
            r13 = 1
            r11.setClickable(r13)
            r11.setFocusable(r13)
            pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView$a r1 = new pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView$a
            r1.<init>()
            r14.setOnClickListener(r1)
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r1 = 2131952477(0x7f13035d, float:1.9541398E38)
            java.lang.String r1 = r12.getString(r1)
            r14[r0] = r1
            r1 = 2131952872(0x7f1304e8, float:1.95422E38)
            java.lang.String r14 = r12.getString(r1, r14)
            java.lang.String r1 = "UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpjYDHcxFyP25ULjp1HHQHcy10UXgdXzNkLXQbKQ=="
            java.lang.String r2 = "oaeV52Rl"
            java.lang.String r1 = ea.a.p(r1, r2)
            kotlin.jvm.internal.g.d(r14, r1)
            android.text.style.CharacterStyle[] r13 = new android.text.style.CharacterStyle[r13]
            pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView$b r1 = new pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView$b
            r1.<init>(r14, r11, r12)
            r13[r0] = r1
            android.text.SpannableString r13 = kl.e.b(r14, r13)
            r15.setText(r13)
            boolean r12 = pdf.pdfreader.viewer.editor.free.utils.a0.i(r12)
            if (r12 == 0) goto Lbd
            r12 = 1127481344(0x43340000, float:180.0)
            r10.setRotationY(r12)
            goto Lc1
        Lbd:
            r12 = 0
            r10.setRotationY(r12)
        Lc1:
            return
        Lc2:
            android.content.res.Resources r12 = r11.getResources()
            java.lang.String r12 = r12.getResourceName(r13)
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpBWhoSXE6IA=="
            java.lang.String r15 = "qH5LmisV"
            java.lang.String r14 = ea.a.p(r14, r15)
            java.lang.String r12 = r14.concat(r12)
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
