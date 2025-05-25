package com.airbnb.lottie.model;

import androidx.activity.f;

/* loaded from: classes.dex */
public final class DocumentData {

    /* renamed from: a  reason: collision with root package name */
    public final String f6042a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6043b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final Justification f6044d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6045e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6046f;

    /* renamed from: g  reason: collision with root package name */
    public final float f6047g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6048h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6049i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6050j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6051k;

    /* loaded from: classes.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f10, Justification justification, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        this.f6042a = str;
        this.f6043b = str2;
        this.c = f10;
        this.f6044d = justification;
        this.f6045e = i10;
        this.f6046f = f11;
        this.f6047g = f12;
        this.f6048h = i11;
        this.f6049i = i12;
        this.f6050j = f13;
        this.f6051k = z10;
    }

    public final int hashCode() {
        String str = this.f6043b;
        int ordinal = ((this.f6044d.ordinal() + (((int) (f.h(str, this.f6042a.hashCode() * 31, 31) + this.c)) * 31)) * 31) + this.f6045e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f6046f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f6048h;
    }
}
