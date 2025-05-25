// Auto-fixed: added missing class declaration
public class OC {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum OC {
    A05(0),
    A04(1),
    A03(2);
    
    public static byte[] A01;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, Field.INCLUDEPICTURE, 76, Field.FORMTEXT, Field.ADDIN, Field.SECTION, Field.INCLUDEPICTURE, 82, Field.FORMCHECKBOX, 56, Field.FILLIN, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    OC(int i10) {
        this.A00 = i10;
    }

    public static OC A00(int i10) {
        OC[] values;
        for (OC oc2 : values()) {
            if (oc2.A00 == i10) {
                return oc2;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}

}
