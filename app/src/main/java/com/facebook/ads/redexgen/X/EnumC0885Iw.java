// Auto-fixed: added missing class declaration
public class EnumC0885Iw {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0885Iw {
    A06,
    A07,
    A04,
    A05,
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 5, 13, 16, 9, 8, -3, 0, -8, -8, -10, -11, -11, -8, -16, -16, -14, -9, -16, -27, -24, -32, -32, -30, -25, -32, -8, -27, -34, -20, -20, -8, -20, -19, -21, -30, -36, -19, -37, -36, -31, -20, -39, -36, -44, -44, -46, -47, -73, -84, -75, -85, -80, -75, -82};
    }

    static {
        A01();
    }
}

}
