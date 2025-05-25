package j9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public final class b extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float a10;
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i10 >= 0) {
            view = view2;
        }
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view);
        if (i10 < 0) {
            a10 = f8.b.a(1.0f, 0.0f, 0.0f, 0.5f, f10);
        } else {
            a10 = f8.b.a(0.0f, 1.0f, 0.5f, 1.0f, f10);
        }
        drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a10 * 255.0f));
    }
}
