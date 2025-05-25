package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC04380g {
    A09,
    A04,
    A05,
    A0A,
    A03,
    A08,
    A07,
    A06;
    
    public static byte[] A00;
    public static String[] A01 = {"lOzuqd9TjXHlivepUaRJZyovV0XRZz3Q", "3CmPFRqqfEz1KNHoTaFI9Gq9W7MdJSat", "haORrB9MD96pjJjEM3VH9Mkp1W5ocbVO", "NmjzB0Xtr3isEon9bZHWRNmwidAWwXHD", "sUTNp2nMxY0O1vbAqz8mD0UyRSKVk6HB", "U2dhTMN4g5dnFjvsoCGatnesuvXNv1a4", "4yC8jy8D2py2trVgka4ywqiYEdNiB8JC", "oszw9hdc4eixLtuswncqLzcYbbEIixDe"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{41, 56, 56, Field.IMPORT, 59, 60, Field.FILLIN, 58, Field.DDE, Field.DATA, 42, Field.PAGEREF, Field.PAGEREF, 36, Field.BARCODE, Field.AUTONUMOUT, 36, 59, Field.DDEAUTO, Field.PAGEREF, 118, 116, 123, 123, 122, 97, 106, 97, 103, 116, 118, 126, 32, Field.AUTONUM, 43, Field.AUTONUMOUT, Field.AUTONUMOUT, 33, 32, Field.NUMCHARS, 1, 13, Field.NUMCHARS, 11, 23, 24, 21, 6, Field.NUMWORDS, 11, 22, 14, 10, Field.NUMCHARS, 11, 98, 106, 105, Field.ADDIN, 80, Field.ADDIN, Field.LISTNUM, 115, 100, 101, 104, 115, 100, 98, 117, 126, 117, 110, 126, 96, 113, 113};
    }

    static {
        A01();
    }

    public static boolean A02(EnumC04380g enumC04380g) {
        return A04.equals(enumC04380g) || A05.equals(enumC04380g);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC04380g[] valuesCustom() {
        EnumC04380g[] enumC04380gArr = (EnumC04380g[]) values().clone();
        String[] strArr = A01;
        if (strArr[6].charAt(17) != strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "RzvFYuFX7ttNqzVxDa22HEjRW3DLLGXn";
        strArr2[0] = "i0gT3y5gW8KzD6GAKa0KnQ1HdBIZCzpI";
        return enumC04380gArr;
    }
}
