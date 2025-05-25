package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class L0 extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"bPO0ugaeXfa7uXjMXKhS1KHZA7oolnDS", "5VEkiBesq0S", "quO3r7P4ln5WJUQ", "zM7ZelbUg22KKOGLl25t", "99uhMkddPMJJPnRd4C", "JBAQo527ZYtZr4L", "", "64LnU3lhwQRNyBCw5dlHSHpXej53Kco6"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].length() == 20) {
                throw new RuntimeException();
            }
            A01[3] = "NtF9HtTTwBqLhjE3yqSm";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 12);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-69, -29, -29, -37, -32, -39, -108, -60, -32, -43, -19, -108, -35, -25, -108, -30, -29, -24, -108, -35, -30, -25, -24, -43, -32, -32, -39, -40};
    }

    static {
        A01();
    }

    public L0() {
        super(A00(0, 28, 104));
    }
}
