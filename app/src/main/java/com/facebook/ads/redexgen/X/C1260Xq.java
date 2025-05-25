package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1260Xq implements C6 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1260Xq(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.A06 = i10;
        this.A07 = i11;
        this.A02 = i12;
        this.A04 = i13;
        this.A03 = i14;
        this.A05 = i15;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j10) {
        long positionOffset = Math.max(0L, j10 - this.A01);
        long j11 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j11 / positionOffset2;
    }

    public final void A06(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        long numFrames = this.A07;
        return (1000000 * (this.A00 / this.A04)) / numFrames;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        long positionOffset = this.A04;
        long j11 = ((this.A02 * j10) / 1000000) / positionOffset;
        long positionOffset2 = this.A04;
        long A0E = IK.A0E(j11 * positionOffset2, 0L, this.A00 - this.A04);
        long j12 = this.A01 + A0E;
        long A05 = A05(j12);
        C7 seekPoint = new C7(A05, j12);
        if (A05 >= j10 || A0E == this.A00 - this.A04) {
            return new C5(seekPoint);
        }
        long seekTimeUs = this.A04 + j12;
        long seekPosition = A05(seekTimeUs);
        return new C5(seekPoint, new C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }
}
