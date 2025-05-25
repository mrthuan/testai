package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;

/* compiled from: DialogStoragePermissionBinding.java */
/* loaded from: classes3.dex */
public final class j0 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f999a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1000b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f1001d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f1002e;

    public j0(NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f999a = nestedScrollView;
        this.f1000b = appCompatImageView;
        this.c = textView;
        this.f1001d = textView2;
        this.f1002e = textView3;
    }

    @Override // i2.a
    public final View b() {
        return this.f999a;
    }
}
