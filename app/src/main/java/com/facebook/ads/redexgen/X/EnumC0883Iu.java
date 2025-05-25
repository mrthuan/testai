// Auto-fixed: added missing class declaration
public class EnumC0883Iu {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0883Iu {
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-80, -77, -91, -88, -83, -78, -85, 4, -9, -13, -10, 11};
    }

    static {
        A01();
    }
}

}
