package am;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutSignColorBottomSheetBinding.java */
/* loaded from: classes3.dex */
public final class z2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f1697a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f1698b;
    public final TextView c;

    public z2(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f1697a = linearLayout;
        this.f1698b = recyclerView;
        this.c = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f1697a;
    }
}
