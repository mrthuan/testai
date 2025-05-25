package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D7 {
    public static String[] A0I = {"8M5RodlOPQ7x9uL", "BFvJ4Vglp8cDeiQE6xUhfEubFpJPL", "BZYHRobTnsNNM90MGp0ZS9IN9yxyVYRA", "frsVK1FdvBngWEpFEgXb3j2VH3I0QFcs", "HR9vdMTLLE1L", "IHA7NybIhxX3WQx4UeYLmhksL6wDXcjz", "KpIVD0zBVazWxl2jPlpRDfEez76Qp1Fs", "SrFaCaqx6zHunknjrTMn1T9PINlSt0tm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C9 A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0864Hz> A0D = new SparseArray<>();
    public final SparseArray<C0863Hy> A0C = new SparseArray<>();
    public D6 A06 = new D6();
    public D6 A07 = new D6();
    public byte[] A0B = new byte[128];
    public final I5 A0F = new I5(this.A0B, 0, 0);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A06(byte[] bArr, int i10, int i11) {
        if (this.A08) {
            int i12 = i11 - i10;
            if (this.A0B.length < this.A00 + i12) {
                this.A0B = Arrays.copyOf(this.A0B, (this.A00 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.A0B, this.A00, i12);
            this.A00 += i12;
            this.A0F.A08(this.A0B, 0, this.A00);
            if (this.A0F.A0B(8)) {
                this.A0F.A06();
                int A05 = this.A0F.A05(2);
                this.A0F.A07(5);
                if (this.A0F.A09()) {
                    this.A0F.A04();
                    if (this.A0F.A09()) {
                        int A04 = this.A0F.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                        } else if (this.A0F.A09()) {
                            int A042 = this.A0F.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            C0863Hy c0863Hy = this.A0C.get(A042);
                            C0864Hz c0864Hz = this.A0D.get(c0863Hy.A01);
                            if (A0I[1].length() == 29) {
                                A0I[1] = "jUrYfFWx4oU0PZ0BHu9RO88HJSHdN";
                                C0864Hz c0864Hz2 = c0864Hz;
                                if (c0864Hz2.A09) {
                                    if (!this.A0F.A0B(2)) {
                                        return;
                                    }
                                    this.A0F.A07(2);
                                }
                                if (!this.A0F.A0B(c0864Hz2.A01)) {
                                    return;
                                }
                                boolean z10 = false;
                                boolean z11 = false;
                                boolean z12 = false;
                                int A052 = this.A0F.A05(c0864Hz2.A01);
                                if (!c0864Hz2.A08) {
                                    if (!this.A0F.A0B(1)) {
                                        return;
                                    }
                                    z10 = this.A0F.A0A();
                                    if (z10) {
                                        if (!this.A0F.A0B(1)) {
                                            return;
                                        }
                                        z12 = this.A0F.A0A();
                                        z11 = true;
                                    }
                                }
                                int i13 = this.A01;
                                if (A0I[3].charAt(28) != 'b') {
                                    A0I[1] = "tJyNa4tKeVwhmsG7D71bzYfBkrrYu";
                                    boolean z13 = i13 == 5;
                                    int i14 = 0;
                                    if (z13) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        }
                                        i14 = this.A0F.A04();
                                    }
                                    int i15 = 0;
                                    int i16 = 0;
                                    int i17 = 0;
                                    int i18 = 0;
                                    if (c0864Hz2.A04 == 0) {
                                        if (!this.A0F.A0B(c0864Hz2.A03)) {
                                            return;
                                        }
                                        i15 = this.A0F.A05(c0864Hz2.A03);
                                        if (c0863Hy.A02 && !z10) {
                                            if (!this.A0F.A09()) {
                                                return;
                                            }
                                            i16 = this.A0F.A03();
                                        }
                                    } else if (c0864Hz2.A04 == 1 && !c0864Hz2.A07) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        }
                                        i17 = this.A0F.A03();
                                        if (c0863Hy.A02 && !z10) {
                                            if (!this.A0F.A09()) {
                                                return;
                                            }
                                            i18 = this.A0F.A03();
                                        }
                                    }
                                    this.A07.A04(c0864Hz2, A05, A04, A052, A042, z10, z11, z12, z13, i14, i15, i16, i17, i18);
                                    this.A08 = false;
                                    return;
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    public D7(C9 c92, boolean z10, boolean z11) {
        this.A0E = c92;
        this.A0G = z10;
        this.A0H = z11;
        A01();
    }

    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0E.AFw(this.A05, z10 ? 1 : 0, (int) (this.A02 - this.A04), i10, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r7.A07.A05() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(long r8, int r10) {
        /*
            r7 = this;
            int r1 = r7.A01
            r0 = 9
            r3 = 0
            r4 = 1
            if (r1 == r0) goto L16
            boolean r0 = r7.A0H
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.D6 r1 = r7.A07
            com.facebook.ads.redexgen.X.D6 r0 = r7.A06
            boolean r0 = com.facebook.ads.redexgen.X.D6.A01(r1, r0)
            if (r0 == 0) goto L2e
        L16:
            boolean r0 = r7.A09
            if (r0 == 0) goto L22
            long r0 = r7.A02
            long r8 = r8 - r0
            int r0 = (int) r8
            int r10 = r10 + r0
            r7.A00(r10)
        L22:
            long r0 = r7.A02
            r7.A04 = r0
            long r0 = r7.A03
            r7.A05 = r0
            r7.A0A = r3
            r7.A09 = r4
        L2e:
            boolean r5 = r7.A0A
            int r1 = r7.A01
            r0 = 5
            if (r1 == r0) goto L61
            boolean r6 = r7.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D7.A0I
            r0 = 6
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 86
            if (r1 == r0) goto L4c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D7.A0I
            java.lang.String r1 = "z8bmRlUG76wDgBp2wvrB0MWrv7DjKXuA"
            r0 = 3
            r2[r0] = r1
            if (r6 == 0) goto L62
            int r0 = r7.A01
            if (r0 != r4) goto L62
            com.facebook.ads.redexgen.X.D6 r0 = r7.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L62
        L61:
            r3 = 1
        L62:
            r5 = r5 | r3
            r7.A0A = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D7.A02(long, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r5 != 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r6.A01 == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r6.A01 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r5 != 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r4 != 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(long r7, int r9, long r10) {
        /*
            r6 = this;
            r6.A01 = r9
            r6.A03 = r10
            r6.A02 = r7
            boolean r0 = r6.A0G
            r3 = 1
            if (r0 == 0) goto L2b
            int r4 = r6.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D7.A0I
            r0 = 6
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 86
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D7.A0I
            java.lang.String r1 = "fGRgHSleOioyqPSfalDbi2Th0ZNuk"
            r0 = 1
            r2[r0] = r1
            if (r4 == r3) goto L5c
        L2b:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L6e
            int r5 = r6.A01
            r4 = 5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D7.A0I
            r0 = 5
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D7.A0I
            java.lang.String r1 = "RFfCf2nIAPbpjmPVi3fM6FAtUM60qcZF"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "7JLfCVxHN71IMtTwiclOJwxf6r9fSssd"
            r0 = 7
            r2[r0] = r1
            if (r5 == r4) goto L5c
        L53:
            int r0 = r6.A01
            if (r0 == r3) goto L5c
            int r1 = r6.A01
            r0 = 2
            if (r1 != r0) goto L6e
        L5c:
            com.facebook.ads.redexgen.X.D6 r1 = r6.A06
            com.facebook.ads.redexgen.X.D6 r0 = r6.A07
            r6.A06 = r0
            r6.A07 = r1
            com.facebook.ads.redexgen.X.D6 r0 = r6.A07
            r0.A02()
            r0 = 0
            r6.A00 = r0
            r6.A08 = r3
        L6e:
            return
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D7.A0I
            java.lang.String r1 = "b1mBfirkBaoBPCNGYKaBtwPuSeSHS"
            r0 = 1
            r2[r0] = r1
            if (r5 == r4) goto L5c
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D7.A03(long, int, long):void");
    }

    public final void A04(C0863Hy c0863Hy) {
        this.A0C.append(c0863Hy.A00, c0863Hy);
    }

    public final void A05(C0864Hz c0864Hz) {
        this.A0D.append(c0864Hz.A05, c0864Hz);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
