package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class I7 extends IOException {
    public static byte[] A00;
    public static String[] A01 = {"Par4AxgKHuADzZajYCYNv8eTOybwGgE2", "HOlKa3VqrZNKzXakTySiImjoYLF1tZiN", "sTSFXoUHOi5oDtfYDlzbl5cXoLl4KFeB", "BEd4Yr8LrEpTvBWaPpQjQteHmdcbjxPt", "vX3nZ4LKyiX8ravoL0WOyW1E36Z0Tdtf", "vpWWQ4wUWg0aqGuW9hPs7ZH", "ICpSMLm3FgqRzKio0CYh0", "tdB"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(17) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "DyR";
            strArr[6] = "x1HJO6sm0oZLnlsePqFvX";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{32, 44, 100, 101, 107, 100, 105, Byte.MAX_VALUE, 120, Field.EQ, 76, 110, 117, 115, 110, 117, 104, 101, 60, 104, 115, 115, 60, 112, 115, 107, 60, Field.FORMCHECKBOX, 108, 110, 117, 115, 110, 117, 104, 101, 33, 111};
    }

    static {
        A01();
    }

    public I7(int i10, int i11) {
        super(A00(10, 27, 69) + i10 + A00(0, 10, 85) + i11 + A00(37, 1, 107));
    }
}
