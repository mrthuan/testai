package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: LayoutAiHistoryGuideBinding.java */
/* loaded from: classes3.dex */
public final class f2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final View f895a;

    /* renamed from: b  reason: collision with root package name */
    public final View f896b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final View f897d;

    /* renamed from: e  reason: collision with root package name */
    public final View f898e;

    /* renamed from: f  reason: collision with root package name */
    public final LottieAnimationView f899f;

    /* renamed from: g  reason: collision with root package name */
    public final View f900g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f901h;

    public f2(View view, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, View view2, View view3, View view4, View view5) {
        this.f895a = view;
        this.f896b = view2;
        this.c = view3;
        this.f897d = view4;
        this.f898e = view5;
        this.f900g = appCompatImageView;
        this.f901h = appCompatTextView;
        this.f899f = lottieAnimationView;
    }

    @Override // i2.a
    public final View b() {
        return this.f895a;
    }

    public f2(View view, LottieAnimationView lottieAnimationView, View view2, TextView textView, View view3, View view4, View view5, View view6) {
        this.f895a = view;
        this.f899f = lottieAnimationView;
        this.f896b = view2;
        this.f901h = textView;
        this.c = view3;
        this.f897d = view4;
        this.f898e = view5;
        this.f900g = view6;
    }
}
