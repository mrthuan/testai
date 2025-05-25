package com.inmobi.media;

/* renamed from: com.inmobi.media.z4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1889z4 {

    /* renamed from: a  reason: collision with root package name */
    public final S5 f15701a;

    /* renamed from: b  reason: collision with root package name */
    public final double f15702b;

    public C1889z4(S5 logLevel, double d10) {
        kotlin.jvm.internal.g.e(logLevel, "logLevel");
        this.f15701a = logLevel;
        this.f15702b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889z4)) {
            return false;
        }
        C1889z4 c1889z4 = (C1889z4) obj;
        if (this.f15701a == c1889z4.f15701a && Double.compare(this.f15702b, c1889z4.f15702b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15702b);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + (this.f15701a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfiguration(logLevel=" + this.f15701a + ", samplingFactor=" + this.f15702b + ')';
    }
}
