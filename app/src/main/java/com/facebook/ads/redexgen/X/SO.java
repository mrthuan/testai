// Auto-fixed: added missing class declaration
public class SO {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum SO {
    A05(A00(27, 7, 66)),
    A04(A00(17, 10, 41));
    
    public static byte[] A01;
    public static String[] A02 = {"8ssLPxUWgolxbJp1XageKk", "Dg1K6DVjcfMH4tCqXC1sgOKGeA5uth3Q", "k5UerSqSpL774hBrbVIh5hzcGYTqhwwy", "0mtXhllSXqdp9S5VgsRy7NU2TbMA8xeG", "", "SSXMStq65k9Kuk7D57GOtIpCJ0iDP0Qg", "", "QQzDcdSrE5R6m8lZGsEzAH1KwZryrNxV"};
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[1].charAt(24) == strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A02[0] = "rcLq9mDrDhDKDEyyKV3bsF";
            copyOfRange[i13] = (byte) (i14 ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, Byte.MAX_VALUE, 111, 115, 120, 113, 126, 119, 117, 99, 22, 20, 9, 16, 15, 2, 3, Field.AUTONUM, Field.IMPORT, 117, 59, 48, Field.SYMBOL, Field.AUTONUM, Field.BARCODE, 61, 43, Field.INCLUDEPICTURE, Field.SECTION, Field.BIDIOUTLINE, Field.FILESIZE, Field.LISTNUM, Field.CONTROL, 86};
    }

    static {
        A01();
    }

    SO(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}

}
