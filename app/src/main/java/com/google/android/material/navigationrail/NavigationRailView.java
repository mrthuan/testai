package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.u0;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import e8.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;
import z8.b;

/* loaded from: classes2.dex */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: f  reason: collision with root package name */
    public final int f12758f;

    /* renamed from: g  reason: collision with root package name */
    public View f12759g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f12760h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f12761i;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public View getHeaderView() {
        return this.f12759g;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f12759g;
        boolean z12 = true;
        int i14 = 0;
        if (view != null && view.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i15 = this.f12758f;
        if (z11) {
            int bottom = this.f12759g.getBottom() + i15;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.G.gravity & 112) != 48) {
                z12 = false;
            }
            if (z12) {
                i14 = i15;
            }
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumWidth > 0) {
            int paddingLeft = getPaddingLeft();
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingRight() + paddingLeft + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i10, i11);
        View view = this.f12759g;
        if (view != null && view.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measureChild(getNavigationRailMenuView(), i10, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f12759g.getMeasuredHeight()) - this.f12758f, SlideAtom.USES_MASTER_SLIDE_ID));
        }
    }

    public void setItemMinimumHeight(int i10) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018285);
        this.f12760h = null;
        this.f12761i = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f12758f = dimensionPixelSize;
        u0 e10 = s.e(getContext(), attributeSet, a.N, i10, 2132018285, new int[0]);
        int i11 = e10.i(0, 0);
        if (i11 != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this, false);
            View view = this.f12759g;
            if (view != null) {
                removeView(view);
                this.f12759g = null;
            }
            this.f12759g = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(inflate, 0, layoutParams);
        }
        setMenuGravity(e10.h(2, 49));
        if (e10.l(1)) {
            setItemMinimumHeight(e10.d(1, -1));
        }
        if (e10.l(4)) {
            this.f12760h = Boolean.valueOf(e10.a(4, false));
        }
        if (e10.l(3)) {
            this.f12761i = Boolean.valueOf(e10.a(3, false));
        }
        e10.n();
        w.a(this, new b(this));
    }
}
