package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6E {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 15, 24, 11, 9, 26, -32, -51, -32, -6, -17, -32, -18, -17, Field.SYMBOL, Field.AUTONUMLGL, Field.FILLIN, Field.AUTONUMOUT, -54, -53, -37, -61, -55, -49, 41, Field.NUMCHARS, 29, Field.QUOTE, Field.NUMCHARS, 26, 43, 32, Field.ASK, Field.PAGEREF, Field.FILLIN, 25, Field.ASK, 42, 29, 23, 25, Field.NUMCHARS, 17, 10, Field.NUMWORDS, 14, 13, Field.DATA, 25, Field.NUMWORDS, 14, 15, Field.NUMCHARS, 31, 16, 30, 31};
    }

    static {
        A01();
    }
}
