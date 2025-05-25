package com.google.android.material.progressindicator;

import a9.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e8.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;

/* loaded from: classes2.dex */
public final class LinearProgressIndicatorSpec extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f12783g;

    /* renamed from: h  reason: collision with root package name */
    public int f12784h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12785i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // a9.b
    public final void a() {
        if (this.f12783g == 0) {
            if (this.f398b <= 0) {
                if (this.c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018258);
        int i11 = LinearProgressIndicator.f12782n;
        TypedArray d10 = s.d(context, attributeSet, a.f16502w, R.attr.linearProgressIndicatorStyle, 2132018258, new int[0]);
        this.f12783g = d10.getInt(0, 1);
        this.f12784h = d10.getInt(1, 0);
        d10.recycle();
        a();
        this.f12785i = this.f12784h == 1;
    }
}
