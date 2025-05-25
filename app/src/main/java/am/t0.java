package am;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: FragmentInquiryAfterGuideBinding.java */
/* loaded from: classes3.dex */
public final class t0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1462a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1463b;
    public final FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f1464d;

    /* renamed from: e  reason: collision with root package name */
    public final Space f1465e;

    public t0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, Space space) {
        this.f1462a = constraintLayout;
        this.f1463b = appCompatImageView;
        this.c = frameLayout;
        this.f1464d = appCompatTextView;
        this.f1465e = space;
    }

    @Override // i2.a
    public final View b() {
        return this.f1462a;
    }
}
