package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;

/* loaded from: classes2.dex */
public class X6 {

    /* renamed from: a  reason: collision with root package name */
    public final Point f14841a;

    /* renamed from: b  reason: collision with root package name */
    public final Point f14842b;
    public final Point c;

    /* renamed from: d  reason: collision with root package name */
    public final Point f14843d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14844e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14845f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14846g;

    /* renamed from: h  reason: collision with root package name */
    public final float f14847h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14848i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14849j;

    /* renamed from: k  reason: collision with root package name */
    public final K7 f14850k;

    public X6() {
        this.f14841a = new Point(0, 0);
        this.c = new Point(0, 0);
        this.f14842b = new Point(0, 0);
        this.f14843d = new Point(0, 0);
        this.f14844e = "none";
        this.f14845f = "straight";
        this.f14847h = 10.0f;
        this.f14848i = "#ff000000";
        this.f14849j = "#00000000";
        this.f14846g = "fill";
        this.f14850k = null;
    }

    public String a() {
        String str = this.f14849j;
        Locale locale = Locale.US;
        return a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public X6(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String contentMode, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, K7 k72) {
        kotlin.jvm.internal.g.e(contentMode, "contentMode");
        kotlin.jvm.internal.g.e(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.g.e(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.g.e(borderColor, "borderColor");
        kotlin.jvm.internal.g.e(backgroundColor, "backgroundColor");
        this.f14841a = new Point(i12, i13);
        this.f14842b = new Point(i16, i17);
        this.c = new Point(i10, i11);
        this.f14843d = new Point(i14, i15);
        this.f14844e = borderStrokeStyle;
        this.f14845f = borderCornerStyle;
        this.f14847h = 10.0f;
        this.f14846g = contentMode;
        this.f14848i = borderColor.length() == 0 ? "#ff000000" : borderColor;
        this.f14849j = backgroundColor.length() == 0 ? "#00000000" : backgroundColor;
        this.f14850k = k72;
    }
}
