// Auto-fixed: added missing class declaration
public class EnumC0951Lp {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0951Lp {
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, -62, -71, -63, -22, -7, -16, -16, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}

}
