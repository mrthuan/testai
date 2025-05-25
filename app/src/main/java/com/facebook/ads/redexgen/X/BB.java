package com.facebook.ads.redexgen.X;

import java.nio.ShortBuffer;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class BB {
    public static String[] A0M = {"12WRHCRvrf7uzS15EjKhAcUJZG2MzuRW", "ORqZ7gMxbJJ1LCIrF8kx2625eiWSr61b", "xtkEmeQamovtvU2Z3hw2mSUwMXjMbz0B", "2SWBRQD5cFodCmXbUuvI5Vs4hvMM", "Ld", "Zx", "oWcxHzaW6r7lBy9gASpUpQY2t5hecS1n", "ItURT5NzCCJzRXO1EoFfUiDaBsWLxBKc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public BB(int i10, int i11, float f10, float f11, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i10 / i12;
        this.A0K = i10 / 400;
        this.A0I = i10 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i11];
        this.A0B = new short[this.A0J * i11];
        this.A0C = new short[this.A0J * i11];
    }

    private int A00(int i10) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i10) {
        int minP;
        int period;
        int i11 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i11 == 1) {
            int i12 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i10, i12, skip2);
        } else {
            A0E(sArr, i10, i11);
            int skip3 = this.A0I;
            minP = A04(this.A0L, 0, this.A0K / i11, skip3 / i11);
            if (i11 != 1) {
                int minP2 = minP * i11;
                int skip4 = i11 * 4;
                int period2 = minP2 - skip4;
                int i13 = (i11 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i13 > skip6) {
                    i13 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i10, period2, i13);
                } else {
                    A0E(sArr, i10, 1);
                    minP = A04(this.A0L, 0, period2, i13);
                }
            }
        }
        int period3 = this.A02;
        int skip8 = this.A01;
        if (A0F(period3, skip8)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            i12 = i11;
            float f11 = i11;
            float f12 = (2.0f * f10) - 1.0f;
            String[] strArr = A0M;
            String str = strArr[7];
            String str2 = strArr[1];
            int charAt = str.charAt(26);
            int newFrameCount = str2.charAt(26);
            if (charAt != newFrameCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "eziTD2o98diJZALFyHxZfIO5bO0xqfa9";
            strArr2[6] = "GKD0g5jHSgdF3gp0Ot79FF6iF1GE2cl5";
            int newFrameCount2 = (int) ((f11 * f12) / (1.0f - f10));
            this.A09 = newFrameCount2;
        }
        int newFrameCount3 = i11 + i12;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount3);
        short[] sArr2 = this.A0B;
        int i13 = this.A05;
        int newFrameCount4 = this.A0G;
        int i14 = i13 * newFrameCount4;
        int newFrameCount5 = this.A0G;
        System.arraycopy(sArr, this.A0G * i10, sArr2, i14, newFrameCount5 * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        int newFrameCount6 = this.A05;
        this.A05 = newFrameCount6 + i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f10, int i11) {
        int newFrameCount;
        if (f10 >= 2.0f) {
            newFrameCount = (int) (i11 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            newFrameCount = i11;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i10, sArr, i10 + i11);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i15 = 1;
        int diff = 0;
        int bestPeriod = this.A0G;
        int i16 = i10 * bestPeriod;
        while (i11 <= i12) {
            int i17 = 0;
            for (int minDiff = 0; minDiff < i11; minDiff++) {
                int bestPeriod2 = i16 + minDiff;
                short s4 = sArr[bestPeriod2];
                int bestPeriod3 = i16 + i11;
                int worstPeriod = s4 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                i17 += bestPeriod4;
            }
            int worstPeriod2 = i17 * i13;
            int bestPeriod5 = i15 * i11;
            if (worstPeriod2 < bestPeriod5) {
                i15 = i17;
                i13 = i11;
            }
            int period = i17 * i14;
            int maxDiff = diff * i11;
            int worstPeriod3 = A0M[3].length();
            if (worstPeriod3 == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[0] = "7654Ro0ah2nKancwMT2DmdIGdIXFgRyE";
            strArr[6] = "tMgWvda3QkwFD9DtGaYlEy8rynMhOKHT";
            if (period > maxDiff) {
                diff = i17;
                i14 = i11;
            }
            i11++;
        }
        this.A02 = i15 / i13;
        this.A01 = diff / i14;
        return i13;
    }

    private short A05(short[] sArr, int i10, int i11, int i12) {
        short s4 = sArr[i10];
        short s10 = sArr[this.A0G + i10];
        int leftPosition = this.A03 * i11;
        int position = (this.A04 + 1) * i12;
        int i13 = position - leftPosition;
        int position2 = position - (this.A04 * i12);
        short left = (short) (((i13 * s4) + ((position2 - i13) * s10)) / position2);
        return left;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06() {
        /*
            r8 = this;
            int r6 = r8.A05
            float r7 = r8.A0F
            float r0 = r8.A0D
            float r7 = r7 / r0
            float r5 = r8.A0E
            float r0 = r8.A0D
            float r5 = r5 * r0
            double r3 = (double) r7
            r1 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            double r3 = (double) r7
            r1 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
        L20:
            r8.A07(r7)
        L23:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L2c
            r8.A08(r5, r6)
        L2c:
            return
        L2d:
            short[] r2 = r8.A0A
            int r1 = r8.A00
            r0 = 0
            r8.A0D(r2, r0, r1)
            r8.A00 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BB.A06():void");
    }

    private void A07(float f10) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i10 = this.A00;
        int i11 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i11);
                i11 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i11);
                int period = (f10 > 1.0d ? 1 : (f10 == 1.0d ? 0 : -1));
                if (period > 0) {
                    int A03 = A03(this.A0A, i11, f10, A01);
                    String[] strArr = A0M;
                    String str = strArr[0];
                    String str2 = strArr[6];
                    int positionFrames = str.charAt(25);
                    int frameCount4 = str2.charAt(25);
                    if (positionFrames == frameCount4) {
                        throw new RuntimeException();
                    }
                    A0M[2] = "xDmSay9THM0s0a1UzRtMZ3OA7t2IbfqA";
                    i11 += A03 + A01;
                } else {
                    int frameCount5 = A02(this.A0A, i11, f10, A01);
                    i11 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i11 <= i10);
        A0B(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        r0 = r9.A04;
        r9.A04 = r0 + 1;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r0 != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        r9.A04 = 0;
        r0 = r9.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r0 != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r3);
        r9.A03 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
        r3 = false;
     */
    /* JADX WARN: Incorrect condition in loop: B:17:0x0037 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(float r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A05
            if (r0 != r11) goto L5
            return
        L5:
            int r0 = r9.A0H
            float r0 = (float) r0
            float r0 = r0 / r10
            int r5 = (int) r0
            int r4 = r9.A0H
        Lc:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r5 > r0) goto L12
            if (r4 <= r0) goto L17
        L12:
            int r5 = r5 / 2
            int r4 = r4 / 2
            goto Lc
        L17:
            r9.A09(r11)
            r6 = 0
        L1b:
            int r0 = r9.A06
            r3 = 1
            int r0 = r0 - r3
            if (r6 >= r0) goto L96
        L21:
            int r1 = r9.A04
            int r1 = r1 + r3
            int r1 = r1 * r5
            int r0 = r9.A03
            int r0 = r0 * r4
            if (r1 <= r0) goto L7c
            short[] r1 = r9.A0B
            int r0 = r9.A05
            short[] r0 = r9.A0G(r1, r0, r3)
            r9.A0B = r0
            r8 = 0
        L35:
            int r0 = r9.A0G
            if (r8 >= r0) goto L50
            short[] r7 = r9.A0B
            int r2 = r9.A05
            int r0 = r9.A0G
            int r2 = r2 * r0
            int r2 = r2 + r8
            short[] r1 = r9.A0C
            int r0 = r9.A0G
            int r0 = r0 * r6
            int r0 = r0 + r8
            short r0 = r9.A05(r1, r0, r4, r5)
            r7[r2] = r0
            int r8 = r8 + 1
            goto L35
        L50:
            int r7 = r9.A03
            int r7 = r7 + r3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BB.A0M
            r0 = 7
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BB.A0M
            java.lang.String r1 = "gKQ25B6uZCLlveN"
            r0 = 3
            r2[r0] = r1
            r9.A03 = r7
            int r0 = r9.A05
            int r0 = r0 + r3
            r9.A05 = r0
            goto L21
        L7c:
            int r0 = r9.A04
            int r0 = r0 + r3
            r9.A04 = r0
            int r0 = r9.A04
            if (r0 != r4) goto L91
            r1 = 0
            r9.A04 = r1
            int r0 = r9.A03
            if (r0 != r5) goto L94
        L8c:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r3)
            r9.A03 = r1
        L91:
            int r6 = r6 + 1
            goto L1b
        L94:
            r3 = 0
            goto L8c
        L96:
            int r0 = r9.A06
            int r0 = r0 - r3
            r9.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BB.A08(float, int):void");
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i11);
        short[] sArr2 = this.A0C;
        int i12 = this.A06;
        int frameCount2 = this.A0G;
        int i13 = i12 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(this.A0B, this.A0G * i10, sArr2, i13, frameCount3 * i11);
        this.A05 = i10;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i10, this.A0C, 0, (this.A06 - i10) * this.A0G);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        System.arraycopy(this.A0A, this.A0G * i10, this.A0A, 0, this.A0G * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int t4 = (i14 * i11) + i15;
            int d10 = (i13 * i11) + i15;
            for (int u7 = 0; u7 < i10; u7++) {
                int i17 = i10 - u7;
                int o10 = sArr2[d10] * i17;
                int i18 = sArr3[t4] * u7;
                sArr[i16] = (short) ((o10 + i18) / i10);
                i16 += i11;
                d10 += i11;
                t4 += i11;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        this.A0B = A0G(this.A0B, this.A05, i11);
        System.arraycopy(sArr, this.A0G * i10, this.A0B, this.A05 * this.A0G, this.A0G * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int i10, int i11) {
        int i12 = this.A0J / i11;
        int value = this.A0G * i11;
        int frameCount = this.A0G;
        int i13 = i10 * frameCount;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = 0;
            for (int i16 = 0; i16 < value; i16++) {
                int frameCount2 = i14 * value;
                i15 += sArr[frameCount2 + i13 + i16];
                int samplesPerValue = A0M[2].charAt(12);
                if (samplesPerValue == 103) {
                    throw new RuntimeException();
                }
                A0M[3] = "EUYS5WQpJRPmKwOGT0we5n4rvI";
            }
            short[] sArr2 = this.A0L;
            short s4 = (short) (i15 / value);
            int samplesPerValue2 = A0M[2].charAt(12);
            if (samplesPerValue2 != 103) {
                String[] strArr = A0M;
                strArr[7] = "BC56aeWxCRgsWp8W5KdRe7bjNbWCzUgr";
                strArr[1] = "XTykDGyd0HT9mdygUoRpzOWOuHWjRRUi";
                sArr2[i14] = s4;
                i14++;
            } else {
                sArr2[i14] = s4;
                i14++;
            }
        }
    }

    private boolean A0F(int i10, int i11) {
        if (i10 == 0 || this.A08 == 0) {
            return false;
        }
        int i12 = i10 * 3;
        String[] strArr = A0M;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[0] = "EZb49YdFLYqoOlZSlgWLmpmtHQMVBG5j";
        strArr2[6] = "6kSbIZyXrbBrsP3zIABXbItVIHW5EGN4";
        if (i11 > i12 || i10 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length / this.A0G;
        if (i10 + i11 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i11;
        int currentCapacityFrames2 = this.A0G;
        short[] copyOf = Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
        String[] strArr = A0M;
        String str = strArr[4];
        String str2 = strArr[5];
        int newCapacityFrames2 = str.length();
        int currentCapacityFrames3 = str2.length();
        if (newCapacityFrames2 != currentCapacityFrames3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[4] = "bD";
        strArr2[5] = "UF";
        return copyOf;
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i10 = this.A00;
        float f10 = this.A0F / this.A0D;
        float r4 = this.A0E * this.A0D;
        int i11 = this.A05;
        float s4 = i10;
        int remainingFrameCount = this.A06;
        int i12 = i11 + ((int) ((((s4 / f10) + remainingFrameCount) / r4) + 0.5f));
        short[] sArr = this.A0A;
        int i13 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i13, (remainingFrameCount2 * 2) + i10);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i14 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i14 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i10) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i15 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i15 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i12) {
            this.A05 = i12;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i10 = this.A0G * min;
        short[] sArr3 = this.A0B;
        int i11 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i10, sArr3, 0, i11 * framesToRead3);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i10 = framesToWrite * remaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, remaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i10 / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + remaining;
        A06();
    }
}
