// Auto-fixed: added missing class declaration
public class EnumC0886Ix {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ix  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0886Ix {
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 121, 109, 107, 125, 124, 110, 114, Byte.MAX_VALUE, 103, 119, 112, 121};
    }

    static {
        A01();
    }
}

}
