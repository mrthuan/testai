package am;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: ActivityHomeScreenPermissionGuideBinding.java */
/* loaded from: classes3.dex */
public final class j implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f995a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f996b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f997d;

    /* renamed from: e  reason: collision with root package name */
    public final View f998e;

    public j(FrameLayout frameLayout, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2, View view) {
        this.f995a = frameLayout;
        this.f996b = lottieAnimationView;
        this.c = textView;
        this.f997d = textView2;
        this.f998e = view;
    }

    @Override // i2.a
    public final View b() {
        return this.f995a;
    }
}
