package com.facebook.ads.redexgen.X;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class I5 {
    public static String[] A04 = {"oaZzVubNOElt02WGCaqvSJ1WhomZeIvc", "NwYbQLWQDzvN9xZwkujqy0rFcq6udtvI", "H4XFnNQqwOU0BBxHSKtA4senwYzulcFS", "6", "HCjDr2k1", "fTBcqf", "mKK7C24ZHr99ntzK4hjILwnVN9oEe41m", "tX5KRUyTrTKIf2eU3tc1SLWDMoaFB6a3"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public I5(byte[] bArr, int i10, int i11) {
        A08(bArr, i10, i11);
    }

    private int A00() {
        int i10 = 0;
        while (!A0A()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        int leadingZeros = i10 > 0 ? A05(i10) : 0;
        return i11 + leadingZeros;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r5.A00 == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01() {
        /*
            r5 = this;
            int r0 = r5.A02
            if (r0 < 0) goto L28
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 < r0) goto L3c
            int r4 = r5.A02
            int r3 = r5.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A04
            r0 = 1
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            r0 = 0
            goto L3d
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A04
            java.lang.String r1 = "lxsNfGUZSrZFSvWPNZMKZyaq3XZkRgvL"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "zOz33HhI6vVy8NnH7CZd9hDrdqmOlIvR"
            r0 = 0
            r2[r0] = r1
            if (r4 != r3) goto L28
            int r0 = r5.A00
            if (r0 != 0) goto L28
        L3c:
            r0 = 1
        L3d:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.A01():void");
    }

    private boolean A02(int i10) {
        return 2 <= i10 && i10 < this.A01 && this.A03[i10] == 3 && this.A03[i10 + (-2)] == 0 && this.A03[i10 + (-1)] == 0;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i10 = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        int i11 = codeNum2 / 2;
        if (A04[5].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[6] = "Qnd9EPcWsl8U4hISHZt2qAi8nsbxDXMp";
        strArr[7] = "09Jd7FyqOKiNQBHflHU03VyjNv0fpOtt";
        return i10 * i11;
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i10) {
        int i11 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i10;
        while (true) {
            int returnValue2 = this.A00;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i12 = bArr[returnValue4] & FunctionEval.FunctionID.EXTERNAL_FUNC;
            int returnValue5 = this.A00;
            i11 |= i12 << returnValue5;
            int i13 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                r4 = 1;
            }
            this.A02 = i13 + r4;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i14 = bArr2[returnValue7] & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int returnValue8 = this.A00;
        int i15 = i11 | (i14 >> (8 - returnValue8));
        int returnValue9 = (-1) >>> (32 - i10);
        int i16 = i15 & returnValue9;
        int returnValue10 = this.A00;
        if (returnValue10 == 8) {
            this.A00 = 0;
            int i17 = this.A02;
            int returnValue11 = this.A02;
            this.A02 = i17 + (A02(returnValue11 + 1) ? 2 : 1);
        }
        A01();
        return i16;
    }

    public final void A06() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(int r5) {
        /*
            r4 = this;
            int r3 = r4.A02
            int r2 = r5 / 8
            int r0 = r4.A02
            int r0 = r0 + r2
            r4.A02 = r0
            int r1 = r4.A00
            int r0 = r2 * 8
            int r5 = r5 - r0
            int r1 = r1 + r5
            r4.A00 = r1
            int r1 = r4.A00
            r0 = 7
            if (r1 <= r0) goto L22
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
            int r0 = r4.A00
            int r0 = r0 + (-8)
            r4.A00 = r0
        L22:
            int r1 = r3 + 1
        L24:
            int r0 = r4.A02
            if (r1 > r0) goto L39
            boolean r0 = r4.A02(r1)
            if (r0 == 0) goto L36
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
            int r1 = r1 + 2
        L36:
            int r1 = r1 + 1
            goto L24
        L39:
            r4.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.A07(int):void");
    }

    public final void A08(byte[] bArr, int i10, int i11) {
        this.A03 = bArr;
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09() {
        /*
            r7 = this;
            int r6 = r7.A02
            int r5 = r7.A00
            r4 = 0
        L5:
            int r1 = r7.A02
            int r0 = r7.A01
            if (r1 >= r0) goto L14
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L14
            int r4 = r4 + 1
            goto L5
        L14:
            int r3 = r7.A02
            int r0 = r7.A01
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L2e
            r0 = 1
        L1d:
            r7.A02 = r6
            r7.A00 = r5
            if (r0 != 0) goto L2d
            int r0 = r4 * 2
            int r0 = r0 + r1
            boolean r0 = r7.A0B(r0)
            if (r0 == 0) goto L2d
            r2 = 1
        L2d:
            return r2
        L2e:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.A09():boolean");
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(int r8) {
        /*
            r7 = this;
            int r1 = r7.A02
            int r0 = r8 / 8
            int r4 = r7.A02
            int r4 = r4 + r0
            int r3 = r7.A00
            int r3 = r3 + r8
            int r0 = r0 * 8
            int r3 = r3 - r0
            r0 = 7
            if (r3 <= r0) goto L14
            int r4 = r4 + 1
            int r3 = r3 + (-8)
        L14:
            int r5 = r1 + 1
        L16:
            r6 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I5.A04
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L29
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A04
            java.lang.String r1 = "E0yrE6bE"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "S"
            r0 = 3
            r2[r0] = r1
            if (r5 > r4) goto L5d
            int r0 = r7.A01
            if (r4 >= r0) goto L5d
            boolean r0 = r7.A02(r5)
            if (r0 == 0) goto L51
            int r4 = r4 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I5.A04
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L53
            int r5 = r5 + 2
        L51:
            int r5 = r5 + r6
            goto L16
        L53:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A04
            java.lang.String r1 = "J0s770"
            r0 = 5
            r2[r0] = r1
            int r5 = r5 + 2
            goto L51
        L5d:
            int r0 = r7.A01
            if (r4 < r0) goto L67
            int r0 = r7.A01
            if (r4 != r0) goto L68
            if (r3 != 0) goto L68
        L67:
            return r6
        L68:
            r6 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.A0B(int):boolean");
    }
}
