package am;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: ItemImageAdjustFiltersBinding.java */
/* loaded from: classes3.dex */
public final class l1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f1066a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f1067b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f1068d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f1069e;

    public l1(FrameLayout frameLayout, FrameLayout frameLayout2, View view, TextView textView, AppCompatImageView appCompatImageView) {
        this.f1066a = frameLayout;
        this.f1067b = frameLayout2;
        this.c = view;
        this.f1068d = textView;
        this.f1069e = appCompatImageView;
    }

    @Override // i2.a
    public final View b() {
        return this.f1066a;
    }
}
