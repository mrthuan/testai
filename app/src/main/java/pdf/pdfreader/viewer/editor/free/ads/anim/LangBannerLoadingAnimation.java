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

/* compiled from: LangBannerLoadingAnimation.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class LangBannerLoadingAnimation extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final Context f23934q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f23935r;

    /* renamed from: s  reason: collision with root package name */
    public final View f23936s;

    /* renamed from: t  reason: collision with root package name */
    public final LottieAnimationView f23937t;

    /* compiled from: LangBannerLoadingAnimation.kt */
    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23938a;

        public a(View view) {
            this.f23938a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23938a;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23938a;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            g.e(animation, "animation");
            View view = this.f23938a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LangBannerLoadingAnimation(Context context, boolean z10) {
        super(context);
        int i10;
        LottieAnimationView lottieAnimationView;
        View view;
        g.e(context, ea.a.p("XkMkbgdlGnQ=", "zViDteS6"));
        this.f23934q = context;
        this.f23935r = z10;
        LayoutInflater from = LayoutInflater.from(context);
        if (z10) {
            i10 = R.layout.layout_lang_adapter_card;
        } else {
            i10 = R.layout.layout_lang_adapter_banner;
        }
        View inflate = from.inflate(i10, (ViewGroup) this, true);
        this.f23936s = inflate;
        if (inflate != null) {
            lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.lv_lottie);
        } else {
            lottieAnimationView = null;
        }
        this.f23937t = lottieAnimationView;
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
        LottieAnimationView lottieAnimationView = this.f23937t;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        Context context = this.f23934q;
        boolean i10 = a0.i(context);
        if (this.f23935r) {
            if (lottieAnimationView != null) {
                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                layoutParams.height = lottieAnimationView.getContext().getResources().getDimensionPixelSize(R.dimen.dp_240);
                lottieAnimationView.setLayoutParams(layoutParams);
            }
            if (!a0.i(context)) {
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(R.raw.language_banner_loading);
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
                lottieAnimationView.setAnimation(R.raw.language_banner_loading_rtl);
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
