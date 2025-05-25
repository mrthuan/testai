package com.google.android.material.progressindicator;

import a9.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b9.c;
import e8.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;

/* loaded from: classes2.dex */
public final class CircularProgressIndicatorSpec extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f12779g;

    /* renamed from: h  reason: collision with root package name */
    public int f12780h;

    /* renamed from: i  reason: collision with root package name */
    public int f12781i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018246);
        int i11 = CircularProgressIndicator.f12778n;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray d10 = s.d(context, attributeSet, a.f16490k, i10, 2132018246, new int[0]);
        this.f12779g = Math.max(c.c(context, d10, 2, dimensionPixelSize), this.f397a * 2);
        this.f12780h = c.c(context, d10, 1, dimensionPixelSize2);
        this.f12781i = d10.getInt(0, 0);
        d10.recycle();
    }

    @Override // a9.b
    public final void a() {
    }
}
