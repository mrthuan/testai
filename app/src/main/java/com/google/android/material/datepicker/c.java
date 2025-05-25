package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f12413a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12414b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12415d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12416e;

    /* renamed from: f  reason: collision with root package name */
    public final b f12417f;

    /* renamed from: g  reason: collision with root package name */
    public final b f12418g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f12419h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b9.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, e8.a.A);
        this.f12413a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f12418g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f12414b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = b9.c.a(context, obtainStyledAttributes, 6);
        this.f12415d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f12416e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f12417f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f12419h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
