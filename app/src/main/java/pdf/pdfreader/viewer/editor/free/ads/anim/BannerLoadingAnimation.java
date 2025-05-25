package pdf.pdfreader.viewer.editor.free.ads.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* compiled from: BannerLoadingAnimation.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class BannerLoadingAnimation extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final Context f23929q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f23930r;

    /* renamed from: s  reason: collision with root package name */
    public final View f23931s;

    /* renamed from: t  reason: collision with root package name */
    public final LottieAnimationView f23932t;

    /* compiled from: BannerLoadingAnimation.kt */
    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23933a;

        public a(View view) {
            this.f23933a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23933a;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23933a;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23933a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerLoadingAnimation(Context context, boolean z10) {
        super(context);
        LottieAnimationView lottieAnimationView;
        View view;
        g.e(context, ea.a.p("GUM9biBlO3Q=", "nGtRTCqT"));
        this.f23929q = context;
        this.f23930r = z10;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_bottom_adapter_banner, (ViewGroup) this, true);
        this.f23931s = inflate;
        if (inflate != null) {
            lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.lv_lottie);
        } else {
            lottieAnimationView = null;
        }
        this.f23932t = lottieAnimationView;
        if (inflate != null) {
            view = inflate.findViewById(R.id.lines);
        } else {
            view = null;
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.c(new a(view));
        }
        if (inflate != null) {
            inflate.setLayerType(1, null);
        }
    }

    public final void r() {
        LottieAnimationView lottieAnimationView = this.f23932t;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        Context context = this.f23929q;
        boolean i10 = a0.i(context);
        if (this.f23930r) {
            if (lottieAnimationView != null) {
                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                int i11 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.368f);
                int dimensionPixelSize = lottieAnimationView.getContext().getResources().getDimensionPixelSize(R.dimen.dp_126);
                if (i11 > dimensionPixelSize) {
                    i11 = dimensionPixelSize;
                }
                layoutParams.height = i11;
                lottieAnimationView.setLayoutParams(layoutParams);
            }
            if (!i10) {
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(R.raw.adapter_banner_native_big);
                }
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRepeatCount(-1);
                }
                if (lottieAnimationView != null) {
                    lottieAnimationView.j();
                    return;
                }
                return;
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(R.raw.adapter_banner_native_big_rtl);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.setRepeatCount(-1);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.j();
            }
        } else if (!i10) {
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(R.raw.adapter_banner_loading);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.setRepeatCount(-1);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.j();
            }
        } else {
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(R.raw.adapter_banner_loading_rtl);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.setRepeatCount(-1);
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.j();
            }
        }
    }
}
