package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.w2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* loaded from: classes3.dex */
public class PreviewAIGuideView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final w2 f28272q;

    /* renamed from: r  reason: collision with root package name */
    public a f28273r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f28274s;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    public PreviewAIGuideView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28274s = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28272q.f1604d.d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        w2 w2Var = this.f28272q;
        if (w2Var == null) {
            return;
        }
        if (i10 == 0) {
            if (this.f28274s) {
                w2Var.f1604d.k(ShapeTypes.FLOW_CHART_EXTRACT, 269);
                w2Var.f1604d.setRepeatCount(-1);
                w2Var.f1604d.j();
                return;
            }
            this.f28274s = true;
            w2Var.f1604d.j();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.15f, 1, 0.0f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setFillAfter(true);
            w2Var.f1603b.startAnimation(scaleAnimation);
            return;
        }
        w2Var.f1604d.i();
    }

    public final void r(ImageView imageView) {
        AppCompatImageView appCompatImageView = this.f28272q.c;
        if (imageView != null && appCompatImageView != null) {
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            int[] iArr2 = new int[2];
            ((ViewGroup) appCompatImageView.getParent()).getLocationOnScreen(iArr2);
            int i10 = iArr[1] - iArr2[1];
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
            marginLayoutParams.width = width;
            marginLayoutParams.height = height;
            marginLayoutParams.leftMargin = iArr[0] - iArr2[0];
            marginLayoutParams.topMargin = i10;
            appCompatImageView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnAIAssistantClickListener(a aVar) {
        this.f28273r = aVar;
    }

    public PreviewAIGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewAIGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.f28274s = false;
        LayoutInflater.from(context).inflate(R.layout.layout_preview_ai_guide, this);
        int i11 = R.id.ai_pop_iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_pop_iv_close);
        if (appCompatImageView != null) {
            i11 = R.id.ai_pop_tv_content;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_pop_tv_content);
            if (textView != null) {
                i11 = R.id.iv_ai_faker;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.iv_ai_faker);
                if (appCompatImageView2 != null) {
                    i11 = R.id.reflow_pop_lottie_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.reflow_pop_lottie_view);
                    if (lottieAnimationView != null) {
                        i11 = R.id.v_ai_guide_line_bottom;
                        View u7 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_bottom);
                        if (u7 != null) {
                            i11 = R.id.v_ai_guide_line_end;
                            View u10 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_end);
                            if (u10 != null) {
                                i11 = R.id.v_ai_guide_line_start;
                                View u11 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_start);
                                if (u11 != null) {
                                    i11 = R.id.v_ai_guide_line_top;
                                    View u12 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_ai_guide_line_top);
                                    if (u12 != null) {
                                        i11 = R.id.v_gift_flg;
                                        View u13 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_gift_flg);
                                        if (u13 != null) {
                                            this.f28272q = new w2(this, u7, u10, u11, u12, u13, textView, appCompatImageView, appCompatImageView2, lottieAnimationView);
                                            setClickable(true);
                                            setFocusable(true);
                                            setVisibility(8);
                                            if (a0.i(context)) {
                                                lottieAnimationView.setRotationY(180.0f);
                                            } else {
                                                lottieAnimationView.setRotationY(0.0f);
                                            }
                                            appCompatImageView.setOnClickListener(new c(this));
                                            appCompatImageView2.setOnClickListener(new d(this));
                                            lottieAnimationView.c(new e(this));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpLWh4STA6IA==", "FVBzYXtr").concat(getResources().getResourceName(i11)));
    }
}
