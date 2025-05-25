// Auto-fixed: added missing class declaration
public class EnumC1078Qm {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1078Qm {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-40, -35, -50, -48, -40, -41, -56, -90, -105, -85, -87, -101, -67, -71, -82, -58, -24, -37, -23, -21, -29, -37, -36, -44, -46, -39, -31, -42, -38, -46, -24, -31, -32, -24, -25, -40, -5, -18, -22, -4, -26, -25, -15, -22, 4, -18, -14, -11, -9, -22, -8, -8, -18, -12, -13};
    }

    static {
        A01();
    }

    EnumC1078Qm(int i10) {
        this.A00 = i10;
    }
}

}
