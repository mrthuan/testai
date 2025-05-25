package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public boolean J;
    public final ArrayList K;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.K = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.F = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.G = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView d(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.e.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        h menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.K;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        boolean e10 = NavigationBarMenuView.e(getLabelVisibilityMode(), size2);
        int i15 = this.H;
        int i16 = 1;
        if (e10 && this.J) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i17 = this.I;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, SlideAtom.USES_MASTER_SLIDE_ID), makeMeasureSpec);
                i17 = Math.max(i17, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i18 = size2 - i13;
            int min = Math.min(size - (this.G * i18), Math.min(i17, i15));
            int i19 = size - min;
            if (i18 != 0) {
                i16 = i18;
            }
            int min2 = Math.min(i19 / i16, this.F);
            int i20 = i19 - (i18 * min2);
            for (int i21 = 0; i21 < childCount; i21++) {
                if (getChildAt(i21).getVisibility() != 8) {
                    if (i21 == getSelectedItemPosition()) {
                        i14 = min;
                    } else {
                        i14 = min2;
                    }
                    if (i20 > 0) {
                        i14++;
                        i20--;
                    }
                } else {
                    i14 = 0;
                }
                arrayList.add(Integer.valueOf(i14));
            }
        } else {
            if (size2 != 0) {
                i16 = size2;
            }
            int min3 = Math.min(size / i16, i15);
            int i22 = size - (size2 * min3);
            for (int i23 = 0; i23 < childCount; i23++) {
                if (getChildAt(i23).getVisibility() != 8) {
                    if (i22 > 0) {
                        i12 = min3 + 1;
                        i22--;
                    } else {
                        i12 = min3;
                    }
                } else {
                    i12 = 0;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i25)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i24 = childAt2.getMeasuredWidth() + i24;
            }
        }
        setMeasuredDimension(i24, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.J = z10;
    }
}
