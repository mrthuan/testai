package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CM {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-38, -5, -84, 2, -19, -8, -11, -16, -84, 2, -19, -2, -11, -6, 0, -84, -8, -15, -6, -13, 0, -12, -84, -7, -19, -1, -9, -84, -14, -5, 1, -6, -16};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r7) {
        /*
            r6 = -1
            r5 = 0
        L2:
            long[] r0 = com.facebook.ads.redexgen.X.CM.A04
            int r0 = r0.length
            if (r5 >= r0) goto L15
            long[] r0 = com.facebook.ads.redexgen.X.CM.A04
            r3 = r0[r5]
            long r0 = (long) r7
            long r3 = r3 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L16
            int r6 = r5 + 1
        L15:
            return r6
        L16:
            int r5 = r5 + 1
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CM.A00(int):int");
    }

    public static long A01(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= A04[i10 - 1] ^ (-1);
        }
        for (int i11 = 1; i11 < i10; i11++) {
            long varint = bArr[i11];
            j10 = (j10 << 8) | (varint & 255);
        }
        return j10;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(InterfaceC0724By interfaceC0724By, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!interfaceC0724By.AEp(this.A02, 0, 1, z10)) {
                return -1L;
            }
            int firstByte = this.A02[0] & 255;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 37));
            }
        }
        int firstByte2 = this.A00;
        if (firstByte2 > i10) {
            this.A01 = 0;
            return -2L;
        }
        if (this.A00 != 1) {
            interfaceC0724By.readFully(this.A02, 1, this.A00 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z11);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
