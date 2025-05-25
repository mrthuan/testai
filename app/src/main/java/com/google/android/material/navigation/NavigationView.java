package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.u0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import f9.h;
import f9.m;
import f9.n;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import q.f;
import w8.h;
import w8.i;
import w8.s;
import x0.f0;
import x0.n0;
import x0.s0;
import y8.d;

/* loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f12743t = {16842912};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f12744u = {-16842910};

    /* renamed from: h  reason: collision with root package name */
    public final h f12745h;

    /* renamed from: i  reason: collision with root package name */
    public final i f12746i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12747j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f12748k;

    /* renamed from: l  reason: collision with root package name */
    public f f12749l;

    /* renamed from: m  reason: collision with root package name */
    public d f12750m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12751n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12752o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12753p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12754q;

    /* renamed from: r  reason: collision with root package name */
    public Path f12755r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f12756s;

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public static class c extends c1.a {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public Bundle c;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeBundle(this.c);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f12749l == null) {
            this.f12749l = new f(getContext());
        }
        return this.f12749l;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void a(s0 s0Var) {
        int i10;
        i iVar = this.f12746i;
        iVar.getClass();
        int e10 = s0Var.e();
        if (iVar.f31027y != e10) {
            iVar.f31027y = e10;
            if (iVar.f31005b.getChildCount() == 0 && iVar.f31025w) {
                i10 = iVar.f31027y;
            } else {
                i10 = 0;
            }
            NavigationMenuView navigationMenuView = iVar.f31004a;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = iVar.f31004a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, s0Var.b());
        f0.b(iVar.f31005b, s0Var);
    }

    public final ColorStateList b(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = androidx.core.content.a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f12744u;
        return new ColorStateList(new int[][]{iArr, f12743t, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable c(u0 u0Var, ColorStateList colorStateList) {
        f9.h hVar = new f9.h(new m(m.a(getContext(), u0Var.i(17, 0), u0Var.i(18, 0))));
        hVar.n(colorStateList);
        return new InsetDrawable((Drawable) hVar, u0Var.d(22, 0), u0Var.d(23, 0), u0Var.d(21, 0), u0Var.d(20, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f12755r == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f12755r);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f12746i.f31007e.f31031e;
    }

    public int getDividerInsetEnd() {
        return this.f12746i.f31021s;
    }

    public int getDividerInsetStart() {
        return this.f12746i.f31020r;
    }

    public int getHeaderCount() {
        return this.f12746i.f31005b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f12746i.f31014l;
    }

    public int getItemHorizontalPadding() {
        return this.f12746i.f31016n;
    }

    public int getItemIconPadding() {
        return this.f12746i.f31018p;
    }

    public ColorStateList getItemIconTintList() {
        return this.f12746i.f31013k;
    }

    public int getItemMaxLines() {
        return this.f12746i.f31026x;
    }

    public ColorStateList getItemTextColor() {
        return this.f12746i.f31012j;
    }

    public int getItemVerticalPadding() {
        return this.f12746i.f31017o;
    }

    public Menu getMenu() {
        return this.f12745h;
    }

    public int getSubheaderInsetEnd() {
        return this.f12746i.f31023u;
    }

    public int getSubheaderInsetStart() {
        return this.f12746i.f31022t;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.X(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f12750m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f12747j;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            }
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f5506a);
        this.f12745h.t(cVar.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.c = bundle;
        this.f12745h.v(bundle);
        return cVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        boolean z10 = getParent() instanceof DrawerLayout;
        RectF rectF = this.f12756s;
        if (z10 && (i14 = this.f12754q) > 0 && (getBackground() instanceof f9.h)) {
            f9.h hVar = (f9.h) getBackground();
            m mVar = hVar.f17164a.f17186a;
            mVar.getClass();
            m.a aVar = new m.a(mVar);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (Gravity.getAbsoluteGravity(this.f12753p, f0.e.d(this)) == 3) {
                float f10 = i14;
                aVar.f(f10);
                aVar.d(f10);
            } else {
                float f11 = i14;
                aVar.e(f11);
                aVar.c(f11);
            }
            hVar.setShapeAppearanceModel(new m(aVar));
            if (this.f12755r == null) {
                this.f12755r = new Path();
            }
            this.f12755r.reset();
            rectF.set(0.0f, 0.0f, i10, i11);
            n nVar = n.a.f17245a;
            h.b bVar = hVar.f17164a;
            nVar.a(bVar.f17186a, bVar.f17194j, rectF, null, this.f12755r);
            invalidate();
            return;
        }
        this.f12755r = null;
        rectF.setEmpty();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f12752o = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f12745h.findItem(i10);
        if (findItem != null) {
            this.f12746i.f31007e.i((j) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        i iVar = this.f12746i;
        iVar.f31021s = i10;
        iVar.c(false);
    }

    public void setDividerInsetStart(int i10) {
        i iVar = this.f12746i;
        iVar.f31020r = i10;
        iVar.c(false);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        b.b.V(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        i iVar = this.f12746i;
        iVar.f31014l = drawable;
        iVar.c(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        i iVar = this.f12746i;
        iVar.f31016n = i10;
        iVar.c(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        i iVar = this.f12746i;
        iVar.f31016n = dimensionPixelSize;
        iVar.c(false);
    }

    public void setItemIconPadding(int i10) {
        i iVar = this.f12746i;
        iVar.f31018p = i10;
        iVar.c(false);
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        i iVar = this.f12746i;
        iVar.f31018p = dimensionPixelSize;
        iVar.c(false);
    }

    public void setItemIconSize(int i10) {
        i iVar = this.f12746i;
        if (iVar.f31019q != i10) {
            iVar.f31019q = i10;
            iVar.f31024v = true;
            iVar.c(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        i iVar = this.f12746i;
        iVar.f31013k = colorStateList;
        iVar.c(false);
    }

    public void setItemMaxLines(int i10) {
        i iVar = this.f12746i;
        iVar.f31026x = i10;
        iVar.c(false);
    }

    public void setItemTextAppearance(int i10) {
        i iVar = this.f12746i;
        iVar.f31011i = i10;
        iVar.c(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        i iVar = this.f12746i;
        iVar.f31012j = colorStateList;
        iVar.c(false);
    }

    public void setItemVerticalPadding(int i10) {
        i iVar = this.f12746i;
        iVar.f31017o = i10;
        iVar.c(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        i iVar = this.f12746i;
        iVar.f31017o = dimensionPixelSize;
        iVar.c(false);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        i iVar = this.f12746i;
        if (iVar != null) {
            iVar.A = i10;
            NavigationMenuView navigationMenuView = iVar.f31004a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        i iVar = this.f12746i;
        iVar.f31023u = i10;
        iVar.c(false);
    }

    public void setSubheaderInsetStart(int i10) {
        i iVar = this.f12746i;
        iVar.f31022t = i10;
        iVar.c(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f12751n = z10;
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018039), attributeSet, i10);
        ColorStateList b10;
        i iVar = new i();
        this.f12746i = iVar;
        this.f12748k = new int[2];
        this.f12751n = true;
        this.f12752o = true;
        this.f12753p = 0;
        this.f12754q = 0;
        this.f12756s = new RectF();
        Context context2 = getContext();
        w8.h hVar = new w8.h(context2);
        this.f12745h = hVar;
        u0 e10 = s.e(context2, attributeSet, e8.a.O, i10, 2132018039, new int[0]);
        if (e10.l(1)) {
            Drawable e11 = e10.e(1);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(this, e11);
        }
        this.f12754q = e10.d(7, 0);
        this.f12753p = e10.h(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            m mVar = new m(m.c(context2, attributeSet, i10, 2132018039));
            Drawable background = getBackground();
            f9.h hVar2 = new f9.h(mVar);
            if (background instanceof ColorDrawable) {
                hVar2.n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            hVar2.k(context2);
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.q(this, hVar2);
        }
        if (e10.l(8)) {
            setElevation(e10.d(8, 0));
        }
        setFitsSystemWindows(e10.a(2, false));
        this.f12747j = e10.d(3, 0);
        ColorStateList b11 = e10.l(30) ? e10.b(30) : null;
        int i11 = e10.l(33) ? e10.i(33, 0) : 0;
        if (i11 == 0 && b11 == null) {
            b11 = b(16842808);
        }
        if (e10.l(14)) {
            b10 = e10.b(14);
        } else {
            b10 = b(16842808);
        }
        int i12 = e10.l(24) ? e10.i(24, 0) : 0;
        if (e10.l(13)) {
            setItemIconSize(e10.d(13, 0));
        }
        ColorStateList b12 = e10.l(25) ? e10.b(25) : null;
        if (i12 == 0 && b12 == null) {
            b12 = b(16842806);
        }
        Drawable e12 = e10.e(10);
        if (e12 == null) {
            if (e10.l(17) || e10.l(18)) {
                e12 = c(e10, b9.c.b(getContext(), e10, 19));
                ColorStateList b13 = b9.c.b(context2, e10, 16);
                if (b13 != null) {
                    iVar.f31015m = new RippleDrawable(c9.a.c(b13), null, c(e10, null));
                    iVar.c(false);
                }
            }
        }
        if (e10.l(11)) {
            setItemHorizontalPadding(e10.d(11, 0));
        }
        if (e10.l(26)) {
            setItemVerticalPadding(e10.d(26, 0));
        }
        setDividerInsetStart(e10.d(6, 0));
        setDividerInsetEnd(e10.d(5, 0));
        setSubheaderInsetStart(e10.d(32, 0));
        setSubheaderInsetEnd(e10.d(31, 0));
        setTopInsetScrimEnabled(e10.a(34, this.f12751n));
        setBottomInsetScrimEnabled(e10.a(4, this.f12752o));
        int d10 = e10.d(12, 0);
        setItemMaxLines(e10.h(15, 1));
        hVar.f2054e = new a();
        iVar.f31006d = 1;
        iVar.g(context2, hVar);
        if (i11 != 0) {
            iVar.f31009g = i11;
            iVar.c(false);
        }
        iVar.f31010h = b11;
        iVar.c(false);
        iVar.f31013k = b10;
        iVar.c(false);
        int overScrollMode = getOverScrollMode();
        iVar.A = overScrollMode;
        NavigationMenuView navigationMenuView = iVar.f31004a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (i12 != 0) {
            iVar.f31011i = i12;
            iVar.c(false);
        }
        iVar.f31012j = b12;
        iVar.c(false);
        iVar.f31014l = e12;
        iVar.c(false);
        iVar.f31018p = d10;
        iVar.c(false);
        hVar.b(iVar, hVar.f2051a);
        if (iVar.f31004a == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) iVar.f31008f.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            iVar.f31004a = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new i.h(iVar.f31004a));
            if (iVar.f31007e == null) {
                iVar.f31007e = new i.c();
            }
            int i13 = iVar.A;
            if (i13 != -1) {
                iVar.f31004a.setOverScrollMode(i13);
            }
            iVar.f31005b = (LinearLayout) iVar.f31008f.inflate(R.layout.design_navigation_item_header, (ViewGroup) iVar.f31004a, false);
            iVar.f31004a.setAdapter(iVar.f31007e);
        }
        addView(iVar.f31004a);
        if (e10.l(27)) {
            int i14 = e10.i(27, 0);
            i.c cVar = iVar.f31007e;
            if (cVar != null) {
                cVar.f31032f = true;
            }
            getMenuInflater().inflate(i14, hVar);
            i.c cVar2 = iVar.f31007e;
            if (cVar2 != null) {
                cVar2.f31032f = false;
            }
            iVar.c(false);
        }
        if (e10.l(9)) {
            iVar.f31005b.addView(iVar.f31008f.inflate(e10.i(9, 0), (ViewGroup) iVar.f31005b, false));
            NavigationMenuView navigationMenuView3 = iVar.f31004a;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        e10.n();
        this.f12750m = new d(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f12750m);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f12745h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f12746i.f31007e.i((j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* loaded from: classes2.dex */
    public class a implements h.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
        }
    }

    public void setNavigationItemSelectedListener(b bVar) {
    }
}
