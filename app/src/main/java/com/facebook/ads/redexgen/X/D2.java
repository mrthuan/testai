package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class D2 extends XC {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC0833Gu A0A;
    public final InterfaceC0847Hi A0B;

    public D2(TrackGroup trackGroup, int[] iArr, InterfaceC0833Gu interfaceC0833Gu, long j10, long j11, long j12, float f10, float f11, long j13, InterfaceC0847Hi interfaceC0847Hi) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0833Gu;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f10;
        this.A05 = f11;
        this.A09 = j13;
        this.A0B = interfaceC0847Hi;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j10) {
        long A6V = ((float) this.A0A.A6V()) * this.A04;
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j10 == Long.MIN_VALUE || !A00(i11, j10)) {
                if (Math.round(A7U(i11).A04 * this.A00) <= A6V) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.XC, com.facebook.ads.redexgen.X.InterfaceC0824Gl
    public final void A5q() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0824Gl
    public final int A8J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.XC, com.facebook.ads.redexgen.X.InterfaceC0824Gl
    public final void AD5(float f10) {
        this.A00 = f10;
    }
}
