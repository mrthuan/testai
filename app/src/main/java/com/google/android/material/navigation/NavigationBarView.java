package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.u0;
import f9.h;
import f9.m;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import q.f;
import w8.s;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f12738e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final y8.b f12739a;

    /* renamed from: b  reason: collision with root package name */
    public final NavigationBarMenuView f12740b;
    public final y8.c c;

    /* renamed from: d  reason: collision with root package name */
    public f f12741d;

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    /* loaded from: classes2.dex */
    public static class d extends c1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public Bundle c;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeBundle(this.c);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(l9.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        y8.c cVar = new y8.c();
        this.c = cVar;
        Context context2 = getContext();
        u0 e10 = s.e(context2, attributeSet, e8.a.M, i10, i11, 10, 9);
        y8.b bVar = new y8.b(context2, getClass(), getMaxItemCount());
        this.f12739a = bVar;
        NavigationBarMenuView a10 = a(context2);
        this.f12740b = a10;
        cVar.f32093a = a10;
        cVar.c = 1;
        a10.setPresenter(cVar);
        bVar.b(cVar, bVar.f2051a);
        getContext();
        cVar.f32093a.C = bVar;
        if (e10.l(5)) {
            a10.setIconTintList(e10.b(5));
        } else {
            a10.setIconTintList(a10.b());
        }
        setItemIconSize(e10.d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.l(10)) {
            setItemTextAppearanceInactive(e10.i(10, 0));
        }
        if (e10.l(9)) {
            setItemTextAppearanceActive(e10.i(9, 0));
        }
        if (e10.l(11)) {
            setItemTextColor(e10.b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            h hVar = new h();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                hVar.n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            hVar.k(context2);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(this, hVar);
        }
        if (e10.l(7)) {
            setItemPaddingTop(e10.d(7, 0));
        }
        if (e10.l(6)) {
            setItemPaddingBottom(e10.d(6, 0));
        }
        if (e10.l(1)) {
            setElevation(e10.d(1, 0));
        }
        a.b.h(getBackground().mutate(), b9.c.b(context2, e10, 0));
        setLabelVisibilityMode(e10.f2688b.getInteger(12, -1));
        int i12 = e10.i(3, 0);
        if (i12 != 0) {
            a10.setItemBackgroundRes(i12);
        } else {
            setItemRippleColor(b9.c.b(context2, e10, 8));
        }
        int i13 = e10.i(2, 0);
        if (i13 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i13, e8.a.L);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(b9.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new m(m.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0)));
            obtainStyledAttributes.recycle();
        }
        if (e10.l(13)) {
            int i14 = e10.i(13, 0);
            cVar.f32094b = true;
            getMenuInflater().inflate(i14, bVar);
            cVar.f32094b = false;
            cVar.c(true);
        }
        e10.n();
        addView(a10);
        bVar.f2054e = new a();
    }

    private MenuInflater getMenuInflater() {
        if (this.f12741d == null) {
            this.f12741d = new f(getContext());
        }
        return this.f12741d;
    }

    public abstract NavigationBarMenuView a(Context context);

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f12740b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f12740b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f12740b.getItemActiveIndicatorMarginHorizontal();
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.f12740b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f12740b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f12740b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f12740b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f12740b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f12740b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f12740b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f12740b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f12740b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f12740b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f12740b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f12740b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f12740b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f12739a;
    }

    public o getMenuView() {
        return this.f12740b;
    }

    public y8.c getPresenter() {
        return this.c;
    }

    public int getSelectedItemId() {
        return this.f12740b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.X(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f5506a);
        this.f12739a.t(dVar.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.c = bundle;
        this.f12739a.v(bundle);
        return dVar;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        b.b.V(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f12740b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f12740b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f12740b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f12740b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.f12740b.setItemActiveIndicatorShapeAppearance(mVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f12740b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f12740b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f12740b.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f12740b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f12740b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f12740b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f12740b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12740b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f12740b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f12740b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12740b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f12740b;
        if (navigationBarMenuView.getLabelVisibilityMode() != i10) {
            navigationBarMenuView.setLabelVisibilityMode(i10);
            this.c.c(false);
        }
    }

    public void setSelectedItemId(int i10) {
        y8.b bVar = this.f12739a;
        MenuItem findItem = bVar.findItem(i10);
        if (findItem != null && !bVar.q(findItem, this.c, 0)) {
            findItem.setChecked(true);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements h.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            int i10 = NavigationBarView.f12738e;
            NavigationBarView navigationBarView = NavigationBarView.this;
            navigationBarView.getClass();
            navigationBarView.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
    }
}
