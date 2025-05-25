package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FU {
    public static String[] A05 = {"ulivTU6ocRt44Fi8kUKccBfI3hgmY7Iu", "IWWAGEYNIxKzg9eOqITKJuHYobxhq8aF", "X0zTjQehaQj8StZrguOVf12daJe7gn3l", "BVuPoTZp9gA5d2vDS0fzf54bf8rPPFO1", "NuJhiRT", "MOipm8XgicKDGsSG3YNTxkuPY6Ba7MyG", "vtzL6kzywxy5KxiMeu5V", "1cqRJ2Z3bK7OTLD9R2J7"};
    public static final FU A06 = new FU(new long[0]);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final FS[] A04;

    public FU(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = Arrays.copyOf(jArr, length);
        this.A04 = new FS[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.A04[i10] = new FS();
        }
        this.A01 = 0L;
        this.A02 = -9223372036854775807L;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A00(long r8) {
        /*
            r7 = this;
            r4 = 0
        L1:
            long[] r0 = r7.A03
            int r0 = r0.length
            if (r4 >= r0) goto L25
            long[] r0 = r7.A03
            r5 = r0[r4]
            r1 = -9223372036854775808
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            long[] r0 = r7.A03
            r1 = r0[r4]
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L22
            com.facebook.ads.redexgen.X.FS[] r0 = r7.A04
            r0 = r0[r4]
            boolean r0 = r0.A02()
            if (r0 != 0) goto L25
        L22:
            int r4 = r4 + 1
            goto L1
        L25:
            long[] r3 = r7.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FU.A05
            r0 = 2
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L43
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FU.A05
            java.lang.String r1 = "yfkVKL0"
            r0 = 4
            r2[r0] = r1
            int r0 = r3.length
            if (r4 >= r0) goto L41
        L40:
            return r4
        L41:
            r4 = -1
            goto L40
        L43:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FU.A00(long):int");
    }

    public final int A01(long j10) {
        int length = this.A03.length - 1;
        while (length >= 0) {
            int index = (this.A03[length] > Long.MIN_VALUE ? 1 : (this.A03[length] == Long.MIN_VALUE ? 0 : -1));
            if (index != 0) {
                int index2 = (this.A03[length] > j10 ? 1 : (this.A03[length] == j10 ? 0 : -1));
                if (index2 <= 0) {
                    break;
                }
            }
            length--;
        }
        if (length < 0 || !this.A04[length].A02()) {
            return -1;
        }
        return length;
    }
}
