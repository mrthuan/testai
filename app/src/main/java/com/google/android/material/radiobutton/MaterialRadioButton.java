package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import b1.c;
import l9.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;

/* loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f12786g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f12787e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12788f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12787e == null) {
            int K = t0.K(this, R.attr.colorControlActivated);
            int K2 = t0.K(this, R.attr.colorOnSurface);
            int K3 = t0.K(this, R.attr.colorSurface);
            this.f12787e = new ColorStateList(f12786g, new int[]{t0.e0(1.0f, K3, K), t0.e0(0.54f, K3, K2), t0.e0(0.38f, K3, K2), t0.e0(0.38f, K3, K2)});
        }
        return this.f12787e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12788f && c.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f12788f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, 2132018252), attributeSet, i10);
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.F, i10, 2132018252, new int[0]);
        if (d10.hasValue(0)) {
            c.c(this, b9.c.a(context2, d10, 0));
        }
        this.f12788f = d10.getBoolean(1, false);
        d10.recycle();
    }
}
