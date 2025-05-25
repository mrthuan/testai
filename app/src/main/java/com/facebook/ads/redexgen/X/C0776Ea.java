package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ea  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0776Ea implements InterfaceC1270Ya {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0776Ea(long j10, long j11, C3 c32) {
        this.A04 = j11;
        this.A01 = c32.A02;
        this.A00 = c32.A00;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j10 - j11;
        this.A03 = A8W(j10);
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        if (this.A02 == -1) {
            return new C5(new C7(0L, this.A04));
        }
        long positionOffset = this.A01;
        long j11 = ((this.A00 * j10) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long A0E = IK.A0E(j11 * positionOffset2, 0L, this.A02 - this.A01);
        long j12 = this.A04 + A0E;
        long A8W = A8W(j12);
        C7 seekPoint = new C7(A8W, j12);
        if (A8W >= j10 || A0E == this.A02 - this.A01) {
            return new C5(seekPoint);
        }
        long seekTimeUs = this.A01 + j12;
        long seekPosition = A8W(seekTimeUs);
        return new C5(seekPoint, new C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1270Ya
    public final long A8W(long j10) {
        return ((Math.max(0L, j10 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return this.A02 != -1;
    }
}
