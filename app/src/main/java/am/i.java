package am;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ActivityDebugBinding.java */
/* loaded from: classes3.dex */
public final class i implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f963a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f964b;
    public final Button c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f965d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewStub f966e;

    /* renamed from: f  reason: collision with root package name */
    public final TabLayout f967f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewPager2 f968g;

    public i(ConstraintLayout constraintLayout, Button button, Button button2, FrameLayout frameLayout, ViewStub viewStub, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f963a = constraintLayout;
        this.f964b = button;
        this.c = button2;
        this.f965d = frameLayout;
        this.f966e = viewStub;
        this.f967f = tabLayout;
        this.f968g = viewPager2;
    }

    @Override // i2.a
    public final View b() {
        return this.f963a;
    }
}
