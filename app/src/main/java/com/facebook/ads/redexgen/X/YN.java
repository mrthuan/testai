package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class YN implements InterfaceC0742Cq, C6 {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ YM A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        int A0B = IK.A0B(this.A02, this.A04.A04(j10), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C7 c72 = new C7(A03, this.A00 + this.A03[A0B]);
        return (A03 >= j10 || A0B == this.A02.length - 1) ? new C5(c72) : new C5(c72, new C7(this.A04.A03(this.A02[A0B + 1]), this.A00 + this.A03[A0B + 1]));
    }

    public YN(YM ym2) {
        this.A04 = ym2;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(I4 i42) {
        i42.A0Z(1);
        int length = i42.A0G();
        int i10 = length / 18;
        this.A02 = new long[i10];
        this.A03 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A02[i11] = i42.A0L();
            this.A03[i11] = i42.A0L();
            i42.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    public final C6 A58() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        C0856Hr c0856Hr;
        c0856Hr = this.A04.A01;
        return c0856Hr.A01();
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    public final long AEl(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A01 >= 0) {
            long result = -(this.A01 + 2);
            this.A01 = -1L;
            return result;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    public final long AGy(long j10) {
        long A04 = this.A04.A04(j10);
        long granule = this.A02[IK.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
