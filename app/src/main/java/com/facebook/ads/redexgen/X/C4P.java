package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.4P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4P implements Runnable {
    public static Comparator<C4O> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<C4P> A07;
    public long A00;
    public long A01;
    public ArrayList<FL> A02 = new ArrayList<>();
    public ArrayList<C4O> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, Field.NUMWORDS, 117, Field.GREETINGLINE, Field.NOTEREF, Field.AUTOTEXT, Field.GREETINGLINE, Field.SHAPE, Field.NUMWORDS, 107, Field.TOA, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.AUTOTEXT, Field.HYPERLINK, Field.FORMDROPDOWN, 100, 96, 22, 102, Field.INCLUDETEXT, Field.FORMDROPDOWN, 80, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.GREETINGLINE};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C4O>() { // from class: com.facebook.ads.redexgen.X.4N
            public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(C4O c4o, C4O c4o2) {
                if ((c4o.A03 == null) != (c4o2.A03 == null)) {
                    FL fl2 = c4o.A03;
                    if (A00[1].length() != 18) {
                        String[] strArr = A00;
                        strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
                        strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
                        return fl2 == null ? 1 : -1;
                    }
                    throw new RuntimeException();
                } else if (c4o.A04 != c4o2.A04) {
                    return c4o.A04 ? -1 : 1;
                } else {
                    int i10 = c4o2.A02 - c4o.A02;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = c4o.A00;
                    int deltaViewVelocity = c4o2.A00;
                    int i12 = i11 - deltaViewVelocity;
                    if (i12 != 0) {
                        return i12;
                    }
                    return 0;
                }
            }
        };
    }

    private AnonymousClass56 A00(FL fl2, int i10, long j10) {
        if (A08(fl2, i10)) {
            return null;
        }
        C05554w c05554w = fl2.A0r;
        try {
            fl2.A1K();
            AnonymousClass56 A0I = c05554w.A0I(i10, false, j10);
            if (A0I != null) {
                if (A0I.A0Y() && !A0I.A0Z()) {
                    c05554w.A0T(A0I.A0H);
                } else {
                    c05554w.A0Z(A0I, false);
                }
            }
            return A0I;
        } finally {
            fl2.A1m(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.FL> r0 = r10.A02
            int r9 = r0.size()
            r4 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r9) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.FL> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.FL r1 = (com.facebook.ads.redexgen.X.FL) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.au r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.au r0 = r1.A02
            int r0 = r0.A00
            int r4 = r4 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            r0.ensureCapacity(r4)
            r8 = 0
            r7 = 0
        L2d:
            if (r7 >= r9) goto L8f
            java.util.ArrayList<com.facebook.ads.redexgen.X.FL> r0 = r10.A02
            java.lang.Object r6 = r0.get(r7)
            com.facebook.ads.redexgen.X.FL r6 = (com.facebook.ads.redexgen.X.FL) r6
            int r0 = r6.getWindowVisibility()
            if (r0 == 0) goto L40
        L3d:
            int r7 = r7 + 1
            goto L2d
        L40:
            com.facebook.ads.redexgen.X.au r5 = r6.A02
            int r0 = r5.A01
            int r4 = java.lang.Math.abs(r0)
            int r0 = r5.A02
            int r0 = java.lang.Math.abs(r0)
            int r4 = r4 + r0
            r3 = 0
        L50:
            int r0 = r5.A00
            int r0 = r0 * 2
            if (r3 >= r0) goto L3d
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            int r0 = r0.size()
            if (r8 < r0) goto L86
            com.facebook.ads.redexgen.X.4O r0 = new com.facebook.ads.redexgen.X.4O
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            r1.add(r0)
        L68:
            int[] r2 = r5.A03
            int r1 = r3 + 1
            r2 = r2[r1]
            if (r2 > r4) goto L84
            r1 = 1
        L71:
            r0.A04 = r1
            r0.A02 = r4
            r0.A00 = r2
            r0.A03 = r6
            int[] r1 = r5.A03
            r1 = r1[r3]
            r0.A01 = r1
            int r8 = r8 + 1
            int r3 = r3 + 2
            goto L50
        L84:
            r1 = 0
            goto L71
        L86:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r10.A03
            java.lang.Object r0 = r0.get(r8)
            com.facebook.ads.redexgen.X.4O r0 = (com.facebook.ads.redexgen.X.C4O) r0
            goto L68
        L8f:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.4O> r0 = com.facebook.ads.redexgen.X.C4P.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4P.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(long r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r5.A03
            int r0 = r0.size()
            if (r4 >= r0) goto L31
            java.util.ArrayList<com.facebook.ads.redexgen.X.4O> r0 = r5.A03
            java.lang.Object r3 = r0.get(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4P.A06
            r0 = 7
            r1 = r1[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L24
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L24:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4P.A06
            java.lang.String r1 = "gpZ2KV2"
            r0 = 6
            r2[r0] = r1
            com.facebook.ads.redexgen.X.4O r3 = (com.facebook.ads.redexgen.X.C4O) r3
            com.facebook.ads.redexgen.X.FL r0 = r3.A03
            if (r0 != 0) goto L32
        L31:
            return
        L32:
            r5.A06(r3, r6)
            r3.A00()
            int r4 = r4 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4P.A04(long):void");
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C4O c4o, long j10) {
        AnonymousClass56 A00 = A00(c4o.A03, c4o.A01, c4o.A04 ? Long.MAX_VALUE : j10);
        if (A00 != null && A00.A09 != null && A00.A0Y() && !A00.A0Z()) {
            FL fl2 = A00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(fl2, j10);
        }
    }

    private void A07(FL fl2, long j10) {
        if (fl2 == null) {
            return;
        }
        if (fl2.A0C && fl2.A01.A06() != 0) {
            fl2.A1N();
        }
        C1377au c1377au = fl2.A02;
        c1377au.A04(fl2, true);
        if (c1377au.A00 != 0) {
            try {
                AbstractC04992q.A01(A01(0, 18, 83));
                fl2.A0s.A05(fl2.A04);
                for (int i10 = 0; i10 < c1377au.A00 * 2; i10 += 2) {
                    A00(fl2, c1377au.A03[i10], j10);
                }
            } finally {
                AbstractC04992q.A00();
            }
        }
    }

    public static boolean A08(FL fl2, int i10) {
        int A062 = fl2.A01.A06();
        for (int i11 = 0; i11 < A062; i11++) {
            AnonymousClass56 A0F = FL.A0F(fl2.A01.A0A(i11));
            int childCount = A0F.A03;
            if (childCount == i10 && !A0F.A0Z()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(FL fl2) {
        this.A02.add(fl2);
    }

    public final void A0A(FL fl2) {
        this.A02.remove(fl2);
    }

    public final void A0B(FL fl2, int i10, int i11) {
        if (fl2.isAttachedToWindow()) {
            long j10 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j10 == 0) {
                this.A01 = fl2.getNanoTime();
                fl2.post(this);
            }
        }
        fl2.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC04992q.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                AbstractC04992q.A00();
                return;
            }
            int size = this.A02.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                FL fl2 = this.A02.get(i10);
                if (fl2.getWindowVisibility() == 0) {
                    j10 = Math.max(fl2.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j10) + this.A00);
        } finally {
            this.A01 = 0L;
            AbstractC04992q.A00();
        }
    }
}
