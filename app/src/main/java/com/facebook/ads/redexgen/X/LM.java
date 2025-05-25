// Auto-fixed: added missing class declaration
public class LM {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public enum LM {
    A04(0),
    A05(1),
    A03(2);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ ShapeTypes.VERTICAL_SCROLL);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.PAGEREF, 56, 56, Field.QUOTE, Field.GOTOBUTTON, Field.MACROBUTTON, 101, 126, 123, 126, Byte.MAX_VALUE, 103, 126, 86, 77, Field.ADDIN, 76, 76, Field.CONTROL, Field.FORMTEXT, Field.FORMCHECKBOX};
    }

    static {
        A01();
    }

    LM(int i10) {
        this.A00 = i10;
    }
}

}
