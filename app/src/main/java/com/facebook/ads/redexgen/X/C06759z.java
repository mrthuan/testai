package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.9z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06759z {
    public static String[] A0C = {"SD", "YErhAKhoPoHO5JcEqCBGFqT2VStp1TyC", "4nv8DO5j3lb6Mdbyys8fgVzZqlsTdLry", "qjEmQJ3wIXjwZ0GHyvyvCADunUAuqpjO", "GXkzr7370MakhENzuenfkB0eq9kFXv2R", "1aejgQpeBJQ", "itEEkzdbLzIQ5uhNoBodYKCVqRWw6l67", "d1pp0oBGZIx5DTsWzGpHk31c0cFELqne"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C06739x A04;
    public C06739x A05;
    public C06739x A06;
    public AM A07;
    public Object A08;
    public boolean A09;
    public final AK A0A = new AK();
    public final AL A0B = new AL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C06749y A02(int i10, long j10, long j11) {
        Et et = new Et(i10, j11);
        this.A07.A09(et.A02, this.A0A);
        int A04 = this.A0A.A04(j10);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(et, A09);
        return new C06749y(et, j10, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(et, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C06749y A03(C06739x c06739x, long j10) {
        long j11;
        C06749y c06749y = c06739x.A02;
        if (c06749y.A06) {
            int A03 = this.A07.A03(c06749y.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j12 = c06749y.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i10, -9223372036854775807L, Math.max(0L, (c06739x.A07() + c06749y.A01) - j10));
                if (A08 == null) {
                    String[] strArr = A0C;
                    if (strArr[2].charAt(19) != strArr[4].charAt(19)) {
                        throw new RuntimeException();
                    }
                    A0C[5] = "RfWnK2Yyhbj";
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j11 = ((Long) A08.second).longValue();
                if (c06739x.A01 == null || !c06739x.A01.A09.equals(obj)) {
                    j12 = this.A02;
                    this.A02 = j12 + 1;
                } else {
                    j12 = c06739x.A01.A02.A04.A03;
                }
                String[] strArr2 = A0C;
                if (strArr2[7].charAt(25) == strArr2[6].charAt(25)) {
                    throw new RuntimeException();
                }
                A0C[0] = "9O";
            } else {
                j11 = 0;
            }
            return A06(A07(A03, j11, j12), j11, j11);
        }
        Et et = c06749y.A04;
        this.A07.A09(et.A02, this.A0A);
        if (et.A01()) {
            int i11 = et.A00;
            int A01 = this.A0A.A01(i11);
            if (A01 != -1) {
                int A032 = this.A0A.A03(i11, et.A01);
                if (A032 < A01) {
                    if (this.A0A.A0E(i11, A032)) {
                        return A01(et.A02, i11, A032, c06749y.A00, et.A03);
                    }
                    return null;
                }
                return A02(et.A02, c06749y.A00, et.A03);
            }
            String[] strArr3 = A0C;
            if (strArr3[2].charAt(19) != strArr3[4].charAt(19)) {
                return null;
            }
            String[] strArr4 = A0C;
            strArr4[7] = "7zgqZ6WWzHmmqPblEioaJN2bcKHGrBAI";
            strArr4[6] = "Cs5FGi3SA7t6W0gmOhYnK70NiHLGkBqx";
            return null;
        } else if (c06749y.A02 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c06749y.A02);
            if (A05 == -1) {
                return A02(et.A02, c06749y.A02, et.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(et.A02, A05, A02, c06749y.A02, et.A03);
            }
            return null;
        } else {
            int A00 = this.A0A.A00();
            String[] strArr5 = A0C;
            if (strArr5[3].charAt(8) != strArr5[1].charAt(8)) {
                A0C[0] = "wj";
                if (A00 == 0) {
                    return null;
                }
            } else if (A00 == 0) {
                return null;
            }
            int i12 = A00 - 1;
            AK ak2 = this.A0A;
            if (A0C[0].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr6 = A0C;
            strArr6[3] = "VmafS5x0USKT3bX56Sh5G7yfuCiR0ECp";
            strArr6[1] = "jdmLnQmjPF3iio1UvFs2J48PpGnAnjtG";
            if (ak2.A09(i12) != Long.MIN_VALUE || this.A0A.A0D(i12)) {
                return null;
            }
            int A022 = this.A0A.A02(i12);
            if (this.A0A.A0E(i12, A022)) {
                return A01(et.A02, i12, A022, this.A0A.A07(), et.A03);
            }
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C06749y A04(C06749y c06749y, Et et) {
        long j10 = c06749y.A03;
        long j11 = c06749y.A02;
        boolean A0A = A0A(et, j11);
        boolean A0B = A0B(et, A0A);
        this.A07.A09(et.A02, this.A0A);
        return new C06749y(et, j10, j11, c06749y.A00, et.A01() ? this.A0A.A0A(et.A00, et.A01) : j11 == Long.MIN_VALUE ? this.A0A.A07() : j11, A0A, A0B);
    }

    private long A00(int i10) {
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object periodUid = this.A08;
        if (periodUid != null) {
            AM am2 = this.A07;
            Object periodUid2 = this.A08;
            int oldFrontPeriodIndex = am2.A04(periodUid2);
            if (oldFrontPeriodIndex != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C06739x A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid3 = A0E.A09;
            if (periodUid3.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C06739x A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AM am3 = this.A07;
            Object periodUid4 = A0E2.A09;
            int A04 = am3.A04(periodUid4);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j10 = this.A02;
        long j11 = 1 + j10;
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[1];
        int windowIndex = str.charAt(8);
        if (windowIndex != str2.charAt(8)) {
            String[] strArr2 = A0C;
            strArr2[2] = "2Y54STJJyMHaXaS5RPefAOPYISy1E85Y";
            strArr2[4] = "6EgyLqFQ36hKoQjXu3lfzUAUfA5pLivv";
            this.A02 = j11;
            return j10;
        }
        throw new RuntimeException();
    }

    private C06749y A01(int i10, int i11, int i12, long j10, long j11) {
        long j12;
        Et et = new Et(i10, i11, i12, j11);
        boolean A0A = A0A(et, Long.MIN_VALUE);
        boolean A0B = A0B(et, A0A);
        long A0A2 = this.A07.A09(et.A02, this.A0A).A0A(et.A00, et.A01);
        if (i12 == this.A0A.A02(i11)) {
            AK ak2 = this.A0A;
            if (A0C[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "IhCnEfnszwyWWR41sH3i20r6eCOdziXa";
            strArr[6] = "l3K1PshDhrbGMMnMidrkvh7uV3bNc5yZ";
            j12 = ak2.A06();
        } else {
            j12 = 0;
        }
        return new C06749y(et, j12, Long.MIN_VALUE, j10, A0A2, A0A, A0B);
    }

    private C06749y A05(A1 a12) {
        return A06(a12.A04, a12.A01, a12.A02);
    }

    private C06749y A06(Et et, long j10, long j11) {
        this.A07.A09(et.A02, this.A0A);
        if (et.A01()) {
            if (this.A0A.A0E(et.A00, et.A01)) {
                return A01(et.A02, et.A00, et.A01, j10, et.A03);
            }
            String[] strArr = A0C;
            if (strArr[7].charAt(25) != strArr[6].charAt(25)) {
                String[] strArr2 = A0C;
                strArr2[2] = "AzfkTkyDGbg2im4f3QyfDnjEgxrRqpBB";
                strArr2[4] = "KpnticVnfLOfZpXrv5gfFtiDgljdRFm8";
                return null;
            }
            throw new RuntimeException();
        }
        return A02(et.A02, j11, et.A03);
    }

    private Et A07(int i10, long j10, long j11) {
        this.A07.A09(i10, this.A0A);
        int A05 = this.A0A.A05(j10);
        if (A05 == -1) {
            return new Et(i10, j11);
        }
        return new Et(i10, A05, this.A0A.A02(A05), j11);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.9x r3 = r11.A0E()
            r4 = 1
            if (r3 != 0) goto L8
            return r4
        L8:
            com.facebook.ads.redexgen.X.AM r5 = r11.A07
            com.facebook.ads.redexgen.X.9y r0 = r3.A02
            com.facebook.ads.redexgen.X.Et r0 = r0.A04
            int r6 = r0.A02
            com.facebook.ads.redexgen.X.AK r7 = r11.A0A
            com.facebook.ads.redexgen.X.AL r8 = r11.A0B
            int r9 = r11.A01
            boolean r10 = r11.A09
            int r1 = r5.A03(r6, r7, r8, r9, r10)
        L1c:
            com.facebook.ads.redexgen.X.9x r0 = r3.A01
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.9y r0 = r3.A02
            boolean r0 = r0.A06
            if (r0 != 0) goto L29
            com.facebook.ads.redexgen.X.9x r3 = r3.A01
            goto L1c
        L29:
            r0 = -1
            if (r1 == r0) goto L3a
            com.facebook.ads.redexgen.X.9x r0 = r3.A01
            if (r0 == 0) goto L3a
            com.facebook.ads.redexgen.X.9x r0 = r3.A01
            com.facebook.ads.redexgen.X.9y r0 = r0.A02
            com.facebook.ads.redexgen.X.Et r0 = r0.A04
            int r0 = r0.A02
            if (r0 == r1) goto L55
        L3a:
            boolean r2 = r11.A0S(r3)
            com.facebook.ads.redexgen.X.9y r1 = r3.A02
            com.facebook.ads.redexgen.X.9y r0 = r3.A02
            com.facebook.ads.redexgen.X.Et r0 = r0.A04
            com.facebook.ads.redexgen.X.9y r0 = r11.A04(r1, r0)
            r3.A02 = r0
            if (r2 == 0) goto L52
            boolean r0 = r11.A0P()
            if (r0 != 0) goto L53
        L52:
            return r4
        L53:
            r4 = 0
            goto L52
        L55:
            com.facebook.ads.redexgen.X.9x r3 = r3.A01
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06759z.A08():boolean");
    }

    private boolean A09(C06739x c06739x, C06749y c06749y) {
        C06749y c06749y2 = c06739x.A02;
        return c06749y2.A03 == c06749y.A03 && c06749y2.A02 == c06749y.A02 && c06749y2.A04.equals(c06749y.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0A(com.facebook.ads.redexgen.X.Et r11, long r12) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.AM r2 = r10.A07
            int r1 = r11.A02
            com.facebook.ads.redexgen.X.AK r0 = r10.A0A
            com.facebook.ads.redexgen.X.AK r0 = r2.A09(r1, r0)
            int r0 = r0.A00()
            r9 = 1
            if (r0 != 0) goto L12
            return r9
        L12:
            int r3 = r0 + (-1)
            boolean r8 = r11.A01()
            com.facebook.ads.redexgen.X.AK r0 = r10.A0A
            long r6 = r0.A09(r3)
            r4 = -9223372036854775808
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C06759z.A0C
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06759z.A0C
            java.lang.String r1 = "Hc3aCU8VvQ7fMwIReaFfVUkP2Qt6QnfB"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "AI0v3pGWOJlJlSG7sCXfeKphukfOjim0"
            r0 = 4
            r2[r0] = r1
            r1 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L4d
            if (r8 != 0) goto L4b
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L4b
        L4a:
            return r9
        L4b:
            r9 = 0
            goto L4a
        L4d:
            com.facebook.ads.redexgen.X.AK r0 = r10.A0A
            int r4 = r0.A01(r3)
            r0 = -1
            if (r4 != r0) goto L57
            return r1
        L57:
            if (r8 == 0) goto L6e
            int r5 = r11.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C06759z.A0C
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L70
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6e:
            r0 = 0
            goto L85
        L70:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06759z.A0C
            java.lang.String r1 = "QtVqnRQedw8mZcoThXsfzsvUlAmleI46"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "4SM7fHGVCS5a0RahBL1f2ORniSun8Kda"
            r0 = 4
            r2[r0] = r1
            if (r5 != r3) goto L6e
            int r1 = r11.A01
            int r0 = r4 + (-1)
            if (r1 != r0) goto L6e
            r0 = 1
        L85:
            if (r0 != 0) goto L91
            if (r8 != 0) goto L92
            com.facebook.ads.redexgen.X.AK r0 = r10.A0A
            int r0 = r0.A02(r3)
            if (r0 != r4) goto L92
        L91:
            return r9
        L92:
            r9 = 0
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06759z.A0A(com.facebook.ads.redexgen.X.Et, long):boolean");
    }

    private boolean A0B(Et et, boolean z10) {
        return !this.A07.A0B(this.A07.A09(et.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(et.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C06739x A0C() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                this.A06 = this.A05.A01;
            }
            this.A05.A0D();
            this.A00--;
            int i10 = this.A00;
            if (A0C[0].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "fHZ2t8GiDHbFn4NJmwYfIeU3TMjbrGb5";
            strArr[4] = "gVIXRXuUbCo6Jg17uj0fHWePWtEZtbid";
            if (i10 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C06739x c06739x = this.A05;
        String[] strArr2 = A0C;
        if (strArr2[3].charAt(8) != strArr2[1].charAt(8)) {
            String[] strArr3 = A0C;
            strArr3[7] = "Ws6vUc5hx67maGB8HH1cEpAr34Q1TMnp";
            strArr3[6] = "cQMmMd0UHrRlmvgDuZLAY44xPtqD6N6M";
            return c06739x;
        }
        return c06739x;
    }

    public final C06739x A0D() {
        AbstractC0844Hf.A04((this.A06 == null || this.A06.A01 == null) ? false : true);
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C06739x A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C06739x A0F() {
        return this.A04;
    }

    public final C06739x A0G() {
        return this.A05;
    }

    public final C06739x A0H() {
        return this.A06;
    }

    public final C06749y A0I(long j10, A1 a12) {
        if (this.A04 == null) {
            return A05(a12);
        }
        return A03(this.A04, j10);
    }

    public final C06749y A0J(C06749y c06749y, int i10) {
        return A04(c06749y, c06749y.A04.A00(i10));
    }

    public final XU A0K(AF[] afArr, AbstractC0827Go abstractC0827Go, InterfaceC0830Gr interfaceC0830Gr, Ev ev, Object obj, C06749y c06749y) {
        long A07;
        if (this.A04 != null) {
            A07 = this.A04.A07() + this.A04.A02.A01;
        } else {
            A07 = c06749y.A03;
        }
        C06739x c06739x = new C06739x(afArr, A07, abstractC0827Go, interfaceC0830Gr, ev, obj, c06749y);
        if (this.A04 != null) {
            AbstractC0844Hf.A04(A0P());
            this.A04.A01 = c06739x;
        }
        this.A08 = null;
        this.A04 = c06739x;
        this.A00++;
        String[] strArr = A0C;
        if (strArr[7].charAt(25) != strArr[6].charAt(25)) {
            A0C[0] = "lD";
            return c06739x.A08;
        }
        throw new RuntimeException();
    }

    public final Et A0L(int i10, long j10) {
        return A07(i10, j10, A00(i10));
    }

    public final void A0M(long j10) {
        if (this.A04 != null) {
            this.A04.A0G(j10);
        }
    }

    public final void A0N(AM am2) {
        this.A07 = am2;
    }

    public final void A0O(boolean z10) {
        C06739x A0E = A0E();
        if (A0E != null) {
            this.A08 = z10 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z10) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        return this.A04 == null || (!this.A04.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C06739x c06739x) {
        AbstractC0844Hf.A04(c06739x != null);
        boolean z10 = false;
        this.A04 = c06739x;
        while (c06739x.A01 != null) {
            c06739x = c06739x.A01;
            if (c06739x == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c06739x.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(XU xu) {
        return this.A04 != null && this.A04.A08 == xu;
    }

    public final boolean A0U(Et et, long j10) {
        int i10 = et.A02;
        C06739x c06739x = null;
        for (C06739x A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (c06739x == null) {
                A0E.A02 = A0J(A0E.A02, i10);
            } else if (i10 == -1 || !A0E.A09.equals(this.A07.A0A(i10, this.A0A, true).A03)) {
                return true ^ A0S(c06739x);
            } else {
                C06749y A03 = A03(c06739x, j10);
                if (A0C[5].length() != 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[2] = "815hHLFNQOCwx2WJokef24TLOsZ1d1uP";
                strArr[4] = "NoWRN646BC2VXV8taBUfsEmBKdMT4cIO";
                if (A03 == null) {
                    return true ^ A0S(c06739x);
                }
                A0E.A02 = A0J(A0E.A02, i10);
                if (!A09(A0E, A03)) {
                    return true ^ A0S(c06739x);
                }
            }
            if (A0E.A02.A06) {
                i10 = this.A07.A03(i10, this.A0A, this.A0B, this.A01, this.A09);
            }
            c06739x = A0E;
            if (A0C[5].length() != 11) {
                throw new RuntimeException();
            }
            A0C[0] = "i7";
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
