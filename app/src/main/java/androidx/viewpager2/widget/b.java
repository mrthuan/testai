package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class b extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f4853a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.i f4854b;

    public b(LinearLayoutManager linearLayoutManager) {
        this.f4853a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(int i10, float f10, int i11) {
        if (this.f4854b == null) {
            return;
        }
        float f11 = -f10;
        int i12 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f4853a;
            if (i12 < linearLayoutManager.I()) {
                View H = linearLayoutManager.H(i12);
                if (H != null) {
                    this.f4854b.a(H, (RecyclerView.m.P(H) - i10) + f11);
                    i12++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(linearLayoutManager.I())));
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i10) {
    }
}
