package am;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FragmentSplashLoadingBinding.java */
/* loaded from: classes3.dex */
public final class b1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f745a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f746b;
    public final AppCompatTextView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f747d;

    /* renamed from: e  reason: collision with root package name */
    public final View f748e;

    public b1(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view) {
        this.f745a = constraintLayout;
        this.f746b = lottieAnimationView;
        this.c = appCompatTextView;
        this.f747d = appCompatTextView2;
        this.f748e = view;
    }

    @Override // i2.a
    public final View b() {
        return this.f745a;
    }
}
