package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import b9.c;
import f9.h;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: a  reason: collision with root package name */
    public final h f12486a;

    /* renamed from: b  reason: collision with root package name */
    public int f12487b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f12488d;

    /* renamed from: e  reason: collision with root package name */
    public int f12489e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.f12489e;
    }

    public int getDividerInsetStart() {
        return this.f12488d;
    }

    public int getDividerThickness() {
        return this.f12487b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int width;
        int i11;
        super.onDraw(canvas);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        boolean z10 = true;
        if (f0.e.d(this) != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f12489e;
        } else {
            i10 = this.f12488d;
        }
        if (z10) {
            width = getWidth();
            i11 = this.f12488d;
        } else {
            width = getWidth();
            i11 = this.f12489e;
        }
        int i12 = width - i11;
        h hVar = this.f12486a;
        hVar.setBounds(i10, 0, i12, getBottom() - getTop());
        hVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f12487b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.c != i10) {
            this.c = i10;
            this.f12486a.n(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(a.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f12489e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f12488d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f12487b != i10) {
            this.f12487b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018284), attributeSet, i10);
        Context context2 = getContext();
        this.f12486a = new h();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.E, i10, 2132018284, new int[0]);
        this.f12487b = d10.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f12488d = d10.getDimensionPixelOffset(2, 0);
        this.f12489e = d10.getDimensionPixelOffset(1, 0);
        setDividerColor(c.a(context2, d10, 0).getDefaultColor());
        d10.recycle();
    }
}
