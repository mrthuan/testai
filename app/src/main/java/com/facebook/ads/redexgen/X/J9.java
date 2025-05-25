// Auto-fixed: added missing class declaration
public class J9 {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum J9 {
    A05(0),
    A04(1);
    
    public static byte[] A01;
    public static String[] A02 = {"uhTzHy3ANqMm9pT5Vj0y58oueHh5X8x0", "T1n0km6AB0RWROiTt90mCanTjxu0eU9v", "guj8u", "qED7e7UX90QQgnHDR4FxiOt7ONkFhw8M", "ckG7PMHxRgjSmMurQ73wQaofIHipTcek", "kxqjIStyOeZmlNn9xMd3jjfND4aGb7YZ", "8IQX3zoxYaZjanbr90SETWyiMVFv66cT", "UjafbnL"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "s0XGUsh";
            strArr2[2] = "eznYh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 35);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-43, -42, -41, -42, -29, -29, -42, -43, -72, -68, -68, -76, -77, -72, -80, -61, -76};
    }

    static {
        A01();
    }

    J9(int i10) {
        this.A00 = i10;
    }
}

}
