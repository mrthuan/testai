package j9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public final class a extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        boolean z10;
        float cos;
        float sin;
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a10.left < a11.left) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            double d10 = (f10 * 3.141592653589793d) / 2.0d;
            sin = (float) (1.0d - Math.cos(d10));
            cos = (float) Math.sin(d10);
        } else {
            double d11 = (f10 * 3.141592653589793d) / 2.0d;
            cos = (float) (1.0d - Math.cos(d11));
            sin = (float) Math.sin(d11);
        }
        drawable.setBounds(f8.b.b(sin, (int) a10.left, (int) a11.left), drawable.getBounds().top, f8.b.b(cos, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
