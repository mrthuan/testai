package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class D8 {
    public static String[] A0D = {"noL", "G1jHhVyg98ySaI4z53KV1", "b", "fvCE7VWYYz7k3T7kDHLiEZoK7CGAkaBB", "ZtfNba1ZWzV3M3XLiIRFTuzciE54fxB9", "uHtea0jMeQZ2HH8", "", "Y4q"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C9 A0C;

    public D8(C9 c92) {
        this.A0C = c92;
    }

    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0C.AFw(this.A04, z10 ? 1 : 0, (int) (this.A01 - this.A03), i10, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j10, int i10) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            this.A0B = false;
        } else if (!this.A05 && !this.A06) {
        } else {
            if (this.A09) {
                A00(i10 + ((int) (j10 - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A09 = true;
            this.A0A = this.A08;
        }
    }

    public final void A03(long j10, int i10, int i11, long j11) {
        boolean z10 = false;
        this.A06 = false;
        this.A05 = false;
        this.A02 = j11;
        this.A00 = 0;
        this.A01 = j10;
        if (i11 >= 32) {
            if (!this.A0B && this.A09) {
                A00(i10);
                this.A09 = false;
            }
            if (i11 <= 34) {
                this.A05 = !this.A0B;
                this.A0B = true;
            }
        }
        this.A08 = i11 >= 16 && i11 <= 21;
        this.A07 = (this.A08 || i11 <= 9) ? true : true;
        String[] strArr = A0D;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0D[4] = "m7KNvRLlG2HGx5CxJtjuXbqCPolwiEk2";
    }

    public final void A04(byte[] bArr, int i10, int i11) {
        if (this.A07) {
            int i12 = (i10 + 2) - this.A00;
            if (A0D[3].charAt(21) == '7') {
                throw new RuntimeException();
            }
            A0D[6] = "4fmXv5sAMrrm0rmwROK6LVqun";
            if (i12 < i11) {
                int headerOffset = bArr[i12];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i11 - i10;
        }
    }
}
