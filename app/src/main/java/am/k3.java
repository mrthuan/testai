package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: ListItemPageSizeSelectBinding.java */
/* loaded from: classes3.dex */
public final class k3 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f1048a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1049b;
    public final TextView c;

    public k3(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.f1048a = linearLayout;
        this.f1049b = appCompatImageView;
        this.c = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f1048a;
    }
}
