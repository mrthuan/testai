// Auto-fixed: added missing class declaration
public class EnumC1099Rh {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Rh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1099Rh {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-11, 8, -7, -7, -8, 5, -4, 1, -6, -27, -14, -14, -17, -14, -8, -13, -5, -12, -21, -36, -16, -18, -32, -33, 12, 8, -3, 21, -2, -3, -1, 7, Field.NUMWORDS, -1, 11, 9, 12, 8, 1, 16, 1, 0, -23, -21, -34, -23, -38, -21, -34, -35, Field.GLOSSARY, Field.EQ, 36, Field.GLOSSARY, 32, Field.EQ, Field.DATA, Field.DDE, Field.ASK, 19, 11, 9, 16, 16, 5, 4, -14, -13, -32, -15, -13, -28, -29};
    }

    static {
        A01();
    }
}

}
