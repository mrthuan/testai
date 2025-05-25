package am;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: DialogPageManagerQuitBinding.java */
/* loaded from: classes3.dex */
public final class g0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f929a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f930b;
    public final TextView c;

    public g0(TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f929a = constraintLayout;
        this.f930b = textView;
        this.c = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f929a;
    }
}
