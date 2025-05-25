package am;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView;

/* compiled from: ItemSubscriptionJBasicBinding.java */
/* loaded from: classes3.dex */
public final class x1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1644a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1645b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1646d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1647e;

    /* renamed from: f  reason: collision with root package name */
    public final View f1648f;

    /* renamed from: g  reason: collision with root package name */
    public final View f1649g;

    /* renamed from: h  reason: collision with root package name */
    public final View f1650h;

    /* renamed from: i  reason: collision with root package name */
    public final View f1651i;

    public x1(View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LottieAnimationView lottieAnimationView, View view2, View view3, View view4, View view5) {
        this.c = view;
        this.f1646d = appCompatTextView;
        this.f1645b = appCompatImageView;
        this.f1647e = lottieAnimationView;
        this.f1648f = view2;
        this.f1649g = view3;
        this.f1650h = view4;
        this.f1651i = view5;
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1644a;
        View view = this.c;
        switch (i10) {
            case 0:
                return (ConstraintLayout) view;
            default:
                return view;
        }
    }

    public x1(ConstraintLayout constraintLayout, Space space, Space space2, BillingIntroduceDetailView billingIntroduceDetailView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2, Space space3) {
        this.c = constraintLayout;
        this.f1646d = space;
        this.f1647e = space2;
        this.f1649g = billingIntroduceDetailView;
        this.f1645b = appCompatImageView;
        this.f1650h = textView;
        this.f1651i = textView2;
        this.f1648f = space3;
    }
}
