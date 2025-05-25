package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: DialogOcrLoadingBinding.java */
/* loaded from: classes3.dex */
public final class d0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f808a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f809b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f810d;

    public d0(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView, TextView textView) {
        this.f808a = constraintLayout;
        this.f809b = lottieAnimationView;
        this.c = appCompatImageView;
        this.f810d = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f808a;
    }
}
