package com.inmobi.media;

/* renamed from: com.inmobi.media.x3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1862x3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15623a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15624b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15625d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15626e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15627f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15628g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15629h;

    /* renamed from: i  reason: collision with root package name */
    public final long f15630i;

    /* renamed from: j  reason: collision with root package name */
    public final long f15631j;

    /* renamed from: k  reason: collision with root package name */
    public String f15632k;

    public C1862x3(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f15623a = i10;
        this.f15624b = j10;
        this.c = j11;
        this.f15625d = j12;
        this.f15626e = i11;
        this.f15627f = i12;
        this.f15628g = i13;
        this.f15629h = i14;
        this.f15630i = j13;
        this.f15631j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862x3)) {
            return false;
        }
        C1862x3 c1862x3 = (C1862x3) obj;
        if (this.f15623a == c1862x3.f15623a && this.f15624b == c1862x3.f15624b && this.c == c1862x3.c && this.f15625d == c1862x3.f15625d && this.f15626e == c1862x3.f15626e && this.f15627f == c1862x3.f15627f && this.f15628g == c1862x3.f15628g && this.f15629h == c1862x3.f15629h && this.f15630i == c1862x3.f15630i && this.f15631j == c1862x3.f15631j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15624b;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.c;
        int i11 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f15625d;
        int i12 = (int) (j12 ^ (j12 >>> 32));
        int i13 = this.f15626e;
        int i14 = this.f15627f;
        int i15 = this.f15628g;
        int i16 = this.f15629h;
        long j13 = this.f15630i;
        int i17 = (int) (j13 ^ (j13 >>> 32));
        long j14 = this.f15631j;
        return ((int) (j14 ^ (j14 >>> 32))) + ((i17 + ((i16 + ((i15 + ((i14 + ((i13 + ((i12 + ((i11 + ((i10 + (this.f15623a * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f15623a + ", timeToLiveInSec=" + this.f15624b + ", processingInterval=" + this.c + ", ingestionLatencyInSec=" + this.f15625d + ", minBatchSizeWifi=" + this.f15626e + ", maxBatchSizeWifi=" + this.f15627f + ", minBatchSizeMobile=" + this.f15628g + ", maxBatchSizeMobile=" + this.f15629h + ", retryIntervalWifi=" + this.f15630i + ", retryIntervalMobile=" + this.f15631j + ')';
    }
}
