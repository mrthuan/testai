package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1245Wy extends H9 {
    public static byte[] A01;
    public static String[] A02 = {"oXD3w3tUVJHNPl", "GdV70Wcz8", "", "DzmyP9XSV", "ggRTYYsXaYFY6DcFpfUTDxKOGTV0t8hM", "gCu8mLRj1GKWx9K1TPcxrUR4JUG", "r1pVudNzCyG", "yxqMOZmEiVbhC7e6Vd9eEudE3"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 46;
            if (A02[6].length() == 27) {
                throw new RuntimeException();
            }
            A02[6] = "lZqD6G";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.AUTONUMLGL, 18, 10, 29, 16, 21, 24, Field.BIDIOUTLINE, 31, 19, 18, 8, 25, 18, 8, Field.BIDIOUTLINE, 8, 5, 12, 25, Field.FORMTEXT, Field.BIDIOUTLINE};
    }

    static {
        A01();
    }

    public C1245Wy(String str, H3 h32) {
        super(A00(0, 22, 82) + str, h32, 1);
        this.A00 = str;
    }
}
