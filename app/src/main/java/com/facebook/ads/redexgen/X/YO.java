package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YO implements InterfaceC0742Cq {
    public static byte[] A0C;
    public static String[] A0D = {"M6vrv0lPEulBwKqIn2oLppwSAAexYQcr", "X6z94pEoRYhvrmzLz15NCZNPiV1DGayg", "F6R2l19lbUGnqlkRAWY8nlBn3LzcSNMm", "JqMGE07PKcarQTYJfMVlvgbSgBzQwdvf", "cRwG0", "Hdv6CWBxyQva7HVZ3vsBwW", "jFaf4HwpniU", "dgl0k2wZZNfglCqQP4SbAA"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C0741Cp A0A = new C0741Cp();
    public final AbstractC0745Ct A0B;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0D[2].charAt(29) == 'C') {
                throw new RuntimeException();
            }
            A0D[6] = "9Sh3q5vdw8d";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
            i13++;
        }
    }

    public static void A0A() {
        A0C = new byte[]{-10, 23, -56, 23, 15, 15, -56, 24, 9, 15, 13, -56, 11, 9, 22, -56, 10, 13, -56, 14, 23, 29, 22, 12, -42};
    }

    static {
        A0A();
    }

    public YO(long j10, long j11, AbstractC0745Ct abstractC0745Ct, int i10, long j12) {
        AbstractC0844Hf.A03(j10 >= 0 && j11 > j10);
        this.A0B = abstractC0745Ct;
        this.A09 = j10;
        this.A08 = j11;
        if (i10 == j11 - j10) {
            this.A07 = j12;
            this.A00 = 3;
            return;
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j10, long j11, long j12) {
        long j13 = j10 + ((((this.A08 - this.A09) * j11) / this.A07) - j12);
        if (j13 < this.A09) {
            j13 = this.A09;
        }
        if (j13 >= this.A08) {
            return this.A08 - 1;
        }
        return j13;
    }

    private final long A01(long j10, InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A86 = interfaceC0724By.A86();
        if (A0D(interfaceC0724By, this.A01)) {
            this.A0A.A03(interfaceC0724By, false);
            interfaceC0724By.AFq();
            long j11 = j10 - this.A0A.A05;
            int i10 = this.A0A.A01 + this.A0A.A00;
            if (j11 < 0 || j11 > 72000) {
                if (j11 >= 0) {
                    this.A04 = interfaceC0724By.A86() + i10;
                    this.A05 = this.A0A.A05;
                    if ((this.A01 - this.A04) + i10 < 100000) {
                        interfaceC0724By.AGq(i10);
                        long initialPosition = this.A05;
                        return -(initialPosition + 2);
                    }
                } else {
                    this.A01 = A86;
                    String[] strArr = A0D;
                    if (strArr[7].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    A0D[2] = "ATYd0uYOxaasgtMR93yDbR3KTZDZgUML";
                    this.A02 = this.A0A.A05;
                }
                if (this.A01 - this.A04 < 100000) {
                    this.A01 = this.A04;
                    return this.A04;
                }
                long j12 = i10;
                long j13 = j11 > 0 ? 1L : 2L;
                long granuleDistance = interfaceC0724By.A86();
                return Math.min(Math.max((granuleDistance - (j12 * j13)) + (((this.A01 - this.A04) * j11) / (this.A02 - this.A05)), this.A04), this.A01 - 1);
            }
            interfaceC0724By.AGq(i10);
            return -(this.A0A.A05 + 2);
        } else if (this.A04 != A86) {
            return this.A04;
        } else {
            throw new IOException(A09(0, 25, 65));
        }
    }

    private final long A02(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        A0C(interfaceC0724By);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && interfaceC0724By.A86() < this.A08) {
            this.A0A.A03(interfaceC0724By, false);
            interfaceC0724By.AGq(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(InterfaceC0724By interfaceC0724By, long j10, long j11) throws IOException, InterruptedException {
        this.A0A.A03(interfaceC0724By, false);
        while (true) {
            long j12 = this.A0A.A05;
            String[] strArr = A0D;
            if (strArr[3].charAt(10) == strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A0D[2] = "U3Kz5F0VQIVI1IcDcrvJUmEEvpKOlzXJ";
            if (j12 < j10) {
                interfaceC0724By.AGq(this.A0A.A01 + this.A0A.A00);
                j11 = this.A0A.A05;
                this.A0A.A03(interfaceC0724By, false);
            } else {
                interfaceC0724By.AFq();
                return j11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    /* renamed from: A07 */
    public final YP A58() {
        if (this.A07 != 0) {
            return new YP(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (A0D(interfaceC0724By, this.A08)) {
            return;
        }
        throw new EOFException();
    }

    private final boolean A0D(InterfaceC0724By interfaceC0724By, long j10) throws IOException, InterruptedException {
        long min = Math.min(3 + j10, this.A08);
        byte[] bArr = new byte[2048];
        int i10 = bArr.length;
        while (true) {
            if (interfaceC0724By.A86() + i10 > min && (i10 = (int) (min - interfaceC0724By.A86())) < 4) {
                return false;
            }
            interfaceC0724By.AEP(bArr, 0, i10, false);
            for (int i11 = 0; i11 < i10 - 3; i11++) {
                int peekLength = bArr[i11];
                if (peekLength == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103) {
                    int peekLength2 = bArr[i11 + 3];
                    if (peekLength2 == 83) {
                        interfaceC0724By.AGq(i11);
                        return true;
                    }
                }
            }
            interfaceC0724By.AGq(i10 - 3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    public final long AEl(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        long A03;
        switch (this.A00) {
            case 0:
                this.A03 = interfaceC0724By.A86();
                this.A00 = 1;
                long j10 = this.A08 - 65307;
                if (j10 > this.A03) {
                    return j10;
                }
                break;
            case 1:
                break;
            case 2:
                if (this.A06 == 0) {
                    A03 = 0;
                } else {
                    long A01 = A01(this.A06, interfaceC0724By);
                    if (A01 >= 0) {
                        return A01;
                    }
                    A03 = A03(interfaceC0724By, this.A06, -(A01 + 2));
                }
                this.A00 = 3;
                long currentGranule = 2 + A03;
                return -currentGranule;
            case 3:
                return -1L;
            default:
                throw new IllegalStateException();
        }
        this.A07 = A02(interfaceC0724By);
        this.A00 = 3;
        return this.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AGy(long r6) {
        /*
            r5 = this;
            int r1 = r5.A00
            r0 = 3
            r3 = 2
            if (r1 == r0) goto L1e
            int r4 = r5.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YO.A0D
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 16
            if (r1 == r0) goto L3b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YO.A0D
            java.lang.String r1 = "RpDPvXNkHrQ5YzzwgtOUV1eKAXch"
            r0 = 4
            r2[r0] = r1
            if (r4 != r3) goto L39
        L1e:
            r0 = 1
        L1f:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A03(r0)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
        L28:
            r5.A06 = r1
            r5.A00 = r3
            r5.A0B()
            long r0 = r5.A06
            return r0
        L32:
            com.facebook.ads.redexgen.X.Ct r0 = r5.A0B
            long r1 = r0.A04(r6)
            goto L28
        L39:
            r0 = 0
            goto L1f
        L3b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YO.AGy(long):long");
    }
}
