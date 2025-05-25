package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: LayoutImageAdjustFiltersToolsBinding.java */
/* loaded from: classes3.dex */
public final class p2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1304a;

    /* renamed from: b  reason: collision with root package name */
    public final Group f1305b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f1306d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f1307e;

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f1308f;

    /* renamed from: g  reason: collision with root package name */
    public final LottieAnimationView f1309g;

    public p2(ConstraintLayout constraintLayout, Group group, View view, RecyclerView recyclerView, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView) {
        this.f1304a = constraintLayout;
        this.f1305b = group;
        this.c = view;
        this.f1306d = recyclerView;
        this.f1307e = appCompatImageView;
        this.f1308f = constraintLayout2;
        this.f1309g = lottieAnimationView;
    }

    @Override // i2.a
    public final View b() {
        return this.f1304a;
    }
}
