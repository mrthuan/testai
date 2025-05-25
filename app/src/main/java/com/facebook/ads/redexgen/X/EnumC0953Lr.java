// Auto-fixed: added missing class declaration
public class EnumC0953Lr {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0953Lr {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -61, -74, -67, -64, -71, -45, -90, -69, -47, -45, -58, -51, -48, -55, -29, -73, -53, -97, -95, -108, -101, -98, -105, -79, -122, -103, -74, -72, -85, -78, -75, -82, -56, -78, -73, -67, -82, -69, -73, -82, -67, Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE, 118, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    EnumC0953Lr(int i10) {
        this.A00 = i10;
    }
}

}
