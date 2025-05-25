package com.inmobi.media;

/* renamed from: com.inmobi.media.fa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1629fa {

    /* renamed from: a  reason: collision with root package name */
    public final int f15075a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15076b;

    public C1629fa(int i10, int i11) {
        this.f15075a = i10;
        this.f15076b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1629fa)) {
            return false;
        }
        C1629fa c1629fa = (C1629fa) obj;
        if (this.f15075a == c1629fa.f15075a && this.f15076b == c1629fa.f15076b && Double.compare(1.0d, 1.0d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15076b;
        long doubleToLongBits = Double.doubleToLongBits(1.0d);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + ((i10 + (this.f15075a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicy(maxNoOfRetries=");
        sb2.append(this.f15075a);
        sb2.append(", delayInMillis=");
        return a6.h.g(sb2, this.f15076b, ", delayFactor=1.0)");
    }
}
