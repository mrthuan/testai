package am;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentInquiryAfterGuidePageBinding.java */
/* loaded from: classes3.dex */
public final class u0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1504a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f1505b;
    public final AppCompatTextView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f1506d;

    public u0(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f1504a = constraintLayout;
        this.f1505b = recyclerView;
        this.c = appCompatTextView;
        this.f1506d = appCompatTextView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f1504a;
    }
}
