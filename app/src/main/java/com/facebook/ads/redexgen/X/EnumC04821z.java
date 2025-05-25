package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.1z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC04821z {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, 101, 102, 104, 109, 108, 109, Field.AUTONUMLGL, Field.AUTONUM, 56, 61, 48, Field.IMPORT, Field.USERADDRESS, Field.DDEAUTO, Field.AUTONUMLGL, Field.GOTOBUTTON, 42, Field.AUTONUMOUT, Field.MACROBUTTON, 58, Field.NUMCHARS, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
