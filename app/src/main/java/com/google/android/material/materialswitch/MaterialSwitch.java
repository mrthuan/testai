package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.u0;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;

/* loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f12675i0 = {R.attr.state_with_icon};
    public Drawable T;
    public Drawable U;
    public Drawable V;
    public Drawable W;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f12676a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f12677b0;

    /* renamed from: c0  reason: collision with root package name */
    public PorterDuff.Mode f12678c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f12679d0;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f12680e0;

    /* renamed from: f0  reason: collision with root package name */
    public PorterDuff.Mode f12681f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f12682g0;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f12683h0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f10) {
        if (drawable != null && colorStateList != null) {
            a.b.g(drawable, o0.a.b(f10, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public final void f() {
        this.T = s8.a.b(this.T, this.f12676a0, getThumbTintMode());
        this.U = s8.a.b(this.U, this.f12677b0, this.f12678c0);
        i();
        super.setThumbDrawable(s8.a.a(this.T, this.U));
        refreshDrawableState();
    }

    public final void g() {
        this.V = s8.a.b(this.V, this.f12679d0, getTrackTintMode());
        this.W = s8.a.b(this.W, this.f12680e0, this.f12681f0);
        i();
        Drawable drawable = this.V;
        if (drawable != null && this.W != null) {
            drawable = new LayerDrawable(new Drawable[]{this.V, this.W});
        } else if (drawable == null) {
            drawable = this.W;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.T;
    }

    public Drawable getThumbIconDrawable() {
        return this.U;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f12677b0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f12678c0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f12676a0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.W;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f12680e0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f12681f0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.V;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f12679d0;
    }

    public final void i() {
        if (this.f12676a0 == null && this.f12677b0 == null && this.f12679d0 == null && this.f12680e0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f12676a0;
        if (colorStateList != null) {
            h(this.T, colorStateList, this.f12682g0, this.f12683h0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f12677b0;
        if (colorStateList2 != null) {
            h(this.U, colorStateList2, this.f12682g0, this.f12683h0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f12679d0;
        if (colorStateList3 != null) {
            h(this.V, colorStateList3, this.f12682g0, this.f12683h0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f12680e0;
        if (colorStateList4 != null) {
            h(this.W, colorStateList4, this.f12682g0, this.f12683h0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        i();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.U != null) {
            View.mergeDrawableStates(onCreateDrawableState, f12675i0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : onCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f12682g0 = iArr;
        this.f12683h0 = s8.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.T = drawable;
        f();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.U = drawable;
        f();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(m.a.a(getContext(), i10));
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f12677b0 = colorStateList;
        f();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f12678c0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f12676a0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        f();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.W = drawable;
        g();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(m.a.a(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f12680e0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f12681f0 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.V = drawable;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f12679d0 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018103), attributeSet, i10);
        Context context2 = getContext();
        this.T = super.getThumbDrawable();
        this.f12676a0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.V = super.getTrackDrawable();
        this.f12679d0 = super.getTrackTintList();
        super.setTrackTintList(null);
        u0 e10 = s.e(context2, attributeSet, e8.a.H, i10, 2132018103, new int[0]);
        this.U = e10.e(0);
        this.f12677b0 = e10.b(1);
        this.f12678c0 = w.f(e10.h(2, -1), PorterDuff.Mode.SRC_IN);
        this.W = e10.e(3);
        this.f12680e0 = e10.b(4);
        this.f12681f0 = w.f(e10.h(5, -1), PorterDuff.Mode.SRC_IN);
        e10.n();
        setEnforceSwitchWidth(false);
        f();
        g();
    }
}
