package am;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutSignatureEditViewBinding.java */
/* loaded from: classes3.dex */
public final class b3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f765a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f766b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final View f767d;

    /* renamed from: e  reason: collision with root package name */
    public final View f768e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f769f;

    /* renamed from: g  reason: collision with root package name */
    public final View f770g;

    public b3(View view, Group group, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, View view2) {
        this.c = view;
        this.f768e = group;
        this.f766b = linearLayout;
        this.f769f = linearLayout2;
        this.f770g = recyclerView;
        this.f767d = view2;
    }

    @Override // i2.a
    public final View b() {
        switch (this.f765a) {
            case 0:
                return this.c;
            default:
                return (ConstraintLayout) this.f767d;
        }
    }

    public b3(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView, LinearLayout linearLayout, View view) {
        this.f767d = constraintLayout;
        this.f768e = appCompatImageView;
        this.f769f = constraintLayout2;
        this.f770g = textView;
        this.f766b = linearLayout;
        this.c = view;
    }
}
