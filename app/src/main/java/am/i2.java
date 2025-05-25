package am;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: LayoutAskQuestionViewBinding.java */
/* loaded from: classes3.dex */
public final class i2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final View f984a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f985b;
    public final EditText c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f986d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f987e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f988f;

    public i2(View view, ConstraintLayout constraintLayout, EditText editText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        this.f984a = view;
        this.f985b = constraintLayout;
        this.c = editText;
        this.f986d = appCompatImageView;
        this.f987e = appCompatImageView2;
        this.f988f = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f984a;
    }
}
