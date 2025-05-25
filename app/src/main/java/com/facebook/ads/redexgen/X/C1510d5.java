package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.d5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1510d5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.EQ, Field.AUTONUMLGL, Field.DDEAUTO, Field.AUTONUM, Field.MACROBUTTON, Field.AUTONUMOUT, 116, 48, 44, Field.IMPORT, 116, 60, Field.GLOSSARY, Field.AUTONUMOUT, Field.SYMBOL, Field.DDEAUTO, Field.MACROBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, 41, 116};
    }

    public final String A02(HY hy) {
        String obj = hy.getClass().getGenericInterfaces()[0].toString();
        String A002 = A00(0, 21, 12);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final String A03(AbstractC06006r abstractC06006r) {
        return A02(abstractC06006r);
    }
}
