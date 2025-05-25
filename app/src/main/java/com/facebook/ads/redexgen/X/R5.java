// Auto-fixed: added missing class declaration
public class R5 {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum R5 {
    A04,
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{123, 118, 121, 122, -108, -124, -118, -119, -108, -124, -125, -108, -123, -127, 118, -114, -73, -68, -60, -63, -73, -80, -70, -77, -117, 126, -120, 126, 119, -127, 122};
    }

    static {
        A01();
    }
}

}
