package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: LayoutImageAdjustCropToolsBinding.java */
/* loaded from: classes3.dex */
public final class o2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1258a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1259b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f1260d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f1261e;

    public o2(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f1258a = constraintLayout;
        this.f1259b = view;
        this.c = appCompatImageView;
        this.f1260d = textView;
        this.f1261e = constraintLayout2;
    }

    @Override // i2.a
    public final View b() {
        return this.f1258a;
    }
}
