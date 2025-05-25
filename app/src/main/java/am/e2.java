package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: LayoutAiChatTitleBinding.java */
/* loaded from: classes3.dex */
public final class e2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f862a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f863b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f864d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f865e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f866f;

    /* renamed from: g  reason: collision with root package name */
    public final View f867g;

    /* renamed from: h  reason: collision with root package name */
    public final View f868h;

    public e2(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, TextView textView, LinearLayout linearLayout, View view) {
        this.f863b = constraintLayout;
        this.c = appCompatImageView;
        this.f864d = appCompatImageView2;
        this.f865e = appCompatImageView3;
        this.f866f = textView;
        this.f868h = linearLayout;
        this.f867g = view;
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f862a;
        ConstraintLayout constraintLayout = this.f863b;
        switch (i10) {
            case 0:
            default:
                return constraintLayout;
        }
    }

    public e2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView, AppCompatTextView appCompatTextView, View view) {
        this.f863b = constraintLayout;
        this.c = appCompatImageView;
        this.f864d = appCompatImageView2;
        this.f865e = appCompatImageView3;
        this.f866f = textView;
        this.f868h = appCompatTextView;
        this.f867g = view;
    }
}
