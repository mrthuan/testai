package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class CP {
    public static byte[] A09;
    public static String[] A0A = {"xMNext", "zlzEwhsQC3FpKQNfU72ignmkxEXGlEWQ", "hTVEjk3rNFsg66RRpHStC4yCUn29H2cK", "lb2Z9KtgGwzkm6WUebOJTSliuGJIKPxa", "NDBSvjeraksgouCWowC9mNbakqVzapXj", "jkP3sVUJry8UgHuLS2r02X6f", "lSPidmQgGebPlfolmgnIPeXjLgEThElM", "Xkj28o"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final I4 A06;
    public final I4 A07;
    public final boolean A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 30;
            if (A0A[1].charAt(28) == 'R') {
                throw new RuntimeException();
            }
            A0A[2] = "7TPgv6JzmOMJusvdxeRCHMdlPjF1ygj3";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-92, -89, -80, -79, -78, -99, -95, -90, -77, -84, -87, Field.GREETINGLINE, -85, -77, -79, -78, Field.GREETINGLINE, -96, -93, Field.GREETINGLINE, 111};
    }

    static {
        A01();
    }

    public CP(I4 i42, I4 i43, boolean z10) {
        this.A07 = i42;
        this.A06 = i43;
        this.A08 = z10;
        i43.A0Y(12);
        this.A05 = i43.A0H();
        i42.A0Y(12);
        this.A04 = i42.A0H();
        AbstractC0844Hf.A06(i42.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i10;
        int i11 = this.A00 + 1;
        this.A00 = i11;
        if (i11 == this.A05) {
            if (A0A[4].charAt(18) != 'C') {
                throw new RuntimeException();
            }
            A0A[5] = "9rTTdGUS3";
            return false;
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            I4 i42 = this.A06;
            String[] strArr = A0A;
            if (strArr[6].charAt(8) != strArr[3].charAt(8)) {
                A0A[4] = "IGdwwTQI2iFuokxRsKC9HYA9e5TBmMKA";
                A0M = i42.A0M();
            } else {
                String[] strArr2 = A0A;
                strArr2[0] = "DD1qjj";
                strArr2[7] = "zmmxaf";
                A0M = i42.A0M();
            }
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i12 = this.A04 - 1;
            this.A04 = i12;
            if (i12 > 0) {
                i10 = this.A07.A0H() - 1;
            } else {
                i10 = -1;
            }
            this.A03 = i10;
        }
        return true;
    }
}
