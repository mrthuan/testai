package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6D  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6D {
    A04(A01(16, 5, 107)),
    A06(A01(27, 5, 1)),
    A05(A01(21, 6, 74));
    
    public static byte[] A01;
    public static String[] A02 = {"SZ4ZqaU4fFFh0E4YNccvZxVNy5", "RnD6qsfq2PJ4GIm1AYVwkdKueb87xF36", "J6AvcZe6YXfwvJXVFlguqZimD2oQ2oTO", "puNNDl5gPUEFWhcEtNEHLKZ21l2c7qHR", "lO566f8c3ZpTrsgNovf1GdP6EuJ1Ihz8", "rzZJHS6KiH5aslcybkMmKbRCqwolmQAz", "lMymBa1GAS6gSrjK2mQJROkXbE", "lIq0nKP0GwKiYNEJRhA9Zsqqg4xJtS7q"};
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-70, -66, -78, -72, -74, Field.AUTOTEXTLIST, 77, Field.GREETINGLINE, Field.CONTROL, 97, Field.BIDIOUTLINE, -81, -94, -99, -98, -88, -34, -30, -42, -36, -38, -63, -75, -58, -65, -55, -60, -127, 116, 111, 112, 122};
    }

    static {
        A02();
    }

    C6D(String str) {
        this.A00 = str;
    }

    public static C6D A00(String str) {
        C6D[] values;
        for (C6D type : values()) {
            String[] strArr = A02;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "Aja9B1UEj6BzKn1INFFqcKK4Fe";
            strArr2[0] = "GwpKbwXfukeF7x0PFg8wIbfMxN";
            if (type.A00.equals(str)) {
                return type;
            }
        }
        return null;
    }
}
