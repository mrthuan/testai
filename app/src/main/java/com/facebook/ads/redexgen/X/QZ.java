// Auto-fixed: added missing class declaration
public class QZ {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum QZ {
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.EQ, Field.AUTONUM, Field.USERADDRESS, Field.IMPORT, 74, Field.LISTNUM, Field.MERGESEQ, Field.BIDIOUTLINE, Field.BIDIOUTLINE, Field.CONTROL, 74, Field.ADDIN, 86, 77, 74};
    }

    static {
        A01();
    }
}

}
