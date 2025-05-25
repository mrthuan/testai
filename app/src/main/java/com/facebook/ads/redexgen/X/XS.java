package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class XS extends AM {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public XS(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, Object obj) {
        this.A01 = j10;
        this.A05 = j11;
        this.A00 = j12;
        this.A03 = j13;
        this.A04 = j14;
        this.A02 = j15;
        this.A08 = z10;
        this.A07 = z11;
        this.A06 = obj;
    }

    public XS(long j10, long j11, long j12, long j13, boolean z10, boolean z11, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, obj);
    }

    public XS(long j10, boolean z10, boolean z11, Object obj) {
        this(j10, j10, 0L, 0L, z10, z11, obj);
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final AK A0A(int i10, AK ak2, boolean z10) {
        AbstractC0844Hf.A00(i10, 0, 1);
        return ak2.A0B(null, z10 ? A09 : null, 0, this.A00, -this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final AL A0D(int i10, AL al2, boolean z10, long j10) {
        Object obj;
        AbstractC0844Hf.A00(i10, 0, 1);
        if (z10) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j11 = this.A02;
        if (this.A07 && j10 != 0) {
            if (this.A03 == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                j11 += j10;
                if (j11 > this.A03) {
                    j11 = -9223372036854775807L;
                }
            }
        }
        return al2.A04(obj, this.A01, this.A05, this.A08, this.A07, j11, this.A03, 0, 0, this.A04);
    }
}
