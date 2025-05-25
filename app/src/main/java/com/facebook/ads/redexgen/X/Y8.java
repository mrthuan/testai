package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Y8 implements D3 {
    public static byte[] A06;
    public static String[] A07 = {"zUGrZ70EHgg4g8jXzpavLDW1HDXUjcvk", "XSRjUF9sTEDdiXUxwO45u1DbSW314W2J", "nLsxxxsHKOcuDjVroXgLpQGJx0KxE44c", "bndBw", "3JgXmgjTjEsbQfCoCUHiRi58jKtnVEg9", "AlsRl", "ykJWFh5Q95Nl6YL21erwEseKjv08tJJZ", "ViwjESz0dBuyLmVYZ7snsHdQwrDUg30e"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<DE> A04;
    public final C9[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
            if (A07[7].charAt(14) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "dfNOx";
            strArr[3] = "k4245";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{105, 120, 120, 100, 97, 107, 105, 124, 97, 103, 102, Field.FILLIN, 108, 126, 106, 123, 125, 106, 123};
    }

    static {
        A01();
    }

    public Y8(List<DE> list) {
        this.A04 = list;
        this.A05 = new C9[list.size()];
    }

    private boolean A02(I4 i42, int i10) {
        if (i42.A04() == 0) {
            return false;
        }
        int A0E = i42.A0E();
        if (A07[2].charAt(4) != 'H') {
            String[] strArr = A07;
            strArr[5] = "AT2i3";
            strArr[3] = "4HMu9";
            if (A0E != i10) {
                this.A03 = false;
            }
            int i11 = this.A00 - 1;
            if (A07[1].charAt(2) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "zNNuT";
            strArr2[3] = "DYhQD";
            this.A00 = i11;
            return this.A03;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) {
        C9[] c9Arr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(i42, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(i42, 0)) {
                return;
            }
            int A062 = i42.A06();
            int A04 = i42.A04();
            for (C9 c92 : this.A05) {
                i42.A0Y(A062);
                c92.AFv(i42, A04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A04;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    @Override // com.facebook.ads.redexgen.X.D3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5B(com.facebook.ads.redexgen.X.InterfaceC0725Bz r14, com.facebook.ads.redexgen.X.DH r15) {
        /*
            r13 = this;
            r3 = 0
        L1:
            com.facebook.ads.redexgen.X.C9[] r0 = r13.A05
            int r0 = r0.length
            if (r3 >= r0) goto L41
            java.util.List<com.facebook.ads.redexgen.X.DE> r0 = r13.A04
            java.lang.Object r4 = r0.get(r3)
            com.facebook.ads.redexgen.X.DE r4 = (com.facebook.ads.redexgen.X.DE) r4
            r15.A05()
            int r1 = r15.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.C9 r2 = r14.AHA(r1, r0)
            java.lang.String r5 = r15.A04()
            byte[] r0 = r4.A02
            java.util.List r10 = java.util.Collections.singletonList(r0)
            java.lang.String r11 = r4.A01
            r4 = 0
            r1 = 19
            r0 = 26
            java.lang.String r6 = A00(r4, r1, r0)
            r7 = 0
            r8 = -1
            r9 = 0
            r12 = 0
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.A69(r0)
            com.facebook.ads.redexgen.X.C9[] r0 = r13.A05
            r0[r3] = r2
            int r3 = r3 + 1
            goto L1
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y8.A5B(com.facebook.ads.redexgen.X.Bz, com.facebook.ads.redexgen.X.DH):void");
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
        C9[] c9Arr;
        if (this.A03) {
            for (C9 c92 : this.A05) {
                String[] strArr = A07;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A07[1] = "w2RvpoOeyIRfzKBrI6Jaemc95yLcCgR9";
                c92.AFw(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A03 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        this.A03 = false;
    }
}
