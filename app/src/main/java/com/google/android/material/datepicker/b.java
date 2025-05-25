package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.f0;
import x0.n0;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f12408a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f12409b;
    public final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f12410d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12411e;

    /* renamed from: f  reason: collision with root package name */
    public final f9.m f12412f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, f9.m mVar, Rect rect) {
        t0.t(rect.left);
        t0.t(rect.top);
        t0.t(rect.right);
        t0.t(rect.bottom);
        this.f12408a = rect;
        this.f12409b = colorStateList2;
        this.c = colorStateList;
        this.f12410d = colorStateList3;
        this.f12411e = i10;
        this.f12412f = mVar;
    }

    public static b a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t0.s("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, e8.a.B);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = b9.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = b9.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = b9.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        f9.m mVar = new f9.m(f9.m.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, mVar, rect);
    }

    public final void b(TextView textView) {
        f9.h hVar = new f9.h();
        f9.h hVar2 = new f9.h();
        f9.m mVar = this.f12412f;
        hVar.setShapeAppearanceModel(mVar);
        hVar2.setShapeAppearanceModel(mVar);
        hVar.n(this.c);
        hVar.t(this.f12411e);
        hVar.s(this.f12410d);
        ColorStateList colorStateList = this.f12409b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), hVar, hVar2);
        Rect rect = this.f12408a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        f0.d.q(textView, insetDrawable);
    }
}
