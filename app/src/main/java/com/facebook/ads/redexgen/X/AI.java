package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AI {
    public final long A00;
    public final long A01;
    public static String[] A02 = {"wjrRPXWyt7FJOtCfXXeKbwMwqBspTzQg", "eY06ibbuLK1J5UWPto3xCw2uyWnrSlTN", "5vbywGgLU2fUNXMaCGRflqdPRLJOnOI5", "n82TP93wz0kvvP6hrorLqVOpldCSHKat", "2zS5yAgm8usBx", "tcU6jmyapCTPAiujYKdEShZXG5LbCi0K", "JC5LCDKkuX4e7glPZC0VksCLDl8t9zvH", "hqvqHn8ksuGmD"};
    public static final AI A05 = new AI(0, 0);
    public static final AI A03 = new AI(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final AI A07 = new AI(Long.MAX_VALUE, 0);
    public static final AI A06 = new AI(0, Long.MAX_VALUE);
    public static final AI A04 = A05;

    public AI(long j10, long j11) {
        AbstractC0844Hf.A03(j10 >= 0);
        AbstractC0844Hf.A03(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r7.A01 == r8.A01) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r7.A00 != r8.A00) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r7.A01 == r8.A01) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 != r8) goto L4
            return r6
        L4:
            r5 = 0
            if (r8 == 0) goto L32
            java.lang.Class r4 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AI.A02
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L29
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AI.A02
            java.lang.String r1 = "OxhK2LHKCoc2mqKSCaROUBw0x2bF5l7L"
            r0 = 1
            r2[r0] = r1
            if (r4 == r3) goto L33
        L32:
            return r5
        L33:
            com.facebook.ads.redexgen.X.AI r8 = (com.facebook.ads.redexgen.X.AI) r8
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AI.A02
            r0 = 3
            r1 = r1[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L5c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AI.A02
            java.lang.String r1 = "d6Mhnf64aMieM2vxsbZH8LbpuFdSo2DL"
            r0 = 3
            r2[r0] = r1
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6c
        L53:
            long r3 = r7.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6c
        L5b:
            return r6
        L5c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AI.A02
            java.lang.String r1 = "SWJJMQHIt7MTKCAkJwEpA52p5HuOpWsK"
            r0 = 3
            r2[r0] = r1
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6c
            goto L53
        L6c:
            r6 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AI.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
