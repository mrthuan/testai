package com.tom_roush.pdfbox.util;

/* loaded from: classes2.dex */
public final class Vector {

    /* renamed from: x  reason: collision with root package name */
    private final float f15997x;

    /* renamed from: y  reason: collision with root package name */
    private final float f15998y;

    public Vector(float f10, float f11) {
        this.f15997x = f10;
        this.f15998y = f11;
    }

    public float getX() {
        return this.f15997x;
    }

    public float getY() {
        return this.f15998y;
    }

    public Vector scale(float f10) {
        return new Vector(this.f15997x * f10, this.f15998y * f10);
    }

    public String toString() {
        return "(" + this.f15997x + ", " + this.f15998y + ")";
    }
}
