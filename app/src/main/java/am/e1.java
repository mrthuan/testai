package am;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: FragmentUserGuideD2Binding.java */
/* loaded from: classes3.dex */
public final class e1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f853a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f854b;
    public final FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f855d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f856e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatImageView f857f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f858g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatImageView f859h;

    /* renamed from: i  reason: collision with root package name */
    public final Space f860i;

    /* renamed from: j  reason: collision with root package name */
    public final ViewPager2 f861j;

    public e1(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, FrameLayout frameLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, AppCompatImageView appCompatImageView2, FrameLayout frameLayout3, AppCompatImageView appCompatImageView3, Space space, ViewPager2 viewPager2) {
        this.f853a = constraintLayout;
        this.f854b = appCompatTextView;
        this.c = frameLayout;
        this.f855d = appCompatImageView;
        this.f856e = frameLayout2;
        this.f857f = appCompatImageView2;
        this.f858g = frameLayout3;
        this.f859h = appCompatImageView3;
        this.f860i = space;
        this.f861j = viewPager2;
    }

    @Override // i2.a
    public final View b() {
        return this.f853a;
    }
}
