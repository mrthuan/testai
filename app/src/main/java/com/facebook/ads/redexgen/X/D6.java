package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class D6 {
    public static String[] A0G = {"rO0OZJw6z6", "aaZ1PuqlEnLnLH0uh8kye4H6vupShwsu", "5d2n1ynsTscs64Ie1ZijKw8edeUX", "XdYDAAdfzTXMLa7AW4crlcJNhIryq833", "hHVLoZdNuWeEAEugaul4BO4ImQQR7t2p", "4twoC8d7INBRsRXpAg06MCBSmEgkqQ0x", "xsd05V2KW0Qtu4gWH7wQnZjvefOmt", "hPU0XcOuH3hqUbmwT7ddYXSmCiMt"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C0864Hz A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public D6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(D6 d62) {
        if (this.A0F) {
            if (!d62.A0F || this.A03 != d62.A03 || this.A07 != d62.A07 || this.A0C != d62.A0C) {
                return true;
            }
            if (this.A0B && d62.A0B && this.A0A != d62.A0A) {
                return true;
            }
            if (this.A05 != d62.A05 && (this.A05 == 0 || d62.A05 == 0)) {
                return true;
            }
            if (this.A09.A04 == 0 && d62.A09.A04 == 0 && (this.A06 != d62.A06 || this.A02 != d62.A02)) {
                return true;
            }
            if ((this.A09.A04 == 1 && d62.A09.A04 == 1 && (this.A00 != d62.A00 || this.A01 != d62.A01)) || this.A0E != d62.A0E) {
                return true;
            }
            if (this.A0E && d62.A0E && this.A04 != d62.A04) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i10) {
        this.A08 = i10;
        this.A0D = true;
    }

    public final void A04(C0864Hz c0864Hz, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.A09 = c0864Hz;
        this.A05 = i10;
        this.A08 = i11;
        this.A03 = i12;
        this.A07 = i13;
        this.A0C = z10;
        this.A0B = z11;
        this.A0A = z12;
        this.A0E = z13;
        this.A04 = i14;
        this.A06 = i15;
        this.A02 = i16;
        this.A00 = i17;
        this.A01 = i18;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        if (this.A0D) {
            int i10 = this.A08;
            if (A0G[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "pPTeXoiLCEtvkN2q3qoF43bpwUDrc";
            strArr[5] = "VbLm6dZxTDBAJEz4a5qL5XAV7QNWTJHt";
            if (i10 == 7 || this.A08 == 2) {
                return true;
            }
        }
        return false;
    }
}
