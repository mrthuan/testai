// Auto-fixed: added missing class declaration
public class RE {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum RE {
    A03,
    A02,
    A05,
    A04;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.NUMCHARS, 19, 20, 16, Field.NUMCHARS, 9, 24, 25, 107, 100, 99, 103, 107, 126, 99, 100, 109, 107, 124, 111, 124, 107, 106, 124, 102, 120, 119, 112, 116, 120, 109, 124, 125, Field.HTMLCONTROL, 76, Field.SHAPE, 76, Field.HTMLCONTROL, Field.LISTNUM, 76, 86, Field.NOTEREF, Field.FORMCHECKBOX, 64, Field.INCLUDETEXT, Field.NOTEREF, Field.ADDRESSBLOCK, 64, Field.FORMCHECKBOX, 78};
    }

    static {
        A01();
    }
}

}
