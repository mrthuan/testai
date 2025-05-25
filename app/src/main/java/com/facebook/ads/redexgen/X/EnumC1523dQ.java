// Auto-fixed: added missing class declaration
public class EnumC1523dQ {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.dQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1523dQ {
    A02,
    A05,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{14, 3, 24, 14, 22, Field.NUMCHARS, Field.HYPERLINK, Field.ADVANCE, 76, Field.CONTROL, 80, 59, 48, Field.QUOTE, 48, Field.FILLIN, 109, 118, 115, 118, 119, 111, 118};
    }

    static {
        A01();
    }
}

}
