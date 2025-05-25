package am;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: DialogImageAdjustDeleteConfirmBinding.java */
/* loaded from: classes3.dex */
public final class b0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f743a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f744b;
    public final TextView c;

    public b0(TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f743a = constraintLayout;
        this.f744b = textView;
        this.c = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f743a;
    }
}
