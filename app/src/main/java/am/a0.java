package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;

/* compiled from: DialogAllFilePermissionBinding.java */
/* loaded from: classes3.dex */
public final class a0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f696a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f697b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f698d;

    public a0(NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.f696a = nestedScrollView;
        this.f697b = appCompatImageView;
        this.c = textView;
        this.f698d = textView2;
    }

    @Override // i2.a
    public final View b() {
        return this.f696a;
    }
}
