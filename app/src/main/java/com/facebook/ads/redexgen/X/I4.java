package com.facebook.ads.redexgen.X;

import java.nio.charset.Charset;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class I4 {
    public static byte[] A03;
    public static String[] A04 = {"BUPkySTcvyKGzFoXb8xNfxJs2vcj6SI6", "", "9t9QVMNm", "OEPmW7llGTv5RugeZAnT8CJpnv71Deb6", "l81c8yE1UXyvzPuTPm0IGIR5VvYUnp6F", "GkKhWAhOLudlAi1KBbGzOYTYZtsrVTXq", "47Bu8gqHgcKZB6yF", "qEfz1IOL"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 48, 56, Field.QUOTE, Field.DDEAUTO, 43, Field.ASK, -30, 23, 22, 8, -17, -6, -30, Field.AUTONUMLGL, Field.FILLIN, Field.MACROBUTTON, Field.IMPORT, Field.FILLIN, 48, Field.PAGEREF, Field.FILLIN, -30, Field.PAGEREF, Field.EQ, 48, Field.AUTONUM, 43, 48, Field.IMPORT, Field.QUOTE, Field.AUTONUM, 43, Field.EQ, 48, -30, 36, 59, Field.AUTONUM, Field.FILLIN, -4, -30, -52, -15, -7, -28, -17, -20, -25, -93, -40, -41, -55, -80, -69, -93, -10, -24, -12, -8, -24, -15, -26, -24, -93, -23, -20, -11, -10, -9, -93, -27, -4, -9, -24, -67, -93, -12, 15, 16, -64, 2, 9, 20, -64, 14, 15, 20, -64, 26, 5, 18, 15, -38, -64, -24, -25, -39, -64, -53};
    }

    static {
        A01();
    }

    public I4() {
    }

    public I4(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public I4(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public I4(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    public final char A02() {
        return (char) (((this.A00[this.A02] & 255) << 8) | (this.A00[this.A02 + 1] & 255));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | (bArr4[i16] & 255);
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | ((bArr4[i16] & 255) << 24);
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | ((bArr2[i12] & 255) << 8);
    }

    public final int A0D() {
        int b22 = A0E();
        int b12 = A0E();
        int b42 = A0E();
        int b32 = A0E();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | (bArr2[i12] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i13;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | (bArr2[i12] & 255);
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = (bArr[i10] & 255) | ((bArr2[i11] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j12 = j11 | ((bArr4[i13] & 255) << 24);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j13 = j12 | ((bArr5[i14] & 255) << 32);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j14 = j13 | ((bArr6[i15] & 255) << 40);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j15 = j14 | ((bArr7[i16] & 255) << 48);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j15 | ((255 & bArr8[i17]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = (bArr[i10] & 255) | ((bArr2[i11] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j11 | ((255 & bArr4[i13]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr2[i11] & 255) << 48);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 40);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j12 = j11 | ((bArr4[i13] & 255) << 32);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j13 = j12 | ((bArr5[i14] & 255) << 24);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j14 = j13 | ((bArr6[i15] & 255) << 16);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j15 = j14 | ((bArr7[i16] & 255) << 8);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j15 | (255 & bArr8[i17]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr2[i11] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j11 | (255 & bArr4[i13]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 70) + A0L);
    }

    public final long A0O() {
        byte b10;
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j10 = bArr[length];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int length2 = 1 << i11;
            long j11 = length2 & j10;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[0];
            int charAt = str.charAt(13);
            int length3 = str2.charAt(13);
            if (charAt == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "8vK315ay";
            strArr2[7] = "jAQDKlNg";
            int length4 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (length4 != 0) {
                i11--;
            } else if (i11 < 6) {
                int length5 = 1 << i11;
                j10 &= length5 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            for (int x4 = 1; x4 < i10; x4++) {
                byte[] bArr2 = this.A00;
                if (A04[4].charAt(3) != 'S') {
                    A04[1] = "x";
                    int length6 = this.A02;
                    b10 = bArr2[length6 + x4];
                    if ((b10 & 192) == 128) {
                        int length7 = b10 & Field.BARCODE;
                        j10 = (j10 << 6) | length7;
                    } else {
                        throw new NumberFormatException(A00(0, 42, 104) + j10);
                    }
                } else {
                    A04[5] = "n5PcJgzDrPqbI2Nld6vWULHVZbuOfTZA";
                    int length8 = this.A02;
                    b10 = bArr2[length8 + x4];
                    if ((b10 & 192) == 92) {
                        int length72 = b10 & Field.BARCODE;
                        j10 = (j10 << 6) | length72;
                    } else {
                        throw new NumberFormatException(A00(0, 42, 104) + j10);
                    }
                }
            }
            int length9 = this.A02;
            this.A02 = length9 + i10;
            return j10;
        }
        throw new NumberFormatException(A00(42, 35, 41) + j10);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0P() {
        /*
            r5 = this;
            int r0 = r5.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r4 = r5.A02
        La:
            int r0 = r5.A01
            if (r4 >= r0) goto L1b
            byte[] r0 = r5.A00
            r0 = r0[r4]
            boolean r0 = com.facebook.ads.redexgen.X.IK.A0d(r0)
            if (r0 != 0) goto L1b
            int r4 = r4 + 1
            goto La
        L1b:
            int r0 = r5.A02
            int r0 = r4 - r0
            r2 = 3
            if (r0 < r2) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = -17
            if (r1 != r0) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            int r0 = r0 + 1
            r1 = r1[r0]
            r0 = -69
            if (r1 != r0) goto L49
            byte[] r1 = r5.A00
            int r0 = r5.A02
            int r0 = r0 + 2
            r1 = r1[r0]
            r0 = -65
            if (r1 != r0) goto L49
            int r0 = r5.A02
            int r0 = r0 + r2
            r5.A02 = r0
        L49:
            byte[] r3 = r5.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I4.A04
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I4.A04
            java.lang.String r1 = "0OPZ9wXiOG88J5thRDM8zE849EKoF2PW"
            r0 = 5
            r2[r0] = r1
            int r1 = r5.A02
            int r0 = r5.A02
            int r0 = r4 - r0
            java.lang.String r2 = com.facebook.ads.redexgen.X.IK.A0R(r3, r1, r0)
            r5.A02 = r4
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 != r0) goto L72
            return r2
        L72:
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = 13
            if (r1 != r0) goto L89
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 != r0) goto L89
            return r2
        L89:
            byte[] r1 = r5.A00
            int r0 = r5.A02
            r1 = r1[r0]
            r0 = 10
            if (r1 != r0) goto L99
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
        L99:
            return r2
        L9a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I4.A0P():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r2 = r5.A00;
        r1 = r5.A02;
        r0 = r5.A02;
        r4 = com.facebook.ads.redexgen.X.IK.A0R(r2, r1, r3 - r0);
        r5.A02 = r3;
        r3 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (com.facebook.ads.redexgen.X.I4.A04[1].length() == 11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        com.facebook.ads.redexgen.X.I4.A04[1] = "UHIahekmnsnG1d53o8blPpYvLvDdhHQg";
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = r5.A02;
        r5.A02 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r3 >= r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0Q() {
        /*
            r5 = this;
            int r0 = r5.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r5.A02
        La:
            int r4 = r5.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I4.A04
            r0 = 4
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I4.A04
            java.lang.String r1 = "7q14VOks0nwB3sOQXz"
            r0 = 6
            r2[r0] = r1
            if (r3 >= r4) goto L2c
            byte[] r0 = r5.A00
            r0 = r0[r3]
            if (r0 == 0) goto L2c
            int r3 = r3 + 1
            goto La
        L2c:
            byte[] r2 = r5.A00
            int r1 = r5.A02
            int r0 = r5.A02
            int r0 = r3 - r0
            java.lang.String r4 = com.facebook.ads.redexgen.X.IK.A0R(r2, r1, r0)
            r5.A02 = r3
            int r3 = r5.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I4.A04
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L5b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I4.A04
            java.lang.String r1 = "UHIahekmnsnG1d53o8blPpYvLvDdhHQg"
            r0 = 1
            r2[r0] = r1
            int r0 = r5.A01
            if (r3 >= r0) goto L5a
        L54:
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
        L5a:
            return r4
        L5b:
            int r0 = r5.A01
            if (r3 >= r0) goto L5a
            goto L54
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I4.A0Q():java.lang.String");
    }

    public final String A0R(int i10) {
        if (i10 == 0) {
            return A00(0, 0, 111);
        }
        int i11 = i10;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i10) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0R = IK.A0R(bArr, stringLength4, i11);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return A0R;
    }

    public final String A0S(int i10) {
        return A0T(i10, Charset.forName(A00(95, 5, 57)));
    }

    public final String A0T(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | (bArr2[i12] & 255));
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i10) {
        A0b(A05() < i10 ? new byte[i10] : this.A00, i10);
    }

    public final void A0X(int i10) {
        AbstractC0844Hf.A03(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    public final void A0Y(int i10) {
        AbstractC0844Hf.A03(i10 >= 0 && i10 <= this.A01);
        this.A02 = i10;
    }

    public final void A0Z(int i10) {
        A0Y(this.A02 + i10);
    }

    public final void A0a(I3 i32, int i10) {
        A0c(i32.A00, 0, i10);
        i32.A07(0);
    }

    public final void A0b(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }
}
