package am;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: DialogPageManagerDeleteConfirmBinding.java */
/* loaded from: classes3.dex */
public final class f0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f889a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f890b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f891d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f892e;

    public f0(TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        this.f889a = constraintLayout;
        this.f890b = textView;
        this.c = textView2;
        this.f891d = textView3;
        this.f892e = textView4;
    }

    @Override // i2.a
    public final View b() {
        return this.f889a;
    }
}
