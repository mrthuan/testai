package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2299a;

    /* renamed from: b  reason: collision with root package name */
    public int f2300b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2301d;

    /* renamed from: e  reason: collision with root package name */
    public int f2302e;

    /* renamed from: f  reason: collision with root package name */
    public int f2303f;

    /* renamed from: g  reason: collision with root package name */
    public float f2304g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2305h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2306i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2307j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2308k;

    /* renamed from: l  reason: collision with root package name */
    public int f2309l;

    /* renamed from: m  reason: collision with root package name */
    public int f2310m;

    /* renamed from: n  reason: collision with root package name */
    public int f2311n;

    /* renamed from: o  reason: collision with root package name */
    public int f2312o;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void e(Canvas canvas, int i10) {
        this.f2308k.setBounds(getPaddingLeft() + this.f2312o, i10, (getWidth() - getPaddingRight()) - this.f2312o, this.f2310m + i10);
        this.f2308k.draw(canvas);
    }

    public final void f(Canvas canvas, int i10) {
        this.f2308k.setBounds(i10, getPaddingTop() + this.f2312o, this.f2309l + i10, (getHeight() - getPaddingBottom()) - this.f2312o);
        this.f2308k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f2300b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f2300b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f2300b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.c;
            if (this.f2301d == 1 && (i10 = this.f2302e & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2303f;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2303f) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2300b;
    }

    public Drawable getDividerDrawable() {
        return this.f2308k;
    }

    public int getDividerPadding() {
        return this.f2312o;
    }

    public int getDividerWidth() {
        return this.f2309l;
    }

    public int getGravity() {
        return this.f2302e;
    }

    public int getOrientation() {
        return this.f2301d;
    }

    public int getShowDividers() {
        return this.f2311n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2304g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i10 = this.f2301d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            if ((this.f2311n & 1) == 0) {
                return false;
            }
            return true;
        } else if (i10 == getChildCount()) {
            if ((this.f2311n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f2311n & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.f2308k == null) {
            return;
        }
        int i11 = 0;
        if (this.f2301d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f2310m);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f2310m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                e(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = d1.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f2309l;
                }
                f(canvas, left2);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.f2309l;
                    right = left - i10;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f2309l;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            f(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x068f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:446:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 2266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f2299a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f2300b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2308k) {
            return;
        }
        this.f2308k = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f2309l = drawable.getIntrinsicWidth();
            this.f2310m = drawable.getIntrinsicHeight();
        } else {
            this.f2309l = 0;
            this.f2310m = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f2312o = i10;
    }

    public void setGravity(int i10) {
        if (this.f2302e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f2302e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f2302e;
        if ((8388615 & i12) != i11) {
            this.f2302e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f2305h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f2301d != i10) {
            this.f2301d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f2311n) {
            requestLayout();
        }
        this.f2311n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f2302e;
        if ((i12 & 112) != i11) {
            this.f2302e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f2304g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f2299a = true;
        this.f2300b = -1;
        this.c = 0;
        this.f2302e = 8388659;
        int[] iArr = k.a.f19443p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f2304g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f2300b = obtainStyledAttributes.getInt(3, -1);
        this.f2305h = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = m.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f2311n = obtainStyledAttributes.getInt(8, 0);
        this.f2312o = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
