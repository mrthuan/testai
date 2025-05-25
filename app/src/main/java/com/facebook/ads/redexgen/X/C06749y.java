package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06749y {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Et A04;
    public final boolean A05;
    public final boolean A06;

    public C06749y(Et et, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = et;
        this.A03 = j10;
        this.A02 = j11;
        this.A00 = j12;
        this.A01 = j13;
        this.A06 = z10;
        this.A05 = z11;
    }

    public final C06749y A00(int i10) {
        return new C06749y(this.A04.A00(i10), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C06749y A01(long j10) {
        return new C06749y(this.A04, j10, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
