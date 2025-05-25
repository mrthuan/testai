package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DA {
    public static String[] A08 = {"ZunWLTCOIeJYFJffUw9", "v7UW83uB4CXpuAJPiqL", "m2soIO3PVQ24y4mXJp6BPxoiSRSk", "lWXZgTR79dXfBN4bKYDC9NT5SIZThBqa", "jJ62S2YkTrNcVcfPKr8ssmQcBjICfRdL", "nHkGt1MBBsIxXO9Vrc3pA339", "iQBWmVjB1ByHXi", "McIj8fqGFOMO4oIbQR6Ew6MhQAT"};
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final D3 A05;
    public final I3 A06 = new I3(new byte[64]);
    public final IG A07;

    public DA(D3 d32, IG ig2) {
        this.A05 = d32;
        this.A07 = ig2;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            long pts = this.A06.A04(3) << 30;
            this.A06.A08(1);
            long pts2 = pts | (this.A06.A04(15) << 15);
            this.A06.A08(1);
            long pts3 = pts2 | this.A06.A04(15);
            this.A06.A08(1);
            if (!this.A04) {
                boolean z10 = this.A02;
                if (A08[6].length() != 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[0] = "feqv4rRQ7ZP5D55JX2e";
                strArr[1] = "tJttPKovNmfgsPQIHKZ";
                if (z10) {
                    this.A06.A08(4);
                    this.A06.A08(1);
                    long A04 = (this.A06.A04(3) << 30) | (this.A06.A04(15) << 15);
                    I3 i32 = this.A06;
                    if (A08[5].length() != 24) {
                        A08[2] = "k2SpdwxF2GRIVTLIk4dksKuAMULx";
                        i32.A08(1);
                        this.A06.A08(1);
                        this.A07.A07(A04 | this.A06.A04(15));
                        this.A04 = true;
                    } else {
                        A08[2] = "VPNHH6bjz4BHnLiGSe5ehxt0fgft";
                        i32.A08(1);
                        this.A06.A08(1);
                        this.A07.A07(A04 | this.A06.A04(15));
                        this.A04 = true;
                    }
                }
            }
            this.A01 = this.A07.A07(pts3);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AG6();
    }

    public final void A03(I4 i42) throws A0 {
        i42.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        i42.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AEM(this.A01, true);
        this.A05.A4n(i42);
        this.A05.AEL();
    }
}
