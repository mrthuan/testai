package com.facebook.ads.redexgen.X;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class I3 {
    public static String[] A04 = {"aOyC0jDito78Vfy1Nla0i9V", "WNsma8cFvme8ZgwSB3ik3sLylzv2AP1M", "N1cAdaDOGYPovqFEJPANujO1lTrm1R8x", "xPaHXuUuj35IhmxPs2j6NM15pvjyhHn", "toTEFRrlGK8K68MOY9fqi4QHUSJ3AT77", "3Fy1x7yVvr", "zIgtazYEv6wIELQnc0J7ZnYrfidBuPPF", "9uudWy56nH"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public I3() {
    }

    public I3(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public I3(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r3 == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r4 = this;
            int r0 = r4.A03
            if (r0 < 0) goto L2a
            int r1 = r4.A03
            int r0 = r4.A02
            if (r1 < r0) goto L3a
            int r1 = r4.A03
            int r0 = r4.A02
            if (r1 != r0) goto L2a
            int r3 = r4.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I3.A04
            r0 = 7
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            r0 = 0
            goto L3b
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I3.A04
            java.lang.String r1 = "OSNHTg3ADFpX6DP2tOs0qw9XaKQiTPiw"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "iVxsD1Hg3ZcKsbvYTUyYIrJOOlBOlPT2"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L2a
        L3a:
            r0 = 1
        L3b:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I3.A00():void");
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC0844Hf.A04(this.A01 == 0);
        String[] strArr = A04;
        if (strArr[1].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "jrHsHrOWGW7hBouRMSU7ObGjew6g61BB";
        strArr2[4] = "NI1fsHbKGeRDwpNTvWuj4i2Lu559JSow";
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 0;
        this.A01 += i10;
        while (this.A01 > 8) {
            this.A01 -= 8;
            byte[] bArr = this.A00;
            int i12 = this.A03;
            this.A03 = i12 + 1;
            String[] strArr = A04;
            String str = strArr[1];
            String str2 = strArr[6];
            int returnValue = str.charAt(29);
            if (returnValue != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "MXVSoh8UspzU4TwiEjshPf0";
            strArr2[3] = "oJC4aegRhEHHJQ1TmbM9HekITZxf6oV";
            int returnValue2 = bArr[i12] & 255;
            i11 |= returnValue2 << this.A01;
        }
        int returnValue3 = this.A00[this.A03] & 255;
        int i13 = i11 | (returnValue3 >> (8 - this.A01));
        int returnValue4 = 32 - i10;
        int i14 = i13 & ((-1) >>> returnValue4);
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
        return i14;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            int i11 = this.A03;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[3].length()) {
                String[] strArr2 = A04;
                strArr2[0] = "G9t9XacKeYsDGYvG3yWvXBJ";
                strArr2[3] = "28QJLyNvJNS9vIUzrH1yFxCTai7z0pp";
                this.A03 = i11 + 1;
            }
            throw new RuntimeException();
        }
        A00();
        String[] strArr3 = A04;
        if (strArr3[2].charAt(8) == strArr3[4].charAt(8)) {
            String[] strArr4 = A04;
            strArr4[7] = "LCiot4B19T";
            strArr4[5] = "B1ovW1DrW4";
            return;
        }
        throw new RuntimeException();
    }

    public final void A07(int i10) {
        this.A03 = i10 / 8;
        this.A01 = i10 - (this.A03 * 8);
        A00();
    }

    public final void A08(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A01 += i10 - numBytes2;
        if (this.A01 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = this.A01;
            this.A01 = numBytes4 - 8;
        }
        A00();
    }

    public final void A09(int i10) {
        AbstractC0844Hf.A04(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0A(int i10, int i11) {
        if (i11 < 32) {
            int remainingBitsToRead = 1 << i11;
            i10 &= remainingBitsToRead - 1;
        }
        int remainingBitsToRead2 = this.A01;
        int min = Math.min(8 - remainingBitsToRead2, i11);
        int remainingBitsToRead3 = this.A01;
        int firstByteInputBits = (8 - remainingBitsToRead3) - min;
        int remainingBitsToRead4 = this.A01;
        int i12 = 65280 >> remainingBitsToRead4;
        int remainingBitsToRead5 = 1 << firstByteInputBits;
        int firstByteBitmask = i12 | (remainingBitsToRead5 - 1);
        byte[] bArr = this.A00;
        int i13 = this.A03;
        byte[] bArr2 = this.A00;
        int remainingBitsToRead6 = this.A03;
        bArr[i13] = (byte) (bArr2[remainingBitsToRead6] & firstByteBitmask);
        int remainingBitsToRead7 = i11 - min;
        int firstByteBitmask2 = i10 >>> remainingBitsToRead7;
        byte[] bArr3 = this.A00;
        int i14 = this.A03;
        byte[] bArr4 = this.A00;
        int remainingBitsToRead8 = this.A03;
        bArr3[i14] = (byte) (bArr4[remainingBitsToRead8] | (firstByteBitmask2 << firstByteInputBits));
        int firstByteBitmask3 = i11 - min;
        int firstByteRightPaddingSize = this.A03;
        int firstByteRightPaddingSize2 = firstByteRightPaddingSize + 1;
        while (firstByteBitmask3 > 8) {
            int firstByteReadSize = firstByteRightPaddingSize2 + 1;
            int remainingBitsToRead9 = firstByteBitmask3 - 8;
            this.A00[firstByteRightPaddingSize2] = (byte) (i10 >>> remainingBitsToRead9);
            firstByteBitmask3 -= 8;
            firstByteRightPaddingSize2 = firstByteReadSize;
        }
        int lastByteRightPaddingSize = 8 - firstByteBitmask3;
        byte[] bArr5 = this.A00;
        int firstByteReadSize2 = this.A00[firstByteRightPaddingSize2];
        int remainingBitsToRead10 = 1 << lastByteRightPaddingSize;
        bArr5[firstByteRightPaddingSize2] = (byte) (firstByteReadSize2 & (remainingBitsToRead10 - 1));
        int remainingBitsToRead11 = 1 << firstByteBitmask3;
        int i15 = i10 & (remainingBitsToRead11 - 1);
        byte[] bArr6 = this.A00;
        int remainingBitsToRead12 = this.A00[firstByteRightPaddingSize2];
        bArr6[firstByteRightPaddingSize2] = (byte) (remainingBitsToRead12 | (i15 << lastByteRightPaddingSize));
        A08(i11);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0D(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int i13 = this.A03;
            int to2 = i13 + 1;
            this.A03 = to2;
            byte b10 = bArr2[i13];
            int to3 = this.A01;
            int i14 = b10 << to3;
            String[] strArr = A04;
            String str = strArr[0];
            String str2 = strArr[3];
            int i15 = str.length();
            int to4 = str2.length();
            if (i15 == to4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "lRrfO5MNPl";
            strArr2[5] = "ysAxYtlVgw";
            bArr[i10] = (byte) i14;
            byte b11 = bArr[i10];
            byte[] bArr3 = this.A00;
            int to5 = this.A03;
            int i16 = 255 & bArr3[to5];
            int to6 = this.A01;
            bArr[i10] = (byte) ((i16 >> (8 - to6)) | b11);
            i10++;
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        int bitsLeft = bArr[i12];
        int to7 = FunctionEval.FunctionID.EXTERNAL_FUNC >> i17;
        bArr[i12] = (byte) (bitsLeft & to7);
        int to8 = this.A01;
        if (to8 + i17 > 8) {
            byte b12 = bArr[i12];
            byte[] bArr4 = this.A00;
            int bitsLeft2 = this.A03;
            int to9 = bitsLeft2 + 1;
            this.A03 = to9;
            int bitsLeft3 = bArr4[bitsLeft2] & FunctionEval.FunctionID.EXTERNAL_FUNC;
            int to10 = this.A01;
            bArr[i12] = (byte) (b12 | (bitsLeft3 << to10));
            int i18 = this.A01 - 8;
            String[] strArr3 = A04;
            String str3 = strArr3[1];
            String str4 = strArr3[6];
            int bitsLeft4 = str3.charAt(29);
            int to11 = str4.charAt(29);
            if (bitsLeft4 != to11) {
                throw new RuntimeException();
            }
            String[] strArr4 = A04;
            strArr4[2] = "mxeYc6MaGpVYTevlIGOp44lhNxXcQQDZ";
            strArr4[4] = "UN93G5VTG9KASeEmW9fM92cjrozp12u2";
            this.A01 = i18;
        }
        int to12 = this.A01;
        this.A01 = to12 + i17;
        byte[] bArr5 = this.A00;
        int to13 = this.A03;
        int i19 = 255 & bArr5[to13];
        int to14 = this.A01;
        int i20 = i19 >> (8 - to14);
        int bitsLeft5 = bArr[i12];
        int to15 = 8 - i17;
        bArr[i12] = (byte) (bitsLeft5 | ((byte) (i20 << to15)));
        int to16 = this.A01;
        if (to16 == 8) {
            this.A01 = 0;
            int to17 = this.A03;
            this.A03 = to17 + 1;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i10, int i11) {
        AbstractC0844Hf.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
