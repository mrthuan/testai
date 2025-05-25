package com.inmobi.media;

/* renamed from: com.inmobi.media.l3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1706l3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15274a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15275b;
    public final float c;

    public C1706l3(int i10, float f10, int i11) {
        this.f15274a = i10;
        this.f15275b = i11;
        this.c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1706l3)) {
            return false;
        }
        C1706l3 c1706l3 = (C1706l3) obj;
        if (this.f15274a == c1706l3.f15274a && this.f15275b == c1706l3.f15275b && Float.compare(this.c, c1706l3.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15275b;
        return Float.floatToIntBits(this.c) + ((i10 + (this.f15274a * 31)) * 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f15274a + ", height=" + this.f15275b + ", density=" + this.c + ')';
    }
}
