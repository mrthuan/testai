package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.m2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.Word2PDFGuideView;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* loaded from: classes3.dex */
public class Word2PDFGuideView extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f28292s = 0;

    /* renamed from: q  reason: collision with root package name */
    public final m2 f28293q;

    /* renamed from: r  reason: collision with root package name */
    public l0 f28294r;

    public Word2PDFGuideView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        m2 m2Var = this.f28293q;
        if (m2Var == null) {
            return;
        }
        if (i10 == 0) {
            m2Var.f1107h.j();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setFillAfter(true);
            m2Var.f1102b.startAnimation(scaleAnimation);
            return;
        }
        m2Var.f1107h.i();
    }

    public void setOnCloseClickListener(l0 l0Var) {
        this.f28294r = l0Var;
    }

    public Word2PDFGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Word2PDFGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_preview_word2pdf_guide, this);
        int i11 = R.id.reflow_pop_tv_content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(this, R.id.reflow_pop_tv_content);
        if (appCompatTextView != null) {
            i11 = R.id.v_word2pdf_open_guide_line_bottom;
            View u7 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_word2pdf_open_guide_line_bottom);
            if (u7 != null) {
                i11 = R.id.v_word2pdf_open_guide_line_end;
                View u10 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_word2pdf_open_guide_line_end);
                if (u10 != null) {
                    i11 = R.id.v_word2pdf_open_guide_line_start;
                    View u11 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_word2pdf_open_guide_line_start);
                    if (u11 != null) {
                        i11 = R.id.v_word2pdf_open_guide_line_top;
                        View u12 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_word2pdf_open_guide_line_top);
                        if (u12 != null) {
                            i11 = R.id.word2pdf_guide_iv_close;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.word2pdf_guide_iv_close);
                            if (appCompatImageView != null) {
                                i11 = R.id.word2pdf_pop_lottie_view;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.word2pdf_pop_lottie_view);
                                if (lottieAnimationView != null) {
                                    this.f28293q = new m2(this, appCompatTextView, u7, u10, u11, u12, appCompatImageView, lottieAnimationView);
                                    setClickable(true);
                                    setFocusable(true);
                                    setVisibility(8);
                                    appCompatImageView.setOnClickListener(new l(this));
                                    if (a0.i(context)) {
                                        lottieAnimationView.setAnimation(R.raw.docx2pdf_preview_guide_rtl);
                                        com.google.android.play.core.assetpacks.c.V(u11, new i());
                                        com.google.android.play.core.assetpacks.c.V(u10, new j());
                                        return;
                                    }
                                    lottieAnimationView.setAnimation(R.raw.docx2pdf_preview_guide);
                                    com.google.android.play.core.assetpacks.c.V(u11, new k());
                                    com.google.android.play.core.assetpacks.c.V(u10, new cg.l() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.c0
                                        @Override // cg.l
                                        public final Object invoke(Object obj) {
                                            switch (r1) {
                                                case 0:
                                                    ((ViewGroup.LayoutParams) obj).height = -2;
                                                    return null;
                                                default:
                                                    ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
                                                    int i12 = Word2PDFGuideView.f28292s;
                                                    if (layoutParams instanceof ConstraintLayout.b) {
                                                        ((ConstraintLayout.b) layoutParams).E = 0.98f;
                                                    }
                                                    return null;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpGGgVSRI6IA==", "l5VyaZeL").concat(getResources().getResourceName(i11)));
    }
}
