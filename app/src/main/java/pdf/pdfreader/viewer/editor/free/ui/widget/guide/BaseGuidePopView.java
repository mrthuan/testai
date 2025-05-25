package pdf.pdfreader.viewer.editor.free.ui.widget.guide;

import am.r2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import i2.a;
import kl.h;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.j;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: BaseGuidePopView.kt */
/* loaded from: classes3.dex */
public abstract class BaseGuidePopView<VB extends i2.a> extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f28387t = 0;

    /* renamed from: q  reason: collision with root package name */
    public VB f28388q;

    /* renamed from: r  reason: collision with root package name */
    public l0 f28389r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f28390s;

    /* compiled from: BaseGuidePopView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BaseGuidePopView<VB> f28391b;

        public a(OCRTrialGuideView oCRTrialGuideView) {
            this.f28391b = oCRTrialGuideView;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            g.e(v10, "v");
            BaseGuidePopView<VB> baseGuidePopView = this.f28391b;
            l0 onPopClosedListener = baseGuidePopView.getOnPopClosedListener();
            if (onPopClosedListener != null) {
                onPopClosedListener.a(v10);
            }
            baseGuidePopView.r();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseGuidePopView(Context context) {
        this(context, null, 0, 14, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "8K2MVwOQ"));
    }

    public final VB getBinding() {
        return this.f28388q;
    }

    public abstract View getCloseView();

    public abstract AppCompatTextView getContentTv();

    public final boolean getHasInflate() {
        if (this.f28388q != null) {
            return true;
        }
        return false;
    }

    public abstract LottieAnimationView getLottieView();

    public final l0 getOnPopClosedListener() {
        return this.f28389r;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View b10;
        super.onMeasure(i10, i11);
        VB vb2 = this.f28388q;
        if (vb2 != null && (b10 = vb2.b()) != null && b10.getMeasuredWidth() > 0 && b10.getMeasuredHeight() > 0 && !this.f28390s) {
            this.f28390s = true;
            LottieAnimationView lottieView = getLottieView();
            if (lottieView != null) {
                lottieView.setFrame(0);
                lottieView.setRepeatCount(0);
                lottieView.j();
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.92f, 1, 1.0f);
            scaleAnimation.setAnimationListener(new vo.a(this));
            scaleAnimation.setDuration(500L);
            scaleAnimation.setFillAfter(true);
            AppCompatTextView contentTv = getContentTv();
            if (contentTv != null) {
                contentTv.startAnimation(scaleAnimation);
            }
        }
    }

    public final void r() {
        if (getHasInflate() && getVisibility() == 0) {
            setVisibility(8);
            LottieAnimationView lottieView = getLottieView();
            if (lottieView != null) {
                lottieView.d();
            }
            LottieAnimationView lottieView2 = getLottieView();
            if (lottieView2 != null) {
                lottieView2.setFrame(0);
            }
            AppCompatTextView contentTv = getContentTv();
            if (contentTv != null) {
                contentTv.clearAnimation();
            }
        }
    }

    public final void s() {
        View view;
        if (getHasInflate()) {
            setVisibility(0);
            LottieAnimationView lottieView = getLottieView();
            if (lottieView != null) {
                lottieView.setProgress(1.0f);
                return;
            }
            return;
        }
        removeAllViews();
        r2 t4 = t();
        this.f28388q = t4;
        if (t4 != null && (view = t4.f1418a) != null) {
            Context context = getContext();
            g.d(context, ea.a.p("LG9fdBx4dA==", "MbGhOfN4"));
            view.setLayoutDirection(c.j(context) ? 1 : 0);
            AppCompatTextView contentTv = getContentTv();
            if (contentTv != null) {
                h.a(contentTv, 3, R.dimen.sp_14);
            }
            View closeView = getCloseView();
            if (closeView != null) {
                closeView.setOnClickListener(new a((OCRTrialGuideView) this));
            }
            setVisibility(0);
            postDelayed(new j(this, 7), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        }
    }

    public final void setBinding(VB vb2) {
        this.f28388q = vb2;
    }

    public final void setOnCloseClickListener(l0 l0Var) {
        this.f28389r = l0Var;
    }

    public final void setOnPopClosedListener(l0 l0Var) {
        this.f28389r = l0Var;
    }

    public abstract r2 t();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseGuidePopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "YAkcPh8p"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseGuidePopView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "dILL8b4n"));
    }

    public /* synthetic */ BaseGuidePopView(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGuidePopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        g.e(context, ea.a.p("FW9WdC54dA==", "71v8K2T6"));
        setClickable(true);
        setFocusable(true);
        setVisibility(8);
    }
}
