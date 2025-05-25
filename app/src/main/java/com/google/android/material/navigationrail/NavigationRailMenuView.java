package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import z8.a;

/* loaded from: classes2.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    public int F;
    public final FrameLayout.LayoutParams G;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.F = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.G = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView d(Context context) {
        return new a(context);
    }

    public final int f(int i10, int i11, int i12, View view) {
        int makeMeasureSpec;
        int i13;
        if (view == null) {
            int max = i11 / Math.max(1, i12);
            int i14 = this.F;
            if (i14 == -1) {
                i14 = View.MeasureSpec.getSize(i10);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i14, max), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, makeMeasureSpec);
                    i13 = childAt.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                i15 += i13;
            }
        }
        return i15;
    }

    public int getItemMinimumHeight() {
        return this.F;
    }

    public int getMenuGravity() {
        return this.G.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int f10;
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().l().size();
        if (size2 > 1 && NavigationBarMenuView.e(getLabelVisibilityMode(), size2)) {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i13 = this.F;
                if (i13 == -1) {
                    i13 = View.MeasureSpec.getSize(i10);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i13, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, makeMeasureSpec);
                    i12 = childAt.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                size -= i12;
                size2--;
            } else {
                i12 = 0;
            }
            f10 = f(i10, size, size2, childAt) + i12;
        } else {
            f10 = f(i10, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState(f10, i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.G;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
