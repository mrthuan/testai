package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import t8.a;
import w8.s;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[][] f12933a0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public final a T;
    public ColorStateList U;
    public ColorStateList V;
    public boolean W;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.U == null) {
            int K = t0.K(this, R.attr.colorSurface);
            int K2 = t0.K(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.T;
            if (aVar.f29971a) {
                float f10 = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f10 += f0.i.i((View) parent);
                }
                dimension += f10;
            }
            int a10 = aVar.a(dimension, K);
            this.U = new ColorStateList(f12933a0, new int[]{t0.e0(1.0f, K, K2), a10, t0.e0(0.38f, K, K2), a10});
        }
        return this.U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.V == null) {
            int K = t0.K(this, R.attr.colorSurface);
            int K2 = t0.K(this, R.attr.colorControlActivated);
            int K3 = t0.K(this, R.attr.colorOnSurface);
            this.V = new ColorStateList(f12933a0, new int[]{t0.e0(0.54f, K, K2), t0.e0(0.32f, K, K3), t0.e0(0.12f, K, K2), t0.e0(0.12f, K, K3)});
        }
        return this.V;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.W = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018253), attributeSet, i10);
        Context context2 = getContext();
        this.T = new a(context2);
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16474a0, i10, 2132018253, new int[0]);
        this.W = d10.getBoolean(0, false);
        d10.recycle();
    }
}
