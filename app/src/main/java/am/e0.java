package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: DialogPageCountSetBinding.java */
/* loaded from: classes3.dex */
public final class e0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f849a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f850b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatEditText f851d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f852e;

    public e0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, AppCompatEditText appCompatEditText, TextView textView2) {
        this.f849a = constraintLayout;
        this.f850b = appCompatImageView;
        this.c = textView;
        this.f851d = appCompatEditText;
        this.f852e = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f849a;
    }
}
