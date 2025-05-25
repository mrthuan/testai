package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import w8.w;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.E && (view instanceof TabLayout.TabView)) {
            TabLayout.TabView tabView = (TabLayout.TabView) view;
            int contentWidth = tabView.getContentWidth();
            int contentHeight = tabView.getContentHeight();
            int b10 = (int) w.b(tabView.getContext(), 24);
            if (contentWidth < b10) {
                contentWidth = b10;
            }
            int right = (tabView.getRight() + tabView.getLeft()) / 2;
            int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
            int i10 = contentWidth / 2;
            return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(f8.b.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, f8.b.b(f10, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
