package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.h;
import x0.n0;

/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f12596a;

    /* renamed from: b  reason: collision with root package name */
    public int f12597b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f12598d;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.c;
    }

    public int getItemSpacing() {
        return this.f12597b;
    }

    public int getLineSpacing() {
        return this.f12596a;
    }

    public int getRowCount() {
        return this.f12598d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f12598d = 0;
            return;
        }
        this.f12598d = 1;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = h.c(marginLayoutParams);
                    i14 = h.b(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i15;
                if (!this.c && measuredWidth > i16) {
                    i18 = this.f12596a + paddingTop;
                    this.f12598d++;
                    i17 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f12598d - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += childAt.getMeasuredWidth() + i15 + i14 + this.f12597b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } else {
            i12 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i16 = this.f12596a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i14 + this.f12597b + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i13) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f12597b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f12596a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.c = z10;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e8.a.f16499t, 0, 0);
        this.f12596a = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f12597b = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        obtainStyledAttributes.recycle();
    }
}
