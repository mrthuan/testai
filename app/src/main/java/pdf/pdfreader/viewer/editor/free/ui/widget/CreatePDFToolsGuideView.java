package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.m2;
import am.n2;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: CreatePDFToolsGuideView.kt */
/* loaded from: classes3.dex */
public final class CreatePDFToolsGuideView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final m2 f28175q;

    /* renamed from: r  reason: collision with root package name */
    public final n2 f28176r;

    /* renamed from: s  reason: collision with root package name */
    public l0 f28177s;

    /* compiled from: CreatePDFToolsGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l0 {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            l0 l0Var = CreatePDFToolsGuideView.this.f28177s;
            if (l0Var != null) {
                l0Var.a(v10);
            }
        }
    }

    /* compiled from: CreatePDFToolsGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kl.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28180a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CreatePDFToolsGuideView f28181b;

        public c(String str, CreatePDFToolsGuideView createPDFToolsGuideView) {
            this.f28180a = str;
            this.f28181b = createPDFToolsGuideView;
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            if (textPaint != null) {
                String p10 = ea.a.p("D2I-", "1PRzaZWY");
                String str = this.f28180a;
                float measureText = textPaint.measureText(kotlin.text.j.K(kotlin.text.j.K(str, ea.a.p("c2I-", "6NfVvQUt"), ""), ea.a.p("Dy9bPg==", "kO39Plyk"), ""), 0, kotlin.text.k.V(str, p10, 0, false, 6));
                CreatePDFToolsGuideView createPDFToolsGuideView = this.f28181b;
                AppCompatTextView contextTv = createPDFToolsGuideView.getContextTv();
                if (contextTv != null) {
                    textPaint.setShader(new LinearGradient(measureText, 0.0f, contextTv.getMeasuredWidth(), textPaint.getTextSize(), androidx.core.content.a.getColor(createPDFToolsGuideView.getContext(), R.color.color_100_FFBD51), androidx.core.content.a.getColor(createPDFToolsGuideView.getContext(), R.color.color_100_FF5532), Shader.TileMode.CLAMP));
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePDFToolsGuideView(Context context) {
        this(context, null, 0, 14);
        kotlin.jvm.internal.g.e(context, ea.a.p("Om84dFR4dA==", "HIYV1oQO"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView getContextTv() {
        if (a0.i(getContext())) {
            n2 n2Var = this.f28176r;
            if (n2Var == null) {
                return null;
            }
            return n2Var.f1174d;
        }
        m2 m2Var = this.f28175q;
        if (m2Var == null) {
            return null;
        }
        return m2Var.f1102b;
    }

    private final LottieAnimationView getLottieView() {
        if (a0.i(getContext())) {
            n2 n2Var = this.f28176r;
            if (n2Var == null) {
                return null;
            }
            return n2Var.c;
        }
        m2 m2Var = this.f28175q;
        if (m2Var == null) {
            return null;
        }
        return m2Var.f1107h;
    }

    public static void r(CreatePDFToolsGuideView createPDFToolsGuideView) {
        kotlin.jvm.internal.g.e(createPDFToolsGuideView, ea.a.p("Nmgec3Mw", "brBwW8PH"));
        createPDFToolsGuideView.setVisibility(0);
        LottieAnimationView lottieView = createPDFToolsGuideView.getLottieView();
        if (lottieView != null) {
            lottieView.setFrame(0);
        }
        LottieAnimationView lottieView2 = createPDFToolsGuideView.getLottieView();
        if (lottieView2 != null) {
            lottieView2.setRepeatCount(0);
        }
        LottieAnimationView lottieView3 = createPDFToolsGuideView.getLottieView();
        if (lottieView3 != null) {
            lottieView3.j();
        }
        AppCompatTextView contextTv = createPDFToolsGuideView.getContextTv();
        if (contextTv != null) {
            contextTv.setAlpha(0.0f);
        }
        AppCompatTextView contextTv2 = createPDFToolsGuideView.getContextTv();
        if (contextTv2 != null) {
            contextTv2.post(new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(createPDFToolsGuideView, 3));
        }
    }

    public static void s(CreatePDFToolsGuideView createPDFToolsGuideView) {
        kotlin.jvm.internal.g.e(createPDFToolsGuideView, ea.a.p("O2hYc10w", "bQCcJLmg"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.92f, 1, 1.0f);
        scaleAnimation.setAnimationListener(new b());
        scaleAnimation.setDuration(500L);
        scaleAnimation.setFillAfter(true);
        AppCompatTextView contextTv = createPDFToolsGuideView.getContextTv();
        if (contextTv != null) {
            contextTv.startAnimation(scaleAnimation);
        }
    }

    public final void setOnCloseClickListener(l0 l0Var) {
        this.f28177s = l0Var;
    }

    public final void u() {
        setVisibility(8);
        LottieAnimationView lottieView = getLottieView();
        if (lottieView != null) {
            lottieView.d();
        }
        LottieAnimationView lottieView2 = getLottieView();
        if (lottieView2 != null) {
            lottieView2.setFrame(0);
        }
    }

    public final void v() {
        String string = getContext().getString(R.string.arg_res_0x7f1304e8, getContext().getString(R.string.arg_res_0x7f1300da));
        kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoOCBmIGMgr4DHYwRlN3RWXztkFV8FcAYpPiBJIHYgZCASKQ==", "MavVr8dn"));
        SpannableString b10 = kl.e.b(string, new c(string, this));
        AppCompatTextView contextTv = getContextTv();
        if (contextTv != null) {
            contextTv.setText(b10);
        }
        post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(this, 6));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePDFToolsGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "jMWcxz8D"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePDFToolsGuideView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "zokadlkD"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CreatePDFToolsGuideView(android.content.Context r17, android.util.AttributeSet r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.CreatePDFToolsGuideView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* compiled from: CreatePDFToolsGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            AppCompatTextView contextTv = CreatePDFToolsGuideView.this.getContextTv();
            if (contextTv != null) {
                contextTv.setAlpha(1.0f);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
