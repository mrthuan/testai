// Auto-fixed: added missing class declaration
public class EnumC0922Kk {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0922Kk {
    A05(0),
    A0D(1),
    A08(2),
    A0B(3),
    A09(4),
    A0C(5),
    A04(6),
    A0A(7),
    A06(8),
    A07(9);
    
    public static byte[] A01;
    public static String[] A02 = {"qsBFV4QzyJZ", "Un3rqFVsxSBnmkCaaN3XKlbCw4AYbFqb", "uS", "DU", "tTGntKCVfgII9xqsGpGrv4L0WmyWUOUj", "KWr2MioisOT1RP6pbxaLpNmtsO5qpX4q", "QPqS7MAagvQqYe50TQs3IlpOEHW3O171", "i9UHFEeYKrwiWF3GKw7x6guqyhTqAOKO"};
    public int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].charAt(8) == 'p') {
                throw new RuntimeException();
            }
            A02[4] = "bTRLSoLZMuaOSwXtpMMGEunxdgwN2gpY";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            int i14 = (copyOfRange[i13] - i12) - 94;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                String[] strArr2 = A02;
                strArr2[6] = "ZL8DSguYajuR1eoXw1hG2lJW2j5bJdo3";
                strArr2[1] = "JhAlZD5OxJYpmdx1a1lzSlrIDQC8pEtq";
                copyOfRange[i13] = (byte) i14;
                i13++;
            } else {
                copyOfRange[i13] = (byte) i14;
                i13++;
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-46, -38, -35, -31, -26, -20, -50, -48, -31, -42, -29, -42, -31, -42, -46, -32, -20, -33, -46, -45, -39, -46, -48, -31, -42, -36, -37, -36, -38, -29, -38, -25, -34, -40, -12, -38, -25, -25, -28, -25, 6, -5, 15, 8, -3, 2, -1, 12, 25, 0, 9, 15, 8, -2, 25, -5, 10, 3, -20, -21, 2, -9, 11, 4, -7, -2, -5, 8, 21, -4, 5, 11, 4, -6, 21, 8, -5, -4, 2, -5, -7, 10, -1, 5, 4, -2, -1, 15, -15, -13, 4, -7, 6, -7, 4, 9, 15, 3, -11, 2, 6, -7, -13, -11, -6, -5, 11, -8, -19, 1, -6, -17, -12, -15, -2, 11, -14, -5, 1, -6, -16, 11, -19, -4, -11, -34, -35, -61, -60, -44, -63, -74, -54, -61, -72, -67, -70, -57, -44, -69, -60, -54, -61, -71, -44, -57, -70, -69, -63, -70, -72, -55, -66, -60, -61, -1, 0, 16, 3, 6, -1, -1, -6, -1, -8, 16, 5, -14, 4, -4, 4, -50, -43, -52, -52, -33, -63, -61, -44, -55, -42, -55, -44, -55, -59, -45, -33, -46, -59, -58, -52, -59, -61, -44, -55, -49, -50, 16, 23, 14, 14, 33, 5, 17, 16, 22, 7, 26, 22};
    }

    static {
        A01();
    }

    EnumC0922Kk(int i10) {
        this.A00 = i10;
    }
}

}
