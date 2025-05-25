package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.1s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04751s {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, Field.TOA, Field.NOTEREF, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, Field.NOTEREF, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.facebook.ads.redexgen.X.C1314Zs r12, com.facebook.ads.redexgen.X.C05906f r13, com.facebook.ads.redexgen.X.C0801Fk r14) {
        /*
            com.facebook.ads.redexgen.X.6d r3 = new com.facebook.ads.redexgen.X.6d
            com.facebook.ads.redexgen.X.1Z r0 = r14.A1S()
            java.lang.String r4 = r0.A01()
            int r5 = com.facebook.ads.redexgen.X.QJ.A04
            int r6 = com.facebook.ads.redexgen.X.QJ.A04
            java.lang.String r7 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            boolean r6 = r14.A19()
            if (r6 == 0) goto L4f
            java.lang.String r5 = r14.A0Z()
            java.lang.String r4 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.6b r3 = new com.facebook.ads.redexgen.X.6b
            r3.<init>(r5, r4, r0)
            r0 = 1
            r3.A04 = r0
            r2 = 0
            r1 = 5
            r0 = 66
            java.lang.String r0 = A00(r2, r1, r0)
            r3.A03 = r0
            r13.A0X(r3)
        L4f:
            boolean r0 = com.facebook.ads.redexgen.X.RS.A03()
            boolean r3 = com.facebook.ads.redexgen.X.C0877Im.A2n(r12, r0)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            java.lang.String r8 = r0.A08()
            com.facebook.ads.redexgen.X.6b r7 = new com.facebook.ads.redexgen.X.6b
            java.lang.String r9 = r14.A0l()
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            long r11 = r0.A05()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r10 = A00(r2, r1, r0)
            r7.<init>(r8, r9, r10, r11)
            if (r6 == 0) goto Lf8
            if (r3 != 0) goto Lf8
            r13.A0X(r7)
        L89:
            com.facebook.ads.redexgen.X.6d r3 = new com.facebook.ads.redexgen.X.6d
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            java.lang.String r4 = r0.A07()
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            int r5 = com.facebook.ads.redexgen.X.AbstractC04701n.A00(r0)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            int r6 = com.facebook.ads.redexgen.X.AbstractC04701n.A01(r0)
            java.lang.String r7 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1Q r0 = r0.A0H()
            java.util.List r0 = r0.A01()
            java.util.Iterator r3 = r0.iterator()
        Ld3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lfc
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.6d r4 = new com.facebook.ads.redexgen.X.6d
            java.lang.String r8 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r2, r1, r0)
            r6 = -1
            r7 = -1
            r4.<init>(r5, r6, r7, r8, r9)
            r13.A0c(r4)
            goto Ld3
        Lf8:
            r13.A0a(r7)
            goto L89
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC04751s.A02(com.facebook.ads.redexgen.X.Zs, com.facebook.ads.redexgen.X.6f, com.facebook.ads.redexgen.X.Fk):void");
    }

    public static void A03(C1314Zs c1314Zs, C05906f c05906f, C0801Fk c0801Fk) {
        int i10 = 0;
        for (C1F c1f : c0801Fk.A1W()) {
            C05886d c05886d = new C05886d(c1f.A0E().A07(), AbstractC04701n.A00(c1f.A0E()), AbstractC04701n.A01(c1f.A0E()), c0801Fk.A0l(), A00(5, 12, 118));
            if (i10 == 0) {
                c05906f.A0b(c05886d);
            } else {
                c05906f.A0c(c05886d);
            }
            for (String str : c1f.A0H().A01()) {
                c05906f.A0c(new C05886d(str, -1, -1, c0801Fk.A0l(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(c1f.A0E().A08())) {
                new C05866b(c1f.A0E().A08(), c0801Fk.A0l(), A00(5, 12, 118), c1f.A0E().A05()).A04 = false;
            }
            i10++;
        }
    }
}
