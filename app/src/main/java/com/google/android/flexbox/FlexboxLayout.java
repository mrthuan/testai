package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.a;
import h7.b;
import h7.c;
import h7.d;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.f0;
import x0.n0;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements h7.a {

    /* renamed from: a  reason: collision with root package name */
    public int f9932a;

    /* renamed from: b  reason: collision with root package name */
    public int f9933b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f9934d;

    /* renamed from: e  reason: collision with root package name */
    public int f9935e;

    /* renamed from: f  reason: collision with root package name */
    public int f9936f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f9937g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f9938h;

    /* renamed from: i  reason: collision with root package name */
    public int f9939i;

    /* renamed from: j  reason: collision with root package name */
    public int f9940j;

    /* renamed from: k  reason: collision with root package name */
    public int f9941k;

    /* renamed from: l  reason: collision with root package name */
    public int f9942l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f9943m;

    /* renamed from: n  reason: collision with root package name */
    public SparseIntArray f9944n;

    /* renamed from: o  reason: collision with root package name */
    public final com.google.android.flexbox.a f9945o;

    /* renamed from: p  reason: collision with root package name */
    public List<c> f9946p;

    /* renamed from: q  reason: collision with root package name */
    public final a.C0156a f9947q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f9946p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f9946p.get(i12);
            for (int i13 = 0; i13 < cVar.f18053h; i13++) {
                int i14 = cVar.f18060o + i13;
                View o10 = o(i14);
                if (o10 != null && o10.getVisibility() != 8) {
                    a aVar = (a) o10.getLayoutParams();
                    if (p(i14, i13)) {
                        if (z10) {
                            left = o10.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            left = (o10.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f9942l;
                        }
                        n(canvas, left, cVar.f18048b, cVar.f18052g);
                    }
                    if (i13 == cVar.f18053h - 1 && (this.f9940j & 4) > 0) {
                        if (z10) {
                            right = (o10.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f9942l;
                        } else {
                            right = o10.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        n(canvas, right, cVar.f18048b, cVar.f18052g);
                    }
                }
            }
            if (q(i12)) {
                if (z11) {
                    i11 = cVar.f18049d;
                } else {
                    i11 = cVar.f18048b - this.f9941k;
                }
                m(canvas, paddingLeft, i11, max);
            }
            if (r(i12) && (this.f9939i & 4) > 0) {
                if (z11) {
                    i10 = cVar.f18048b - this.f9941k;
                } else {
                    i10 = cVar.f18049d;
                }
                m(canvas, paddingLeft, i10, max);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f9944n == null) {
            this.f9944n = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f9944n;
        com.google.android.flexbox.a aVar = this.f9945o;
        h7.a aVar2 = aVar.f9995a;
        int flexItemCount = aVar2.getFlexItemCount();
        ArrayList f10 = aVar.f(flexItemCount);
        a.b bVar = new a.b();
        if (view != null && (layoutParams instanceof b)) {
            bVar.f10002b = ((b) layoutParams).getOrder();
        } else {
            bVar.f10002b = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < aVar2.getFlexItemCount()) {
                bVar.f10001a = i10;
                for (int i11 = i10; i11 < flexItemCount; i11++) {
                    ((a.b) f10.get(i11)).f10001a++;
                }
            } else {
                bVar.f10001a = flexItemCount;
            }
        } else {
            bVar.f10001a = flexItemCount;
        }
        f10.add(bVar);
        this.f9943m = com.google.android.flexbox.a.r(flexItemCount + 1, f10, sparseIntArray);
        super.addView(view, i10, layoutParams);
    }

    @Override // h7.a
    public final View b(int i10) {
        return o(i10);
    }

    @Override // h7.a
    public final int c(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // h7.a
    public final void d(c cVar) {
        if (k()) {
            if ((this.f9940j & 4) > 0) {
                int i10 = cVar.f18050e;
                int i11 = this.f9942l;
                cVar.f18050e = i10 + i11;
                cVar.f18051f += i11;
            }
        } else if ((this.f9939i & 4) > 0) {
            int i12 = cVar.f18050e;
            int i13 = this.f9941k;
            cVar.f18050e = i12 + i13;
            cVar.f18051f += i13;
        }
    }

    @Override // h7.a
    public final void e(View view, int i10, int i11, c cVar) {
        if (p(i10, i11)) {
            if (k()) {
                int i12 = cVar.f18050e;
                int i13 = this.f9942l;
                cVar.f18050e = i12 + i13;
                cVar.f18051f += i13;
                return;
            }
            int i14 = cVar.f18050e;
            int i15 = this.f9941k;
            cVar.f18050e = i14 + i15;
            cVar.f18051f += i15;
        }
    }

    @Override // h7.a
    public final View f(int i10) {
        return getChildAt(i10);
    }

    @Override // h7.a
    public final int g(View view, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (k()) {
            if (p(i10, i11)) {
                i13 = 0 + this.f9942l;
            }
            if ((this.f9940j & 4) > 0) {
                i12 = this.f9942l;
            } else {
                return i13;
            }
        } else {
            if (p(i10, i11)) {
                i13 = 0 + this.f9941k;
            }
            if ((this.f9939i & 4) > 0) {
                i12 = this.f9941k;
            } else {
                return i13;
            }
        }
        return i13 + i12;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // h7.a
    public int getAlignContent() {
        return this.f9935e;
    }

    @Override // h7.a
    public int getAlignItems() {
        return this.f9934d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9937g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9938h;
    }

    @Override // h7.a
    public int getFlexDirection() {
        return this.f9932a;
    }

    @Override // h7.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f9946p.size());
        for (c cVar : this.f9946p) {
            if (cVar.f18053h - cVar.f18054i != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // h7.a
    public List<c> getFlexLinesInternal() {
        return this.f9946p;
    }

    @Override // h7.a
    public int getFlexWrap() {
        return this.f9933b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // h7.a
    public int getLargestMainSize() {
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        for (c cVar : this.f9946p) {
            i10 = Math.max(i10, cVar.f18050e);
        }
        return i10;
    }

    @Override // h7.a
    public int getMaxLine() {
        return this.f9936f;
    }

    public int getShowDividerHorizontal() {
        return this.f9939i;
    }

    public int getShowDividerVertical() {
        return this.f9940j;
    }

    @Override // h7.a
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.f9946p.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = this.f9946p.get(i13);
            if (q(i13)) {
                if (k()) {
                    i11 = this.f9941k;
                } else {
                    i11 = this.f9942l;
                }
                i12 += i11;
            }
            if (r(i13)) {
                if (k()) {
                    i10 = this.f9941k;
                } else {
                    i10 = this.f9942l;
                }
                i12 += i10;
            }
            i12 += cVar.f18052g;
        }
        return i12;
    }

    @Override // h7.a
    public final int h(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final void i(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f9946p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f9946p.get(i12);
            for (int i13 = 0; i13 < cVar.f18053h; i13++) {
                int i14 = cVar.f18060o + i13;
                View o10 = o(i14);
                if (o10 != null && o10.getVisibility() != 8) {
                    a aVar = (a) o10.getLayoutParams();
                    if (p(i14, i13)) {
                        if (z11) {
                            top = o10.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            top = (o10.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f9941k;
                        }
                        m(canvas, cVar.f18047a, top, cVar.f18052g);
                    }
                    if (i13 == cVar.f18053h - 1 && (this.f9939i & 4) > 0) {
                        if (z11) {
                            bottom = (o10.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f9941k;
                        } else {
                            bottom = o10.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        m(canvas, cVar.f18047a, bottom, cVar.f18052g);
                    }
                }
            }
            if (q(i12)) {
                if (z10) {
                    i11 = cVar.c;
                } else {
                    i11 = cVar.f18047a - this.f9942l;
                }
                n(canvas, i11, paddingTop, max);
            }
            if (r(i12) && (this.f9940j & 4) > 0) {
                if (z10) {
                    i10 = cVar.f18047a - this.f9942l;
                } else {
                    i10 = cVar.c;
                }
                n(canvas, i10, paddingTop, max);
            }
        }
    }

    @Override // h7.a
    public final boolean k() {
        int i10 = this.f9932a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // h7.a
    public final int l(View view) {
        return 0;
    }

    public final void m(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f9937g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f9941k + i11);
        this.f9937g.draw(canvas);
    }

    public final void n(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f9938h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f9942l + i10, i12 + i11);
        this.f9938h.draw(canvas);
    }

    public final View o(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f9943m;
            if (i10 < iArr.length) {
                return getChildAt(iArr[i10]);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (this.f9938h == null && this.f9937g == null) {
            return;
        }
        if (this.f9939i == 0 && this.f9940j == 0) {
            return;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.e.d(this);
        int i10 = this.f9932a;
        boolean z12 = false;
        boolean z13 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (d10 == 1) {
                            z12 = true;
                        }
                        if (this.f9933b == 2) {
                            z12 = !z12;
                        }
                        i(canvas, z12, true);
                        return;
                    }
                    return;
                }
                if (d10 != 1) {
                    z13 = false;
                }
                if (this.f9933b == 2) {
                    z13 = !z13;
                }
                i(canvas, z13, false);
                return;
            }
            if (d10 != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f9933b == 2) {
                z12 = true;
            }
            a(canvas, z11, z12);
            return;
        }
        if (d10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9933b == 2) {
            z12 = true;
        }
        a(canvas, z10, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.e.d(this);
        int i14 = this.f9932a;
        boolean z15 = false;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (d10 == 1) {
                            z15 = true;
                        }
                        if (this.f9933b == 2) {
                            z14 = !z15;
                        } else {
                            z14 = z15;
                        }
                        t(i10, i11, i12, z14, true, i13);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f9932a);
                }
                if (d10 == 1) {
                    z15 = true;
                }
                if (this.f9933b == 2) {
                    z13 = !z15;
                } else {
                    z13 = z15;
                }
                t(i10, i11, i12, z13, false, i13);
                return;
            }
            if (d10 != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            s(i10, i11, i12, i13, z12);
            return;
        }
        if (d10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        s(i10, i11, i12, i13, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public final boolean p(int i10, int i11) {
        boolean z10;
        int i12 = 1;
        while (true) {
            if (i12 <= i11) {
                View o10 = o(i10 - i12);
                if (o10 != null && o10.getVisibility() != 8) {
                    z10 = false;
                    break;
                }
                i12++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            if (k()) {
                if ((this.f9940j & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f9939i & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (k()) {
            if ((this.f9940j & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9939i & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f9946p.size()) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                c cVar = this.f9946p.get(i11);
                if (cVar.f18053h - cVar.f18054i > 0) {
                    z10 = false;
                    break;
                }
                i11++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            if (k()) {
                if ((this.f9939i & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f9940j & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (k()) {
            if ((this.f9939i & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9940j & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean r(int i10) {
        if (i10 < 0 || i10 >= this.f9946p.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.f9946p.size(); i11++) {
            c cVar = this.f9946p.get(i11);
            if (cVar.f18053h - cVar.f18054i > 0) {
                return false;
            }
        }
        if (k()) {
            if ((this.f9939i & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9940j & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r29, int r30, int r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.s(int, int, int, int, boolean):void");
    }

    public void setAlignContent(int i10) {
        if (this.f9935e != i10) {
            this.f9935e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f9934d != i10) {
            this.f9934d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f9937g) {
            return;
        }
        this.f9937g = drawable;
        if (drawable != null) {
            this.f9941k = drawable.getIntrinsicHeight();
        } else {
            this.f9941k = 0;
        }
        if (this.f9937g == null && this.f9938h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f9938h) {
            return;
        }
        this.f9938h = drawable;
        if (drawable != null) {
            this.f9942l = drawable.getIntrinsicWidth();
        } else {
            this.f9942l = 0;
        }
        if (this.f9937g == null && this.f9938h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f9932a != i10) {
            this.f9932a = i10;
            requestLayout();
        }
    }

    @Override // h7.a
    public void setFlexLines(List<c> list) {
        this.f9946p = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f9933b != i10) {
            this.f9933b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.c != i10) {
            this.c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f9936f != i10) {
            this.f9936f = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f9939i) {
            this.f9939i = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f9940j) {
            this.f9940j = i10;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(int r30, int r31, int r32, boolean r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(int, int, int, boolean, boolean, int):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(b.a.c("Invalid flex direction: ", i10));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i13 = View.combineMeasuredStates(i13, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
                } else {
                    throw new IllegalStateException(b.a.c("Unknown width mode is set: ", mode));
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
            }
        } else {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < paddingBottom) {
                        i13 = View.combineMeasuredStates(i13, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
                } else {
                    throw new IllegalStateException(b.a.c("Unknown height mode is set: ", mode2));
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
            }
        } else {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9936f = -1;
        this.f9945o = new com.google.android.flexbox.a(this);
        this.f9946p = new ArrayList();
        this.f9947q = new a.C0156a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f18064a, i10, 0);
        this.f9932a = obtainStyledAttributes.getInt(5, 0);
        this.f9933b = obtainStyledAttributes.getInt(6, 0);
        this.c = obtainStyledAttributes.getInt(7, 0);
        this.f9934d = obtainStyledAttributes.getInt(1, 0);
        this.f9935e = obtainStyledAttributes.getInt(0, 0);
        this.f9936f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(9, 0);
        if (i11 != 0) {
            this.f9940j = i11;
            this.f9939i = i11;
        }
        int i12 = obtainStyledAttributes.getInt(11, 0);
        if (i12 != 0) {
            this.f9940j = i12;
        }
        int i13 = obtainStyledAttributes.getInt(10, 0);
        if (i13 != 0) {
            this.f9939i = i13;
        }
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C0155a();

        /* renamed from: a  reason: collision with root package name */
        public final int f9948a;

        /* renamed from: b  reason: collision with root package name */
        public final float f9949b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9950d;

        /* renamed from: e  reason: collision with root package name */
        public final float f9951e;

        /* renamed from: f  reason: collision with root package name */
        public int f9952f;

        /* renamed from: g  reason: collision with root package name */
        public int f9953g;

        /* renamed from: h  reason: collision with root package name */
        public final int f9954h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9955i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f9956j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0155a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9948a = 1;
            this.f9949b = 0.0f;
            this.c = 1.0f;
            this.f9950d = -1;
            this.f9951e = -1.0f;
            this.f9952f = -1;
            this.f9953g = -1;
            this.f9954h = 16777215;
            this.f9955i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f18065b);
            this.f9948a = obtainStyledAttributes.getInt(8, 1);
            this.f9949b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f9950d = obtainStyledAttributes.getInt(0, -1);
            this.f9951e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f9952f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f9953g = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f9954h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f9955i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f9956j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // h7.b
        public final float Q() {
            return this.f9949b;
        }

        @Override // h7.b
        public final float T() {
            return this.f9951e;
        }

        @Override // h7.b
        public final int a0() {
            return this.f9953g;
        }

        @Override // h7.b
        public final boolean b0() {
            return this.f9956j;
        }

        @Override // h7.b
        public final int d0() {
            return this.f9955i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // h7.b
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // h7.b
        public final int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // h7.b
        public final int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // h7.b
        public final int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // h7.b
        public final int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // h7.b
        public final int getOrder() {
            return this.f9948a;
        }

        @Override // h7.b
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // h7.b
        public final int k0() {
            return this.f9954h;
        }

        @Override // h7.b
        public final void setMinWidth(int i10) {
            this.f9952f = i10;
        }

        @Override // h7.b
        public final int u() {
            return this.f9950d;
        }

        @Override // h7.b
        public final float v() {
            return this.c;
        }

        @Override // h7.b
        public final int w() {
            return this.f9952f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f9948a);
            parcel.writeFloat(this.f9949b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.f9950d);
            parcel.writeFloat(this.f9951e);
            parcel.writeInt(this.f9952f);
            parcel.writeInt(this.f9953g);
            parcel.writeInt(this.f9954h);
            parcel.writeInt(this.f9955i);
            parcel.writeByte(this.f9956j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // h7.b
        public final void x(int i10) {
            this.f9953g = i10;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f9948a = 1;
            this.f9949b = 0.0f;
            this.c = 1.0f;
            this.f9950d = -1;
            this.f9951e = -1.0f;
            this.f9952f = -1;
            this.f9953g = -1;
            this.f9954h = 16777215;
            this.f9955i = 16777215;
            this.f9948a = aVar.f9948a;
            this.f9949b = aVar.f9949b;
            this.c = aVar.c;
            this.f9950d = aVar.f9950d;
            this.f9951e = aVar.f9951e;
            this.f9952f = aVar.f9952f;
            this.f9953g = aVar.f9953g;
            this.f9954h = aVar.f9954h;
            this.f9955i = aVar.f9955i;
            this.f9956j = aVar.f9956j;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9948a = 1;
            this.f9949b = 0.0f;
            this.c = 1.0f;
            this.f9950d = -1;
            this.f9951e = -1.0f;
            this.f9952f = -1;
            this.f9953g = -1;
            this.f9954h = 16777215;
            this.f9955i = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9948a = 1;
            this.f9949b = 0.0f;
            this.c = 1.0f;
            this.f9950d = -1;
            this.f9951e = -1.0f;
            this.f9952f = -1;
            this.f9953g = -1;
            this.f9954h = 16777215;
            this.f9955i = 16777215;
        }

        public a(Parcel parcel) {
            super(0, 0);
            this.f9948a = 1;
            this.f9949b = 0.0f;
            this.c = 1.0f;
            this.f9950d = -1;
            this.f9951e = -1.0f;
            this.f9952f = -1;
            this.f9953g = -1;
            this.f9954h = 16777215;
            this.f9955i = 16777215;
            this.f9948a = parcel.readInt();
            this.f9949b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.f9950d = parcel.readInt();
            this.f9951e = parcel.readFloat();
            this.f9952f = parcel.readInt();
            this.f9953g = parcel.readInt();
            this.f9954h = parcel.readInt();
            this.f9955i = parcel.readInt();
            this.f9956j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    @Override // h7.a
    public final void j(View view, int i10) {
    }
}
