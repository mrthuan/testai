package com.inmobi.media;

/* loaded from: classes2.dex */
public final class Y2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14870a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14871b;
    public final long c;

    public Y2(long j10, long j11, long j12) {
        this.f14870a = j10;
        this.f14871b = j11;
        this.c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        if (this.f14870a == y22.f14870a && this.f14871b == y22.f14871b && this.c == y22.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14870a;
        long j11 = this.f14871b;
        int i10 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.c;
        return ((int) (j12 ^ (j12 >>> 32))) + ((i10 + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        return "DeviceMemoryInfo(maxHeapSize=" + this.f14870a + ", freeHeapSize=" + this.f14871b + ", currentHeapSize=" + this.c + ')';
    }
}
