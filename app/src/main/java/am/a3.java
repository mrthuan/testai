package am;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: LayoutSignSizeBottomSheetBinding.java */
/* loaded from: classes3.dex */
public final class a3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f717a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f718b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f719d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatSeekBar f720e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f721f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f722g;

    public a3(LinearLayout linearLayout, FrameLayout frameLayout, View view, ConstraintLayout constraintLayout, AppCompatSeekBar appCompatSeekBar, TextView textView, TextView textView2) {
        this.f717a = linearLayout;
        this.f718b = frameLayout;
        this.c = view;
        this.f719d = constraintLayout;
        this.f720e = appCompatSeekBar;
        this.f721f = textView;
        this.f722g = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f717a;
    }
}
