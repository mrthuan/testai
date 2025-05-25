package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.ValueAnimator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: ImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public final class g0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppCompatImageView f25809b;
    public final /* synthetic */ TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f25810d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f25811e;

    public g0(ImageAdjustActivity imageAdjustActivity, AppCompatImageView appCompatImageView, TextView textView, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView) {
        this.f25808a = imageAdjustActivity;
        this.f25809b = appCompatImageView;
        this.c = textView;
        this.f25810d = constraintLayout;
        this.f25811e = lottieAnimationView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        boolean z10;
        kotlin.jvm.internal.g.e(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int i10 = (animatedFraction > 0.1f ? 1 : (animatedFraction == 0.1f ? 0 : -1));
        AppCompatImageView appCompatImageView = this.f25809b;
        ImageAdjustActivity imageAdjustActivity = this.f25808a;
        TextView textView = this.c;
        if (i10 < 0) {
            ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
            imageAdjustActivity.getClass();
            ImageAdjustActivity.x2(appCompatImageView, 0.0f);
            ImageAdjustActivity.x2(textView, 0.0f);
            return;
        }
        if (0.1f <= animatedFraction && animatedFraction <= 0.15f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = (animatedFraction - 0.1f) / 0.05f;
            float f11 = 1.0f - f10;
            ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
            imageAdjustActivity.getClass();
            ImageAdjustActivity.x2(appCompatImageView, f10);
            ImageAdjustActivity.x2(textView, f10);
            ConstraintLayout constraintLayout = this.f25810d;
            if (constraintLayout.getMeasuredWidth() > 0 && constraintLayout.getMeasuredHeight() > 0) {
                appCompatImageView.setTranslationY((constraintLayout.getMeasuredHeight() / 2.0f) * f11);
                textView.setTranslationX((constraintLayout.getMeasuredWidth() / 4.0f) * f11);
                textView.setTranslationY((constraintLayout.getMeasuredHeight() / 2.0f) * f11);
                return;
            }
            return;
        }
        appCompatImageView.setTranslationY(0.0f);
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
        imageAdjustActivity.getClass();
        ImageAdjustActivity.x2(appCompatImageView, 1.0f);
        ImageAdjustActivity.x2(textView, 1.0f);
        this.f25811e.f6018h.c.removeUpdateListener(this);
    }
}
