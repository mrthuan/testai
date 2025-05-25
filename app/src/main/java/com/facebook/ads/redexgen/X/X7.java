package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC0830Gr {
    public static byte[] A08;
    public static String[] A09 = {"uCIHf2uPFSpN7s394GB", "bw9U9dL", "AAvtM4z7IZvGS3xiAGY", "RwMjBWFP3sqBY", "V8vFz2NVX1z2e3auyeYyWjFvf7xuik3z", "MjYG2pSQFtH7G", "DfS2nPoTWNflTHew7ejwtivrUd6Et1b1", "Z7pxnQFdOkAG9OVyKKW5ogdy9zcWk7rj"};
    public int A00;
    public int A01;
    public int A02;
    public C0829Gq[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0829Gq[] A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[0] = "UrFOZG2CNzDWALsIN7J";
            strArr[2] = "hMYy47mgqrPq4T1YTM5";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
            i13++;
        }
    }

    public static void A01() {
        A08 = new byte[]{-60, -72, -61, -36, -45, -26, -34, -45, -47, -30, -45, -46, -114, -49, -38, -38, -35, -47, -49, -30, -41, -35, -36, -88, -114};
    }

    static {
        A01();
    }

    public X7(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public X7(boolean z10, int i10, int i11) {
        AbstractC0844Hf.A03(i10 > 0);
        AbstractC0844Hf.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C0829Gq[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C0829Gq(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0829Gq[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AHB();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0830Gr
    public final synchronized C0829Gq A3t() {
        C0829Gq c0829Gq;
        this.A00++;
        if (this.A01 > 0) {
            C0829Gq[] c0829GqArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            c0829Gq = c0829GqArr[i10];
            this.A03[this.A01] = null;
        } else {
            c0829Gq = new C0829Gq(new byte[this.A04], 0);
        }
        return c0829Gq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0830Gr
    public final int A7b() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0830Gr
    public final synchronized void AEz(C0829Gq c0829Gq) {
        this.A07[0] = c0829Gq;
        AF0(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0830Gr
    public final synchronized void AF0(C0829Gq[] c0829GqArr) {
        if (this.A01 + c0829GqArr.length >= this.A03.length) {
            this.A03 = (C0829Gq[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + c0829GqArr.length));
        }
        for (C0829Gq c0829Gq : c0829GqArr) {
            if (c0829Gq.A01 == this.A06 || c0829Gq.A01.length == this.A04) {
                C0829Gq[] c0829GqArr2 = this.A03;
                int i10 = this.A01;
                this.A01 = i10 + 1;
                c0829GqArr2[i10] = c0829Gq;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 68) + System.identityHashCode(c0829Gq.A01) + A00(0, 2, 110) + System.identityHashCode(this.A06) + A00(0, 2, 110) + c0829Gq.A01.length + A00(0, 2, 110) + this.A04);
            }
        }
        this.A00 -= c0829GqArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0830Gr
    public final synchronized void AHB() {
        int A04 = IK.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A04 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C0829Gq highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0829Gq lowAllocation = this.A03[highIndex];
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C0829Gq[] c0829GqArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c0829GqArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
