package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.1K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C1K {
    A04(A01(23, 14, 118)),
    A05(A01(37, 9, 3));
    
    public static byte[] A01;
    public static String[] A02 = {"wiqydbsLJDwKBvl8t", "43d9HmwIqa0UmHFIq", "pggHvImyjq29EoPdIbNPEyFQYY47zx5L", "Y7HVzfyHvrAyRWnGs1HIvpl", "hbOUIe", "Z6uWuqD1EDiaZecfB", "H4uwq6", "uO2zzJUzM8GpymnowP"};
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A02;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[7] = "YRQbc7SZzU6A3uauK9TIi077IJfJ6";
            copyOfRange[i13] = (byte) ((b10 - i12) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-84, -72, -73, -67, -82, -63, -67, -66, -86, -75, -56, -86, -71, -71, -30, -45, -39, -41, -15, -30, -31, -27, -26, 20, 32, 31, Field.PAGEREF, 22, 41, Field.PAGEREF, Field.ASK, 18, 29, 16, 18, 33, 33, -82, -97, -91, -93, -99, -82, -83, -79, -78};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "ja6ocK";
        strArr2[4] = "zrwWzc";
    }

    static {
        A02();
    }

    C1K(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r3 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C1K A00(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case 883765328: goto L59;
                case 1434358835: goto L24;
                default: goto L7;
            }
        L7:
            r0 = -1
        L8:
            switch(r0) {
                case 0: goto L70;
                default: goto Lb;
            }
        Lb:
            com.facebook.ads.redexgen.X.1K r3 = com.facebook.ads.redexgen.X.C1K.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1K.A02
            r0 = 2
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 97
            if (r1 == r0) goto L6a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1K.A02
            java.lang.String r1 = "wI7Mn7kKRaTG8Mvy9wZ"
            r0 = 7
            r2[r0] = r1
            return r3
        L24:
            r2 = 23
            r1 = 14
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r3 = r3.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1K.A02
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L4a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1K.A02
            java.lang.String r1 = "bogI3bwqsUF49nq3u6zYPkLLi"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L7
        L48:
            r0 = 0
            goto L8
        L4a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1K.A02
            java.lang.String r1 = "XJGJWrBy1UqGLv6Rhel9amw"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "eBE1kZuIIDAbDWtcc"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L7
            goto L48
        L59:
            r2 = 37
            r1 = 9
            r0 = 3
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L6a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L70:
            com.facebook.ads.redexgen.X.1K r0 = com.facebook.ads.redexgen.X.C1K.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1K.A00(java.lang.String):com.facebook.ads.redexgen.X.1K");
    }
}
