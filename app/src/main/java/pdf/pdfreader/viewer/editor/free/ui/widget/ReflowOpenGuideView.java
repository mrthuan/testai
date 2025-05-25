package pdf.pdfreader.viewer.editor.free.ui.widget;

import am.y2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* loaded from: classes3.dex */
public class ReflowOpenGuideView extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final y2 f28282q;

    /* renamed from: r  reason: collision with root package name */
    public a f28283r;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    public ReflowOpenGuideView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        y2 y2Var = this.f28282q;
        if (y2Var == null) {
            return;
        }
        if (i10 == 0) {
            y2Var.c.j();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.15f, 1, 0.0f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setFillAfter(true);
            y2Var.f1676d.startAnimation(scaleAnimation);
            return;
        }
        y2Var.c.i();
    }

    public final void r(View view) {
        AppCompatImageView appCompatImageView = this.f28282q.f1675b;
        if (view != null && appCompatImageView != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
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

    public void setOnReflowClickListener(a aVar) {
        this.f28283r = aVar;
    }

    public ReflowOpenGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReflowOpenGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_preview_open_reflow_guide, this);
        int i11 = R.id.iv_open_reflow_faker;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.iv_open_reflow_faker);
        if (appCompatImageView != null) {
            i11 = R.id.reflow_pop_iv_close;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.reflow_pop_iv_close);
            if (appCompatImageView2 != null) {
                i11 = R.id.reflow_pop_lottie_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.reflow_pop_lottie_view);
                if (lottieAnimationView != null) {
                    i11 = R.id.reflow_pop_tv_content;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.reflow_pop_tv_content);
                    if (textView != null) {
                        i11 = R.id.v_gift_flg;
                        View u7 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_gift_flg);
                        if (u7 != null) {
                            i11 = R.id.v_reflow_open_guide_line_bottom;
                            View u10 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_reflow_open_guide_line_bottom);
                            if (u10 != null) {
                                i11 = R.id.v_reflow_open_guide_line_end;
                                View u11 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_reflow_open_guide_line_end);
                                if (u11 != null) {
                                    i11 = R.id.v_reflow_open_guide_line_start;
                                    View u12 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_reflow_open_guide_line_start);
                                    if (u12 != null) {
                                        i11 = R.id.v_reflow_open_guide_line_top;
                                        View u13 = com.google.android.play.core.assetpacks.c.u(this, R.id.v_reflow_open_guide_line_top);
                                        if (u13 != null) {
                                            this.f28282q = new y2(this, u7, u10, u11, u12, u13, textView, appCompatImageView, appCompatImageView2, lottieAnimationView);
                                            setClickable(true);
                                            setFocusable(true);
                                            setVisibility(8);
                                            appCompatImageView2.setOnClickListener(new f(this));
                                            appCompatImageView.setOnClickListener(new g(this));
                                            if (a0.i(context)) {
                                                lottieAnimationView.setAnimation(R.raw.reflow_guide_rtl);
                                                return;
                                            } else {
                                                lottieAnimationView.setAnimation(R.raw.reflow_guide);
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
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpOGhJSS86IA==", "KsJRLikE").concat(getResources().getResourceName(i11)));
    }
}
