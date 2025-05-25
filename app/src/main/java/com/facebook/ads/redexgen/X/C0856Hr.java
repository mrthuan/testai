package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0856Hr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public C0856Hr(byte[] bArr, int i10) {
        I3 i32 = new I3(bArr);
        i32.A07(i10 * 8);
        this.A04 = i32.A04(16);
        this.A02 = i32.A04(16);
        this.A05 = i32.A04(24);
        this.A03 = i32.A04(24);
        this.A06 = i32.A04(20);
        this.A01 = i32.A04(3) + 1;
        this.A00 = i32.A04(5) + 1;
        this.A07 = ((i32.A04(4) & 15) << 32) | (i32.A04(32) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / this.A06;
    }
}
