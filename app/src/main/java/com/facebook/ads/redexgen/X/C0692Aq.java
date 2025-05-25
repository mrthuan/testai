package com.facebook.ads.redexgen.X;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Aq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0692Aq extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9f4E74cmBUvlZ9r8GKUPRXI", OperatorName.NON_STROKING_CMYK, "FcQ9tYQNKKiD", "j0qb62VKLMRQ8PRw4qiKaZlPPtSv7x0h", "1av", "k3yiwvHxpK5tFRY8KUaXiWkeksXbodjI", "72fVAuzjtBWgXhw67DzT", "sOW"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[5].charAt(23) != 'e') {
            throw new RuntimeException();
        }
        A02[3] = "Alxm9pRAksCVWi4qdGhYTOlqnuoHaQY3";
        A01 = new byte[]{12, -19, -31, -63, -75, -40, 4, 3, -5, -2, -4, -67, -46, 6, -11, -6, 0, -27, 3, -14, -12, -4, -79, -6, -1, -6, 5, -79, -9, -14, -6, -3, -10, -11, -53, -79};
    }

    static {
        A01();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0692Aq(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 12
            r1 = 24
            r0 = 19
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r5)
            r2 = 3
            r1 = 9
            r0 = 23
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r6)
            r2 = 1
            r1 = 2
            r0 = 67
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r8)
            r2 = 0
            r1 = 1
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            r4.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0692Aq.<init>(int, int, int, int):void");
    }
}
