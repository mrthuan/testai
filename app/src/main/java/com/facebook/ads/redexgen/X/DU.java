package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class DU extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -24, -20, -36, -23, -16, -105, -20, -27, -37, -36, -23, -29, -16, -32, -27, -34, -105, -28, -36, -37, -32, -40, -105, -38, -26, -37, -36, -38, -22};
    }

    public DU(Throwable th2) {
        super(A00(0, 39, 115), th2);
    }
}
