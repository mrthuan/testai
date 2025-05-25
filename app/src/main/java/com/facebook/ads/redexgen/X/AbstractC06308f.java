package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06308f {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{6, 6, 19, 7, -7, 6, 10, -3, -9, -7, 19, -7, 12, 8, 6, -11, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -4, -19, -12, 8, -1, -18, -5, -4, -14, -8, -9};
    }

    public static String A01(C1313Zr c1313Zr) {
        return KJ.A00(c1313Zr).getString(A00(0, 17, 75), null);
    }

    public static String A02(C1313Zr c1313Zr) {
        return KJ.A00(c1313Zr).getString(A00(17, 22, 64), null);
    }

    public static void A04(C1313Zr c1313Zr) {
        KJ.A00(c1313Zr).edit().remove(A00(17, 22, 64)).apply();
    }

    public static void A05(C1313Zr c1313Zr, String str, String str2) {
        KJ.A00(c1313Zr).edit().putString(A00(17, 22, 64), str).putString(A00(0, 17, 75), str2).apply();
    }
}
