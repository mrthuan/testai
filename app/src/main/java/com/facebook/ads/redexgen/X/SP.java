// Auto-fixed: added missing class declaration
public class SP {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum SP {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, Field.GOTOBUTTON, 58, 108, Field.MERGESEQ, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.TOA, 76, Field.SECTION, 5, 86, 64, Field.CONTROL, Field.FORMDROPDOWN, 64, Field.CONTROL, 5, Field.CONTROL, 64, 86, Field.DOCPROPERTY, 74, Field.MERGESEQ, 86, 64, 31, 5, 0, 86, Field.MACROBUTTON, Field.DATA, Field.DDE, Field.DATA, 41, Field.EQ, Field.DATA, 106, 104, 96, Field.IMPORT, 44, 41, 44, Field.DDE, Field.AUTONUMLGL, 44};
    }

    static {
        A02();
    }

    SP(String str) {
        this.A00 = str;
    }

    public static SP A00(String str) {
        SP[] values;
        for (SP sp2 : values()) {
            if (sp2.A00.equals(str)) {
                return sp2;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}

}
